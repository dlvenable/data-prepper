/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.plugin.ExtensionPlugin;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Named
public class ClasspathExtensionProvider implements ExtensionProvider {
    private final Reflections reflections;
    private Set<Class<? extends ExtensionPlugin>> extensionPluginClasses;

    @Inject
    public ClasspathExtensionProvider() {
        this(new Reflections(new ConfigurationBuilder()
                .forPackages(new PluginPackagesSupplier().get()))
        );
    }
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
        return reflections.getSubTypesOf(ExtensionPlugin.class);
    }

}
