package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9233qy0 {
    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void c(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
