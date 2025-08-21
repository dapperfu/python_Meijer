package De;

/* loaded from: classes6.dex */
public final class p {
    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return v.c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return v.c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return v.c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return v.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String c(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? b(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? b(i11, i12, "end index") : v.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, Character.valueOf(c10)));
        }
    }

    public static void g(boolean z10, String str, char c10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, Character.valueOf(c10), obj));
        }
    }

    public static void h(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, Integer.valueOf(i10)));
        }
    }

    public static void i(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void j(boolean z10, String str, int i10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, Integer.valueOf(i10), obj));
        }
    }

    public static void k(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, Long.valueOf(j10)));
        }
    }

    public static void l(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, obj));
        }
    }

    public static void m(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, obj, obj2));
        }
    }

    public static void n(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new IllegalArgumentException(v.c(str, obj, obj2, obj3));
        }
    }

    public static int o(int i10, int i11) {
        return p(i10, i11, "index");
    }

    public static int p(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    public static <T> T r(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T s(T t10, String str, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(v.c(str, obj));
    }

    public static int t(int i10, int i11) {
        return u(i10, i11, "index");
    }

    public static int u(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, str));
        }
        return i10;
    }

    public static void v(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void w(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void x(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void y(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(v.c(str, Integer.valueOf(i10)));
        }
    }

    public static void z(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(v.c(str, obj));
        }
    }

    public static <T> T q(T t10) {
        t10.getClass();
        return t10;
    }
}
