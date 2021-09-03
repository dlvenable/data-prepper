package com.amazon.dataprepper.plugins.prepper;

import com.amazon.dataprepper.model.PluginType;
import com.amazon.dataprepper.model.annotations.DataPrepperPlugin;
import com.amazon.dataprepper.model.configuration.PluginSetting;

@DataPrepperPlugin(name = "reverse", type = PluginType.PREPPER)
public class ReversibleConfigurableStringPrepperStrategy implements ConfigurableStringPrepperStrategy {

    public ReversibleConfigurableStringPrepperStrategy(final PluginSetting pluginSetting) {

    }

    @Override
    public String apply(final String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
