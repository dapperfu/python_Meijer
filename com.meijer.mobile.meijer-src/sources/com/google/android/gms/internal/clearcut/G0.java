package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final E0 f81951a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final E0 f81952b = new F0();

    static E0 a() {
        return f81951a;
    }

    static E0 b() {
        return f81952b;
    }

    private static E0 c() {
        try {
            return (E0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
