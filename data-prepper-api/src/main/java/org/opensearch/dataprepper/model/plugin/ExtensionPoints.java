/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.model.plugin;

import org.opensearch.dataprepper.model.configuration.PluginSetting;

public interface ExtensionPoints {
    // TODO: Probably want a better interface here.
    void addSetting(PluginSetting pluginSetting);

    // TODO: Is there a better name here as well?
    void addExtensionProvider(ExtensionProvider<?> extensionProvider);

    // TODO: Instead of ExtensionProvider, should this add directly to the ApplicationContext?
    //    But, what if we need more of a factory?
    // void addToApplicationContext()

}
