/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.event_language;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opensearch.dataprepper.event.TestEventFactory;
import org.opensearch.dataprepper.event.TestEventKeyFactory;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.event.EventBuilder;
import org.opensearch.dataprepper.model.event.EventFactory;
import org.opensearch.dataprepper.model.event.EventKeyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

class GenericEventLanguageEvaluatorIT {
    private AnnotationConfigApplicationContext applicationContext;

    private final EventFactory testEventFactory = TestEventFactory.getTestEventFactory();
    private final EventKeyFactory testEventKeyFactory = TestEventKeyFactory.getTestEventFactory();

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBean("testEventKeyFactory", EventKeyFactory.class, () -> testEventKeyFactory);
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
    void assigment_from_value() {
        final EventLanguageEvaluator evaluator = applicationContext.getBean(EventLanguageEvaluator.class);
        final Event event = testEventFactory.eventBuilder(EventBuilder.class).withEventType("event").build();
        evaluator.evaluate("/test = \"value\";", event);

        assertThat(event.get("/test", Object.class), equalTo("value"));
    }

    @Test
    void assigment_from_another_field() {
        final EventLanguageEvaluator evaluator = applicationContext.getBean(EventLanguageEvaluator.class);
        String sourceValue = "hello";
        final Event event = testEventFactory
                .eventBuilder(EventBuilder.class)
                .withEventType("event")
                .withData(Map.of("source_field", sourceValue))
                .build();
        evaluator.evaluate("/test = /source_field;", event);

        assertThat(event.get("/test", Object.class), equalTo(sourceValue));
    }
}