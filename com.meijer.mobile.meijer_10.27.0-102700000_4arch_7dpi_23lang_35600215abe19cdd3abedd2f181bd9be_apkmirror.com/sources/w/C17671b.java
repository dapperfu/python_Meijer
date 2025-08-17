package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17671b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
