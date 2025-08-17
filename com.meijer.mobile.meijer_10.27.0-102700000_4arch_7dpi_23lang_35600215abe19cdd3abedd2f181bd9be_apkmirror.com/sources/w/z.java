package w;

import android.hardware.camera2.CameraCharacteristics;
import w.B;

/* loaded from: classes.dex */
class z implements B.a {

    /* renamed from: a, reason: collision with root package name */
    protected final CameraCharacteristics f165240a;

    @Override // w.B.a
    public <T> T get(CameraCharacteristics.Key<T> key) {
        return (T) this.f165240a.get(key);
    }

    z(CameraCharacteristics cameraCharacteristics) {
        this.f165240a = cameraCharacteristics;
    }
}
