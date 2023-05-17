/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.plugin.ExtensionPlugin;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

interface ExtensionProvider {
    Collection<Class<? extends ExtensionPlugin>> loadExtensionPluginClasses();
}
