package C;

import C.o0;
import F.InterfaceC3290z;
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
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Range<Integer> f3872p = androidx.camera.core.impl.x.f47721a;

    /* renamed from: a, reason: collision with root package name */
    private final Object f3873a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Size f3874b;

    /* renamed from: c, reason: collision with root package name */
    private final C3037w f3875c;

    /* renamed from: d, reason: collision with root package name */
    private final Range<Integer> f3876d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3290z f3877e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3878f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.common.util.concurrent.q<Surface> f3879g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a<Surface> f3880h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f3881i;

    /* renamed from: j, reason: collision with root package name */
    private final c.a<Void> f3882j;

    /* renamed from: k, reason: collision with root package name */
    private final c.a<Void> f3883k;

    /* renamed from: l, reason: collision with root package name */
    private final DeferrableSurface f3884l;

    /* renamed from: m, reason: collision with root package name */
    private h f3885m;

    /* renamed from: n, reason: collision with root package name */
    private i f3886n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f3887o;

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f3888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q f3889b;

        a(c.a aVar, com.google.common.util.concurrent.q qVar) {
            this.f3888a = aVar;
            this.f3889b = qVar;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            o2.i.i(this.f3888a.c(null));
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof f) {
                o2.i.i(this.f3889b.cancel(false));
            } else {
                o2.i.i(this.f3888a.c(null));
            }
        }
    }

    class b extends DeferrableSurface {
        b(Size size, int i10) {
            super(size, i10);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        protected com.google.common.util.concurrent.q<Surface> o() {
            return o0.this.f3879g;
        }
    }

    class c implements I.c<Surface> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q f3892a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f3893b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3894c;

        c(com.google.common.util.concurrent.q qVar, c.a aVar, String str) {
            this.f3892a = qVar;
            this.f3893b = aVar;
            this.f3894c = str;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            I.n.t(this.f3892a, this.f3893b);
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f3893b.c(null);
                return;
            }
            o2.i.i(this.f3893b.f(new f(this.f3894c + " cancelled.", th2)));
        }
    }

    class d implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16068a f3896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f3897b;

        d(InterfaceC16068a interfaceC16068a, Surface surface) {
            this.f3896a = interfaceC16068a;
            this.f3897b = surface;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            this.f3896a.accept(g.c(0, this.f3897b));
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            o2.i.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f3896a.accept(g.c(1, this.f3897b));
        }
    }

    class e implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f3899a;

        @Override // I.c
        public void onFailure(Throwable th2) {
        }

        e(Runnable runnable) {
            this.f3899a = runnable;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f3899a.run();
        }
    }

    public static abstract class g {
        public abstract int a();

        public abstract Surface b();

        static g c(int i10, Surface surface) {
            return new C3022g(i10, surface);
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
            return new C3023h(rect, i10, i11, z10, matrix, z11);
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
        I.n.j(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: C.k0
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return o0.g(this.f3853a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (c.a) o2.i.g((c.a) atomicReference.get());
    }

    @SuppressLint({"PairedRegistration"})
    public void j(Executor executor, Runnable runnable) {
        this.f3883k.a(runnable, executor);
    }

    public void k() {
        synchronized (this.f3873a) {
            this.f3886n = null;
            this.f3887o = null;
        }
    }

    public InterfaceC3290z l() {
        return this.f3877e;
    }

    public DeferrableSurface m() {
        return this.f3884l;
    }

    public C3037w n() {
        return this.f3875c;
    }

    public Size o() {
        return this.f3874b;
    }

    public boolean r() {
        return this.f3878f;
    }

    public void s(final Surface surface, Executor executor, final InterfaceC16068a<g> interfaceC16068a) throws ExecutionException, InterruptedException {
        if (this.f3880h.c(surface) || this.f3879g.isCancelled()) {
            I.n.j(this.f3881i, new d(interfaceC16068a, surface), executor);
            return;
        }
        o2.i.i(this.f3879g.isDone());
        try {
            this.f3879g.get();
            executor.execute(new Runnable() { // from class: C.m0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC16068a.accept(o0.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: C.n0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC16068a.accept(o0.g.c(4, surface));
                }
            });
        }
    }

    public void t(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f3873a) {
            this.f3886n = iVar;
            this.f3887o = executor;
            hVar = this.f3885m;
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
        synchronized (this.f3873a) {
            this.f3885m = hVar;
            iVar = this.f3886n;
            executor = this.f3887o;
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
        return this.f3880h.f(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public o0(Size size, InterfaceC3290z interfaceC3290z, boolean z10, C3037w c3037w, Range<Integer> range, Runnable runnable) {
        this.f3874b = size;
        this.f3877e = interfaceC3290z;
        this.f3878f = z10;
        this.f3875c = c3037w;
        this.f3876d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.q qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: C.g0
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return o0.b(atomicReference, str, aVar);
            }
        });
        c.a<Void> aVar = (c.a) o2.i.g((c.a) atomicReference.get());
        this.f3883k = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.q<Void> qVarA2 = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: C.h0
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar2) {
                return o0.h(atomicReference2, str, aVar2);
            }
        });
        this.f3881i = qVarA2;
        I.n.j(qVarA2, new a(aVar, qVarA), H.a.a());
        c.a aVar2 = (c.a) o2.i.g((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.q<Surface> qVarA3 = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: C.i0
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar3) {
                return o0.c(atomicReference3, str, aVar3);
            }
        });
        this.f3879g = qVarA3;
        this.f3880h = (c.a) o2.i.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f3884l = bVar;
        com.google.common.util.concurrent.q<Void> qVarK = bVar.k();
        I.n.j(qVarA3, new c(qVarK, aVar2, str), H.a.a());
        qVarK.addListener(new Runnable() { // from class: C.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3852a.f3879g.cancel(true);
            }
        }, H.a.a());
        this.f3882j = p(H.a.a(), runnable);
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
        return this.f3882j.c(null);
    }
}
