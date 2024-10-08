/*
 * Copyright OpenSearch Contributors
 * SPDX-Limense-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processor.aggregate.actions;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.AssertTrue;

import java.time.Duration;

@JsonPropertyOrder
@JsonClassDescription("The <code>tail_sampler</code> action samples OpenTelemetry traces after collecting spans for a trace.")
public class TailSamplerAggregateActionConfig {
    @JsonPropertyDescription("Period to wait before considering that a trace event is complete")
    @JsonProperty("wait_period")
    @NotNull
    private Duration waitPeriod;
    
    @JsonPropertyDescription("Percent value to use for sampling non error events. Must be greater than 0.0 and less than 100.0")
    @JsonProperty("percent")
    @NotNull
    private Integer percent;
    
    @JsonPropertyDescription("A <a href=\"https://opensearch.org/docs/latest/data-prepper/pipelines/expression-syntax/\">conditional expression</a>, such as '/some-key == \"test\"', that will be evaluated to determine whether the event is an error event or not")
    @JsonProperty("condition")
    private String condition;

    @AssertTrue(message = "Percent value must be greater than 0.0 and less than 100.0")
    boolean isPercentValid() {
        return percent > 0.0 && percent < 100.0;
    }

    public Integer getPercent() {
        return percent;
    }
    
    @AssertTrue(message = "Wait period value must be greater than 0 and less than 60")
    boolean isWaitPeriodValid() {
        return waitPeriod.getSeconds() > 0 && waitPeriod.getSeconds() <= 60;
    }

    public Duration getWaitPeriod() {
        return waitPeriod;
    }

    public String getCondition() {
        return condition;
    }
}
