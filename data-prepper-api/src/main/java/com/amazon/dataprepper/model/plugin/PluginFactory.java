package com.amazon.dataprepper.model.plugin;

import com.amazon.dataprepper.model.configuration.PluginSetting;

public interface PluginFactory {
    <T> T loadPlugin(final Class<? extends T> baseClass, final PluginSetting pluginSetting);
    <T> Class<? extends T> getPluginClass(final String pluginName);
}
