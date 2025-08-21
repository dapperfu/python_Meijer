package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10461u {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f82417a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f82418b;

    static {
        f82418b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (f82417a == null || f82418b) ? false : true;
    }

    static Class<?> c() {
        return f82417a;
    }
}
