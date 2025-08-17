package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: com.google.android.gms.internal.ads.xL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9917xL {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f79771a = new Object();

    public static String a(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f79771a) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }

    public static void b(String str, String str2) {
        synchronized (f79771a) {
            com.fullstory.FS.log_d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f79771a) {
            com.fullstory.FS.log_e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f79771a) {
            com.fullstory.FS.log_e(str, a(str2, th2));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f79771a) {
            com.fullstory.FS.log_i(str, a(str2, null));
        }
    }

    public static void f(String str, String str2) {
        synchronized (f79771a) {
            com.fullstory.FS.log_w(str, a(str2, null));
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        synchronized (f79771a) {
            com.fullstory.FS.log_w(str, a(str2, th2));
        }
    }
}
