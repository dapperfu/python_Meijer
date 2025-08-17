package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class D0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C0<?> f84291a = new B0();

    /* renamed from: b, reason: collision with root package name */
    private static final C0<?> f84292b = c();

    private static C0<?> c() {
        try {
            return (C0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static C0<?> a() {
        return f84291a;
    }

    static C0<?> b() {
        C0<?> c02 = f84292b;
        if (c02 != null) {
            return c02;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
