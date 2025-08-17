package w;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final a f165152a;

    interface a {
        void a(x.q qVar) throws CameraAccessExceptionCompat;
    }

    static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraDevice.StateCallback f165153a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f165154b;

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f165154b.execute(new Runnable() { // from class: w.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165155a.f165153a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f165154b.execute(new Runnable() { // from class: w.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165160a.f165153a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f165154b.execute(new Runnable() { // from class: w.E
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165157a.f165153a.onError(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f165154b.execute(new Runnable() { // from class: w.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165162a.f165153a.onOpened(cameraDevice);
                }
            });
        }

        b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f165154b = executor;
            this.f165153a = stateCallback;
        }
    }

    public static C b(CameraDevice cameraDevice, Handler handler) {
        return new C(cameraDevice, handler);
    }

    public void a(x.q qVar) throws CameraAccessExceptionCompat {
        this.f165152a.a(qVar);
    }

    private C(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f165152a = new J(cameraDevice);
        } else {
            this.f165152a = I.e(cameraDevice, handler);
        }
    }
}
