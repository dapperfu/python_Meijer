package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w.C17747h;

/* loaded from: classes.dex */
public interface J1 {

    public interface a {
        Executor b();

        com.google.common.util.concurrent.q<Void> e(CameraDevice cameraDevice, x.q qVar, List<DeferrableSurface> list);

        com.google.common.util.concurrent.q<List<Surface>> j(List<DeferrableSurface> list, long j10);

        x.q m(int i10, List<x.k> list, c cVar);

        boolean stop();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f164757a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f164758b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f164759c;

        /* renamed from: d, reason: collision with root package name */
        private final C17518g1 f164760d;

        /* renamed from: e, reason: collision with root package name */
        private final F.l0 f164761e;

        /* renamed from: f, reason: collision with root package name */
        private final F.l0 f164762f;

        a a() {
            return new T1(this.f164761e, this.f164762f, this.f164760d, this.f164757a, this.f164758b, this.f164759c);
        }

        b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C17518g1 c17518g1, F.l0 l0Var, F.l0 l0Var2) {
            this.f164757a = executor;
            this.f164758b = scheduledExecutorService;
            this.f164759c = handler;
            this.f164760d = c17518g1;
            this.f164761e = l0Var;
            this.f164762f = l0Var2;
        }
    }

    public static abstract class c {
        void o(J1 j12) {
        }

        void p(J1 j12) {
        }

        public void q(J1 j12) {
        }

        public void r(J1 j12) {
        }

        void s(J1 j12) {
        }

        void t(J1 j12) {
        }

        void u(J1 j12) {
        }

        void v(J1 j12, Surface surface) {
        }
    }

    void a() throws CameraAccessException;

    c c();

    void close();

    void d();

    void f(int i10);

    void g() throws CameraAccessException;

    CameraDevice h();

    int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    C17747h l();

    com.google.common.util.concurrent.q<Void> n();
}
