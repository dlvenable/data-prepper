package com.amazon.dataprepper.plugin;

import com.amazon.dataprepper.model.configuration.PluginSetting;
import com.amazon.dataprepper.model.plugin.PluginFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Objects;

public class PluginFactoryImpl implements PluginFactory {
    private static final Logger LOG = LoggerFactory.getLogger(PluginFactoryImpl.class);

    public <T> T loadPlugin(final Class<? extends T> baseClass, final PluginSetting pluginSetting)
    {
        final Collection<PluginProvider> pluginProviders = PluginProviderLoader.getInstance().getPluginProviders();

        final String pluginName = pluginSetting.getName();

        LOG.info("Loading plugin {}", pluginName);

        // TODO: Some form of caching would be appropriate.

        final Class<? extends T> pluginClass = pluginProviders.stream()
                .map(pluginProvider -> pluginProvider.<T>findPlugin(pluginName))
                .filter(Objects::nonNull)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No plugin found"));

        return (T) com.amazon.dataprepper.plugins.PluginFactory.newPlugin(pluginSetting, pluginClass, this);
    }
}
