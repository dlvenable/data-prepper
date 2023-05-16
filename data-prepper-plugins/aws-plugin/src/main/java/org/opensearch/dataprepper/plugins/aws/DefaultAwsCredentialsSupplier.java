/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.aws;

import org.opensearch.dataprepper.aws.api.AwsCredentialsOptions;
import org.opensearch.dataprepper.aws.api.AwsCredentialsSupplier;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;

public class DefaultAwsCredentialsSupplier implements AwsCredentialsSupplier {
    @Override
    public AwsCredentialsProvider getProvider(AwsCredentialsOptions options) {
        return null;
    }
}
