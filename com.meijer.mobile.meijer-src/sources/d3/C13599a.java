package d3;

import android.text.TextUtils;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13599a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    public static <T> T f(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void g(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T i(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    public static <T> T j(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T e(T t10) {
        t10.getClass();
        return t10;
    }
}
