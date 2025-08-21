package id;

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
import sd.C17067f;

/* renamed from: id.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14726i {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f137536a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f137538c;

    /* renamed from: d, reason: collision with root package name */
    static boolean f137539d;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    static final AtomicBoolean f137537b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f137540e = new AtomicBoolean();

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
            if (!f137539d) {
                try {
                    PackageInfo packageInfoF = C17067f.a(context).f("com.google.android.gms", 64);
                    j.a(context);
                    if (packageInfoF == null || j.e(packageInfoF, false) || !j.e(packageInfoF, true)) {
                        f137538c = false;
                    } else {
                        f137538c = true;
                    }
                    f137539d = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    FS.log_w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f137539d = true;
                }
            }
            return f137538c || !com.google.android.gms.common.util.j.e();
        } catch (Throwable th2) {
            f137539d = true;
            throw th2;
        }
    }

    @Deprecated
    public static int f(Context context) {
        return g(context, f137536a);
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
        throw new UnsupportedOperationException("Method not decompiled: id.C14726i.g(android.content.Context, int):int");
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

    C14726i() {
    }

    @Deprecated
    public static String b(int i10) {
        return C14719b.U0(i10);
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
