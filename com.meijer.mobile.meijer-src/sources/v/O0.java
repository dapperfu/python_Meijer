package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;

/* loaded from: classes.dex */
public final class O0 {
    public static boolean a(w.O o10, String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) o10.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e10) {
            throw new InitializationException(R0.a(e10));
        }
    }
}
