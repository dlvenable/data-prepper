/*
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  The OpenSearch Contributors require contributions made to
 *  this file be licensed under the Apache-2.0 license or a
 *  compatible open source license.
 *
 *  Modifications Copyright OpenSearch Contributors. See
 *  GitHub history for details.
 */

package com.amazon.searchservices.plugins;

import com.amazon.dataprepper.model.PluginType;
import com.amazon.dataprepper.model.annotations.DataPrepperPlugin;
import com.amazon.dataprepper.model.configuration.PluginSetting;
import com.amazon.dataprepper.model.plugin.PluginFactory;
import com.amazon.dataprepper.model.prepper.Prepper;
import com.amazon.dataprepper.model.record.Record;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * An simple String implementation of {@link Prepper} which generates new Records with upper case or lowercase content. The current
 * simpler implementation does not handle errors (if any).
 */
@DataPrepperPlugin(name = "configurable_string_converter", type = PluginType.PREPPER)
public class ConfigurableStringPrepper implements Prepper<Record<String>, Record<String>> {

    public static final String UPPER_CASE = "upper_case";

    private final boolean upperCase;
    private final ConfigurableStringPrepperStrategy configurableStringPrepperStrategy;

    /**
     * Mandatory constructor for Data Prepper Component - This constructor is used by Data Prepper
     * runtime engine to construct an instance of {@link ConfigurableStringPrepper} using an instance of {@link PluginSetting} which
     * has access to pluginSetting metadata from pipeline
     * pluginSetting file.
     *
     * @param pluginSetting instance with metadata information from pipeline pluginSetting file.
     */
    public ConfigurableStringPrepper(final PluginSetting pluginSetting, PluginFactory pluginFactory) {
        this.upperCase = pluginSetting.getBooleanOrDefault(UPPER_CASE, true);
        Map<String, Object> pluggableConfiguration = (Map<String, Object>) pluginSetting.getAttributeFromSettings("configuration");

        String name = (String) pluggableConfiguration.get("name");

        PluginSetting innerPluginSettings = new PluginSetting(name, pluggableConfiguration);
        configurableStringPrepperStrategy = pluginFactory.loadPlugin(ConfigurableStringPrepperStrategy.class, innerPluginSettings);
    }

    @Override
    public Collection<Record<String>> execute(final Collection<Record<String>> records) {
        final Collection<Record<String>> modifiedRecords = new ArrayList<>(records.size());
        for (Record<String> record : records) {
            String recordData = record.getData();

            recordData = configurableStringPrepperStrategy.apply(recordData);

            // Still allow the upper case
            final String newData = upperCase? recordData.toUpperCase() : recordData.toLowerCase();
            modifiedRecords.add(new Record<>(newData));
        }
        return modifiedRecords;
    }

    @Override
    public void prepareForShutdown() {

    }

    @Override
    public boolean isReadyForShutdown() {
        return true;
    }


    @Override
    public void shutdown() {

    }
}
