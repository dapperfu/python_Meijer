package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class F1 {

    /* renamed from: a, reason: collision with root package name */
    private static final D1 f85136a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final D1 f85137b = new G1();

    private static D1 c() {
        try {
            return (D1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static D1 a() {
        return f85136a;
    }

    static D1 b() {
        return f85137b;
    }
}
