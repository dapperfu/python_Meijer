package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11205v1 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC11199t1 f85497a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC11199t1 f85498b = new C11196s1();

    private static InterfaceC11199t1 c() {
        try {
            return (InterfaceC11199t1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static InterfaceC11199t1 a() {
        return f85497a;
    }

    static InterfaceC11199t1 b() {
        return f85498b;
    }
}
