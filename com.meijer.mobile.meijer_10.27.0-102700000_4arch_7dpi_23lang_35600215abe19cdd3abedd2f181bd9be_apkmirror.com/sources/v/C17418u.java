package v;

import B.j;
import C.H;
import E.InterfaceC3408j;
import F.AbstractC3611h;
import F.C3613j;
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
import u.C17169a;
import v.C17418u;
import z.C18321a;
import z.C18322b;

/* renamed from: v.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17418u implements CameraControlInternal {

    /* renamed from: b, reason: collision with root package name */
    final b f164160b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f164161c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f164162d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final w.B f164163e;

    /* renamed from: f, reason: collision with root package name */
    private final CameraControlInternal.c f164164f;

    /* renamed from: g, reason: collision with root package name */
    private final w.b f164165g;

    /* renamed from: h, reason: collision with root package name */
    private final C17414s1 f164166h;

    /* renamed from: i, reason: collision with root package name */
    private final a2 f164167i;

    /* renamed from: j, reason: collision with root package name */
    private final X1 f164168j;

    /* renamed from: k, reason: collision with root package name */
    private final C17391k1 f164169k;

    /* renamed from: l, reason: collision with root package name */
    c2 f164170l;

    /* renamed from: m, reason: collision with root package name */
    private final B.g f164171m;

    /* renamed from: n, reason: collision with root package name */
    private final C17360a0 f164172n;

    /* renamed from: o, reason: collision with root package name */
    private final Z1 f164173o;

    /* renamed from: p, reason: collision with root package name */
    private int f164174p;

    /* renamed from: q, reason: collision with root package name */
    private H.i f164175q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f164176r;

    /* renamed from: s, reason: collision with root package name */
    private volatile int f164177s;

    /* renamed from: t, reason: collision with root package name */
    private final C18321a f164178t;

    /* renamed from: u, reason: collision with root package name */
    private final C18322b f164179u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicLong f164180v;

    /* renamed from: w, reason: collision with root package name */
    private volatile com.google.common.util.concurrent.q<Void> f164181w;

    /* renamed from: x, reason: collision with root package name */
    private int f164182x;

    /* renamed from: y, reason: collision with root package name */
    private long f164183y;

    /* renamed from: z, reason: collision with root package name */
    private final a f164184z;

    /* renamed from: v.u$a */
    static final class a extends AbstractC3611h {

        /* renamed from: a, reason: collision with root package name */
        Set<AbstractC3611h> f164185a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        Map<AbstractC3611h, Executor> f164186b = new ArrayMap();

        @Override // F.AbstractC3611h
        public void a(final int i10) {
            for (final AbstractC3611h abstractC3611h : this.f164185a) {
                try {
                    this.f164186b.get(abstractC3611h).execute(new Runnable() { // from class: v.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC3611h.a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C.P.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // F.AbstractC3611h
        public void b(final int i10, final F.r rVar) {
            for (final AbstractC3611h abstractC3611h : this.f164185a) {
                try {
                    this.f164186b.get(abstractC3611h).execute(new Runnable() { // from class: v.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC3611h.b(i10, rVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C.P.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // F.AbstractC3611h
        public void c(final int i10, final C3613j c3613j) {
            for (final AbstractC3611h abstractC3611h : this.f164185a) {
                try {
                    this.f164186b.get(abstractC3611h).execute(new Runnable() { // from class: v.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC3611h.c(i10, c3613j);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C.P.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void h(Executor executor, AbstractC3611h abstractC3611h) {
            this.f164185a.add(abstractC3611h);
            this.f164186b.put(abstractC3611h, executor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void i(AbstractC3611h abstractC3611h) {
            this.f164185a.remove(abstractC3611h);
            this.f164186b.remove(abstractC3611h);
        }

        a() {
        }
    }

    /* renamed from: v.u$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final Set<c> f164187a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f164188b;

        void b(c cVar) {
            this.f164187a.add(cVar);
        }

        void c(c cVar) {
            this.f164187a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f164188b.execute(new Runnable() { // from class: v.v
                @Override // java.lang.Runnable
                public final void run() {
                    C17418u.b.a(this.f164192a, totalCaptureResult);
                }
            });
        }

        b(Executor executor) {
            this.f164188b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f164187a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                bVar.f164187a.removeAll(hashSet);
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
        int[] iArr = (int[]) this.f164163e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return N(i10, iArr) ? i10 : N(1, iArr) ? 1 : 0;
    }

    private com.google.common.util.concurrent.q<Void> a0(final long j10) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.h
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C17418u.o(this.f164049a, j10, aVar);
            }
        });
    }

    public static /* synthetic */ Object p(final C17418u c17418u, final c.a aVar) {
        c17418u.f164161c.execute(new Runnable() { // from class: v.q
            @Override // java.lang.Runnable
            public final void run() {
                C17418u c17418u2 = this.f164111a;
                I.n.t(c17418u2.a0(c17418u2.Z()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public androidx.camera.core.impl.w A() {
        this.f164165g.w(this.f164182x);
        this.f164165g.s(B());
        this.f164165g.n("CameraControlSessionUpdateId", Long.valueOf(this.f164183y));
        return this.f164165g.o();
    }

    androidx.camera.core.impl.k B() {
        C17169a.C2558a c2558a = new C17169a.C2558a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        k.c cVar = k.c.REQUIRED;
        c2558a.g(key, 1, cVar);
        this.f164166h.g(c2558a);
        this.f164178t.a(c2558a);
        this.f164167i.a(c2558a);
        int iA = this.f164166h.s() ? 5 : 1;
        if (this.f164176r) {
            c2558a.g(CaptureRequest.FLASH_MODE, 2, cVar);
        } else {
            int i10 = this.f164177s;
            if (i10 == 0) {
                iA = this.f164179u.a(2);
            } else if (i10 == 1) {
                iA = 3;
            } else if (i10 == 2) {
                iA = 1;
            }
        }
        c2558a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(C(iA)), cVar);
        c2558a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(F(1)), cVar);
        this.f164169k.c(c2558a);
        this.f164171m.i(c2558a);
        return c2558a.c();
    }

    int C(int i10) {
        return D(this.f164163e, i10);
    }

    int E(int i10) {
        int[] iArr = (int[]) this.f164163e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
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
        return this.f164168j;
    }

    int H() {
        int i10;
        synchronized (this.f164162d) {
            i10 = this.f164174p;
        }
        return i10;
    }

    public a2 I() {
        return this.f164167i;
    }

    public c2 J() {
        return this.f164170l;
    }

    void K() {
        synchronized (this.f164162d) {
            this.f164174p++;
        }
    }

    public boolean M() {
        int iA = this.f164173o.a();
        C.P.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iA);
        return iA > 0;
    }

    boolean P() {
        return this.f164176r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(c cVar) {
        this.f164160b.c(cVar);
    }

    void R(final AbstractC3611h abstractC3611h) {
        this.f164161c.execute(new Runnable() { // from class: v.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f164098a.f164184z.i(abstractC3611h);
            }
        });
    }

    void T(boolean z10) {
        C.P.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f164166h.t(z10);
        this.f164167i.f(z10);
        this.f164168j.d(z10);
        this.f164169k.b(z10);
        this.f164171m.o(z10);
        if (z10) {
            return;
        }
        this.f164175q = null;
        this.f164173o.b();
    }

    public void U(Rational rational) {
        this.f164166h.u(rational);
    }

    void V(int i10) {
        this.f164182x = i10;
        this.f164166h.v(i10);
        this.f164172n.g(this.f164182x);
    }

    public void W(boolean z10) {
        this.f164170l.d(z10);
    }

    void X(List<androidx.camera.core.impl.i> list) {
        this.f164164f.b(list);
    }

    public com.google.common.util.concurrent.q<Void> Y() {
        return I.n.s(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.o
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C17418u.p(this.f164104a, aVar);
            }
        }));
    }

    long Z() {
        this.f164183y = this.f164180v.getAndIncrement();
        this.f164164f.a();
        return this.f164183y;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void a(w.b bVar) {
        this.f164170l.a(bVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect c() {
        Rect rect = (Rect) this.f164163e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) o2.i.g(rect);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.k e() {
        return this.f164171m.n();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void f(H.i iVar) {
        this.f164175q = iVar;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void g(androidx.camera.core.impl.k kVar) {
        this.f164171m.g(j.a.e(kVar).d()).addListener(new Runnable() { // from class: v.l
            @Override // java.lang.Runnable
            public final void run() {
                C17418u.j();
            }
        }, H.a.a());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void i() {
        this.f164171m.j().addListener(new Runnable() { // from class: v.p
            @Override // java.lang.Runnable
            public final void run() {
                C17418u.k();
            }
        }, H.a.a());
    }

    void t(c cVar) {
        this.f164160b.b(cVar);
    }

    void u(final Executor executor, final AbstractC3611h abstractC3611h) {
        this.f164161c.execute(new Runnable() { // from class: v.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f164078a.f164184z.h(executor, abstractC3611h);
            }
        });
    }

    void v() {
        synchronized (this.f164162d) {
            try {
                int i10 = this.f164174p;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f164174p = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void w(boolean z10) {
        this.f164176r = z10;
        if (!z10) {
            i.a aVar = new i.a();
            aVar.u(this.f164182x);
            aVar.v(true);
            C17169a.C2558a c2558a = new C17169a.C2558a();
            c2558a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(C(1)));
            c2558a.f(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c2558a.c());
            X(Collections.singletonList(aVar.h()));
        }
        Z();
    }

    public int x() {
        return this.f164177s;
    }

    public C17414s1 y() {
        return this.f164166h;
    }

    public H.i z() {
        return this.f164175q;
    }

    C17418u(w.B b10, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.c cVar, F.l0 l0Var) {
        w.b bVar = new w.b();
        this.f164165g = bVar;
        this.f164174p = 0;
        this.f164176r = false;
        this.f164177s = 2;
        this.f164180v = new AtomicLong(0L);
        this.f164181w = I.n.p(null);
        this.f164182x = 1;
        this.f164183y = 0L;
        a aVar = new a();
        this.f164184z = aVar;
        this.f164163e = b10;
        this.f164164f = cVar;
        this.f164161c = executor;
        this.f164173o = new Z1(executor);
        b bVar2 = new b(executor);
        this.f164160b = bVar2;
        bVar.w(this.f164182x);
        bVar.j(T0.e(bVar2));
        bVar.j(aVar);
        this.f164169k = new C17391k1(this, b10, executor);
        this.f164166h = new C17414s1(this, scheduledExecutorService, executor, l0Var);
        this.f164167i = new a2(this, b10, executor);
        this.f164168j = new X1(this, b10, executor);
        this.f164170l = new g2(b10);
        this.f164178t = new C18321a(l0Var);
        this.f164179u = new C18322b(l0Var);
        this.f164171m = new B.g(this, executor);
        this.f164172n = new C17360a0(this, b10, l0Var, executor, scheduledExecutorService);
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

    public static /* synthetic */ Object o(C17418u c17418u, final long j10, final c.a aVar) {
        c17418u.getClass();
        c17418u.t(new c() { // from class: v.i
            @Override // v.C17418u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C17418u.s(j10, aVar, totalCaptureResult);
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
        return I.d.a(I.n.s(this.f164181w)).e(new I.a() { // from class: v.j
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return this.f164070a.f164172n.h(list, i10, iX, i11);
            }
        }, this.f164161c);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void d(int i10) {
        if (!L()) {
            C.P.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f164177s = i10;
        C.P.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f164177s);
        c2 c2Var = this.f164170l;
        boolean z10 = true;
        if (this.f164177s != 1 && this.f164177s != 0) {
            z10 = false;
        }
        c2Var.c(z10);
        this.f164181w = Y();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.q<InterfaceC3408j> h(final int i10, final int i11) {
        if (!L()) {
            C.P.l("Camera2CameraControlImp", "Camera is not active.");
            return I.n.n(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int iX = x();
        return I.d.a(I.n.s(this.f164181w)).e(new I.a() { // from class: v.m
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return I.n.p(this.f164091a.f164172n.c(i10, iX, i11));
            }
        }, this.f164161c);
    }
}
