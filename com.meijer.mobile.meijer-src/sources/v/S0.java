package v;

import F.AbstractC3273h;
import F.C3275j;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
final class S0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3273h f164892a;

    S0(AbstractC3273h abstractC3273h) {
        if (abstractC3273h != null) {
            this.f164892a = abstractC3273h;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    private int a(CaptureRequest captureRequest) {
        Integer num;
        if (!(captureRequest.getTag() instanceof F.x0) || (num = (Integer) ((F.x0) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        F.x0 x0VarB;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            o2.i.b(tag instanceof F.x0, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            x0VarB = (F.x0) tag;
        } else {
            x0VarB = F.x0.b();
        }
        this.f164892a.b(a(captureRequest), new C17516g(x0VarB, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f164892a.c(a(captureRequest), new C3275j(C3275j.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        this.f164892a.d(a(captureRequest));
    }
}
