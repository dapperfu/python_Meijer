package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11443n {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f89260a = c();

    public static C11444o a() {
        C11444o c11444oB = b("getEmptyRegistry");
        return c11444oB != null ? c11444oB : C11444o.f89262c;
    }

    private static final C11444o b(String str) {
        Class<?> cls = f89260a;
        if (cls == null) {
            return null;
        }
        try {
            return (C11444o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
