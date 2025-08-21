package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Df0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6782Df0 {
    public static int a(int i10, int i11, String str) {
        String strB;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strB = C7392Vf0.b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strB = C7392Vf0.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strB);
    }

    public static int b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(n(i10, i11, "index"));
        }
        return i10;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C7392Vf0.b(str, obj2));
    }

    public static void e(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(C7392Vf0.b(str, Character.valueOf(c10)));
        }
    }

    public static void h(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(C7392Vf0.b(str, Long.valueOf(j10)));
        }
    }

    public static void i(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(C7392Vf0.b(str, obj));
        }
    }

    public static void j(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(C7392Vf0.b(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void k(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? n(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? n(i11, i12, "end index") : C7392Vf0.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void l(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void m(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String n(int i10, int i11, String str) {
        if (i10 < 0) {
            return C7392Vf0.b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C7392Vf0.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
