package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class D0 {

    /* renamed from: a, reason: collision with root package name */
    private static final A0 f81589a = new B0();

    /* renamed from: b, reason: collision with root package name */
    private static final A0 f81590b;

    static A0 b() {
        return f81589a;
    }

    static {
        A0 a02 = null;
        try {
            a02 = (A0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f81590b = a02;
    }

    static A0 a() {
        A0 a02 = f81590b;
        if (a02 != null) {
            return a02;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
