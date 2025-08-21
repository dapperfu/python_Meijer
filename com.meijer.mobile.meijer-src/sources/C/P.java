package C;

import android.os.Build;
import android.util.Log;
import com.fullstory.FS;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private static int f3773a = 3;

    static void i() {
        f3773a = 3;
    }

    private static boolean g(String str, int i10) {
        return f3773a <= i10 || Log.isLoggable(str, i10);
    }

    static void j(int i10) {
        f3773a = i10;
    }

    private static String k(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void a(String str, String str2) {
        String strK = k(str);
        if (g(strK, 3)) {
            FS.log_d(strK, str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        String strK = k(str);
        if (g(strK, 3)) {
            FS.log_d(strK, str2, th2);
        }
    }

    public static void c(String str, String str2) {
        String strK = k(str);
        if (g(strK, 6)) {
            FS.log_e(strK, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        String strK = k(str);
        if (g(strK, 6)) {
            FS.log_e(strK, str2, th2);
        }
    }

    public static void e(String str, String str2) {
        String strK = k(str);
        if (g(strK, 4)) {
            FS.log_i(strK, str2);
        }
    }

    public static boolean f(String str) {
        return g(k(str), 3);
    }

    public static boolean h(String str) {
        return g(k(str), 2);
    }

    public static void l(String str, String str2) {
        String strK = k(str);
        if (g(strK, 5)) {
            FS.log_w(strK, str2);
        }
    }

    public static void m(String str, String str2, Throwable th2) {
        String strK = k(str);
        if (g(strK, 5)) {
            FS.log_w(strK, str2, th2);
        }
    }
}
