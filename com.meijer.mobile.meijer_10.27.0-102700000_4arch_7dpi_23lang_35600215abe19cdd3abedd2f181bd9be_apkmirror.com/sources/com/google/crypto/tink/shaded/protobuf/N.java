package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    private static final L f88283a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final L f88284b = new M();

    static L a() {
        return f88283a;
    }

    static L b() {
        return f88284b;
    }

    private static L c() {
        if (b0.f88318d) {
            return null;
        }
        try {
            return (L) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
