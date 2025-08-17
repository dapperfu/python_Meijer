package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import w.C17677h;

/* loaded from: classes.dex */
class x implements C17677h.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f165237a;

    /* renamed from: b, reason: collision with root package name */
    final Object f165238b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f165239a;

        a(Handler handler) {
            this.f165239a = handler;
        }
    }

    static C17677h.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new x(cameraCaptureSession, new a(handler));
    }

    @Override // w.C17677h.a
    public CameraCaptureSession a() {
        return this.f165237a;
    }

    @Override // w.C17677h.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f165237a.captureBurst(list, new C17677h.b(executor, captureCallback), ((a) this.f165238b).f165239a);
    }

    @Override // w.C17677h.a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f165237a.setRepeatingRequest(captureRequest, new C17677h.b(executor, captureCallback), ((a) this.f165238b).f165239a);
    }

    x(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f165237a = (CameraCaptureSession) o2.i.g(cameraCaptureSession);
        this.f165238b = obj;
    }
}
