/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.model.annotations;

import org.opensearch.dataprepper.model.configuration.PluginSetting;

// TODO: Does this support any component that can be included in the pipeline YAML??
//

/**
 * Annotates a Data Prepper pipeline component plugin. This can be a pipeline component such
 * as {@link org.opensearch.dataprepper.model.source.Source},
 * {@link org.opensearch.dataprepper.model.buffer.Buffer},
 * {@link org.opensearch.dataprepper.model.processor.Processor}, or
 * {@link org.opensearch.dataprepper.model.sink.Sink}. It can also be another
 * plugin-supported class.
 * <p>
 * The value provided in the {@link #name()} attribute determines the name of
 * the plugin as would be found in the pipeline configuration.
 * <p>
 * You must define the {@link #pluginType()} to load your class as a plugin.
 */
public @interface PipelineComponentPlugin {
    String DEFAULT_DEPRECATED_NAME = "";

    /**
     * Gets the pipeline component name.
     *
     * @return Name of the plugin which should be unique for the type
     * @since 2.3
     */
    String name();

    /**
     *
     * @return Deprecated name of the plugin which should be unique for the type
     * @since 2.3
     */
    String deprecatedName() default DEFAULT_DEPRECATED_NAME;

    /**
     * The class type for this plugin.
     *
     * @return The Java class
     * @since 2.3
     */
    Class<?> pluginType();

    /**
     * The configuration type which the plugin takes in the constructor.
     * <p>
     * By default, this value is a {@link PluginSetting}, but you can provide
     * a POJO object to facilitate cleaner code in your plugins.
     *
     * @return The Java class type for plugin configurations
     * @since 2.3
     */
    Class<?> pluginConfigurationType();
}
