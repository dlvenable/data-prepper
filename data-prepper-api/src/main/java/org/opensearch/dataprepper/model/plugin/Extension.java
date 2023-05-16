/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.model.plugin;

import java.util.Optional;

public interface Extension<T> {
    /**
     * Called every time this extension is needed.
     * <p>
     * The implementor is responsible for determining how to manage.
     * @return
     */
    default Optional<T> provideInstance() {
        return Optional.empty();
    }
}
