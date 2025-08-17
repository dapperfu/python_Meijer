package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final E f88270a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final E f88271b = new F();

    static E a() {
        return f88270a;
    }

    static E b() {
        return f88271b;
    }

    private static E c() {
        if (b0.f88318d) {
            return null;
        }
        try {
            return (E) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
