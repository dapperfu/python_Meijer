package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class r extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static r f89034a;

    public static synchronized r f() {
        try {
            if (f89034a == null) {
                f89034a = new r();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89034a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_session_sampling_rate";
    }

    private r() {
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }

    protected Double d() {
        return Double.valueOf(0.01d);
    }
}
