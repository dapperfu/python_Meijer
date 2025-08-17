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
import z.C18328h;
import z.C18329i;
import z.C18340t;
import z.C18342v;

/* loaded from: classes.dex */
class T1 extends P1 {

    /* renamed from: o, reason: collision with root package name */
    private final ScheduledExecutorService f163878o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f163879p;

    /* renamed from: q, reason: collision with root package name */
    private List<DeferrableSurface> f163880q;

    /* renamed from: r, reason: collision with root package name */
    com.google.common.util.concurrent.q<List<Void>> f163881r;

    /* renamed from: s, reason: collision with root package name */
    private final C18329i f163882s;

    /* renamed from: t, reason: collision with root package name */
    private final C18328h f163883t;

    /* renamed from: u, reason: collision with root package name */
    private final C18340t f163884u;

    /* renamed from: v, reason: collision with root package name */
    private final C18342v f163885v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f163886w;

    public static /* synthetic */ com.google.common.util.concurrent.q G(T1 t12, CameraDevice cameraDevice, x.q qVar, List list, List list2) {
        if (t12.f163885v.a()) {
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
        Iterator<J1> it = this.f163836b.d().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    void J(String str) {
        C.P.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // v.P1, v.J1
    public void close() {
        if (!this.f163886w.compareAndSet(false, true)) {
            J("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f163885v.a()) {
            try {
                J("Call abortCaptures() before closing session.");
                g();
            } catch (Exception e10) {
                J("Exception when calling abortCaptures()" + e10);
            }
        }
        J("Session call close()");
        this.f163884u.e().addListener(new Runnable() { // from class: v.R1
            @Override // java.lang.Runnable
            public final void run() {
                T1.H(this.f163856a);
            }
        }, b());
    }

    @Override // v.P1, v.J1.a
    public com.google.common.util.concurrent.q<Void> e(final CameraDevice cameraDevice, final x.q qVar, final List<DeferrableSurface> list) {
        com.google.common.util.concurrent.q<Void> qVarS;
        synchronized (this.f163879p) {
            try {
                List<J1> listD = this.f163836b.d();
                ArrayList arrayList = new ArrayList();
                Iterator<J1> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().n());
                }
                com.google.common.util.concurrent.q<List<Void>> qVarW = I.n.w(arrayList);
                this.f163881r = qVarW;
                qVarS = I.n.s(I.d.a(qVarW).e(new I.a() { // from class: v.S1
                    @Override // I.a
                    public final com.google.common.util.concurrent.q apply(Object obj) {
                        return T1.G(this.f163859a, cameraDevice, qVar, list, (List) obj);
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
        return super.i(captureRequest, this.f163884u.d(captureCallback));
    }

    @Override // v.P1, v.J1.a
    public com.google.common.util.concurrent.q<List<Surface>> j(List<DeferrableSurface> list, long j10) {
        com.google.common.util.concurrent.q<List<Surface>> qVarJ;
        synchronized (this.f163879p) {
            this.f163880q = list;
            qVarJ = super.j(list, j10);
        }
        return qVarJ;
    }

    @Override // v.P1, v.J1
    public int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.k(list, this.f163884u.d(captureCallback));
    }

    @Override // v.J1
    public com.google.common.util.concurrent.q<Void> n() {
        return I.n.q(1500L, this.f163878o, this.f163884u.e());
    }

    @Override // v.P1, v.J1.c
    public void q(J1 j12) {
        synchronized (this.f163879p) {
            this.f163882s.a(this.f163880q);
        }
        J("onClosed()");
        super.q(j12);
    }

    @Override // v.P1, v.J1.c
    public void s(J1 j12) {
        J("Session onConfigured()");
        this.f163883t.c(j12, this.f163836b.e(), this.f163836b.d(), new C18328h.a() { // from class: v.Q1
            @Override // z.C18328h.a
            public final void a(J1 j13) {
                super/*v.P1*/.s(j13);
            }
        });
    }

    @Override // v.P1, v.J1.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f163879p) {
            try {
                if (D()) {
                    this.f163882s.a(this.f163880q);
                } else {
                    com.google.common.util.concurrent.q<List<Void>> qVar = this.f163881r;
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

    T1(F.l0 l0Var, F.l0 l0Var2, C17379g1 c17379g1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c17379g1, executor, scheduledExecutorService, handler);
        this.f163879p = new Object();
        this.f163886w = new AtomicBoolean(false);
        this.f163882s = new C18329i(l0Var, l0Var2);
        this.f163884u = new C18340t(l0Var.a(CaptureSessionStuckQuirk.class) || l0Var.a(IncorrectCaptureStateQuirk.class));
        this.f163883t = new C18328h(l0Var2);
        this.f163885v = new C18342v(l0Var2);
        this.f163878o = scheduledExecutorService;
    }

    @Override // v.P1, v.J1
    public void d() {
        super.d();
        this.f163884u.g();
    }

    @Override // v.P1, v.J1
    public void f(int i10) {
        super.f(i10);
        if (i10 == 5) {
            synchronized (this.f163879p) {
                try {
                    if (D() && this.f163880q != null) {
                        J("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<DeferrableSurface> it = this.f163880q.iterator();
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
