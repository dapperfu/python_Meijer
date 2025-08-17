package v;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* loaded from: classes.dex */
public final class R0 {
    public static CameraUnavailableException a(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int iD = cameraAccessExceptionCompat.d();
        int i10 = 1;
        if (iD != 1) {
            i10 = 2;
            if (iD != 2) {
                i10 = 3;
                if (iD != 3) {
                    i10 = 4;
                    if (iD != 4) {
                        i10 = 5;
                        if (iD != 5) {
                            if (iD != 10001) {
                                i10 = 0;
                            } else {
                                i10 = 6;
                            }
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i10, cameraAccessExceptionCompat);
    }
}
