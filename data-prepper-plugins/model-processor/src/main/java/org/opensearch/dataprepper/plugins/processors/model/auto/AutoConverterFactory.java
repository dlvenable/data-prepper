/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.auto;

public class AutoConverterFactory {
    public AutoConverter getAutoConverter(String autoType) {
        switch (autoType) {
            case "vpc-flow-logs":
                return new VpcFlowLogsAutoConverter();
        }

        throw new UnsupportedOperationException("The type " + autoType + " is not supported.");
    }
}
