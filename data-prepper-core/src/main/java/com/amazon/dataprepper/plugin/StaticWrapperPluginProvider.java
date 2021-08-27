package com.amazon.dataprepper.plugin;

import com.amazon.dataprepper.plugins.PluginRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Uses the existing static methods as a quick way to demonstrate capability.
 */
public class StaticWrapperPluginProvider implements PluginProvider {
    private static final Logger LOG = LoggerFactory.getLogger(StaticWrapperPluginProvider.class);

    @Override
    public <T> Class<? extends T> findPlugin(final String pluginName) {

        final Class<? extends T> pluginClass = (Class<? extends T>) PluginRepository.getAnyClass(pluginName);

        LOG.info("Found plugin: {}", pluginClass);

        return pluginClass;
    }
}
