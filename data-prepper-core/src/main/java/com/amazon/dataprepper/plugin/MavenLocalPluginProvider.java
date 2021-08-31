package com.amazon.dataprepper.plugin;

import com.amazon.dataprepper.model.annotations.DataPrepperPlugin;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ConfigurationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class exists so that we can demonstrate an alternate way to load plugins.
 * We would not be implementing our dynamic in this way.
 */
public class MavenLocalPluginProvider implements PluginProvider {

    private static final Logger LOG = LoggerFactory.getLogger(MavenLocalPluginProvider.class);
    private static final String POC_CORE_JAR_LOCATION = ".m2/repository/com/amazon/dataprepper/poc/plugins/core-plugins/2.0.0-poc/core-plugins-2.0.0-poc.jar";
    private static final String POC_BUFFER_JAR_LOCATION = ".m2/repository/com/amazon/dataprepper/poc/plugins/blocking-buffer/2.0.0-poc/blocking-buffer-2.0.0-poc.jar";
    private static final String DEFAULT_PLUGINS_CLASSPATH = "com.amazon.dataprepper.plugins";

    private Map<String, Class<?>> plugins;

    public MavenLocalPluginProvider() {
        loadPlugins();
    }

    @Override
    public <T> Class<? extends T> findPlugin(final String pluginName) {
        Class<?> loadedClass = plugins.get(pluginName);

        LOG.info("Found plugin from jar: {}", loadedClass);

        return (Class<? extends T>) loadedClass;
    }

    private void loadPlugins() {

        if (plugins != null)
            return;

        LOG.info("loadPlugins()");

        final String homeDirectory = System.getProperty("user.home");
        final URL coreJarUrl = generateJarUrl(homeDirectory, POC_CORE_JAR_LOCATION);
        final URL bufferJarUrl = generateJarUrl(homeDirectory, POC_BUFFER_JAR_LOCATION);

        final ClassLoader classLoader = URLClassLoader.newInstance(
                new URL[]{coreJarUrl, bufferJarUrl});


        plugins = new HashMap<>();
        final Reflections reflections = new Reflections(new ConfigurationBuilder()
                .addUrls(coreJarUrl, bufferJarUrl)
                .addClassLoaders(classLoader)
                .addScanners(
                        // https://stackoverflow.com/a/67556567/650176
                        new SubTypesScanner(false),
                        new TypeAnnotationsScanner(),
                        new FieldAnnotationsScanner())
                .forPackages(DEFAULT_PLUGINS_CLASSPATH));

        LOG.info("Starting to load types");
        //LOG.info("All types count {}", reflections.getAllTypes().size());

        final Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(DataPrepperPlugin.class);

        for (final Class<?> annotatedClass : annotatedClasses) {
            final DataPrepperPlugin dataPrepperPluginAnnotation = annotatedClass
                    .getAnnotation(DataPrepperPlugin.class);
            final String pluginName = dataPrepperPluginAnnotation.name();

            LOG.info("Found plugin: name={}, class={}",
                    pluginName, annotatedClass);
            plugins.put(pluginName, annotatedClass);
        }
        LOG.info("Finished loading types");
    }

    private URL generateJarUrl(String homeDirectory, String relativeJarPath) {
        final File jarFile = new File(homeDirectory, relativeJarPath);

        LOG.info("Using file: {}", jarFile);
        if (!jarFile.exists())
            throw new RuntimeException("Unable to get the right jar.");

        final URL jarUrl;
        try {
            jarUrl = jarFile.toURI().toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        LOG.info("Jar URL: {}", jarUrl);
        return jarUrl;
    }
}
