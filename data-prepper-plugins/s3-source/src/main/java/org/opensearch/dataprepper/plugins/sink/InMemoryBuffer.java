/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.sink;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class InMemoryBuffer implements Buffer {

    private final ByteArrayOutputStream byteArrayOutputStream;
    private int eventCount;

    InMemoryBuffer() {
        // TODO: Get the size limitation and use that to avoid too much growth
        byteArrayOutputStream = new ByteArrayOutputStream();
        eventCount = 0;
    }

    @Override
    public long getSize() {
        return byteArrayOutputStream.size();
    }

    @Override
    public int getEventCount() {
        return eventCount;
    }

    @Override
    public void flushToS3(S3Client s3Client, String bucket, String key) {
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        s3Client.putObject(
                PutObjectRequest.builder().bucket(bucket).key(key).build(),
                RequestBody.fromBytes(byteArray));
    }

    @Override
    public void writeEvent(byte[] bytes) throws IOException {
        byteArrayOutputStream.write(bytes);
        eventCount++;
    }
}
