/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.opensearch.dataprepper.model.event.Event;

public class IpAddressConvertRule implements Rule {
    private final String key;

    public IpAddressConvertRule(String key) {
        this.key = key;
    }

    @Override
    public boolean matches(String key) {
        return this.key.equals(key);
    }

    @Override
    public void apply(Event event, String key) {
        String ipString = event.get(key, String.class);

        // Just validation
        /*
        try {
            InetAddress.getByName(ipString);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

         */

    }
}
