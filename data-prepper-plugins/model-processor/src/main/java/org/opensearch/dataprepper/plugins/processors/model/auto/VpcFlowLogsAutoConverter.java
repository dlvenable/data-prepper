/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.auto;

import org.opensearch.dataprepper.model.event.Event;

import java.time.Instant;
import java.util.Objects;

class VpcFlowLogsAutoConverter implements AutoConverter {

    private static final String NULL_CHARACTER = "-";

    @Override
    public void convertEvent(Event event) {
        deleteS3(event);
        nullOutValues(event);
        convertValues(event);
    }

    private void deleteS3(Event event) {
        event.delete("/s3");
    }

    private void nullOutValues(Event event) {
        for (String key : event.keys()) {
            String value = event.get(key, String.class);
            if(Objects.equals(value, NULL_CHARACTER)) {
                event.delete(key);
            }
        }
    }

    private void convertValues(Event event) {
        convertToInteger(event, "/version");
        convertToInteger(event, "/dstport");
        convertToInteger(event, "/protocol");
        convertToInteger(event, "/bytes");
        convertToInteger(event, "/packets");

        convertEpochToInstant(event, "/start");
        convertEpochToInstant(event, "/end");
    }

    private void convertToInteger(Event event, String key) {
        String stringValue = event.get(key, String.class);

        if(stringValue == null)
            return;
        int integerValue = Integer.parseInt(stringValue);

        event.put(key, integerValue);
    }

    private void convertEpochToInstant(Event event, String key) {
        String stringValue = event.get(key, String.class);

        if(stringValue == null)
            return;

        int epochSeconds = Integer.parseInt(stringValue);

        Instant instant = Instant.ofEpochSecond(epochSeconds);

        event.put(key, instant.toString());
    }
}
