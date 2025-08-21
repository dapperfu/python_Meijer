package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes8.dex */
final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final W f89150a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final W f89151b = new X();

    static W a() {
        return f89150a;
    }

    static W b() {
        return f89151b;
    }

    private static W c() {
        if (b0.f89158d) {
            return null;
        }
        try {
            return (W) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
