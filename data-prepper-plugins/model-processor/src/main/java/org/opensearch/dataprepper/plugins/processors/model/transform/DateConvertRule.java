/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.opensearch.dataprepper.model.event.Event;

import java.time.Instant;
import java.util.Collections;

public class DateConvertRule extends CustomRule {


    private final DateType inputType;
    private final DateType outputType;

    public enum DateType {
        DATE_TIME,
        EPOCH_SECONDS;
    }
    public DateConvertRule(String key, DateType inputType, DateType outputType) {
        super(Collections.singleton(key));
        this.inputType = inputType;
        this.outputType = outputType;
    }

    @Override
    public void apply(Event event, String key) {
        if(inputType == DateType.EPOCH_SECONDS) {
            // TODO: This works for VPC flow logs, but sometimes we will have this as integer
            String epochAsString = event.get(key, String.class);
            Instant dateTime = Instant.ofEpochSecond(Long.parseLong(epochAsString));
            if(outputType == DateType.DATE_TIME) {
                event.put(key, dateTime.toString());
                return;
            }
        }

        // TODO: Perhaps this should go into the constructor
        throw new RuntimeException("Unable to apply to date.");
    }
}
