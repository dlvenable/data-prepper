package com.amazon.dataprepper.plugin;

/**
 * This should replace {@link StaticWrapperPluginProvider}.
 *
 */
public class ClasspathPluginProvider implements PluginProvider {
    @Override
    public <T> Class<? extends T> findPlugin(String pluginName) {
        return null;
    }
}
