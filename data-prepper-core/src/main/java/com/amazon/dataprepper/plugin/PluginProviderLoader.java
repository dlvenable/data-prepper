package com.amazon.dataprepper.plugin;

import java.util.Collection;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

class PluginProviderLoader {
    private static PluginProviderLoader pluginProviderLoader;
    private ServiceLoader<PluginProvider> serviceLoader;

    private PluginProviderLoader() {
        serviceLoader = ServiceLoader.load(PluginProvider.class);
    }

    static synchronized PluginProviderLoader getInstance() {
        if (pluginProviderLoader == null) {
            pluginProviderLoader = new PluginProviderLoader();
        }
        return pluginProviderLoader;
    }

    Collection<PluginProvider> getPluginProviders() {
        return StreamSupport.stream(serviceLoader.spliterator(), false)
                .collect(Collectors.toList());
    }
}
