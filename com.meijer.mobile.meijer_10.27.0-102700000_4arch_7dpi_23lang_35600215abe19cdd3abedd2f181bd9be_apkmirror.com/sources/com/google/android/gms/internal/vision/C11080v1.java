package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11080v1 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC11074t1 f84657a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC11074t1 f84658b = new C11071s1();

    private static InterfaceC11074t1 c() {
        try {
            return (InterfaceC11074t1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static InterfaceC11074t1 a() {
        return f84657a;
    }

    static InterfaceC11074t1 b() {
        return f84658b;
    }
}
