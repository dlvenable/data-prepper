/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processor.parse.ion;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.opensearch.dataprepper.model.event.HandleFailedEventsOption;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.opensearch.dataprepper.test.helper.ReflectivelySetField.setField;

public class ParseIonProcessorConfigTest {

    private ParseIonProcessorConfig createObjectUnderTest() {
        return new ParseIonProcessorConfig();
    }

    @Test
    public void test_when_defaultParseIonProcessorConfig_then_returns_default_values() {
        final ParseIonProcessorConfig objectUnderTest = createObjectUnderTest();

        assertThat(objectUnderTest.getSource(), equalTo(ParseIonProcessorConfig.DEFAULT_SOURCE));
        assertThat(objectUnderTest.getDestination(), equalTo(null));
        assertThat(objectUnderTest.getPointer(), equalTo(null));
        assertThat(objectUnderTest.getNormalizeKeys(), equalTo(false));
        assertThat(objectUnderTest.getTagsOnFailure(), equalTo(null));
        assertThat(objectUnderTest.getOverwriteIfDestinationExists(), equalTo(true));
        assertThat(objectUnderTest.getHandleFailedEventsOption(), equalTo(HandleFailedEventsOption.SKIP));
        assertThat(objectUnderTest.isHandleFailedEventsOptionValid(), equalTo(true));
    }

    @Nested
    class Validation {
        final ParseIonProcessorConfig config = createObjectUnderTest();

        @Test
        void test_when_destinationIsWhiteSpaceOrFrontSlash_then_isValidDestinationFalse()
                throws NoSuchFieldException, IllegalAccessException {
            setField(ParseIonProcessorConfig.class, config, "destination", "good destination");

            assertThat(config.isValidDestination(), equalTo(true));

            setField(ParseIonProcessorConfig.class, config, "destination", "");

            assertThat(config.isValidDestination(), equalTo(false));

            setField(ParseIonProcessorConfig.class, config, "destination", "    ");

            assertThat(config.isValidDestination(), equalTo(false));

            setField(ParseIonProcessorConfig.class, config, "destination", "   /   ");

            assertThat(config.isValidDestination(), equalTo(false));
            List<String> tagsList = List.of("tag1", "tag2");
            setField(ParseIonProcessorConfig.class, config, "tagsOnFailure", tagsList);

            assertThat(config.getTagsOnFailure(), equalTo(tagsList));

            setField(ParseIonProcessorConfig.class, config, "deleteSource", true);
            assertThat(config.isDeleteSourceRequested(), equalTo(true));
        }

        @Test
        void isHandleFailedEventsOptionValid_returns_false_with_drop_option() throws NoSuchFieldException, IllegalAccessException {
            setField(ParseIonProcessorConfig.class, config, "handleFailedEventsOption", HandleFailedEventsOption.DROP);

            assertThat(config.isHandleFailedEventsOptionValid(), equalTo(false));
        }

        @Test
        void isHandleFailedEventsOptionValid_returns_true_with_null_handle_events() throws NoSuchFieldException, IllegalAccessException {
            setField(ParseIonProcessorConfig.class, config, "handleFailedEventsOption", null);

            assertThat(config.isHandleFailedEventsOptionValid(), equalTo(true));
        }
    }
}
