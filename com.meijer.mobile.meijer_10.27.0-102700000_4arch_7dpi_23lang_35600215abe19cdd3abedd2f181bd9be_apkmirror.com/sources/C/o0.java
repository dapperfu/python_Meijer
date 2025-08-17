package C;

import C.o0;
import F.InterfaceC3628z;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Range<Integer> f3414p = androidx.camera.core.impl.x.f47497a;

    /* renamed from: a, reason: collision with root package name */
    private final Object f3415a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Size f3416b;

    /* renamed from: c, reason: collision with root package name */
    private final C2979w f3417c;

    /* renamed from: d, reason: collision with root package name */
    private final Range<Integer> f3418d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3628z f3419e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3420f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.common.util.concurrent.q<Surface> f3421g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a<Surface> f3422h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f3423i;

    /* renamed from: j, reason: collision with root package name */
    private final c.a<Void> f3424j;

    /* renamed from: k, reason: collision with root package name */
    private final c.a<Void> f3425k;

    /* renamed from: l, reason: collision with root package name */
    private final DeferrableSurface f3426l;

    /* renamed from: m, reason: collision with root package name */
    private h f3427m;

    /* renamed from: n, reason: collision with root package name */
    private i f3428n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f3429o;

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f3430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q f3431b;

        a(c.a aVar, com.google.common.util.concurrent.q qVar) {
            this.f3430a = aVar;
            this.f3431b = qVar;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            o2.i.i(this.f3430a.c(null));
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof f) {
                o2.i.i(this.f3431b.cancel(false));
            } else {
                o2.i.i(this.f3430a.c(null));
            }
        }
    }

    class b extends DeferrableSurface {
        b(Size size, int i10) {
            super(size, i10);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        protected com.google.common.util.concurrent.q<Surface> o() {
            return o0.this.f3421g;
        }
    }

    class c implements I.c<Surface> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q f3434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f3435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3436c;

        c(com.google.common.util.concurrent.q qVar, c.a aVar, String str) {
            this.f3434a = qVar;
            this.f3435b = aVar;
            this.f3436c = str;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            I.n.t(this.f3434a, this.f3435b);
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f3435b.c(null);
                return;
            }
            o2.i.i(this.f3435b.f(new f(this.f3436c + " cancelled.", th2)));
        }
    }

    class d implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15993a f3438a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f3439b;

        d(InterfaceC15993a interfaceC15993a, Surface surface) {
            this.f3438a = interfaceC15993a;
            this.f3439b = surface;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            this.f3438a.accept(g.c(0, this.f3439b));
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            o2.i.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f3438a.accept(g.c(1, this.f3439b));
        }
    }

    class e implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f3441a;

        @Override // I.c
        public void onFailure(Throwable th2) {
        }

        e(Runnable runnable) {
            this.f3441a = runnable;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f3441a.run();
        }
    }

    public static abstract class g {
        public abstract int a();

        public abstract Surface b();

        static g c(int i10, Surface surface) {
            return new C2964g(i10, surface);
        }

        g() {
        }
    }

    public static abstract class h {
        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();

        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new C2965h(rect, i10, i11, z10, matrix, z11);
        }

        h() {
        }
    }

    public interface i {
        void a(h hVar);
    }

    private static final class f extends RuntimeException {
        f(String str, Throwable th2) {
            super(str, th2);
        }
    }

    private c.a<Void> p(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        I.n.j(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: C.k0
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return o0.g(this.f3395a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (c.a) o2.i.g((c.a) atomicReference.get());
    }

    @SuppressLint({"PairedRegistration"})
    public void j(Executor executor, Runnable runnable) {
        this.f3425k.a(runnable, executor);
    }

    public void k() {
        synchronized (this.f3415a) {
            this.f3428n = null;
            this.f3429o = null;
        }
    }

    public InterfaceC3628z l() {
        return this.f3419e;
    }

    public DeferrableSurface m() {
        return this.f3426l;
    }

    public C2979w n() {
        return this.f3417c;
    }

    public Size o() {
        return this.f3416b;
    }

    public boolean r() {
        return this.f3420f;
    }

    public void s(final Surface surface, Executor executor, final InterfaceC15993a<g> interfaceC15993a) throws ExecutionException, InterruptedException {
        if (this.f3422h.c(surface) || this.f3421g.isCancelled()) {
            I.n.j(this.f3423i, new d(interfaceC15993a, surface), executor);
            return;
        }
        o2.i.i(this.f3421g.isDone());
        try {
            this.f3421g.get();
            executor.execute(new Runnable() { // from class: C.m0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC15993a.accept(o0.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: C.n0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC15993a.accept(o0.g.c(4, surface));
                }
            });
        }
    }

    public void t(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f3415a) {
            this.f3428n = iVar;
            this.f3429o = executor;
            hVar = this.f3427m;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: C.l0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void u(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f3415a) {
            this.f3427m = hVar;
            iVar = this.f3428n;
            executor = this.f3429o;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: C.f0
            @Override // java.lang.Runnable
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean v() {
        return this.f3422h.f(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public o0(Size size, InterfaceC3628z interfaceC3628z, boolean z10, C2979w c2979w, Range<Integer> range, Runnable runnable) {
        this.f3416b = size;
        this.f3419e = interfaceC3628z;
        this.f3420f = z10;
        this.f3417c = c2979w;
        this.f3418d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.q qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: C.g0
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return o0.b(atomicReference, str, aVar);
            }
        });
        c.a<Void> aVar = (c.a) o2.i.g((c.a) atomicReference.get());
        this.f3425k = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.q<Void> qVarA2 = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: C.h0
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar2) {
                return o0.h(atomicReference2, str, aVar2);
            }
        });
        this.f3423i = qVarA2;
        I.n.j(qVarA2, new a(aVar, qVarA), H.a.a());
        c.a aVar2 = (c.a) o2.i.g((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.q<Surface> qVarA3 = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: C.i0
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar3) {
                return o0.c(atomicReference3, str, aVar3);
            }
        });
        this.f3421g = qVarA3;
        this.f3422h = (c.a) o2.i.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f3426l = bVar;
        com.google.common.util.concurrent.q<Void> qVarK = bVar.k();
        I.n.j(qVarA3, new c(qVarK, aVar2, str), H.a.a());
        qVarK.addListener(new Runnable() { // from class: C.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3394a.f3421g.cancel(true);
            }
        }, H.a.a());
        this.f3424j = p(H.a.a(), runnable);
    }

    public static /* synthetic */ Object b(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(o0 o0Var, AtomicReference atomicReference, c.a aVar) {
        o0Var.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + o0Var.hashCode() + ")";
    }

    public static /* synthetic */ Object h(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public boolean q() {
        v();
        return this.f3424j.c(null);
    }
}
