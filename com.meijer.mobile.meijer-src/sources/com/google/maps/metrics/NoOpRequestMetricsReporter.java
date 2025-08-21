package com.google.maps.metrics;

/* loaded from: classes8.dex */
public final class NoOpRequestMetricsReporter implements RequestMetricsReporter {
    @Override // com.google.maps.metrics.RequestMetricsReporter
    public RequestMetrics newRequest(String str) {
        return new NoOpRequestMetrics(str);
    }
}
