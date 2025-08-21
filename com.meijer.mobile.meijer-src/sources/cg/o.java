package cg;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.a;
import okhttp3.HttpUrl;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f62483a;

    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f62483a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f62483a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Wf.a.e().a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static String d(String str) {
        HttpUrl httpUrlM = HttpUrl.m(str);
        if (httpUrlM != null) {
            return httpUrlM.k().P("").s("").x(null).l(null).toString();
        }
        return str;
    }

    public static String e(String str, int i10) {
        int iLastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) == '/') {
            return str.substring(0, i10);
        }
        HttpUrl httpUrlM = HttpUrl.m(str);
        if (httpUrlM == null) {
            return str.substring(0, i10);
        }
        if (httpUrlM.c().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, i10 - 1)) >= 0) {
            return str.substring(0, iLastIndexOf);
        }
        return str.substring(0, i10);
    }
}
