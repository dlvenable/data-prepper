/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugin;

import org.opensearch.dataprepper.model.configuration.PluginSetting;
import org.opensearch.dataprepper.model.plugin.ExtensionPoints;
import org.opensearch.dataprepper.model.plugin.ExtensionProvider;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
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

    private static final ExtensionProvider.Context EMPTY_CONTEXT = new EmptyContext();

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

        final FactoryBean<Object> factoryBean = new FactoryBean<>() {

            @Override
            public Object getObject() throws Exception {
                return extensionProvider.provideInstance(EMPTY_CONTEXT);
            }

            @Override
            public Class<?> getObjectType() {
                return extensionProvider.supportedClass();
            }
        };


        // Original way, but produced only one bean.
        //genericApplicationContext.registerBean(extensionProvider.supportedClass(), extensionProvider::provideInstance);
        genericApplicationContext.registerBean(
                extensionProvider.supportedClass(),
                () -> extensionProvider.provideInstance(EMPTY_CONTEXT),
                b -> b.setScope(BeanDefinition.SCOPE_PROTOTYPE));

        //genericApplicationContext.registerBeanDefinition();
        // This does not work at all...
        //genericApplicationContext.registerBean(extensionProvider.supportedClass(), factoryBean);
    }

    private static class EmptyContext implements ExtensionProvider.Context {

    }
}
