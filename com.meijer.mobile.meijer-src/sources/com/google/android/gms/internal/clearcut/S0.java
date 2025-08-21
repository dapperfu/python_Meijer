package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Q0 f82041a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final Q0 f82042b = new R0();

    static Q0 a() {
        return f82041a;
    }

    static Q0 b() {
        return f82042b;
    }

    private static Q0 c() {
        try {
            return (Q0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
