package vc;

import android.os.Build;
import android.util.Log;
import com.fullstory.FS;

/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17544a {
    private static String a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    private static String e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void b(String str, String str2, Object obj) {
        String strE = e(str);
        if (Log.isLoggable(strE, 3)) {
            FS.log_d(strE, String.format(str2, obj));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String strE = e(str);
        if (Log.isLoggable(strE, 3)) {
            FS.log_d(strE, String.format(str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        String strE = e(str);
        if (Log.isLoggable(strE, 6)) {
            FS.log_e(strE, str2, th2);
        }
    }

    public static void f(String str, String str2, Object obj) {
        String strE = e(str);
        if (Log.isLoggable(strE, 4)) {
            FS.log_i(strE, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Object obj) {
        String strE = e(str);
        if (Log.isLoggable(strE, 5)) {
            FS.log_w(strE, String.format(str2, obj));
        }
    }
}
