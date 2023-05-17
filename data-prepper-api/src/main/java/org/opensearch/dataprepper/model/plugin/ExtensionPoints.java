/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.model.plugin;

import org.opensearch.dataprepper.model.configuration.PluginSetting;

/**
 * A model for extending Data Prepper. A Data Prepper extension will call methods in a provided instance
 * of this class.
 *
 * @since 2.3
 */
public interface ExtensionPoints {
    // TODO: Probably want a better interface here.
    void addSetting(PluginSetting pluginSetting);

    // TODO: Is there a better name here as well?

    /**
     * Adds an {@link ExtensionProvider} to Data Prepper. This allows an extension to make a class
     * available to plugins within Data Prepper.
     *
     * @param extensionProvider The {@link ExtensionProvider} which this extension is creating.
     * @since 2.3
     */
    void addExtensionProvider(ExtensionProvider<?> extensionProvider);

    // TODO: Instead of ExtensionProvider, should this add directly to the ApplicationContext?
    //    But, what if we need more of a factory?
    // void addToApplicationContext()

}
