/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.sink;

import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.record.Record;
import org.opensearch.dataprepper.model.sink.Sink;

import java.io.IOException;
import java.util.Collection;

public class S3SinkSample implements Sink<Record<Event>> {
    // TODO: Create this in the constructor
    private S3SinkService s3SinkService;

    @Override
    public void output(Collection<Record<Event>> records) {

        try {
            s3SinkService.output(records);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void initialize() {

    }

    @Override
    public boolean isReady() {
        return false;
    }
}
