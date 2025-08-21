package com.google.protobuf;

/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11652m {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f91411a = c();

    public static C11653n a() {
        C11653n c11653nB = b("getEmptyRegistry");
        return c11653nB != null ? c11653nB : C11653n.f91420d;
    }

    private static final C11653n b(String str) {
        Class<?> cls = f91411a;
        if (cls == null) {
            return null;
        }
        try {
            return (C11653n) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
