package com.google.protobuf;

/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11643d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f91333a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f91334b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f91335c;

    static {
        f91335c = (f91333a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class<?> b() {
        return f91334b;
    }

    static boolean c() {
        if (f91333a) {
            return true;
        }
        return (f91334b == null || f91335c) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
