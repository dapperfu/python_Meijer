package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class k extends v<String> {

    /* renamed from: a, reason: collision with root package name */
    private static k f89027a;

    protected static synchronized k e() {
        try {
            if (f89027a == null) {
                f89027a = new k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89027a;
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
