package androidx.camera.view.internal.compat.quirk;

import F.g0;
import android.os.Build;

/* loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements g0 {
    private static boolean c() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean d() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean e() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    static boolean f() {
        if (Build.VERSION.SDK_INT < 33) {
            return e() || d() || c();
        }
        return false;
    }
}
