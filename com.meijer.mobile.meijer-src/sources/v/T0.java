package v;

import F.AbstractC3273h;
import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
final class T0 extends AbstractC3273h {

    /* renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f164911a;

    static T0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new T0(captureCallback);
    }

    CameraCaptureSession.CaptureCallback f() {
        return this.f164911a;
    }

    private T0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f164911a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
