package com.google.maps.metrics;

import Fu.o;
import Gu.j;
import Gu.k;
import com.google.maps.metrics.OpenCensusMetrics;

/* loaded from: classes8.dex */
final class OpenCensusRequestMetrics implements RequestMetrics {
    private final String requestName;
    private final o statsRecorder;
    private final k tagger;
    private long requestStart = milliTime();
    private long networkStart = milliTime();
    private long networkTime = 0;
    private boolean finished = false;

    private String exceptionName(Exception exc) {
        return exc == null ? "" : exc.getClass().getName();
    }

    @Override // com.google.maps.metrics.RequestMetrics
    public void endNetwork() {
        this.networkTime += milliTime() - this.networkStart;
    }

    @Override // com.google.maps.metrics.RequestMetrics
    public void endRequest(Exception exc, int i10, long j10) {
        if (this.finished) {
            return;
        }
        this.finished = true;
        long jMilliTime = milliTime() - this.requestStart;
        this.statsRecorder.a().a(OpenCensusMetrics.Measures.LATENCY, jMilliTime).a(OpenCensusMetrics.Measures.NETWORK_LATENCY, this.networkTime).a(OpenCensusMetrics.Measures.RETRY_COUNT, j10).b(this.tagger.a().c(OpenCensusMetrics.Tags.REQUEST_NAME, j.b(this.requestName)).c(OpenCensusMetrics.Tags.HTTP_CODE, j.b(Integer.toString(i10))).c(OpenCensusMetrics.Tags.API_STATUS, j.b(exceptionName(exc))).a());
    }

    OpenCensusRequestMetrics(String str, k kVar, o oVar) {
        this.requestName = str;
        this.tagger = kVar;
        this.statsRecorder = oVar;
    }

    private long milliTime() {
        return System.currentTimeMillis();
    }

    @Override // com.google.maps.metrics.RequestMetrics
    public void startNetwork() {
        this.networkStart = milliTime();
    }
}
