package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class l extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static l f89870a;

    protected static synchronized l e() {
        try {
            if (f89870a == null) {
                f89870a = new l();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89870a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_enabled";
    }

    protected Boolean d() {
        return Boolean.TRUE;
    }

    protected l() {
    }
}
