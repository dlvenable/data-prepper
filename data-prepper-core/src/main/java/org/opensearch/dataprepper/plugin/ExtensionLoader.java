/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.plugin.ExtensionPlugin;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.stream.Collectors;

@Named
public class ExtensionLoader {
    private final ExtensionProvider extensionProvider;
    private final DataPrepperExtensionPoints extensionPoints;
    private final PluginCreator pluginCreator;

    @Inject
    ExtensionLoader(
            ExtensionProvider extensionProvider,
            DataPrepperExtensionPoints extensionPoints,
            PluginCreator pluginCreator) {
        this.extensionProvider = extensionProvider;
        this.extensionPoints = extensionPoints;
        this.pluginCreator = pluginCreator;
    }


    List<? extends ExtensionPlugin> loadExtensions() {
        final PluginArgumentsContext pluginArgumentsContext = new NoArgumentsArgumentsContext();
        final List<? extends ExtensionPlugin> extensionPlugins = extensionProvider.loadExtensionPluginClasses()
                .stream()
                .map(extensionClass -> pluginCreator.newPluginInstance(extensionClass, pluginArgumentsContext, covertClassToName(extensionClass)))
                .collect(Collectors.toList());

        return extensionPlugins;
    }

    private String covertClassToName(Class<? extends ExtensionPlugin> extensionClass) {
        final String className = extensionClass.getSimpleName();

        // TODO: Perhaps split by capital letters.


        //className.split()

        return className;
    }

    private static class NoArgumentsArgumentsContext implements PluginArgumentsContext {

        @Override
        public Object[] createArguments(final Class<?>[] parameterTypes) {
            if(parameterTypes.length != 0) {
                throw new RuntimeException("No arguments are permitted for extensions constructors.");
            }
            return new Object[0];
        }
    }
}
