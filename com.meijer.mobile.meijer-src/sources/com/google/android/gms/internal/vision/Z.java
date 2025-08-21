package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f85343a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f85344b;

    static {
        f85344b = a("org.robolectric.Robolectric") != null;
    }

    static boolean b() {
        return (f85343a == null || f85344b) ? false : true;
    }

    static Class<?> c() {
        return f85343a;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
