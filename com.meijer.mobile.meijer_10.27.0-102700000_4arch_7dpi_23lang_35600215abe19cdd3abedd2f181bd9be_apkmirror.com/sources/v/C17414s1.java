package v;

import F.AbstractC3611h;
import F.C3613j;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import com.fullstory.FS;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import u.C17169a;
import v.C17418u;
import z.C18333m;

/* renamed from: v.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17414s1 {

    /* renamed from: x, reason: collision with root package name */
    private static final MeteringRectangle[] f164129x = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    private final C17418u f164130a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f164131b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f164132c;

    /* renamed from: f, reason: collision with root package name */
    private final C18333m f164135f;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f164138i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f164139j;

    /* renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f164146q;

    /* renamed from: r, reason: collision with root package name */
    private MeteringRectangle[] f164147r;

    /* renamed from: s, reason: collision with root package name */
    private MeteringRectangle[] f164148s;

    /* renamed from: t, reason: collision with root package name */
    c.a<Object> f164149t;

    /* renamed from: u, reason: collision with root package name */
    c.a<Void> f164150u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f164151v;

    /* renamed from: w, reason: collision with root package name */
    private C17418u.c f164152w;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f164133d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile Rational f164134e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f164136g = false;

    /* renamed from: h, reason: collision with root package name */
    Integer f164137h = 0;

    /* renamed from: k, reason: collision with root package name */
    long f164140k = 0;

    /* renamed from: l, reason: collision with root package name */
    boolean f164141l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f164142m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f164143n = 1;

    /* renamed from: o, reason: collision with root package name */
    private C17418u.c f164144o = null;

    /* renamed from: p, reason: collision with root package name */
    private C17418u.c f164145p = null;

    /* renamed from: v.s1$a */
    class a extends AbstractC3611h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f164153a;

        a(c.a aVar) {
            this.f164153a = aVar;
        }

        @Override // F.AbstractC3611h
        public void a(int i10) {
            c.a aVar = this.f164153a;
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is closed"));
            }
        }

        @Override // F.AbstractC3611h
        public void b(int i10, F.r rVar) {
            c.a aVar = this.f164153a;
            if (aVar != null) {
                aVar.c(rVar);
            }
        }

        @Override // F.AbstractC3611h
        public void c(int i10, C3613j c3613j) {
            c.a aVar = this.f164153a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(c3613j));
            }
        }
    }

    /* renamed from: v.s1$b */
    class b extends AbstractC3611h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f164155a;

        b(c.a aVar) {
            this.f164155a = aVar;
        }

        @Override // F.AbstractC3611h
        public void a(int i10) {
            c.a aVar = this.f164155a;
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is closed"));
            }
        }

        @Override // F.AbstractC3611h
        public void b(int i10, F.r rVar) {
            if (this.f164155a != null) {
                C.P.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f164155a.c(null);
            }
        }

        @Override // F.AbstractC3611h
        public void c(int i10, C3613j c3613j) {
            c.a aVar = this.f164155a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(c3613j));
            }
        }
    }

    void h(boolean z10, boolean z11) {
        if (this.f164133d) {
            i.a aVar = new i.a();
            aVar.v(true);
            aVar.u(this.f164143n);
            C17169a.C2558a c2558a = new C17169a.C2558a();
            if (z10) {
                c2558a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c2558a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c2558a.c());
            this.f164130a.X(Collections.singletonList(aVar.h()));
        }
    }

    void j() {
        i(null);
    }

    public static /* synthetic */ void b(C17414s1 c17414s1, boolean z10, c.a aVar) {
        c17414s1.f164130a.Q(c17414s1.f164152w);
        c17414s1.f164151v = z10;
        c17414s1.o(aVar);
    }

    public static /* synthetic */ Object c(final C17414s1 c17414s1, final boolean z10, final c.a aVar) {
        c17414s1.f164131b.execute(new Runnable() { // from class: v.o1
            @Override // java.lang.Runnable
            public final void run() {
                C17414s1.b(this.f164105a, z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ Object f(final C17414s1 c17414s1, final c.a aVar) {
        c17414s1.f164131b.execute(new Runnable() { // from class: v.p1
            @Override // java.lang.Runnable
            public final void run() {
                this.f164109a.y(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    private void k() {
        ScheduledFuture<?> scheduledFuture = this.f164139j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f164139j = null;
        }
    }

    private void l() {
        c.a<Void> aVar = this.f164150u;
        if (aVar != null) {
            aVar.c(null);
            this.f164150u = null;
        }
    }

    private void m() {
        ScheduledFuture<?> scheduledFuture = this.f164138i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f164138i = null;
        }
    }

    private void o(final c.a<Void> aVar) {
        if (!this.f164133d) {
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            }
        } else {
            final long jZ = this.f164130a.Z();
            C17418u.c cVar = new C17418u.c() { // from class: v.q1
                @Override // v.C17418u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C17414s1.e(this.f164114a, jZ, aVar, totalCaptureResult);
                }
            };
            this.f164152w = cVar;
            this.f164130a.t(cVar);
        }
    }

    private void p(String str) {
        this.f164130a.Q(this.f164144o);
        c.a<Object> aVar = this.f164149t;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException(str));
            this.f164149t = null;
        }
    }

    private void q(String str) {
        this.f164130a.Q(this.f164145p);
        c.a<Void> aVar = this.f164150u;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException(str));
            this.f164150u = null;
        }
    }

    private boolean w() {
        return this.f164146q.length > 0;
    }

    void g(C17169a.C2558a c2558a) {
        int iR = this.f164136g ? 1 : r();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer numValueOf = Integer.valueOf(this.f164130a.E(iR));
        k.c cVar = k.c.REQUIRED;
        c2558a.g(key, numValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f164146q;
        if (meteringRectangleArr.length != 0) {
            c2558a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f164147r;
        if (meteringRectangleArr2.length != 0) {
            c2558a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f164148s;
        if (meteringRectangleArr3.length != 0) {
            c2558a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    void i(c.a<Void> aVar) {
        q("Cancelled by another cancelFocusAndMetering()");
        p("Cancelled by cancelFocusAndMetering()");
        this.f164150u = aVar;
        m();
        k();
        if (w()) {
            h(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f164129x;
        this.f164146q = meteringRectangleArr;
        this.f164147r = meteringRectangleArr;
        this.f164148s = meteringRectangleArr;
        this.f164136g = false;
        final long jZ = this.f164130a.Z();
        if (this.f164150u != null) {
            final int iE = this.f164130a.E(r());
            C17418u.c cVar = new C17418u.c() { // from class: v.r1
                @Override // v.C17418u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C17414s1.a(this.f164121a, iE, jZ, totalCaptureResult);
                }
            };
            this.f164145p = cVar;
            this.f164130a.t(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.q<Void> n(final boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            FS.log_d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return I.n.p(null);
        }
        if (this.f164130a.C(5) != 5) {
            FS.log_d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return I.n.p(null);
        }
        FS.log_d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.m1
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C17414s1.c(this.f164096a, z10, aVar);
            }
        });
    }

    int r() {
        return this.f164143n != 3 ? 4 : 3;
    }

    boolean s() {
        return this.f164151v;
    }

    void t(boolean z10) {
        if (z10 == this.f164133d) {
            return;
        }
        this.f164133d = z10;
        if (this.f164133d) {
            return;
        }
        j();
    }

    public void u(Rational rational) {
        this.f164134e = rational;
    }

    void v(int i10) {
        this.f164143n = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.q<Void> x() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: v.n1
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C17414s1.f(this.f164103a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(c.a<Void> aVar) {
        C.P.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f164133d) {
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        i.a aVar2 = new i.a();
        aVar2.u(this.f164143n);
        aVar2.v(true);
        C17169a.C2558a c2558a = new C17169a.C2558a();
        c2558a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c2558a.c());
        aVar2.c(new b(aVar));
        this.f164130a.X(Collections.singletonList(aVar2.h()));
    }

    void z(c.a<F.r> aVar, boolean z10) {
        if (!this.f164133d) {
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        i.a aVar2 = new i.a();
        aVar2.u(this.f164143n);
        aVar2.v(true);
        C17169a.C2558a c2558a = new C17169a.C2558a();
        c2558a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c2558a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f164130a.C(1)), k.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c2558a.c());
        aVar2.c(new a(aVar));
        this.f164130a.X(Collections.singletonList(aVar2.h()));
    }

    C17414s1(C17418u c17418u, ScheduledExecutorService scheduledExecutorService, Executor executor, F.l0 l0Var) {
        MeteringRectangle[] meteringRectangleArr = f164129x;
        this.f164146q = meteringRectangleArr;
        this.f164147r = meteringRectangleArr;
        this.f164148s = meteringRectangleArr;
        this.f164149t = null;
        this.f164150u = null;
        this.f164151v = false;
        this.f164152w = null;
        this.f164130a = c17418u;
        this.f164131b = executor;
        this.f164132c = scheduledExecutorService;
        this.f164135f = new C18333m(l0Var);
    }

    public static /* synthetic */ boolean a(C17414s1 c17414s1, int i10, long j10, TotalCaptureResult totalCaptureResult) {
        c17414s1.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == i10 && C17418u.O(totalCaptureResult, j10)) {
            c17414s1.l();
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean e(C17414s1 c17414s1, long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        boolean z10;
        c17414s1.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        C.P.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != c17414s1.f164151v || !C17418u.O(totalCaptureResult, j10)) {
            return false;
        }
        C.P.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }
}
