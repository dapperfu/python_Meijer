package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class k extends v<String> {

    /* renamed from: a, reason: collision with root package name */
    private static k f89869a;

    protected static synchronized k e() {
        try {
            if (f89869a == null) {
                f89869a = new k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89869a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_disabled_android_versions";
    }

    protected String d() {
        return "";
    }

    protected k() {
    }
}
