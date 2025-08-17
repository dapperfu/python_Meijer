package v;

import B.j;
import F.AbstractC3611h;
import F.r0;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q.InterfaceC16423a;
import u.C17169a;
import v.J1;

/* loaded from: classes.dex */
final class E1 implements InterfaceC17370d1 {

    /* renamed from: p, reason: collision with root package name */
    private static List<DeferrableSurface> f163639p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private static int f163640q = 0;

    /* renamed from: a, reason: collision with root package name */
    private final F.r0 f163641a;

    /* renamed from: b, reason: collision with root package name */
    private final T f163642b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f163643c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f163644d;

    /* renamed from: e, reason: collision with root package name */
    private final C17367c1 f163645e;

    /* renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.w f163647g;

    /* renamed from: h, reason: collision with root package name */
    private I0 f163648h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.camera.core.impl.w f163649i;

    /* renamed from: j, reason: collision with root package name */
    private c f163650j;

    /* renamed from: l, reason: collision with root package name */
    private final d f163652l;

    /* renamed from: o, reason: collision with root package name */
    private int f163655o;

    /* renamed from: f, reason: collision with root package name */
    private List<DeferrableSurface> f163646f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private volatile List<androidx.camera.core.impl.i> f163651k = null;

    /* renamed from: m, reason: collision with root package name */
    private B.j f163653m = new j.a().d();

    /* renamed from: n, reason: collision with root package name */
    private B.j f163654n = new j.a().d();

    class a implements I.c<Void> {
        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        a() {
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            C.P.d("ProcessingCaptureSession", "open session failed ", th2);
            E1.this.close();
            E1.this.d(false);
        }
    }

    private static class b implements r0.a {

        /* renamed from: a, reason: collision with root package name */
        private List<AbstractC3611h> f163657a;

        /* renamed from: b, reason: collision with root package name */
        private final int f163658b;

        /* renamed from: c, reason: collision with root package name */
        private F.r f163659c;

        /* synthetic */ b(int i10, List list, a aVar) {
            this(i10, list);
        }

        private b(int i10, List<AbstractC3611h> list) {
            this.f163659c = null;
            this.f163658b = i10;
            this.f163657a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum c {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    private boolean v(int i10) {
        return i10 == 2 || i10 == 4;
    }

    @Override // v.InterfaceC17370d1
    public void i(Map<DeferrableSurface, Long> map) {
    }

    private static class d implements r0.a {
        d() {
        }
    }

    public static /* synthetic */ Void j(E1 e12, Void r12) {
        e12.y(e12.f163645e);
        return null;
    }

    public static /* synthetic */ void l(E1 e12, DeferrableSurface deferrableSurface) {
        androidx.camera.core.impl.l.c(e12.f163646f);
        if (deferrableSurface != null) {
            deferrableSurface.e();
        }
    }

    private static List<F.s0> p(List<DeferrableSurface> list) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            o2.i.b(deferrableSurface instanceof F.s0, "Surface must be SessionProcessorSurface");
            arrayList.add((F.s0) deferrableSurface);
        }
        return arrayList;
    }

    private void z(B.j jVar, B.j jVar2) {
        C17169a.C2558a c2558a = new C17169a.C2558a();
        c2558a.d(jVar);
        c2558a.d(jVar2);
        this.f163641a.h(c2558a.c());
    }

    @Override // v.InterfaceC17370d1
    public boolean b() {
        return this.f163645e.b();
    }

    @Override // v.InterfaceC17370d1
    public void c() {
        C.P.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f163655o + ")");
        if (this.f163651k != null) {
            for (androidx.camera.core.impl.i iVar : this.f163651k) {
                Iterator<AbstractC3611h> it = iVar.c().iterator();
                while (it.hasNext()) {
                    it.next().a(iVar.f());
                }
            }
            this.f163651k = null;
        }
    }

    @Override // v.InterfaceC17370d1
    public void close() {
        C.P.a("ProcessingCaptureSession", "close (id=" + this.f163655o + ") state=" + this.f163650j);
        if (this.f163650j == c.ON_CAPTURE_SESSION_STARTED) {
            C.P.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f163655o + ")");
            this.f163641a.e();
            I0 i02 = this.f163648h;
            if (i02 != null) {
                i02.a();
            }
            this.f163650j = c.ON_CAPTURE_SESSION_ENDED;
        }
        this.f163645e.close();
    }

    @Override // v.InterfaceC17370d1
    public com.google.common.util.concurrent.q<Void> d(boolean z10) {
        C.P.a("ProcessingCaptureSession", "release (id=" + this.f163655o + ") mProcessorState=" + this.f163650j);
        com.google.common.util.concurrent.q<Void> qVarD = this.f163645e.d(z10);
        int iOrdinal = this.f163650j.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            qVarD.addListener(new Runnable() { // from class: v.z1
                @Override // java.lang.Runnable
                public final void run() {
                    E1.n(this.f164229a);
                }
            }, H.a.a());
        }
        this.f163650j = c.DE_INITIALIZED;
        return qVarD;
    }

    @Override // v.InterfaceC17370d1
    public List<androidx.camera.core.impl.i> e() {
        return this.f163651k != null ? this.f163651k : Collections.EMPTY_LIST;
    }

    @Override // v.InterfaceC17370d1
    public androidx.camera.core.impl.w f() {
        return this.f163647g;
    }

    @Override // v.InterfaceC17370d1
    public com.google.common.util.concurrent.q<Void> g(final androidx.camera.core.impl.w wVar, final CameraDevice cameraDevice, final J1.a aVar) {
        o2.i.b(this.f163650j == c.UNINITIALIZED, "Invalid state state:" + this.f163650j);
        o2.i.b(wVar.o().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C.P.a("ProcessingCaptureSession", "open (id=" + this.f163655o + ")");
        List<DeferrableSurface> listO = wVar.o();
        this.f163646f = listO;
        return I.d.a(androidx.camera.core.impl.l.e(listO, false, 5000L, this.f163643c, this.f163644d)).e(new I.a() { // from class: v.A1
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return E1.m(this.f163624a, wVar, cameraDevice, aVar, (List) obj);
            }
        }, this.f163643c).d(new InterfaceC16423a() { // from class: v.B1
            @Override // q.InterfaceC16423a
            public final Object apply(Object obj) {
                return E1.j(this.f163630a, (Void) obj);
            }
        }, this.f163643c);
    }

    @Override // v.InterfaceC17370d1
    public void h(androidx.camera.core.impl.w wVar) {
        C.P.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f163655o + ")");
        this.f163647g = wVar;
        if (wVar == null) {
            return;
        }
        I0 i02 = this.f163648h;
        if (i02 != null) {
            i02.b(wVar);
        }
        if (this.f163650j == c.ON_CAPTURE_SESSION_STARTED) {
            B.j jVarD = j.a.e(wVar.f()).d();
            this.f163653m = jVarD;
            z(jVarD, this.f163654n);
            if (q(wVar.k())) {
                this.f163641a.b(wVar.k().j(), this.f163652l);
            } else {
                this.f163641a.a();
            }
        }
    }

    void x(androidx.camera.core.impl.i iVar) {
        C.P.a("ProcessingCaptureSession", "issueTriggerRequest");
        B.j jVarD = j.a.e(iVar.g()).d();
        Iterator<k.a<?>> it = jVarD.f().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.f163641a.c(jVarD, iVar.j(), new b(iVar.f(), iVar.c(), null));
                return;
            }
        }
        o(Arrays.asList(iVar));
    }

    void y(C17367c1 c17367c1) {
        if (this.f163650j != c.SESSION_INITIALIZED) {
            return;
        }
        this.f163648h = new I0(c17367c1, p(this.f163649i.o()));
        C.P.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f163655o + ")");
        this.f163641a.d(this.f163648h);
        this.f163650j = c.ON_CAPTURE_SESSION_STARTED;
        androidx.camera.core.impl.w wVar = this.f163647g;
        if (wVar != null) {
            h(wVar);
        }
        if (this.f163651k != null) {
            a(this.f163651k);
            this.f163651k = null;
        }
    }

    E1(F.r0 r0Var, T t10, x.g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f163655o = 0;
        this.f163645e = new C17367c1(gVar, androidx.camera.camera2.internal.compat.quirk.b.b(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.f163641a = r0Var;
        this.f163642b = t10;
        this.f163643c = executor;
        this.f163644d = scheduledExecutorService;
        this.f163650j = c.UNINITIALIZED;
        this.f163652l = new d();
        int i10 = f163640q;
        f163640q = i10 + 1;
        this.f163655o = i10;
        C.P.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f163655o + ")");
    }

    public static /* synthetic */ com.google.common.util.concurrent.q m(final E1 e12, androidx.camera.core.impl.w wVar, CameraDevice cameraDevice, J1.a aVar, List list) {
        F.e0 e0VarA;
        e12.getClass();
        C.P.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + e12.f163655o + ")");
        if (e12.f163650j == c.DE_INITIALIZED) {
            return I.n.n(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final DeferrableSurface deferrableSurfaceF = null;
        if (list.contains(null)) {
            return I.n.n(new DeferrableSurface.SurfaceClosedException("Surface closed", wVar.o().get(list.indexOf(null))));
        }
        F.e0 e0VarA2 = null;
        F.e0 e0VarA3 = null;
        F.e0 e0VarA4 = null;
        for (int i10 = 0; i10 < wVar.o().size(); i10++) {
            DeferrableSurface deferrableSurface = wVar.o().get(i10);
            if (!t(deferrableSurface) && !u(deferrableSurface)) {
                if (s(deferrableSurface)) {
                    e0VarA3 = F.e0.a(deferrableSurface.j().get(), deferrableSurface.h(), deferrableSurface.i());
                } else if (r(deferrableSurface)) {
                    e0VarA4 = F.e0.a(deferrableSurface.j().get(), deferrableSurface.h(), deferrableSurface.i());
                }
            } else {
                e0VarA2 = F.e0.a(deferrableSurface.j().get(), deferrableSurface.h(), deferrableSurface.i());
            }
        }
        if (wVar.i() != null) {
            deferrableSurfaceF = wVar.i().f();
            e0VarA = F.e0.a(deferrableSurfaceF.j().get(), deferrableSurfaceF.h(), deferrableSurfaceF.i());
        } else {
            e0VarA = null;
        }
        e12.f163650j = c.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(e12.f163646f);
            if (deferrableSurfaceF != null) {
                arrayList.add(deferrableSurfaceF);
            }
            androidx.camera.core.impl.l.d(arrayList);
            C.P.l("ProcessingCaptureSession", "== initSession (id=" + e12.f163655o + ")");
            try {
                androidx.camera.core.impl.w wVarI = e12.f163641a.i(e12.f163642b, F.f0.a(e0VarA2, e0VarA3, e0VarA4, e0VarA));
                e12.f163649i = wVarI;
                wVarI.o().get(0).k().addListener(new Runnable() { // from class: v.C1
                    @Override // java.lang.Runnable
                    public final void run() {
                        E1.l(this.f163632a, deferrableSurfaceF);
                    }
                }, H.a.a());
                for (final DeferrableSurface deferrableSurface2 : e12.f163649i.o()) {
                    f163639p.add(deferrableSurface2);
                    deferrableSurface2.k().addListener(new Runnable() { // from class: v.D1
                        @Override // java.lang.Runnable
                        public final void run() {
                            E1.f163639p.remove(deferrableSurface2);
                        }
                    }, e12.f163643c);
                }
                w.h hVar = new w.h();
                hVar.b(wVar);
                hVar.d();
                hVar.b(e12.f163649i);
                o2.i.b(hVar.f(), "Cannot transform the SessionConfig");
                com.google.common.util.concurrent.q<Void> qVarG = e12.f163645e.g(hVar.c(), (CameraDevice) o2.i.g(cameraDevice), aVar);
                I.n.j(qVarG, e12.new a(), e12.f163643c);
                return qVarG;
            } catch (Throwable th2) {
                C.P.d("ProcessingCaptureSession", "initSession failed", th2);
                androidx.camera.core.impl.l.c(e12.f163646f);
                if (deferrableSurfaceF != null) {
                    deferrableSurfaceF.e();
                }
                throw th2;
            }
        } catch (DeferrableSurface.SurfaceClosedException e10) {
            return I.n.n(e10);
        }
    }

    public static /* synthetic */ void n(E1 e12) {
        e12.getClass();
        C.P.a("ProcessingCaptureSession", "== deInitSession (id=" + e12.f163655o + ")");
        e12.f163641a.f();
    }

    private static void o(List<androidx.camera.core.impl.i> list) {
        for (androidx.camera.core.impl.i iVar : list) {
            Iterator<AbstractC3611h> it = iVar.c().iterator();
            while (it.hasNext()) {
                it.next().a(iVar.f());
            }
        }
    }

    private static boolean q(androidx.camera.core.impl.i iVar) {
        for (DeferrableSurface deferrableSurface : iVar.i()) {
            if (t(deferrableSurface) || u(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private static boolean r(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), androidx.camera.core.f.class);
    }

    private static boolean s(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), C.H.class);
    }

    private static boolean t(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), C.Y.class);
    }

    private static boolean u(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.g(), S.f.class);
    }

    @Override // v.InterfaceC17370d1
    public void a(List<androidx.camera.core.impl.i> list) {
        if (!list.isEmpty()) {
            C.P.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f163655o + ") + state =" + this.f163650j);
            int iOrdinal = this.f163650j.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3 || iOrdinal == 4) {
                        C.P.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f163650j);
                        o(list);
                        return;
                    }
                    return;
                }
                for (androidx.camera.core.impl.i iVar : list) {
                    if (v(iVar.k())) {
                        w(iVar);
                    } else {
                        x(iVar);
                    }
                }
                return;
            }
            if (this.f163651k != null) {
                o(list);
                C.P.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
            } else {
                this.f163651k = list;
            }
        }
    }

    void w(androidx.camera.core.impl.i iVar) {
        j.a aVarE = j.a.e(iVar.g());
        androidx.camera.core.impl.k kVarG = iVar.g();
        k.a<Integer> aVar = androidx.camera.core.impl.i.f47400i;
        if (kVarG.c(aVar)) {
            aVarE.f(CaptureRequest.JPEG_ORIENTATION, (Integer) iVar.g().a(aVar));
        }
        androidx.camera.core.impl.k kVarG2 = iVar.g();
        k.a<Integer> aVar2 = androidx.camera.core.impl.i.f47401j;
        if (kVarG2.c(aVar2)) {
            aVarE.f(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) iVar.g().a(aVar2)).byteValue()));
        }
        B.j jVarD = aVarE.d();
        this.f163654n = jVarD;
        z(this.f163653m, jVarD);
        this.f163641a.j(iVar.m(), iVar.j(), new b(iVar.f(), iVar.c(), null));
    }
}
