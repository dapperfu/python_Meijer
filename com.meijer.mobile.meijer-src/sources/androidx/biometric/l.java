package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
class l {

    private static class a {
        static boolean a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || !a.a(context.getPackageManager())) ? false : true;
    }
}
