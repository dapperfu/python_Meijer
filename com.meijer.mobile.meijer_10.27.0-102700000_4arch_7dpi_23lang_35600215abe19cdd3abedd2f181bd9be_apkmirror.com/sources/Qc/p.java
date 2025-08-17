package Qc;

import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.internal.ads.C7200Tf0;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    protected static final C7200Tf0 f29970a = C7200Tf0.a(4000);

    public static void b(String str) {
        if (j(3)) {
            if (str.length() <= 4000) {
                FS.log_d("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : f29970a.d(str)) {
                if (z10) {
                    FS.log_d("Ads", str2);
                } else {
                    FS.log_d("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void c(String str, Throwable th2) {
        if (j(3)) {
            FS.log_d("Ads", str, th2);
        }
    }

    public static void d(String str) {
        if (j(6)) {
            if (str == null || str.length() <= 4000) {
                FS.log_e("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : f29970a.d(str)) {
                if (z10) {
                    FS.log_e("Ads", str2);
                } else {
                    FS.log_e("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (j(6)) {
            FS.log_e("Ads", str, th2);
        }
    }

    public static void f(String str) {
        if (j(4)) {
            if (str == null || str.length() <= 4000) {
                FS.log_i("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : f29970a.d(str)) {
                if (z10) {
                    FS.log_i("Ads", str2);
                } else {
                    FS.log_i("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void g(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                FS.log_w("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : f29970a.d(str)) {
                if (z10) {
                    FS.log_w("Ads", str2);
                } else {
                    FS.log_w("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void h(String str, Throwable th2) {
        if (j(5)) {
            FS.log_w("Ads", str, th2);
        }
    }

    public static void i(String str, Throwable th2) {
        if (j(5)) {
            if (th2 != null) {
                h(a(str), th2);
            } else {
                g(a(str));
            }
        }
    }

    public static boolean j(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }

    static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            return str + " @" + stackTrace[3].getLineNumber();
        }
        return str;
    }
}
