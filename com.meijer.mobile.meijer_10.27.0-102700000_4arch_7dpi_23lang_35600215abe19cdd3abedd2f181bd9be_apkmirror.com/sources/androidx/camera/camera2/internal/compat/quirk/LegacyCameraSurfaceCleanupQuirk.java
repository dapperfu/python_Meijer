package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import w.B;

/* loaded from: classes.dex */
public class LegacyCameraSurfaceCleanupQuirk implements g0 {
    static boolean c(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    static boolean d(B b10) {
        return Build.VERSION.SDK_INT < 29 && c(b10);
    }
}
