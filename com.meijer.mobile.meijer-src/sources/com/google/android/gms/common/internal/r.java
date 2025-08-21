package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class r {
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

    public static void c(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void h() {
        i("Must not be called on GoogleApiHandler thread.");
    }

    public static void j() {
        k("Must not be called on the main application thread");
    }

    public static <T> T l(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T m(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int n(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static long o(long j10) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static void p(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void q(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void d(Handler handler) {
        String name;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            if (looperMyLooper != null) {
                name = looperMyLooper.getThread().getName();
            } else {
                name = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void e(String str) {
        if (com.google.android.gms.common.util.y.a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static String f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String g(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void i(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    public static void k(String str) {
        if (!com.google.android.gms.common.util.y.a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }
}
