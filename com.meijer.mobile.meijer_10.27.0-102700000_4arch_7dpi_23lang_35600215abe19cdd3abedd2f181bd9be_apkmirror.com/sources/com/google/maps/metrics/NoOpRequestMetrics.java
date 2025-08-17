package com.google.maps.metrics;

/* loaded from: classes7.dex */
final class NoOpRequestMetrics implements RequestMetrics {
    @Override // com.google.maps.metrics.RequestMetrics
    public void endNetwork() {
    }

    @Override // com.google.maps.metrics.RequestMetrics
    public void endRequest(Exception exc, int i10, long j10) {
    }

    @Override // com.google.maps.metrics.RequestMetrics
    public void startNetwork() {
    }

    NoOpRequestMetrics(String str) {
    }
}
