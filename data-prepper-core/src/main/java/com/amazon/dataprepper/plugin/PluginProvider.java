package com.amazon.dataprepper.plugin;

public interface PluginProvider {
    <T> Class<? extends T> findPlugin(String pluginName);
}
