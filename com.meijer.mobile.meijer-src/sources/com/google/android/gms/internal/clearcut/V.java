package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class V {

    /* renamed from: a, reason: collision with root package name */
    private static final S<?> f82045a = new T();

    /* renamed from: b, reason: collision with root package name */
    private static final S<?> f82046b = a();

    private static S<?> a() {
        try {
            return (S) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static S<?> b() {
        return f82045a;
    }

    static S<?> c() {
        S<?> s10 = f82046b;
        if (s10 != null) {
            return s10;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
