/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.plugin.ExtensionPlugin;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Implements {@link ExtensionProvider} using the classpath to detect extensions.
 * This uses the same {@link PluginPackagesSupplier} as {@link ClasspathPluginProvider}.
 */
@Named
public class ClasspathExtensionProvider implements ExtensionProvider {
    private static final Logger LOG = LoggerFactory.getLogger(ClasspathExtensionProvider.class);
    private final Reflections reflections;
    private Set<Class<? extends ExtensionPlugin>> extensionPluginClasses;

    @Inject
    public ClasspathExtensionProvider() {
        this(new Reflections(new ConfigurationBuilder()
                .forPackages(new PluginPackagesSupplier().get()))
        );
    }

    /**
     * For testing purposes.
     *
     * @param reflections A {@link Reflections} object.
     */
    ClasspathExtensionProvider(final Reflections reflections) {
        this.reflections = reflections;
    }

    @Override
    public Collection<Class<? extends ExtensionPlugin>> loadExtensionPluginClasses() {
        if(extensionPluginClasses == null) {
            extensionPluginClasses = scanForExtensionPlugins();
        }
        return extensionPluginClasses;
    }

    private Set<Class<? extends ExtensionPlugin>> scanForExtensionPlugins() {
        final Set<Class<? extends ExtensionPlugin>> extensionClasses = reflections.getSubTypesOf(ExtensionPlugin.class);

        if(LOG.isDebugEnabled()) {
            LOG.debug("Found {} extension classes.", extensionClasses.size());
            LOG.debug("Extensions classes: {}",
                    extensionClasses.stream().map(Class::getName).collect(Collectors.joining(", ")));
        }

        return extensionClasses;
    }
}
