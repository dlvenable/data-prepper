/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.opensearch.dataprepper.model.plugin.PluginConfigValueTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Named
public class VariableExpander {
    private static final Logger LOG = LoggerFactory.getLogger(VariableExpander.class);
    static final String PREFIX_REFERENCE_KEY = "prefixReferenceKey";
    static final String VALUE_REFERENCE_KEY = "valueReferenceKey";
    static final String VARIABLE_REFERENCE_PATTERN_STRING = "^\\$\\{\\{(?<%s>.*)\\:(?<%s>.*)\\}\\}$";
    private final Map<String, PluginConfigValueTranslator> patternPluginConfigValueTranslatorMap;
    private final ObjectMapper objectMapper;
    private final Pattern compile;

    @Inject
    public VariableExpander(
            @Named("extensionPluginConfigObjectMapper")
            final ObjectMapper objectMapper,
            final Set<PluginConfigValueTranslator> pluginConfigValueTranslators) {
        this.objectMapper = objectMapper;
        compile = Pattern.compile(String.format(VARIABLE_REFERENCE_PATTERN_STRING, PREFIX_REFERENCE_KEY, VALUE_REFERENCE_KEY));
        patternPluginConfigValueTranslatorMap = pluginConfigValueTranslators.stream().collect(Collectors.toMap(
                PluginConfigValueTranslator::getPrefix,
                Function.identity()));
    }

    public <T> T translate(final JsonParser jsonParser, final Class<T> destinationType) throws IOException {
        if (JsonToken.VALUE_STRING.equals(jsonParser.currentToken())) {
            final String rawValue = jsonParser.getValueAsString();
            final Matcher variableExpansionMatcher = compile.matcher(rawValue);
            if(variableExpansionMatcher.matches()) {
                final String prefix = variableExpansionMatcher.group(PREFIX_REFERENCE_KEY);
                final String translatorPart = variableExpansionMatcher.group(VALUE_REFERENCE_KEY);
                LOG.debug("Searching for PluginConfigValueTranslator to match prefix {} on {}", prefix, rawValue);
                return patternPluginConfigValueTranslatorMap.entrySet().stream()
                        //.map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey().variableExpansionMatcher(rawValue), entry.getValue()))
                        .filter(entry -> Objects.equals(prefix, entry.getKey()))
                        .map(entry -> objectMapper.convertValue(
                                entry.getValue().translate(translatorPart), destinationType))
                        .findFirst()
                        .orElseGet(() -> {
                            LOG.warn("Unable to find matching prefix.");
                            return objectMapper.convertValue(rawValue, destinationType);
                        });
            }
        }
        return objectMapper.readValue(jsonParser, destinationType);
    }
}
