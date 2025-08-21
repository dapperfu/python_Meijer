package v;

import F.AbstractC3273h;
import F.C3275j;
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
import u.C17296a;
import v.C17557u;
import z.C18396m;

/* renamed from: v.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17553s1 {

    /* renamed from: x, reason: collision with root package name */
    private static final MeteringRectangle[] f165163x = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    private final C17557u f165164a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f165165b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f165166c;

    /* renamed from: f, reason: collision with root package name */
    private final C18396m f165169f;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f165172i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f165173j;

    /* renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f165180q;

    /* renamed from: r, reason: collision with root package name */
    private MeteringRectangle[] f165181r;

    /* renamed from: s, reason: collision with root package name */
    private MeteringRectangle[] f165182s;

    /* renamed from: t, reason: collision with root package name */
    c.a<Object> f165183t;

    /* renamed from: u, reason: collision with root package name */
    c.a<Void> f165184u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f165185v;

    /* renamed from: w, reason: collision with root package name */
    private C17557u.c f165186w;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f165167d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile Rational f165168e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f165170g = false;

    /* renamed from: h, reason: collision with root package name */
    Integer f165171h = 0;

    /* renamed from: k, reason: collision with root package name */
    long f165174k = 0;

    /* renamed from: l, reason: collision with root package name */
    boolean f165175l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f165176m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f165177n = 1;

    /* renamed from: o, reason: collision with root package name */
    private C17557u.c f165178o = null;

    /* renamed from: p, reason: collision with root package name */
    private C17557u.c f165179p = null;

    /* renamed from: v.s1$a */
    class a extends AbstractC3273h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f165187a;

        a(c.a aVar) {
            this.f165187a = aVar;
        }

        @Override // F.AbstractC3273h
        public void a(int i10) {
            c.a aVar = this.f165187a;
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is closed"));
            }
        }

        @Override // F.AbstractC3273h
        public void b(int i10, F.r rVar) {
            c.a aVar = this.f165187a;
            if (aVar != null) {
                aVar.c(rVar);
            }
        }

        @Override // F.AbstractC3273h
        public void c(int i10, C3275j c3275j) {
            c.a aVar = this.f165187a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(c3275j));
            }
        }
    }

    /* renamed from: v.s1$b */
    class b extends AbstractC3273h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f165189a;

        b(c.a aVar) {
            this.f165189a = aVar;
        }

        @Override // F.AbstractC3273h
        public void a(int i10) {
            c.a aVar = this.f165189a;
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is closed"));
            }
        }

        @Override // F.AbstractC3273h
        public void b(int i10, F.r rVar) {
            if (this.f165189a != null) {
                C.P.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f165189a.c(null);
            }
        }

        @Override // F.AbstractC3273h
        public void c(int i10, C3275j c3275j) {
            c.a aVar = this.f165189a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(c3275j));
            }
        }
    }

    void h(boolean z10, boolean z11) {
        if (this.f165167d) {
            i.a aVar = new i.a();
            aVar.v(true);
            aVar.u(this.f165177n);
            C17296a.C2582a c2582a = new C17296a.C2582a();
            if (z10) {
                c2582a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c2582a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c2582a.c());
            this.f165164a.X(Collections.singletonList(aVar.h()));
        }
    }

    void j() {
        i(null);
    }

    public static /* synthetic */ void b(C17553s1 c17553s1, boolean z10, c.a aVar) {
        c17553s1.f165164a.Q(c17553s1.f165186w);
        c17553s1.f165185v = z10;
        c17553s1.o(aVar);
    }

    public static /* synthetic */ Object c(final C17553s1 c17553s1, final boolean z10, final c.a aVar) {
        c17553s1.f165165b.execute(new Runnable() { // from class: v.o1
            @Override // java.lang.Runnable
            public final void run() {
                C17553s1.b(this.f165139a, z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ Object f(final C17553s1 c17553s1, final c.a aVar) {
        c17553s1.f165165b.execute(new Runnable() { // from class: v.p1
            @Override // java.lang.Runnable
            public final void run() {
                this.f165143a.y(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    private void k() {
        ScheduledFuture<?> scheduledFuture = this.f165173j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f165173j = null;
        }
    }

    private void l() {
        c.a<Void> aVar = this.f165184u;
        if (aVar != null) {
            aVar.c(null);
            this.f165184u = null;
        }
    }

    private void m() {
        ScheduledFuture<?> scheduledFuture = this.f165172i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f165172i = null;
        }
    }

    private void o(final c.a<Void> aVar) {
        if (!this.f165167d) {
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            }
        } else {
            final long jZ = this.f165164a.Z();
            C17557u.c cVar = new C17557u.c() { // from class: v.q1
                @Override // v.C17557u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C17553s1.e(this.f165148a, jZ, aVar, totalCaptureResult);
                }
            };
            this.f165186w = cVar;
            this.f165164a.t(cVar);
        }
    }

    private void p(String str) {
        this.f165164a.Q(this.f165178o);
        c.a<Object> aVar = this.f165183t;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException(str));
            this.f165183t = null;
        }
    }

    private void q(String str) {
        this.f165164a.Q(this.f165179p);
        c.a<Void> aVar = this.f165184u;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException(str));
            this.f165184u = null;
        }
    }

    private boolean w() {
        return this.f165180q.length > 0;
    }

    void g(C17296a.C2582a c2582a) {
        int iR = this.f165170g ? 1 : r();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer numValueOf = Integer.valueOf(this.f165164a.E(iR));
        k.c cVar = k.c.REQUIRED;
        c2582a.g(key, numValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f165180q;
        if (meteringRectangleArr.length != 0) {
            c2582a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f165181r;
        if (meteringRectangleArr2.length != 0) {
            c2582a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f165182s;
        if (meteringRectangleArr3.length != 0) {
            c2582a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    void i(c.a<Void> aVar) {
        q("Cancelled by another cancelFocusAndMetering()");
        p("Cancelled by cancelFocusAndMetering()");
        this.f165184u = aVar;
        m();
        k();
        if (w()) {
            h(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f165163x;
        this.f165180q = meteringRectangleArr;
        this.f165181r = meteringRectangleArr;
        this.f165182s = meteringRectangleArr;
        this.f165170g = false;
        final long jZ = this.f165164a.Z();
        if (this.f165184u != null) {
            final int iE = this.f165164a.E(r());
            C17557u.c cVar = new C17557u.c() { // from class: v.r1
                @Override // v.C17557u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C17553s1.a(this.f165155a, iE, jZ, totalCaptureResult);
                }
            };
            this.f165179p = cVar;
            this.f165164a.t(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.q<Void> n(final boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            FS.log_d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return I.n.p(null);
        }
        if (this.f165164a.C(5) != 5) {
            FS.log_d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return I.n.p(null);
        }
        FS.log_d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.m1
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C17553s1.c(this.f165130a, z10, aVar);
            }
        });
    }

    int r() {
        return this.f165177n != 3 ? 4 : 3;
    }

    boolean s() {
        return this.f165185v;
    }

    void t(boolean z10) {
        if (z10 == this.f165167d) {
            return;
        }
        this.f165167d = z10;
        if (this.f165167d) {
            return;
        }
        j();
    }

    public void u(Rational rational) {
        this.f165168e = rational;
    }

    void v(int i10) {
        this.f165177n = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.q<Void> x() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: v.n1
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C17553s1.f(this.f165137a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(c.a<Void> aVar) {
        C.P.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f165167d) {
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        i.a aVar2 = new i.a();
        aVar2.u(this.f165177n);
        aVar2.v(true);
        C17296a.C2582a c2582a = new C17296a.C2582a();
        c2582a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c2582a.c());
        aVar2.c(new b(aVar));
        this.f165164a.X(Collections.singletonList(aVar2.h()));
    }

    void z(c.a<F.r> aVar, boolean z10) {
        if (!this.f165167d) {
            if (aVar != null) {
                aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        i.a aVar2 = new i.a();
        aVar2.u(this.f165177n);
        aVar2.v(true);
        C17296a.C2582a c2582a = new C17296a.C2582a();
        c2582a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c2582a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f165164a.C(1)), k.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c2582a.c());
        aVar2.c(new a(aVar));
        this.f165164a.X(Collections.singletonList(aVar2.h()));
    }

    C17553s1(C17557u c17557u, ScheduledExecutorService scheduledExecutorService, Executor executor, F.l0 l0Var) {
        MeteringRectangle[] meteringRectangleArr = f165163x;
        this.f165180q = meteringRectangleArr;
        this.f165181r = meteringRectangleArr;
        this.f165182s = meteringRectangleArr;
        this.f165183t = null;
        this.f165184u = null;
        this.f165185v = false;
        this.f165186w = null;
        this.f165164a = c17557u;
        this.f165165b = executor;
        this.f165166c = scheduledExecutorService;
        this.f165169f = new C18396m(l0Var);
    }

    public static /* synthetic */ boolean a(C17553s1 c17553s1, int i10, long j10, TotalCaptureResult totalCaptureResult) {
        c17553s1.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == i10 && C17557u.O(totalCaptureResult, j10)) {
            c17553s1.l();
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean e(C17553s1 c17553s1, long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        boolean z10;
        c17553s1.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        C.P.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != c17553s1.f165185v || !C17557u.O(totalCaptureResult, j10)) {
            return false;
        }
        C.P.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }
}
