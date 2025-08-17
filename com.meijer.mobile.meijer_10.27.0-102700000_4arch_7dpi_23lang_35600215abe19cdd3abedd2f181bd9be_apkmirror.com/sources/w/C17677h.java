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
public final class C17677h {

    /* renamed from: a, reason: collision with root package name */
    private final a f165188a;

    /* renamed from: w.h$a */
    interface a {
        CameraCaptureSession a();

        int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: w.h$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f165189a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f165190b;

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f165190b.execute(new Runnable() { // from class: w.n
                @Override // java.lang.Runnable
                public final void run() {
                    C17672c.a(this.f165214a.f165189a, cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f165190b.execute(new Runnable() { // from class: w.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165198a.f165189a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f165190b.execute(new Runnable() { // from class: w.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165210a.f165189a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f165190b.execute(new Runnable() { // from class: w.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165202a.f165189a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f165190b.execute(new Runnable() { // from class: w.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165219a.f165189a.onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f165190b.execute(new Runnable() { // from class: w.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165206a.f165189a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f165190b.execute(new Runnable() { // from class: w.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165193a.f165189a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }

        b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f165190b = executor;
            this.f165189a = captureCallback;
        }
    }

    /* renamed from: w.h$c */
    static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f165191a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f165192b;

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f165192b.execute(new Runnable() { // from class: w.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165222a.f165191a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f165192b.execute(new Runnable() { // from class: w.s
                @Override // java.lang.Runnable
                public final void run() {
                    C17674e.a(this.f165229a.f165191a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f165192b.execute(new Runnable() { // from class: w.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165224a.f165191a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f165192b.execute(new Runnable() { // from class: w.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165235a.f165191a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f165192b.execute(new Runnable() { // from class: w.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165231a.f165191a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f165192b.execute(new Runnable() { // from class: w.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165233a.f165191a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f165192b.execute(new Runnable() { // from class: w.r
                @Override // java.lang.Runnable
                public final void run() {
                    C17671b.a(this.f165226a.f165191a, cameraCaptureSession, surface);
                }
            });
        }

        c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f165192b = executor;
            this.f165191a = stateCallback;
        }
    }

    public static C17677h d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C17677h(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f165188a.b(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f165188a.c(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f165188a.a();
    }

    private C17677h(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f165188a = new C17691w(cameraCaptureSession);
        } else {
            this.f165188a = x.d(cameraCaptureSession, handler);
        }
    }
}
