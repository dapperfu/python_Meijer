package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import gd.C14250i;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f64953a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f64954b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f64955c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f64956d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f64957e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f64958f;

    public static boolean b(Context context) {
        if (f64958f == null) {
            boolean z10 = false;
            if (n.j() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f64958f = Boolean.valueOf(z10);
        }
        return f64958f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f64955c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f64955c = Boolean.valueOf(z10);
        }
        return f64955c.booleanValue();
    }

    public static boolean e() {
        int i10 = C14250i.f133320a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(21)
    public static boolean h(Context context) {
        if (f64954b == null) {
            f64954b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f64954b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f64956d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f64956d = Boolean.valueOf(z10);
        }
        return f64956d.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean j(PackageManager packageManager) {
        if (f64953a == null) {
            f64953a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f64953a.booleanValue();
    }

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f64957e == null) {
            boolean z10 = false;
            if (n.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f64957e = Boolean.valueOf(z10);
        }
        return f64957e.booleanValue();
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        return h(context);
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean g(Context context) {
        if (!f(context) || n.f()) {
            if (h(context)) {
                if (!n.g() || n.j()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
