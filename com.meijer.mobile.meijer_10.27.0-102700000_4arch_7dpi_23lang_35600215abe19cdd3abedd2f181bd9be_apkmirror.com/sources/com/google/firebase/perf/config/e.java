package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class e extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static e f89020a;

    protected static synchronized e e() {
        try {
            if (f89020a == null) {
                f89020a = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89020a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "fragment_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(0.0d);
    }

    private e() {
    }
}
