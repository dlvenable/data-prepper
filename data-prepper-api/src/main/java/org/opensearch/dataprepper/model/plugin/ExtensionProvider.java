/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.model.plugin;

import java.util.Optional;

public interface ExtensionProvider<T> {
    Optional<T> provideInstance();
}
