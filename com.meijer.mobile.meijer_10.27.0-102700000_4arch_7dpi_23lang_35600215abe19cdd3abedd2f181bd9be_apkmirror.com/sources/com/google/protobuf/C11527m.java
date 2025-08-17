package com.google.protobuf;

/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11527m {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f90572a = c();

    public static C11528n a() {
        C11528n c11528nB = b("getEmptyRegistry");
        return c11528nB != null ? c11528nB : C11528n.f90581d;
    }

    private static final C11528n b(String str) {
        Class<?> cls = f90572a;
        if (cls == null) {
            return null;
        }
        try {
            return (C11528n) cls.getDeclaredMethod(str, null).invoke(null, null);
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
