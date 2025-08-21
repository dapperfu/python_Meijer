package w;

import android.hardware.camera2.CameraCharacteristics;
import w.B;

/* loaded from: classes.dex */
class z implements B.a {

    /* renamed from: a, reason: collision with root package name */
    protected final CameraCharacteristics f166451a;

    @Override // w.B.a
    public <T> T get(CameraCharacteristics.Key<T> key) {
        return (T) this.f166451a.get(key);
    }

    z(CameraCharacteristics cameraCharacteristics) {
        this.f166451a = cameraCharacteristics;
    }
}
