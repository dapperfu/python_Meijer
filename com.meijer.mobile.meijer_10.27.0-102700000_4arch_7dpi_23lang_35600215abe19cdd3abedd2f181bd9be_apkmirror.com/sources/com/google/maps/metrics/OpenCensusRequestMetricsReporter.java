package com.google.maps.metrics;

import Ju.m;
import Ju.o;
import Ku.k;
import Ku.l;

/* loaded from: classes7.dex */
public final class OpenCensusRequestMetricsReporter implements RequestMetricsReporter {
    private static final k tagger = l.a();
    private static final o statsRecorder = m.a();

    @Override // com.google.maps.metrics.RequestMetricsReporter
    public RequestMetrics newRequest(String str) {
        return new OpenCensusRequestMetrics(str, tagger, statsRecorder);
    }
}
