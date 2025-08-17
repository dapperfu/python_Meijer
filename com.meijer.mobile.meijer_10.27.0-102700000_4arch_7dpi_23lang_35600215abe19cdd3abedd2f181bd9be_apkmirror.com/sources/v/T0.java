package v;

import F.AbstractC3611h;
import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
final class T0 extends AbstractC3611h {

    /* renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f163877a;

    static T0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new T0(captureCallback);
    }

    CameraCaptureSession.CaptureCallback f() {
        return this.f163877a;
    }

    private T0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f163877a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
