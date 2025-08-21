package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.C17741b;
import w.C17744e;

/* loaded from: classes.dex */
public final class M0 {

    static final class a extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        private final List<CameraCaptureSession.StateCallback> f164856a = new ArrayList();

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f164856a.iterator();
            while (it.hasNext()) {
                it.next().onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f164856a.iterator();
            while (it.hasNext()) {
                C17744e.a(it.next(), cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f164856a.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f164856a.iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f164856a.iterator();
            while (it.hasNext()) {
                it.next().onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f164856a.iterator();
            while (it.hasNext()) {
                it.next().onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f164856a.iterator();
            while (it.hasNext()) {
                C17741b.a(it.next(), cameraCaptureSession, surface);
            }
        }

        a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f164856a.add(stateCallback);
                }
            }
        }
    }

    static final class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }

        b() {
        }
    }

    public static CameraCaptureSession.StateCallback b() {
        return new b();
    }

    public static CameraCaptureSession.StateCallback a(List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }
}
