package com.amazon.dataprepper.plugins.prepper;

import com.amazon.dataprepper.model.PluginType;
import com.amazon.dataprepper.model.annotations.DataPrepperPlugin;
import com.amazon.dataprepper.model.configuration.PluginSetting;

@DataPrepperPlugin(name = "number_removing", type = PluginType.PREPPER)
public class NumberRemovingConfigurableStringPrepperStrategy implements ConfigurableStringPrepperStrategy {

    public NumberRemovingConfigurableStringPrepperStrategy(final PluginSetting pluginSetting) {

    }

    @Override
    public String apply(final String input) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if(!Character.isDigit(c))
                stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
