package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: w.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17761w extends x {
    C17761w(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // w.x, w.C17747h.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f166448a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // w.x, w.C17747h.a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f166448a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
