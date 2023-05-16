/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.model.plugin;

public interface ExtensionPlugin {
    void apply(ExtensionPoints extensionPoints);
}
