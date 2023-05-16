/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.aws;

import org.opensearch.dataprepper.aws.api.AwsCredentialsOptions;
import org.opensearch.dataprepper.aws.api.AwsCredentialsSupplier;
import org.opensearch.dataprepper.model.annotations.DataPrepperPlugin;
import org.opensearch.dataprepper.model.annotations.DataPrepperPluginConstructor;
import org.opensearch.dataprepper.model.annotations.ExtensionPlugin;
import org.opensearch.dataprepper.model.plugin.Extension;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;

import java.util.Optional;

//@DataPrepperPlugin(name = "aws", pluginType = AwsCredentialsSupplier.class)
@ExtensionPlugin(providedTypes = {AwsCredentialsSupplier.class}, globalConfigurationType = AwsConfiguration.class)
public class AwsPlugin implements Extension<AwsCredentialsSupplier> {

    private final DefaultAwsCredentialsSupplier defaultAwsCredentialsSupplier;

    @DataPrepperPluginConstructor
    public AwsPlugin() {
        defaultAwsCredentialsSupplier = new DefaultAwsCredentialsSupplier();
    }

    @Override
    public Optional<AwsCredentialsSupplier> provideInstance() {
        return Optional.of(defaultAwsCredentialsSupplier);
    }
}
