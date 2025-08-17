package gd;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.fullstory.FS;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import qd.C16519f;

/* renamed from: gd.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14250i {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f133320a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f133322c;

    /* renamed from: d, reason: collision with root package name */
    static boolean f133323d;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    static final AtomicBoolean f133321b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f133324e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            FS.log_w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static boolean j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        try {
            if (!f133323d) {
                try {
                    PackageInfo packageInfoF = C16519f.a(context).f("com.google.android.gms", 64);
                    j.a(context);
                    if (packageInfoF == null || j.e(packageInfoF, false) || !j.e(packageInfoF, true)) {
                        f133322c = false;
                    } else {
                        f133322c = true;
                    }
                    f133323d = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    FS.log_w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f133323d = true;
                }
            }
            return f133322c || !com.google.android.gms.common.util.j.e();
        } catch (Throwable th2) {
            f133323d = true;
            throw th2;
        }
    }

    @Deprecated
    public static int f(Context context) {
        return g(context, f133320a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.C14250i.g(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean i(Context context) {
        Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.r.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @TargetApi(21)
    static boolean l(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !i(context);
    }

    C14250i() {
    }

    @Deprecated
    public static String b(int i10) {
        return C14243b.W0(i10);
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @TargetApi(19)
    @Deprecated
    public static boolean k(Context context, int i10, String str) {
        return com.google.android.gms.common.util.s.b(context, i10, str);
    }
}
