package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.common.zzac;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import yd.C18207b;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static String f64961a;

    /* renamed from: b, reason: collision with root package name */
    private static int f64962b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f64963c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f64961a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f64961a = Application.getProcessName();
            } else {
                int iMyPid = f64962b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f64962b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                com.google.android.gms.common.internal.r.l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                l.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    l.a(bufferedReader);
                }
                f64961a = strTrim;
            }
        }
        return f64961a;
    }

    public static boolean b() {
        Boolean boolValueOf = f64963c;
        if (boolValueOf == null) {
            if (n.h()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = yd.g.a(Process.class, "isIsolated", new yd.f[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new zzac(C18207b.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f64963c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
