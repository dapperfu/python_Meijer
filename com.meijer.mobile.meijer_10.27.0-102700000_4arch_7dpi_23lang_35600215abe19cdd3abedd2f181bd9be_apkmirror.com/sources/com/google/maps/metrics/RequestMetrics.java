package com.google.maps.metrics;

/* loaded from: classes7.dex */
public interface RequestMetrics {
    void endNetwork();

    void endRequest(Exception exc, int i10, long j10);

    void startNetwork();
}
