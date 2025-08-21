package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.hardware.camera2.CameraCharacteristics;
import w.B;

/* loaded from: classes.dex */
public class ConfigureSurfaceToSecondarySessionFailQuirk implements g0 {
    static boolean c(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
