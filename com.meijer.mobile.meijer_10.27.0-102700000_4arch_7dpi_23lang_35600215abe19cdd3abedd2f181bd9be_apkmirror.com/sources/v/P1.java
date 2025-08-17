package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v.J1;
import w.C17677h;

/* loaded from: classes.dex */
class P1 extends J1.c implements J1, J1.a {

    /* renamed from: b, reason: collision with root package name */
    final C17379g1 f163836b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f163837c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f163838d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f163839e;

    /* renamed from: f, reason: collision with root package name */
    J1.c f163840f;

    /* renamed from: g, reason: collision with root package name */
    C17677h f163841g;

    /* renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.q<Void> f163842h;

    /* renamed from: i, reason: collision with root package name */
    c.a<Void> f163843i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.q<List<Surface>> f163844j;

    /* renamed from: a, reason: collision with root package name */
    final Object f163835a = new Object();

    /* renamed from: k, reason: collision with root package name */
    private List<DeferrableSurface> f163845k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f163846l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f163847m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f163848n = false;

    class a implements I.c<Void> {
        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        a() {
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            P1.this.d();
            P1 p12 = P1.this;
            p12.f163836b.i(p12);
        }
    }

    class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                P1.this.B(cameraCaptureSession);
                P1 p12 = P1.this;
                p12.r(p12);
                synchronized (P1.this.f163835a) {
                    o2.i.h(P1.this.f163843i, "OpenCaptureSession completer should not null");
                    P1 p13 = P1.this;
                    aVar = p13.f163843i;
                    p13.f163843i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (P1.this.f163835a) {
                    o2.i.h(P1.this.f163843i, "OpenCaptureSession completer should not null");
                    P1 p14 = P1.this;
                    c.a<Void> aVar2 = p14.f163843i;
                    p14.f163843i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                P1.this.B(cameraCaptureSession);
                P1 p12 = P1.this;
                p12.s(p12);
                synchronized (P1.this.f163835a) {
                    o2.i.h(P1.this.f163843i, "OpenCaptureSession completer should not null");
                    P1 p13 = P1.this;
                    aVar = p13.f163843i;
                    p13.f163843i = null;
                }
                aVar.c(null);
            } catch (Throwable th2) {
                synchronized (P1.this.f163835a) {
                    o2.i.h(P1.this.f163843i, "OpenCaptureSession completer should not null");
                    P1 p14 = P1.this;
                    c.a<Void> aVar2 = p14.f163843i;
                    p14.f163843i = null;
                    aVar2.c(null);
                    throw th2;
                }
            }
        }

        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            P1.this.B(cameraCaptureSession);
            P1 p12 = P1.this;
            p12.o(p12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            P1.this.B(cameraCaptureSession);
            P1 p12 = P1.this;
            p12.p(p12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            P1.this.B(cameraCaptureSession);
            P1 p12 = P1.this;
            p12.q(p12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            P1.this.B(cameraCaptureSession);
            P1 p12 = P1.this;
            p12.t(p12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            P1.this.B(cameraCaptureSession);
            P1 p12 = P1.this;
            p12.v(p12, surface);
        }
    }

    @Override // v.J1
    public J1.c c() {
        return this;
    }

    @Override // v.J1
    public void f(int i10) {
    }

    @Override // v.J1.a
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f163835a) {
                try {
                    if (!this.f163847m) {
                        com.google.common.util.concurrent.q<List<Surface>> qVar = this.f163844j;
                        qVar = qVar != null ? qVar : null;
                        this.f163847m = true;
                    }
                    z10 = !D();
                } finally {
                }
            }
            return z10;
        } finally {
            if (qVar != null) {
                qVar.cancel(true);
            }
        }
    }

    public static /* synthetic */ void w(P1 p12, J1 j12) {
        p12.f163836b.g(p12);
        p12.A(j12);
        if (p12.f163841g != null) {
            Objects.requireNonNull(p12.f163840f);
            p12.f163840f.q(j12);
            return;
        }
        C.P.l("SyncCaptureSessionBase", "[" + p12 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object x(P1 p12, List list, w.C c10, x.q qVar, c.a aVar) {
        String str;
        synchronized (p12.f163835a) {
            p12.C(list);
            o2.i.j(p12.f163843i == null, "The openCaptureSessionCompleter can only set once!");
            p12.f163843i = aVar;
            c10.a(qVar);
            str = "openCaptureSession[session=" + p12 + "]";
        }
        return str;
    }

    public static /* synthetic */ void y(P1 p12, J1 j12) {
        Objects.requireNonNull(p12.f163840f);
        p12.f163840f.A(j12);
    }

    void B(CameraCaptureSession cameraCaptureSession) {
        if (this.f163841g == null) {
            this.f163841g = C17677h.d(cameraCaptureSession, this.f163837c);
        }
    }

    void C(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.f163835a) {
            E();
            androidx.camera.core.impl.l.d(list);
            this.f163845k = list;
        }
    }

    boolean D() {
        boolean z10;
        synchronized (this.f163835a) {
            z10 = this.f163842h != null;
        }
        return z10;
    }

    void E() {
        synchronized (this.f163835a) {
            try {
                List<DeferrableSurface> list = this.f163845k;
                if (list != null) {
                    androidx.camera.core.impl.l.c(list);
                    this.f163845k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.J1
    public void a() throws CameraAccessException {
        o2.i.h(this.f163841g, "Need to call openCaptureSession before using this API.");
        this.f163841g.c().stopRepeating();
    }

    @Override // v.J1.a
    public Executor b() {
        return this.f163838d;
    }

    @Override // v.J1
    public void close() {
        o2.i.h(this.f163841g, "Need to call openCaptureSession before using this API.");
        this.f163836b.h(this);
        this.f163841g.c().close();
        b().execute(new Runnable() { // from class: v.L1
            @Override // java.lang.Runnable
            public final void run() {
                P1 p12 = this.f163742a;
                p12.A(p12);
            }
        });
    }

    @Override // v.J1.a
    public com.google.common.util.concurrent.q<Void> e(CameraDevice cameraDevice, final x.q qVar, final List<DeferrableSurface> list) {
        synchronized (this.f163835a) {
            try {
                if (this.f163847m) {
                    return I.n.n(new CancellationException("Opener is disabled"));
                }
                this.f163836b.k(this);
                final w.C cB = w.C.b(cameraDevice, this.f163837c);
                com.google.common.util.concurrent.q<Void> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.M1
                    @Override // androidx.concurrent.futures.c.InterfaceC1088c
                    public final Object a(c.a aVar) {
                        return P1.x(this.f163823a, list, cB, qVar, aVar);
                    }
                });
                this.f163842h = qVarA;
                I.n.j(qVarA, new a(), H.a.a());
                return I.n.s(this.f163842h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.J1
    public void g() throws CameraAccessException {
        o2.i.h(this.f163841g, "Need to call openCaptureSession before using this API.");
        this.f163841g.c().abortCaptures();
    }

    @Override // v.J1
    public CameraDevice h() {
        o2.i.g(this.f163841g);
        return this.f163841g.c().getDevice();
    }

    @Override // v.J1
    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        o2.i.h(this.f163841g, "Need to call openCaptureSession before using this API.");
        return this.f163841g.b(captureRequest, b(), captureCallback);
    }

    @Override // v.J1.a
    public com.google.common.util.concurrent.q<List<Surface>> j(final List<DeferrableSurface> list, long j10) {
        synchronized (this.f163835a) {
            try {
                if (this.f163847m) {
                    return I.n.n(new CancellationException("Opener is disabled"));
                }
                I.d dVarE = I.d.a(androidx.camera.core.impl.l.e(list, false, j10, b(), this.f163839e)).e(new I.a() { // from class: v.O1
                    @Override // I.a
                    public final com.google.common.util.concurrent.q apply(Object obj) {
                        return P1.z(this.f163832a, list, (List) obj);
                    }
                }, b());
                this.f163844j = dVarE;
                return I.n.s(dVarE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.J1
    public int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        o2.i.h(this.f163841g, "Need to call openCaptureSession before using this API.");
        return this.f163841g.a(list, b(), captureCallback);
    }

    @Override // v.J1
    public C17677h l() {
        o2.i.g(this.f163841g);
        return this.f163841g;
    }

    @Override // v.J1.a
    public x.q m(int i10, List<x.k> list, J1.c cVar) {
        this.f163840f = cVar;
        return new x.q(i10, list, b(), new b());
    }

    @Override // v.J1.c
    public void o(J1 j12) {
        Objects.requireNonNull(this.f163840f);
        this.f163840f.o(j12);
    }

    @Override // v.J1.c
    public void p(J1 j12) {
        Objects.requireNonNull(this.f163840f);
        this.f163840f.p(j12);
    }

    @Override // v.J1.c
    public void q(final J1 j12) {
        com.google.common.util.concurrent.q<Void> qVar;
        synchronized (this.f163835a) {
            try {
                if (this.f163846l) {
                    qVar = null;
                } else {
                    this.f163846l = true;
                    o2.i.h(this.f163842h, "Need to call openCaptureSession before using this API.");
                    qVar = this.f163842h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d();
        if (qVar != null) {
            qVar.addListener(new Runnable() { // from class: v.N1
                @Override // java.lang.Runnable
                public final void run() {
                    P1.w(this.f163829a, j12);
                }
            }, H.a.a());
        }
    }

    @Override // v.J1.c
    public void r(J1 j12) {
        Objects.requireNonNull(this.f163840f);
        d();
        this.f163836b.i(this);
        this.f163840f.r(j12);
    }

    @Override // v.J1.c
    public void s(J1 j12) {
        Objects.requireNonNull(this.f163840f);
        this.f163836b.j(this);
        this.f163840f.s(j12);
    }

    @Override // v.J1.c
    public void t(J1 j12) {
        Objects.requireNonNull(this.f163840f);
        this.f163840f.t(j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // v.J1.c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void A(final J1 j12) {
        com.google.common.util.concurrent.q<Void> qVar;
        synchronized (this.f163835a) {
            try {
                if (this.f163848n) {
                    qVar = null;
                } else {
                    this.f163848n = true;
                    o2.i.h(this.f163842h, "Need to call openCaptureSession before using this API.");
                    qVar = this.f163842h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (qVar != null) {
            qVar.addListener(new Runnable() { // from class: v.K1
                @Override // java.lang.Runnable
                public final void run() {
                    P1.y(this.f163736a, j12);
                }
            }, H.a.a());
        }
    }

    @Override // v.J1.c
    public void v(J1 j12, Surface surface) {
        Objects.requireNonNull(this.f163840f);
        this.f163840f.v(j12, surface);
    }

    P1(C17379g1 c17379g1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f163836b = c17379g1;
        this.f163837c = handler;
        this.f163838d = executor;
        this.f163839e = scheduledExecutorService;
    }

    public static /* synthetic */ com.google.common.util.concurrent.q z(P1 p12, List list, List list2) {
        p12.getClass();
        C.P.a("SyncCaptureSessionBase", "[" + p12 + "] getSurface done with results: " + list2);
        if (list2.isEmpty()) {
            return I.n.n(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        if (list2.contains(null)) {
            return I.n.n(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null))));
        }
        return I.n.p(list2);
    }

    @Override // v.J1
    public void d() {
        E();
    }
}
