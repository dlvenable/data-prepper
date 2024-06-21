/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.event_language;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class SetOnYouConfig {
    @NotNull
    @NotEmpty
    private String program;

    public String getProgram() {
        return program;
    }
}
