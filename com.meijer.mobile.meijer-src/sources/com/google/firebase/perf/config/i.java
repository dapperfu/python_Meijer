package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class i extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static i f89867a;

    protected static synchronized i f() {
        try {
            if (f89867a == null) {
                f89867a = new i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89867a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    private i() {
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
