package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import w.C17747h;

/* loaded from: classes.dex */
class x implements C17747h.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f166448a;

    /* renamed from: b, reason: collision with root package name */
    final Object f166449b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f166450a;

        a(Handler handler) {
            this.f166450a = handler;
        }
    }

    static C17747h.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new x(cameraCaptureSession, new a(handler));
    }

    @Override // w.C17747h.a
    public CameraCaptureSession a() {
        return this.f166448a;
    }

    @Override // w.C17747h.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f166448a.captureBurst(list, new C17747h.b(executor, captureCallback), ((a) this.f166449b).f166450a);
    }

    @Override // w.C17747h.a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f166448a.setRepeatingRequest(captureRequest, new C17747h.b(executor, captureCallback), ((a) this.f166449b).f166450a);
    }

    x(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f166448a = (CameraCaptureSession) o2.i.g(cameraCaptureSession);
        this.f166449b = obj;
    }
}
