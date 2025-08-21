package fsimpl;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.fullstory.util.Log;

/* loaded from: classes15.dex */
public class dP {

    /* renamed from: a, reason: collision with root package name */
    private static PackageInfo f133274a = null;

    public static int a(PackageInfo packageInfo) {
        return packageInfo.versionCode;
    }

    public static synchronized PackageInfo a() {
        return f133274a;
    }

    public static synchronized PackageInfo a(Context context) {
        if (f133274a != null) {
            Log.e("Package info already initialized");
            throw new RuntimeException("Package info already initialized");
        }
        try {
            f133274a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th2) {
            Log.e("Unable to initialize package info", th2);
        }
        return f133274a;
    }
}
