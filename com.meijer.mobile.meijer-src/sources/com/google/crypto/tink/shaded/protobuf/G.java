package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes8.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final E f89110a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final E f89111b = new F();

    static E a() {
        return f89110a;
    }

    static E b() {
        return f89111b;
    }

    private static E c() {
        if (b0.f89158d) {
            return null;
        }
        try {
            return (E) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
