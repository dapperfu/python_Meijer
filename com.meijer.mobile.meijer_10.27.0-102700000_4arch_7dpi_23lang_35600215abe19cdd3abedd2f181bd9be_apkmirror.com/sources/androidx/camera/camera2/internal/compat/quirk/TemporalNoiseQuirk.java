package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import w.B;

/* loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean c() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    static boolean d(B b10) {
        if (c() && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }
}
