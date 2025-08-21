package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* loaded from: classes.dex */
public class PreviewStretchWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk {
    private static boolean c() {
        return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean d() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "A37F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean e() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j510fn".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(Build.MODEL);
    }

    static boolean i() {
        if (!c() && !f() && !h() && !e() && !d() && !g()) {
            return false;
        }
        return true;
    }
}
