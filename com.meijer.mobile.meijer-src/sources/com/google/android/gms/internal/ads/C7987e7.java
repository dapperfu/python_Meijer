package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.e7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7987e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f74611a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f74612b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f74613c = C7987e7.class.getName();

    public static void a(String str, Object... objArr) {
        com.fullstory.FS.log_d(f74611a, e(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        com.fullstory.FS.log_e(f74611a, e(str, objArr));
    }

    public static void c(Throwable th2, String str, Object... objArr) {
        com.fullstory.FS.log_e(f74611a, e(str, objArr), th2);
    }

    public static void d(String str, Object... objArr) {
        if (f74612b) {
            com.fullstory.FS.log_v(f74611a, e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f74613c)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
    }
}
