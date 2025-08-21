package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import z.C18391h;
import z.C18392i;
import z.C18403t;
import z.C18405v;

/* loaded from: classes.dex */
class T1 extends P1 {

    /* renamed from: o, reason: collision with root package name */
    private final ScheduledExecutorService f164912o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f164913p;

    /* renamed from: q, reason: collision with root package name */
    private List<DeferrableSurface> f164914q;

    /* renamed from: r, reason: collision with root package name */
    com.google.common.util.concurrent.q<List<Void>> f164915r;

    /* renamed from: s, reason: collision with root package name */
    private final C18392i f164916s;

    /* renamed from: t, reason: collision with root package name */
    private final C18391h f164917t;

    /* renamed from: u, reason: collision with root package name */
    private final C18403t f164918u;

    /* renamed from: v, reason: collision with root package name */
    private final C18405v f164919v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f164920w;

    public static /* synthetic */ com.google.common.util.concurrent.q G(T1 t12, CameraDevice cameraDevice, x.q qVar, List list, List list2) {
        if (t12.f164919v.a()) {
            t12.I();
        }
        t12.J("start openCaptureSession");
        return super.e(cameraDevice, qVar, list);
    }

    public static /* synthetic */ void H(T1 t12) {
        t12.J("Session call super.close()");
        super.close();
    }

    private void I() {
        Iterator<J1> it = this.f164870b.d().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    void J(String str) {
        C.P.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // v.P1, v.J1
    public void close() {
        if (!this.f164920w.compareAndSet(false, true)) {
            J("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f164919v.a()) {
            try {
                J("Call abortCaptures() before closing session.");
                g();
            } catch (Exception e10) {
                J("Exception when calling abortCaptures()" + e10);
            }
        }
        J("Session call close()");
        this.f164918u.e().addListener(new Runnable() { // from class: v.R1
            @Override // java.lang.Runnable
            public final void run() {
                T1.H(this.f164890a);
            }
        }, b());
    }

    @Override // v.P1, v.J1.a
    public com.google.common.util.concurrent.q<Void> e(final CameraDevice cameraDevice, final x.q qVar, final List<DeferrableSurface> list) {
        com.google.common.util.concurrent.q<Void> qVarS;
        synchronized (this.f164913p) {
            try {
                List<J1> listD = this.f164870b.d();
                ArrayList arrayList = new ArrayList();
                Iterator<J1> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().n());
                }
                com.google.common.util.concurrent.q<List<Void>> qVarW = I.n.w(arrayList);
                this.f164915r = qVarW;
                qVarS = I.n.s(I.d.a(qVarW).e(new I.a() { // from class: v.S1
                    @Override // I.a
                    public final com.google.common.util.concurrent.q apply(Object obj) {
                        return T1.G(this.f164893a, cameraDevice, qVar, list, (List) obj);
                    }
                }, b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVarS;
    }

    @Override // v.P1, v.J1
    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.i(captureRequest, this.f164918u.d(captureCallback));
    }

    @Override // v.P1, v.J1.a
    public com.google.common.util.concurrent.q<List<Surface>> j(List<DeferrableSurface> list, long j10) {
        com.google.common.util.concurrent.q<List<Surface>> qVarJ;
        synchronized (this.f164913p) {
            this.f164914q = list;
            qVarJ = super.j(list, j10);
        }
        return qVarJ;
    }

    @Override // v.P1, v.J1
    public int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.k(list, this.f164918u.d(captureCallback));
    }

    @Override // v.J1
    public com.google.common.util.concurrent.q<Void> n() {
        return I.n.q(1500L, this.f164912o, this.f164918u.e());
    }

    @Override // v.P1, v.J1.c
    public void q(J1 j12) {
        synchronized (this.f164913p) {
            this.f164916s.a(this.f164914q);
        }
        J("onClosed()");
        super.q(j12);
    }

    @Override // v.P1, v.J1.c
    public void s(J1 j12) {
        J("Session onConfigured()");
        this.f164917t.c(j12, this.f164870b.e(), this.f164870b.d(), new C18391h.a() { // from class: v.Q1
            @Override // z.C18391h.a
            public final void a(J1 j13) {
                super/*v.P1*/.s(j13);
            }
        });
    }

    @Override // v.P1, v.J1.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f164913p) {
            try {
                if (D()) {
                    this.f164916s.a(this.f164914q);
                } else {
                    com.google.common.util.concurrent.q<List<Void>> qVar = this.f164915r;
                    if (qVar != null) {
                        qVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zStop;
    }

    T1(F.l0 l0Var, F.l0 l0Var2, C17518g1 c17518g1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c17518g1, executor, scheduledExecutorService, handler);
        this.f164913p = new Object();
        this.f164920w = new AtomicBoolean(false);
        this.f164916s = new C18392i(l0Var, l0Var2);
        this.f164918u = new C18403t(l0Var.a(CaptureSessionStuckQuirk.class) || l0Var.a(IncorrectCaptureStateQuirk.class));
        this.f164917t = new C18391h(l0Var2);
        this.f164919v = new C18405v(l0Var2);
        this.f164912o = scheduledExecutorService;
    }

    @Override // v.P1, v.J1
    public void d() {
        super.d();
        this.f164918u.g();
    }

    @Override // v.P1, v.J1
    public void f(int i10) {
        super.f(i10);
        if (i10 == 5) {
            synchronized (this.f164913p) {
                try {
                    if (D() && this.f164914q != null) {
                        J("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<DeferrableSurface> it = this.f164914q.iterator();
                        while (it.hasNext()) {
                            it.next().d();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
