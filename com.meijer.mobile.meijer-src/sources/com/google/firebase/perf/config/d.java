package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class d extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static d f89861a;

    protected static synchronized d e() {
        try {
            if (f89861a == null) {
                f89861a = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89861a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "experiment_app_start_ttid";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_experiment_app_start_ttid";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }

    private d() {
    }
}
