package du;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: du.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C13575c {
    public static /* synthetic */ SessionConfiguration a(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(i10, list, executor, stateCallback);
    }
}
