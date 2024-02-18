/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.breaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ForcedCircuitBreaker implements InnerCircuitBreaker, ForcedCircuitBreakerProvider {
    private static final Logger LOG = LoggerFactory.getLogger(ForcedCircuitBreaker.class);
    private boolean open;

    @Override
    public boolean isOpen() {
        return open;
    }

    public void setOpen(final boolean open) {
        LOG.info("Setting forced circuit breaker status to {}", open);
        this.open = open;
    }
}
