package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class u extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static u f89037a;

    protected static synchronized u f() {
        try {
            if (f89037a == null) {
                f89037a = new u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89037a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    private u() {
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
