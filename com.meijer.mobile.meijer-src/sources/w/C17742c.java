package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17742c {
    public static void a(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
    }
}
