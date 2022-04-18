/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.amazon.dataprepper.plugins.sink.opensearch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class JacksonDoubleTest {

    @SuppressWarnings("rawtypes")
    @Test
    public void validate_serialized_doubles() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        final double tooLargeForFloat = Float.MAX_VALUE * 100d;
        final double tooSmallForFloat = Float.MIN_VALUE / 100d;
        Map<String, Object> dynamicMap = new HashMap<>();
        dynamicMap.put("upperBound", tooLargeForFloat);
        dynamicMap.put("lowerBound", tooSmallForFloat);

        final String serializedJson = objectMapper.writeValueAsString(dynamicMap);

        System.out.println(serializedJson);

        final Map readBack = objectMapper.readValue(serializedJson, Map.class);
        assertThat(readBack.get("upperBound"), equalTo(tooLargeForFloat));
        assertThat(readBack.get("lowerBound"), equalTo(tooSmallForFloat));
    }
}
