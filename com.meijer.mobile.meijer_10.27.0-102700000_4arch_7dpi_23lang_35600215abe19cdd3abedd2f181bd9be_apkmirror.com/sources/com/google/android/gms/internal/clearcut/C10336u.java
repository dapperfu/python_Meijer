package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10336u {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f81577a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f81578b;

    static {
        f81578b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (f81577a == null || f81578b) ? false : true;
    }

    static Class<?> c() {
        return f81577a;
    }
}
