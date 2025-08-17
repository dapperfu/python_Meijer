package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* loaded from: classes.dex */
public final class Y1 {
    public static boolean a(w.B b10) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) b10.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i10 : iArr) {
                if (i10 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
