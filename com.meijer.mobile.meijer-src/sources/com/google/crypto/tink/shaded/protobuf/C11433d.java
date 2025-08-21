package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11433d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f89165a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f89166b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f89167c;

    static {
        f89167c = (f89165a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class<?> b() {
        return f89166b;
    }

    static boolean c() {
        if (f89165a) {
            return true;
        }
        return (f89166b == null || f89167c) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
