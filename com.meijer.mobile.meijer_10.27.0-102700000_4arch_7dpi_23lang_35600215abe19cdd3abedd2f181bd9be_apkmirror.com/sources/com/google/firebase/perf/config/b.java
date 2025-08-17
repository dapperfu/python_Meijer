package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class b extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static b f89017a;

    protected static synchronized b e() {
        try {
            if (f89017a == null) {
                f89017a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89017a;
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
