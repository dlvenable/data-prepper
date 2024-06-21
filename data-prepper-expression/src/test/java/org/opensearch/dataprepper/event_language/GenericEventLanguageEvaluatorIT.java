/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opensearch.dataprepper.event.TestEventFactory;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.event.EventBuilder;
import org.opensearch.dataprepper.model.event.EventFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

class GenericEventLanguageEvaluatorIT {
    private AnnotationConfigApplicationContext applicationContext;

    private final EventFactory testEventFactory = TestEventFactory.getTestEventFactory();

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("org.opensearch.dataprepper.expression");
        applicationContext.scan("org.opensearch.dataprepper.event_language");
        applicationContext.refresh();
    }

    @Test
    void provides_EventLanguageEvaluator() {
        final EventLanguageEvaluator evaluator = applicationContext.getBean(EventLanguageEvaluator.class);
        assertThat(evaluator, instanceOf(GenericEventLanguageEvaluator.class));
    }

    @Test
    void assigment() {
        final EventLanguageEvaluator evaluator = applicationContext.getBean(EventLanguageEvaluator.class);
        final Event event = testEventFactory.eventBuilder(EventBuilder.class).withEventType("event").build();
        evaluator.evaluate("/test = \"value\";", event);

        assertThat(event.get("/test", Object.class), equalTo("value"));
    }
}