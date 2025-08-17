package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class c extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static c f89018a;

    protected static synchronized c d() {
        try {
            if (f89018a == null) {
                f89018a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89018a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "isEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_enabled";
    }

    private c() {
    }
}
