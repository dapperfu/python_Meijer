package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Q0 f81201a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final Q0 f81202b = new R0();

    static Q0 a() {
        return f81201a;
    }

    static Q0 b() {
        return f81202b;
    }

    private static Q0 c() {
        try {
            return (Q0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
