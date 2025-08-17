package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* loaded from: classes.dex */
class S extends Q {
    @Override // w.T, w.O.b
    public Set<Set<String>> c() throws CameraAccessExceptionCompat {
        try {
            return this.f165178a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.e(e10);
        }
    }

    S(Context context) {
        super(context);
    }
}
