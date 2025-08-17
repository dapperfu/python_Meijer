package com.google.protobuf;

/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11518d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f90494a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f90495b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f90496c;

    static {
        f90496c = (f90494a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class<?> b() {
        return f90495b;
    }

    static boolean c() {
        if (f90494a) {
            return true;
        }
        return (f90495b == null || f90496c) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
