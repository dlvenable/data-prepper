/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.configuration.PluginSetting;
import org.opensearch.dataprepper.model.plugin.ExtensionPoints;
import org.opensearch.dataprepper.model.plugin.ExtensionProvider;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class DataPrepperExtensionPoints implements ExtensionPoints {

    //private final ApplicationContext coreContext;

    private final GenericApplicationContext genericApplicationContext;
    private final PluginBeanFactoryProvider pluginBeanFactoryProvider;

    @Inject
    public DataPrepperExtensionPoints(
            PluginBeanFactoryProvider pluginBeanFactoryProvider) {
        this.pluginBeanFactoryProvider = pluginBeanFactoryProvider;


        this.genericApplicationContext = pluginBeanFactoryProvider.getSharedPluginApplicationContext();
    }
    @Override
    public void addSetting(PluginSetting pluginSetting) {

    }

    @Override
    public void addExtensionProvider(ExtensionProvider extensionProvider) {
        ConfigurableApplicationContext context;

        //context.bea
        // TODO: How to define this well?
        //beanDefinitionRegistry.registerBeanDefinition();

        new FactoryBean<>() {

            @Override
            public Object getObject() throws Exception {
                return extensionProvider.provideInstance();
            }

            @Override
            public Class<?> getObjectType() {
                return extensionProvider.supportedClass();
            }
        };



        //GenericApplicationContext genericApplicationContext;
        genericApplicationContext.registerBean(extensionProvider.supportedClass(), extensionProvider::provideInstance);
        //genericApplicationContext.fac
    }
}
