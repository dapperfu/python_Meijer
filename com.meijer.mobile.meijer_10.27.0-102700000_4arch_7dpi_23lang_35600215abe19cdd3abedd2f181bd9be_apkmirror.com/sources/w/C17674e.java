package w;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17674e {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
