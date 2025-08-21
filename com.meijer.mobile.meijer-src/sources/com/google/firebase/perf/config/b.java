package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class b extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static b f89859a;

    protected static synchronized b e() {
        try {
            if (f89859a == null) {
                f89859a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89859a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_deactivated";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }

    private b() {
    }
}
