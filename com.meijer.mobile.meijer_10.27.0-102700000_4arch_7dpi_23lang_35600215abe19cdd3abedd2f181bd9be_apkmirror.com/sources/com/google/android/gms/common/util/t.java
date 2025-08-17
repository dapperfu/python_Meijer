package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.fullstory.FS;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import qd.C16519f;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f64965a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f64966b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f64967c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f64968d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f64969e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f64970f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f64971g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f64972h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f64973i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f64974j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f64965a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f64966b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f64967c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f64968d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f64969e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f64970f = method5;
        if (n.h()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                FS.log_w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        } else {
            method6 = null;
        }
        f64971g = method6;
        if (n.h()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e11) {
                FS.log_w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        } else {
            method7 = null;
        }
        f64972h = method7;
        if (n.h()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f64973i = method8;
        f64974j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f64967c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f64966b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = C16519f.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    FS.log_e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                FS.log_e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f64974j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z10 = Z1.b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f64974j = Boolean.valueOf(z10);
        return z10;
    }

    public static boolean d(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f64973i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                com.google.android.gms.common.internal.r.l(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                FS.log_e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return e(workSource) == 0;
    }

    public static int e(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f64968d;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            com.google.android.gms.common.internal.r.l(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
