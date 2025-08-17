package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class d extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static d f89019a;

    protected static synchronized d e() {
        try {
            if (f89019a == null) {
                f89019a = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89019a;
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
