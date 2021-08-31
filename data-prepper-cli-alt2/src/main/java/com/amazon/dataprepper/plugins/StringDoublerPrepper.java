package com.amazon.dataprepper.plugins;

import com.amazon.dataprepper.model.PluginType;
import com.amazon.dataprepper.model.annotations.DataPrepperPlugin;
import com.amazon.dataprepper.model.configuration.PluginSetting;
import com.amazon.dataprepper.model.prepper.Prepper;
import com.amazon.dataprepper.model.record.Record;

import java.util.Collection;
import java.util.stream.Collectors;

@DataPrepperPlugin(name = "string_doubler", type = PluginType.PREPPER)
public class StringDoublerPrepper implements Prepper<Record<String>, Record<String>> {

    public StringDoublerPrepper(final PluginSetting pluginSetting) {

    }

    @Override
    public Collection<Record<String>> execute(Collection<Record<String>> records) {
        return records.stream()
                .map(r -> r.getData() + r.getData())
                .map(Record::new)
                .collect(Collectors.toList());
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
