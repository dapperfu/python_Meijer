package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class Q extends P {
    @Override // w.P, w.T, w.O.b
    public CameraCharacteristics b(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f166389a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }

    @Override // w.P, w.T, w.O.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            this.f166389a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }

    Q(Context context) {
        super(context);
    }
}
