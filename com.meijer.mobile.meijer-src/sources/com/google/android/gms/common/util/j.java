package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import id.C14726i;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f65793a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f65794b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f65795c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f65796d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f65797e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f65798f;

    public static boolean b(Context context) {
        if (f65798f == null) {
            boolean z10 = false;
            if (n.j() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f65798f = Boolean.valueOf(z10);
        }
        return f65798f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f65795c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f65795c = Boolean.valueOf(z10);
        }
        return f65795c.booleanValue();
    }

    public static boolean e() {
        int i10 = C14726i.f137536a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(21)
    public static boolean h(Context context) {
        if (f65794b == null) {
            f65794b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f65794b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f65796d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f65796d = Boolean.valueOf(z10);
        }
        return f65796d.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean j(PackageManager packageManager) {
        if (f65793a == null) {
            f65793a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f65793a.booleanValue();
    }

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f65797e == null) {
            boolean z10 = false;
            if (n.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f65797e = Boolean.valueOf(z10);
        }
        return f65797e.booleanValue();
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
