/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.metrics;

import io.micrometer.core.instrument.Measurement;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Statistic;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Testing utility for metrics.
 *
 * @deprecated Mock your metrics instead. If any parts of this remain, it will be moved into a testing package.
 */
@Deprecated(since = "2.4")
public class MetricsTestUtil {

    /**
     * Initializes metrics with the global registry.
     *
     * @deprecated This uses a global registry and thus interferes with parallel testing. Use mocks instead.
     */
    @Deprecated(since = "2.4", forRemoval = true)
    public static void initMetrics() {
        Metrics.globalRegistry.getRegistries().forEach(meterRegistry -> Metrics.globalRegistry.remove(meterRegistry));
        Metrics.globalRegistry.getMeters().forEach(meter -> Metrics.globalRegistry.remove(meter));
        Metrics.addRegistry(new SimpleMeterRegistry());
    }

    public static List<Measurement> getMeasurementList(final String meterName) {
        return StreamSupport.stream(getRegistry().find(meterName).meter().measure().spliterator(), false)
                .collect(Collectors.toList());
    }

    public static Measurement getMeasurementFromList(final List<Measurement> measurements, final Statistic statistic) {
        return measurements.stream().filter(measurement -> measurement.getStatistic() == statistic).findAny().get();
    }

    private static MeterRegistry getRegistry() {
        return Metrics.globalRegistry.getRegistries().iterator().next();
    }

    public static boolean isBetween(double value, double low, double high) {
        return value > low && value < high;
    }

}
