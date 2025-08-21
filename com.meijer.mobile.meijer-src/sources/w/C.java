package w;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final a f166363a;

    interface a {
        void a(x.q qVar) throws CameraAccessExceptionCompat;
    }

    static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraDevice.StateCallback f166364a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f166365b;

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f166365b.execute(new Runnable() { // from class: w.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166366a.f166364a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f166365b.execute(new Runnable() { // from class: w.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166371a.f166364a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f166365b.execute(new Runnable() { // from class: w.E
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166368a.f166364a.onError(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f166365b.execute(new Runnable() { // from class: w.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166373a.f166364a.onOpened(cameraDevice);
                }
            });
        }

        b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f166365b = executor;
            this.f166364a = stateCallback;
        }
    }

    public static C b(CameraDevice cameraDevice, Handler handler) {
        return new C(cameraDevice, handler);
    }

    public void a(x.q qVar) throws CameraAccessExceptionCompat {
        this.f166363a.a(qVar);
    }

    private C(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f166363a = new J(cameraDevice);
        } else {
            this.f166363a = I.e(cameraDevice, handler);
        }
    }
}
