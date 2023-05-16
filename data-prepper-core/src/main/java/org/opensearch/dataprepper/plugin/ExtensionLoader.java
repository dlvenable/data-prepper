/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import javax.inject.Inject;

public class ExtensionLoader {
    private final DataPrepperExtensionPoints extensionPoints;

    @Inject
    ExtensionLoader(DataPrepperExtensionPoints extensionPoints) {
        this.extensionPoints = extensionPoints;
    }

    void loadExtensions() {

    }
}
