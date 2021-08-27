package com.amazon.dataprepper.plugin;

/**
 * TODO: Implement this to load from Maven local in a very simple fashion.
 */
public class MavenLocalPluginProvider implements PluginProvider {
    @Override
    public <T> Class<? extends T> findPlugin(String pluginName) {
        return null;
    }
}
