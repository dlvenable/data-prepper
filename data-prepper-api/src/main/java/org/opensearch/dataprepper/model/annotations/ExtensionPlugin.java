/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.model.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ExtensionPlugin {
    Class<?>[] providedTypes();

    /**
     * The type to use for data-prepper-config.yaml
     * @return
     */
    Class<?> configurationType() default Void.class;

    /**
     * The plugin configuration type that could be added within a plugin.
     * @return
     */
    Class<?> pipelineConfigurationType() default Void.class;

    /**
     * We don't have this concept yet. But, this would be a pipeline context. Basically, each
     * YAML file can have an isolated context for sharing common configurations.
     * @return
     */
    Class<?> pipelineContextConfigurationType() default Void.class;
}
