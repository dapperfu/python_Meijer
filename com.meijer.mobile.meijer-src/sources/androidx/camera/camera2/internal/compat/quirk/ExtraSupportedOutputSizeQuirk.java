package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import android.util.Size;

/* loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements g0 {
    private Size[] d() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }

    private static boolean e() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public Size[] c(int i10) {
        return (i10 == 34 && e()) ? d() : new Size[0];
    }

    static boolean f() {
        return e();
    }
}
