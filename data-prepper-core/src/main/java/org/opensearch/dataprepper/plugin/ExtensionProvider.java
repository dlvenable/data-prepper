/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.plugin.ExtensionPlugin;

import java.util.List;

public interface ExtensionProvider {
    List<ExtensionPlugin> loadExtensionPluginClasses();
}
