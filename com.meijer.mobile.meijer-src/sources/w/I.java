package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;
import w.C17747h;
import w.K;

/* loaded from: classes.dex */
class I extends H {
    static I e(CameraDevice cameraDevice, Handler handler) {
        return new I(cameraDevice, new K.a(handler));
    }

    @Override // w.C.a
    public void a(x.q qVar) throws CameraAccessException, CameraAccessExceptionCompat {
        K.c(this.f166375a, qVar);
        C17747h.c cVar = new C17747h.c(qVar.a(), qVar.e());
        List<x.k> listC = qVar.c();
        Handler handler = ((K.a) o2.i.g((K.a) this.f166376b)).f166377a;
        x.j jVarB = qVar.b();
        try {
            if (jVarB != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) jVarB.a();
                o2.i.g(inputConfiguration);
                this.f166375a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, x.q.h(listC), cVar, handler);
            } else if (qVar.d() == 1) {
                this.f166375a.createConstrainedHighSpeedCaptureSession(K.d(listC), cVar, handler);
            } else {
                this.f166375a.createCaptureSessionByOutputConfigurations(x.q.h(listC), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }

    I(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }
}
