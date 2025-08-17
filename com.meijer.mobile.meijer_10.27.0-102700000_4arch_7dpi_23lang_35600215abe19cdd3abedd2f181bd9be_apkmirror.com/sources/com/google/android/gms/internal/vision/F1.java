package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class F1 {

    /* renamed from: a, reason: collision with root package name */
    private static final D1 f84296a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final D1 f84297b = new G1();

    private static D1 c() {
        try {
            return (D1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static D1 a() {
        return f84296a;
    }

    static D1 b() {
        return f84297b;
    }
}
