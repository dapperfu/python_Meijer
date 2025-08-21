package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes8.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    private static final L f89123a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final L f89124b = new M();

    static L a() {
        return f89123a;
    }

    static L b() {
        return f89124b;
    }

    private static L c() {
        if (b0.f89158d) {
            return null;
        }
        try {
            return (L) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
