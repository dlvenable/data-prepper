/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.configuration.PluginSetting;
import org.opensearch.dataprepper.model.plugin.ExtensionPoints;
import org.opensearch.dataprepper.model.plugin.ExtensionProvider;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;

import javax.inject.Inject;

public class DataPrepperExtensionPoints implements ExtensionPoints {

    //private final ApplicationContext coreContext;
    private final BeanDefinitionRegistry beanDefinitionRegistry;

    @Inject
    public DataPrepperExtensionPoints(final BeanDefinitionRegistry beanDefinitionRegistry) {
        this.beanDefinitionRegistry = beanDefinitionRegistry;



    }
    @Override
    public void addSetting(PluginSetting pluginSetting) {

    }

    @Override
    public void addExtensionProvider(ExtensionProvider<?> extensionProvider) {
        // TODO: How to define this well?
        //beanDefinitionRegistry.registerBeanDefinition();

    }
}
