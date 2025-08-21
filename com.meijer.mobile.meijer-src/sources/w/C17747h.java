package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17747h {

    /* renamed from: a, reason: collision with root package name */
    private final a f166399a;

    /* renamed from: w.h$a */
    interface a {
        CameraCaptureSession a();

        int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: w.h$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f166400a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f166401b;

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f166401b.execute(new Runnable() { // from class: w.n
                @Override // java.lang.Runnable
                public final void run() {
                    C17742c.a(this.f166425a.f166400a, cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f166401b.execute(new Runnable() { // from class: w.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166409a.f166400a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f166401b.execute(new Runnable() { // from class: w.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166421a.f166400a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f166401b.execute(new Runnable() { // from class: w.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166413a.f166400a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f166401b.execute(new Runnable() { // from class: w.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166430a.f166400a.onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f166401b.execute(new Runnable() { // from class: w.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166417a.f166400a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f166401b.execute(new Runnable() { // from class: w.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166404a.f166400a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }

        b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f166401b = executor;
            this.f166400a = captureCallback;
        }
    }

    /* renamed from: w.h$c */
    static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f166402a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f166403b;

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f166403b.execute(new Runnable() { // from class: w.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166433a.f166402a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f166403b.execute(new Runnable() { // from class: w.s
                @Override // java.lang.Runnable
                public final void run() {
                    C17744e.a(this.f166440a.f166402a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f166403b.execute(new Runnable() { // from class: w.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166435a.f166402a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f166403b.execute(new Runnable() { // from class: w.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166446a.f166402a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f166403b.execute(new Runnable() { // from class: w.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166442a.f166402a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f166403b.execute(new Runnable() { // from class: w.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166444a.f166402a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f166403b.execute(new Runnable() { // from class: w.r
                @Override // java.lang.Runnable
                public final void run() {
                    C17741b.a(this.f166437a.f166402a, cameraCaptureSession, surface);
                }
            });
        }

        c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f166403b = executor;
            this.f166402a = stateCallback;
        }
    }

    public static C17747h d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C17747h(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f166399a.b(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f166399a.c(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f166399a.a();
    }

    private C17747h(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f166399a = new C17761w(cameraCaptureSession);
        } else {
            this.f166399a = x.d(cameraCaptureSession, handler);
        }
    }
}
