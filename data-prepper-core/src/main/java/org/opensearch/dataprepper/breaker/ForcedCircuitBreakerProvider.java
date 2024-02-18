/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.breaker;

public interface ForcedCircuitBreakerProvider {
    void setOpen(final boolean open);
}
