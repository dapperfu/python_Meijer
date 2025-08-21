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
import w.C17747h;

/* loaded from: classes.dex */
class P1 extends J1.c implements J1, J1.a {

    /* renamed from: b, reason: collision with root package name */
    final C17518g1 f164870b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f164871c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f164872d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f164873e;

    /* renamed from: f, reason: collision with root package name */
    J1.c f164874f;

    /* renamed from: g, reason: collision with root package name */
    C17747h f164875g;

    /* renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.q<Void> f164876h;

    /* renamed from: i, reason: collision with root package name */
    c.a<Void> f164877i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.q<List<Surface>> f164878j;

    /* renamed from: a, reason: collision with root package name */
    final Object f164869a = new Object();

    /* renamed from: k, reason: collision with root package name */
    private List<DeferrableSurface> f164879k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f164880l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f164881m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f164882n = false;

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
            p12.f164870b.i(p12);
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
                synchronized (P1.this.f164869a) {
                    o2.i.h(P1.this.f164877i, "OpenCaptureSession completer should not null");
                    P1 p13 = P1.this;
                    aVar = p13.f164877i;
                    p13.f164877i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (P1.this.f164869a) {
                    o2.i.h(P1.this.f164877i, "OpenCaptureSession completer should not null");
                    P1 p14 = P1.this;
                    c.a<Void> aVar2 = p14.f164877i;
                    p14.f164877i = null;
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
                synchronized (P1.this.f164869a) {
                    o2.i.h(P1.this.f164877i, "OpenCaptureSession completer should not null");
                    P1 p13 = P1.this;
                    aVar = p13.f164877i;
                    p13.f164877i = null;
                }
                aVar.c(null);
            } catch (Throwable th2) {
                synchronized (P1.this.f164869a) {
                    o2.i.h(P1.this.f164877i, "OpenCaptureSession completer should not null");
                    P1 p14 = P1.this;
                    c.a<Void> aVar2 = p14.f164877i;
                    p14.f164877i = null;
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
            synchronized (this.f164869a) {
                try {
                    if (!this.f164881m) {
                        com.google.common.util.concurrent.q<List<Surface>> qVar = this.f164878j;
                        qVar = qVar != null ? qVar : null;
                        this.f164881m = true;
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
        p12.f164870b.g(p12);
        p12.A(j12);
        if (p12.f164875g != null) {
            Objects.requireNonNull(p12.f164874f);
            p12.f164874f.q(j12);
            return;
        }
        C.P.l("SyncCaptureSessionBase", "[" + p12 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object x(P1 p12, List list, w.C c10, x.q qVar, c.a aVar) {
        String str;
        synchronized (p12.f164869a) {
            p12.C(list);
            o2.i.j(p12.f164877i == null, "The openCaptureSessionCompleter can only set once!");
            p12.f164877i = aVar;
            c10.a(qVar);
            str = "openCaptureSession[session=" + p12 + "]";
        }
        return str;
    }

    public static /* synthetic */ void y(P1 p12, J1 j12) {
        Objects.requireNonNull(p12.f164874f);
        p12.f164874f.A(j12);
    }

    void B(CameraCaptureSession cameraCaptureSession) {
        if (this.f164875g == null) {
            this.f164875g = C17747h.d(cameraCaptureSession, this.f164871c);
        }
    }

    void C(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.f164869a) {
            E();
            androidx.camera.core.impl.l.d(list);
            this.f164879k = list;
        }
    }

    boolean D() {
        boolean z10;
        synchronized (this.f164869a) {
            z10 = this.f164876h != null;
        }
        return z10;
    }

    void E() {
        synchronized (this.f164869a) {
            try {
                List<DeferrableSurface> list = this.f164879k;
                if (list != null) {
                    androidx.camera.core.impl.l.c(list);
                    this.f164879k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.J1
    public void a() throws CameraAccessException {
        o2.i.h(this.f164875g, "Need to call openCaptureSession before using this API.");
        this.f164875g.c().stopRepeating();
    }

    @Override // v.J1.a
    public Executor b() {
        return this.f164872d;
    }

    @Override // v.J1
    public void close() {
        o2.i.h(this.f164875g, "Need to call openCaptureSession before using this API.");
        this.f164870b.h(this);
        this.f164875g.c().close();
        b().execute(new Runnable() { // from class: v.L1
            @Override // java.lang.Runnable
            public final void run() {
                P1 p12 = this.f164776a;
                p12.A(p12);
            }
        });
    }

    @Override // v.J1.a
    public com.google.common.util.concurrent.q<Void> e(CameraDevice cameraDevice, final x.q qVar, final List<DeferrableSurface> list) {
        synchronized (this.f164869a) {
            try {
                if (this.f164881m) {
                    return I.n.n(new CancellationException("Opener is disabled"));
                }
                this.f164870b.k(this);
                final w.C cB = w.C.b(cameraDevice, this.f164871c);
                com.google.common.util.concurrent.q<Void> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.M1
                    @Override // androidx.concurrent.futures.c.InterfaceC1101c
                    public final Object a(c.a aVar) {
                        return P1.x(this.f164857a, list, cB, qVar, aVar);
                    }
                });
                this.f164876h = qVarA;
                I.n.j(qVarA, new a(), H.a.a());
                return I.n.s(this.f164876h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.J1
    public void g() throws CameraAccessException {
        o2.i.h(this.f164875g, "Need to call openCaptureSession before using this API.");
        this.f164875g.c().abortCaptures();
    }

    @Override // v.J1
    public CameraDevice h() {
        o2.i.g(this.f164875g);
        return this.f164875g.c().getDevice();
    }

    @Override // v.J1
    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        o2.i.h(this.f164875g, "Need to call openCaptureSession before using this API.");
        return this.f164875g.b(captureRequest, b(), captureCallback);
    }

    @Override // v.J1.a
    public com.google.common.util.concurrent.q<List<Surface>> j(final List<DeferrableSurface> list, long j10) {
        synchronized (this.f164869a) {
            try {
                if (this.f164881m) {
                    return I.n.n(new CancellationException("Opener is disabled"));
                }
                I.d dVarE = I.d.a(androidx.camera.core.impl.l.e(list, false, j10, b(), this.f164873e)).e(new I.a() { // from class: v.O1
                    @Override // I.a
                    public final com.google.common.util.concurrent.q apply(Object obj) {
                        return P1.z(this.f164866a, list, (List) obj);
                    }
                }, b());
                this.f164878j = dVarE;
                return I.n.s(dVarE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.J1
    public int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        o2.i.h(this.f164875g, "Need to call openCaptureSession before using this API.");
        return this.f164875g.a(list, b(), captureCallback);
    }

    @Override // v.J1
    public C17747h l() {
        o2.i.g(this.f164875g);
        return this.f164875g;
    }

    @Override // v.J1.a
    public x.q m(int i10, List<x.k> list, J1.c cVar) {
        this.f164874f = cVar;
        return new x.q(i10, list, b(), new b());
    }

    @Override // v.J1.c
    public void o(J1 j12) {
        Objects.requireNonNull(this.f164874f);
        this.f164874f.o(j12);
    }

    @Override // v.J1.c
    public void p(J1 j12) {
        Objects.requireNonNull(this.f164874f);
        this.f164874f.p(j12);
    }

    @Override // v.J1.c
    public void q(final J1 j12) {
        com.google.common.util.concurrent.q<Void> qVar;
        synchronized (this.f164869a) {
            try {
                if (this.f164880l) {
                    qVar = null;
                } else {
                    this.f164880l = true;
                    o2.i.h(this.f164876h, "Need to call openCaptureSession before using this API.");
                    qVar = this.f164876h;
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
                    P1.w(this.f164863a, j12);
                }
            }, H.a.a());
        }
    }

    @Override // v.J1.c
    public void r(J1 j12) {
        Objects.requireNonNull(this.f164874f);
        d();
        this.f164870b.i(this);
        this.f164874f.r(j12);
    }

    @Override // v.J1.c
    public void s(J1 j12) {
        Objects.requireNonNull(this.f164874f);
        this.f164870b.j(this);
        this.f164874f.s(j12);
    }

    @Override // v.J1.c
    public void t(J1 j12) {
        Objects.requireNonNull(this.f164874f);
        this.f164874f.t(j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // v.J1.c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void A(final J1 j12) {
        com.google.common.util.concurrent.q<Void> qVar;
        synchronized (this.f164869a) {
            try {
                if (this.f164882n) {
                    qVar = null;
                } else {
                    this.f164882n = true;
                    o2.i.h(this.f164876h, "Need to call openCaptureSession before using this API.");
                    qVar = this.f164876h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (qVar != null) {
            qVar.addListener(new Runnable() { // from class: v.K1
                @Override // java.lang.Runnable
                public final void run() {
                    P1.y(this.f164770a, j12);
                }
            }, H.a.a());
        }
    }

    @Override // v.J1.c
    public void v(J1 j12, Surface surface) {
        Objects.requireNonNull(this.f164874f);
        this.f164874f.v(j12, surface);
    }

    P1(C17518g1 c17518g1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f164870b = c17518g1;
        this.f164871c = handler;
        this.f164872d = executor;
        this.f164873e = scheduledExecutorService;
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
