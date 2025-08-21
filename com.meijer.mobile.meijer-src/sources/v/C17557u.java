package v;

import B.j;
import C.H;
import E.InterfaceC3170j;
import F.AbstractC3273h;
import F.C3275j;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.w;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import u.C17296a;
import v.C17557u;
import z.C18384a;
import z.C18385b;

/* renamed from: v.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17557u implements CameraControlInternal {

    /* renamed from: b, reason: collision with root package name */
    final b f165194b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f165195c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f165196d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final w.B f165197e;

    /* renamed from: f, reason: collision with root package name */
    private final CameraControlInternal.c f165198f;

    /* renamed from: g, reason: collision with root package name */
    private final w.b f165199g;

    /* renamed from: h, reason: collision with root package name */
    private final C17553s1 f165200h;

    /* renamed from: i, reason: collision with root package name */
    private final a2 f165201i;

    /* renamed from: j, reason: collision with root package name */
    private final X1 f165202j;

    /* renamed from: k, reason: collision with root package name */
    private final C17530k1 f165203k;

    /* renamed from: l, reason: collision with root package name */
    c2 f165204l;

    /* renamed from: m, reason: collision with root package name */
    private final B.g f165205m;

    /* renamed from: n, reason: collision with root package name */
    private final C17499a0 f165206n;

    /* renamed from: o, reason: collision with root package name */
    private final Z1 f165207o;

    /* renamed from: p, reason: collision with root package name */
    private int f165208p;

    /* renamed from: q, reason: collision with root package name */
    private H.i f165209q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f165210r;

    /* renamed from: s, reason: collision with root package name */
    private volatile int f165211s;

    /* renamed from: t, reason: collision with root package name */
    private final C18384a f165212t;

    /* renamed from: u, reason: collision with root package name */
    private final C18385b f165213u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicLong f165214v;

    /* renamed from: w, reason: collision with root package name */
    private volatile com.google.common.util.concurrent.q<Void> f165215w;

    /* renamed from: x, reason: collision with root package name */
    private int f165216x;

    /* renamed from: y, reason: collision with root package name */
    private long f165217y;

    /* renamed from: z, reason: collision with root package name */
    private final a f165218z;

    /* renamed from: v.u$a */
    static final class a extends AbstractC3273h {

        /* renamed from: a, reason: collision with root package name */
        Set<AbstractC3273h> f165219a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        Map<AbstractC3273h, Executor> f165220b = new ArrayMap();

        @Override // F.AbstractC3273h
        public void a(final int i10) {
            for (final AbstractC3273h abstractC3273h : this.f165219a) {
                try {
                    this.f165220b.get(abstractC3273h).execute(new Runnable() { // from class: v.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC3273h.a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C.P.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // F.AbstractC3273h
        public void b(final int i10, final F.r rVar) {
            for (final AbstractC3273h abstractC3273h : this.f165219a) {
                try {
                    this.f165220b.get(abstractC3273h).execute(new Runnable() { // from class: v.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC3273h.b(i10, rVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C.P.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // F.AbstractC3273h
        public void c(final int i10, final C3275j c3275j) {
            for (final AbstractC3273h abstractC3273h : this.f165219a) {
                try {
                    this.f165220b.get(abstractC3273h).execute(new Runnable() { // from class: v.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC3273h.c(i10, c3275j);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C.P.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void h(Executor executor, AbstractC3273h abstractC3273h) {
            this.f165219a.add(abstractC3273h);
            this.f165220b.put(abstractC3273h, executor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void i(AbstractC3273h abstractC3273h) {
            this.f165219a.remove(abstractC3273h);
            this.f165220b.remove(abstractC3273h);
        }

        a() {
        }
    }

    /* renamed from: v.u$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final Set<c> f165221a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f165222b;

        void b(c cVar) {
            this.f165221a.add(cVar);
        }

        void c(c cVar) {
            this.f165221a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f165222b.execute(new Runnable() { // from class: v.v
                @Override // java.lang.Runnable
                public final void run() {
                    C17557u.b.a(this.f165226a, totalCaptureResult);
                }
            });
        }

        b(Executor executor) {
            this.f165222b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f165221a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                bVar.f165221a.removeAll(hashSet);
            }
        }
    }

    /* renamed from: v.u$c */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    private static boolean N(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }

    void S() {
        V(1);
    }

    public static int D(w.B b10, int i10) {
        int[] iArr = (int[]) b10.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return N(i10, iArr) ? i10 : N(1, iArr) ? 1 : 0;
    }

    private int F(int i10) {
        int[] iArr = (int[]) this.f165197e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return N(i10, iArr) ? i10 : N(1, iArr) ? 1 : 0;
    }

    private com.google.common.util.concurrent.q<Void> a0(final long j10) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.h
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C17557u.o(this.f165083a, j10, aVar);
            }
        });
    }

    public static /* synthetic */ Object p(final C17557u c17557u, final c.a aVar) {
        c17557u.f165195c.execute(new Runnable() { // from class: v.q
            @Override // java.lang.Runnable
            public final void run() {
                C17557u c17557u2 = this.f165145a;
                I.n.t(c17557u2.a0(c17557u2.Z()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public androidx.camera.core.impl.w A() {
        this.f165199g.w(this.f165216x);
        this.f165199g.s(B());
        this.f165199g.n("CameraControlSessionUpdateId", Long.valueOf(this.f165217y));
        return this.f165199g.o();
    }

    androidx.camera.core.impl.k B() {
        C17296a.C2582a c2582a = new C17296a.C2582a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        k.c cVar = k.c.REQUIRED;
        c2582a.g(key, 1, cVar);
        this.f165200h.g(c2582a);
        this.f165212t.a(c2582a);
        this.f165201i.a(c2582a);
        int iA = this.f165200h.s() ? 5 : 1;
        if (this.f165210r) {
            c2582a.g(CaptureRequest.FLASH_MODE, 2, cVar);
        } else {
            int i10 = this.f165211s;
            if (i10 == 0) {
                iA = this.f165213u.a(2);
            } else if (i10 == 1) {
                iA = 3;
            } else if (i10 == 2) {
                iA = 1;
            }
        }
        c2582a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(C(iA)), cVar);
        c2582a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(F(1)), cVar);
        this.f165203k.c(c2582a);
        this.f165205m.i(c2582a);
        return c2582a.c();
    }

    int C(int i10) {
        return D(this.f165197e, i10);
    }

    int E(int i10) {
        int[] iArr = (int[]) this.f165197e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (N(i10, iArr)) {
            return i10;
        }
        if (N(4, iArr)) {
            return 4;
        }
        return N(1, iArr) ? 1 : 0;
    }

    public X1 G() {
        return this.f165202j;
    }

    int H() {
        int i10;
        synchronized (this.f165196d) {
            i10 = this.f165208p;
        }
        return i10;
    }

    public a2 I() {
        return this.f165201i;
    }

    public c2 J() {
        return this.f165204l;
    }

    void K() {
        synchronized (this.f165196d) {
            this.f165208p++;
        }
    }

    public boolean M() {
        int iA = this.f165207o.a();
        C.P.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iA);
        return iA > 0;
    }

    boolean P() {
        return this.f165210r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(c cVar) {
        this.f165194b.c(cVar);
    }

    void R(final AbstractC3273h abstractC3273h) {
        this.f165195c.execute(new Runnable() { // from class: v.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f165132a.f165218z.i(abstractC3273h);
            }
        });
    }

    void T(boolean z10) {
        C.P.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f165200h.t(z10);
        this.f165201i.f(z10);
        this.f165202j.d(z10);
        this.f165203k.b(z10);
        this.f165205m.o(z10);
        if (z10) {
            return;
        }
        this.f165209q = null;
        this.f165207o.b();
    }

    public void U(Rational rational) {
        this.f165200h.u(rational);
    }

    void V(int i10) {
        this.f165216x = i10;
        this.f165200h.v(i10);
        this.f165206n.g(this.f165216x);
    }

    public void W(boolean z10) {
        this.f165204l.d(z10);
    }

    void X(List<androidx.camera.core.impl.i> list) {
        this.f165198f.b(list);
    }

    public com.google.common.util.concurrent.q<Void> Y() {
        return I.n.s(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.o
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C17557u.p(this.f165138a, aVar);
            }
        }));
    }

    long Z() {
        this.f165217y = this.f165214v.getAndIncrement();
        this.f165198f.a();
        return this.f165217y;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void a(w.b bVar) {
        this.f165204l.a(bVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect c() {
        Rect rect = (Rect) this.f165197e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) o2.i.g(rect);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.k e() {
        return this.f165205m.n();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void f(H.i iVar) {
        this.f165209q = iVar;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void g(androidx.camera.core.impl.k kVar) {
        this.f165205m.g(j.a.e(kVar).d()).addListener(new Runnable() { // from class: v.l
            @Override // java.lang.Runnable
            public final void run() {
                C17557u.j();
            }
        }, H.a.a());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void i() {
        this.f165205m.j().addListener(new Runnable() { // from class: v.p
            @Override // java.lang.Runnable
            public final void run() {
                C17557u.k();
            }
        }, H.a.a());
    }

    void t(c cVar) {
        this.f165194b.b(cVar);
    }

    void u(final Executor executor, final AbstractC3273h abstractC3273h) {
        this.f165195c.execute(new Runnable() { // from class: v.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f165112a.f165218z.h(executor, abstractC3273h);
            }
        });
    }

    void v() {
        synchronized (this.f165196d) {
            try {
                int i10 = this.f165208p;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f165208p = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void w(boolean z10) {
        this.f165210r = z10;
        if (!z10) {
            i.a aVar = new i.a();
            aVar.u(this.f165216x);
            aVar.v(true);
            C17296a.C2582a c2582a = new C17296a.C2582a();
            c2582a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(C(1)));
            c2582a.f(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c2582a.c());
            X(Collections.singletonList(aVar.h()));
        }
        Z();
    }

    public int x() {
        return this.f165211s;
    }

    public C17553s1 y() {
        return this.f165200h;
    }

    public H.i z() {
        return this.f165209q;
    }

    C17557u(w.B b10, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.c cVar, F.l0 l0Var) {
        w.b bVar = new w.b();
        this.f165199g = bVar;
        this.f165208p = 0;
        this.f165210r = false;
        this.f165211s = 2;
        this.f165214v = new AtomicLong(0L);
        this.f165215w = I.n.p(null);
        this.f165216x = 1;
        this.f165217y = 0L;
        a aVar = new a();
        this.f165218z = aVar;
        this.f165197e = b10;
        this.f165198f = cVar;
        this.f165195c = executor;
        this.f165207o = new Z1(executor);
        b bVar2 = new b(executor);
        this.f165194b = bVar2;
        bVar.w(this.f165216x);
        bVar.j(T0.e(bVar2));
        bVar.j(aVar);
        this.f165203k = new C17530k1(this, b10, executor);
        this.f165200h = new C17553s1(this, scheduledExecutorService, executor, l0Var);
        this.f165201i = new a2(this, b10, executor);
        this.f165202j = new X1(this, b10, executor);
        this.f165204l = new g2(b10);
        this.f165212t = new C18384a(l0Var);
        this.f165213u = new C18385b(l0Var);
        this.f165205m = new B.g(this, executor);
        this.f165206n = new C17499a0(this, b10, l0Var, executor, scheduledExecutorService);
    }

    private boolean L() {
        if (H() > 0) {
            return true;
        }
        return false;
    }

    static boolean O(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof F.x0) || (l10 = (Long) ((F.x0) tag).d("CameraControlSessionUpdateId")) == null || l10.longValue() < j10) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object o(C17557u c17557u, final long j10, final c.a aVar) {
        c17557u.getClass();
        c17557u.t(new c() { // from class: v.i
            @Override // v.C17557u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C17557u.s(j10, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public static /* synthetic */ boolean s(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (O(totalCaptureResult, j10)) {
            aVar.c(null);
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.q<List<Void>> b(final List<androidx.camera.core.impl.i> list, final int i10, final int i11) {
        if (!L()) {
            C.P.l("Camera2CameraControlImp", "Camera is not active.");
            return I.n.n(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int iX = x();
        return I.d.a(I.n.s(this.f165215w)).e(new I.a() { // from class: v.j
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return this.f165104a.f165206n.h(list, i10, iX, i11);
            }
        }, this.f165195c);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void d(int i10) {
        if (!L()) {
            C.P.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f165211s = i10;
        C.P.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f165211s);
        c2 c2Var = this.f165204l;
        boolean z10 = true;
        if (this.f165211s != 1 && this.f165211s != 0) {
            z10 = false;
        }
        c2Var.c(z10);
        this.f165215w = Y();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.q<InterfaceC3170j> h(final int i10, final int i11) {
        if (!L()) {
            C.P.l("Camera2CameraControlImp", "Camera is not active.");
            return I.n.n(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int iX = x();
        return I.d.a(I.n.s(this.f165215w)).e(new I.a() { // from class: v.m
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return I.n.p(this.f165125a.f165206n.c(i10, iX, i11));
            }
        }, this.f165195c);
    }
}
