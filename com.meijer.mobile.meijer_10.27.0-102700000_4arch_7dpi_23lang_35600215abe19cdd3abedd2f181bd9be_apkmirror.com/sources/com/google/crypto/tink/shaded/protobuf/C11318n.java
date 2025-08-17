package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11318n {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f88420a = c();

    public static C11319o a() {
        C11319o c11319oB = b("getEmptyRegistry");
        return c11319oB != null ? c11319oB : C11319o.f88422c;
    }

    private static final C11319o b(String str) {
        Class<?> cls = f88420a;
        if (cls == null) {
            return null;
        }
        try {
            return (C11319o) cls.getDeclaredMethod(str, null).invoke(null, null);
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
