package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final W f88310a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final W f88311b = new X();

    static W a() {
        return f88310a;
    }

    static W b() {
        return f88311b;
    }

    private static W c() {
        if (b0.f88318d) {
            return null;
        }
        try {
            return (W) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
