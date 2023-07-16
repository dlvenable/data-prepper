/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processors.model.transform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opensearch.dataprepper.model.event.Event;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ConvertToNullCustomRuleTest {

    private String key;
    private Set<String> keys;
    private String nullMarker;
    private Event event;

    @BeforeEach
    void setUp() {
        key = UUID.randomUUID().toString();
        keys = Collections.singleton(key);

        nullMarker = "-";

        event = mock(Event.class);
    }

    private ConvertToNullCustomRule createObjectUnderTest() {
        return new ConvertToNullCustomRule(keys, nullMarker);
    }

    @Test
    void apply_with_null() {


        createObjectUnderTest().apply(event, key);

        verify(event, never()).put(anyString(), any());
    }

    @Test
    void apply_with_existing_non_nullMarker_value() {

        when(event.get(key, String.class)).thenReturn(UUID.randomUUID().toString());

        createObjectUnderTest().apply(event, key);

        verify(event, never()).put(anyString(), any());
    }

    @Test
    void apply_with_null_marker() {

        when(event.get(key, String.class)).thenReturn(nullMarker);

        createObjectUnderTest().apply(event, key);

        verify(event).put(anyString(), isNull());
    }

}