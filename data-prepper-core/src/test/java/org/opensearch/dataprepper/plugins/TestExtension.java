/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins;

import org.opensearch.dataprepper.model.annotations.DataPrepperPluginConstructor;
import org.opensearch.dataprepper.model.plugin.ExtensionPlugin;
import org.opensearch.dataprepper.model.plugin.ExtensionPoints;
import org.opensearch.dataprepper.model.plugin.ExtensionProvider;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class TestExtension implements ExtensionPlugin {

    private final static AtomicInteger constructedCount = new AtomicInteger(0);
    private final String extensionId;

    @DataPrepperPluginConstructor
    public TestExtension() {
        constructedCount.incrementAndGet();
        extensionId = UUID.randomUUID().toString();
    }

    @Override
    public void apply(final ExtensionPoints extensionPoints) {

        extensionPoints.addExtensionProvider(new TestExtensionProvider());
    }

    public static void reset() {
        constructedCount.set(0);
    }

    public static int getConstructedInstances() {
        return constructedCount.get();
    }

    public static class TestModel {
        private final String extensionId;

        private TestModel(final String extensionId) {

            this.extensionId = extensionId;
        }
        public String getExtensionId() {
            return this.extensionId;
        }
    }

    private class TestExtensionProvider implements ExtensionProvider<TestModel> {

        @Override
        public Optional<TestModel> provideInstance(final Context context) {
            return Optional.of(new TestModel(extensionId));
        }

        @Override
        public Class<TestModel> supportedClass() {
            return TestModel.class;
        }
    }
}
