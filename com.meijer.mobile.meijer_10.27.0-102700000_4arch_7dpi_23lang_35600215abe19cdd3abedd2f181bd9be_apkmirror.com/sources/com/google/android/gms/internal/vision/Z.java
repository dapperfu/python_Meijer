package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f84503a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f84504b;

    static {
        f84504b = a("org.robolectric.Robolectric") != null;
    }

    static boolean b() {
        return (f84503a == null || f84504b) ? false : true;
    }

    static Class<?> c() {
        return f84503a;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
