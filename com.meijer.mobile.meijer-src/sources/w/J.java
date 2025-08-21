package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* loaded from: classes.dex */
class J extends I {
    J(CameraDevice cameraDevice) {
        super((CameraDevice) o2.i.g(cameraDevice), null);
    }

    @Override // w.I, w.C.a
    public void a(x.q qVar) throws CameraAccessException, CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) qVar.j();
        o2.i.g(sessionConfiguration);
        try {
            this.f166375a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }
}
