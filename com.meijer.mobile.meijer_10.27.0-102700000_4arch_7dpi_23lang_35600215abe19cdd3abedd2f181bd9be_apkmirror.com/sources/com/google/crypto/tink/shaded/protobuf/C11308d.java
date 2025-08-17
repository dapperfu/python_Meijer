package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11308d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f88325a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f88326b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f88327c;

    static {
        f88327c = (f88325a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class<?> b() {
        return f88326b;
    }

    static boolean c() {
        if (f88325a) {
            return true;
        }
        return (f88326b == null || f88327c) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
