/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.plugin.ExtensionPlugin;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
class ExtensionsApplier {
    private final DataPrepperExtensionPoints dataPrepperExtensionPoints;
    private final ExtensionLoader extensionLoader;

    @Inject
    ExtensionsApplier(DataPrepperExtensionPoints dataPrepperExtensionPoints, ExtensionLoader extensionLoader) {
        this.dataPrepperExtensionPoints = dataPrepperExtensionPoints;
        this.extensionLoader = extensionLoader;
    }

    void applyExtensions() {
        final List<? extends ExtensionPlugin> extensionPlugins = extensionLoader.loadExtensions();

        for (ExtensionPlugin extensionPlugin : extensionPlugins) {
            extensionPlugin.apply(dataPrepperExtensionPoints);
        }

    }
}
