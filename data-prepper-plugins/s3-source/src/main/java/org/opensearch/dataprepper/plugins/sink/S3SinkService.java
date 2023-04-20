/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.sink;

import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.record.Record;
import software.amazon.awssdk.services.s3.S3Client;

import java.io.IOException;
import java.util.Collection;

public class S3SinkService {

    private final BufferFactory bufferFactory;
    private final Codec codec;
    private final S3Client s3Client;
    private Buffer currentBuffer;
    private String bucket;
    private KeyGenerator keyGenerator;


    public S3SinkService(BufferFactory bufferFactory, Codec codec, S3Client s3Client, String bucket) {

        this.bufferFactory = bufferFactory;
        this.codec = codec;
        this.s3Client = s3Client;
        this.bucket = bucket;
    }

    void output(Collection<Record<Event>> records) throws IOException {

        // TODO: You can lock this whole method for now. It is probably the simplest approach.

        if(currentBuffer == null) {
            currentBuffer = bufferFactory.getBuffer();
        }

        for (Record<Event> record : records) {
            final Event event = record.getData();
            final String encodedEvent;
            encodedEvent = codec.parse(event);

            final byte[] encodedBytes = encodedEvent.getBytes();

            if(willExceedThreshold(currentBuffer, encodedBytes)) {

                // If adding this would exceed the threshold, then rotate the buffer.
                //  1. Write the existing data to S3.
                //  2. Create a new Buffer

                String key = keyGenerator.generateKey();
                currentBuffer.flushToS3(s3Client, bucket, key);
                currentBuffer = bufferFactory.getBuffer();
            }

            currentBuffer.writeEvent(encodedBytes);
        }


    }

    boolean willExceedThreshold(Buffer buffer, byte[] encodedBytes) {
        // TODO: Implement this code.
        // Have we reached the time limit?
        // Does this exceed the event count?
        //buffer.getEventCount() + 1 > eventThreshold
        // Does this exceed the configured byte threshold?
        //buffer.getSize() + encodedBytes.length > byteThreshold
        return false;
    }
}
