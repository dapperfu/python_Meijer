package O;

import C.d0;
import C.o0;
import F.InterfaceC3290z;
import O.N;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private final int f22799a;

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f22800b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22801c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f22802d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f22803e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22804f;

    /* renamed from: g, reason: collision with root package name */
    private final androidx.camera.core.impl.x f22805g;

    /* renamed from: h, reason: collision with root package name */
    private int f22806h;

    /* renamed from: i, reason: collision with root package name */
    private int f22807i;

    /* renamed from: k, reason: collision with root package name */
    private o0 f22809k;

    /* renamed from: l, reason: collision with root package name */
    private a f22810l;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22808j = false;

    /* renamed from: m, reason: collision with root package name */
    private final Set<Runnable> f22811m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private boolean f22812n = false;

    /* renamed from: o, reason: collision with root package name */
    private final List<InterfaceC16068a<o0.h>> f22813o = new ArrayList();

    static class a extends DeferrableSurface {

        /* renamed from: o, reason: collision with root package name */
        final com.google.common.util.concurrent.q<Surface> f22814o;

        /* renamed from: p, reason: collision with root package name */
        c.a<Surface> f22815p;

        /* renamed from: q, reason: collision with root package name */
        private DeferrableSurface f22816q;

        /* renamed from: r, reason: collision with root package name */
        private Q f22817r;

        public static /* synthetic */ void q(a aVar) {
            Q q10 = aVar.f22817r;
            if (q10 != null) {
                q10.h();
            }
            if (aVar.f22816q == null) {
                aVar.f22815p.d();
            }
        }

        public static /* synthetic */ Object r(a aVar, c.a aVar2) {
            aVar.f22815p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        protected com.google.common.util.concurrent.q<Surface> o() {
            return this.f22814o;
        }

        public void t(Q q10) {
            o2.i.j(this.f22817r == null, "Consumer can only be linked once.");
            this.f22817r = q10;
        }

        a(Size size, int i10) {
            super(size, i10);
            this.f22814o = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: O.L
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return N.a.r(this.f22797a, aVar);
                }
            });
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void d() {
            super.d();
            G.o.d(new Runnable() { // from class: O.K
                @Override // java.lang.Runnable
                public final void run() {
                    N.a.q(this.f22796a);
                }
            });
        }

        boolean s() {
            G.o.a();
            if (this.f22816q == null && !m()) {
                return true;
            }
            return false;
        }

        public boolean u(final DeferrableSurface deferrableSurface, Runnable runnable) throws DeferrableSurface.SurfaceClosedException {
            boolean z10;
            G.o.a();
            o2.i.g(deferrableSurface);
            DeferrableSurface deferrableSurface2 = this.f22816q;
            boolean z11 = false;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            if (deferrableSurface2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            o2.i.j(z10, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            o2.i.b(h().equals(deferrableSurface.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), deferrableSurface.h()));
            if (i() == deferrableSurface.i()) {
                z11 = true;
            }
            o2.i.b(z11, String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(deferrableSurface.i())));
            o2.i.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f22816q = deferrableSurface;
            I.n.t(deferrableSurface.j(), this.f22815p);
            deferrableSurface.l();
            k().addListener(new Runnable() { // from class: O.M
                @Override // java.lang.Runnable
                public final void run() {
                    deferrableSurface.e();
                }
            }, H.a.a());
            deferrableSurface.f().addListener(runnable, H.a.d());
            return true;
        }
    }

    public o0 k(InterfaceC3290z interfaceC3290z) {
        return l(interfaceC3290z, true);
    }

    public static /* synthetic */ void b(N n10) {
        if (n10.f22812n) {
            return;
        }
        n10.v();
    }

    public static /* synthetic */ void c(N n10, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (n10.f22807i != i10) {
            n10.f22807i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n10.f22806h != i11) {
            n10.f22806h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            n10.x();
        }
    }

    private void g() {
        o2.i.j(!this.f22808j, "Consumer can only be linked once.");
        this.f22808j = true;
    }

    private void h() {
        o2.i.j(!this.f22812n, "Edge is already closed.");
    }

    public Rect n() {
        return this.f22802d;
    }

    public int p() {
        return this.f22799a;
    }

    public int q() {
        return this.f22807i;
    }

    public Matrix r() {
        return this.f22800b;
    }

    public androidx.camera.core.impl.x s() {
        return this.f22805g;
    }

    public int t() {
        return this.f22804f;
    }

    public boolean u() {
        return this.f22801c;
    }

    public boolean w() {
        return this.f22803e;
    }

    public void z(final int i10, final int i11) {
        G.o.d(new Runnable() { // from class: O.G
            @Override // java.lang.Runnable
            public final void run() {
                N.c(this.f22786a, i10, i11);
            }
        });
    }

    public N(int i10, int i11, androidx.camera.core.impl.x xVar, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f22804f = i10;
        this.f22799a = i11;
        this.f22805g = xVar;
        this.f22800b = matrix;
        this.f22801c = z10;
        this.f22802d = rect;
        this.f22807i = i12;
        this.f22806h = i13;
        this.f22803e = z11;
        this.f22810l = new a(xVar.e(), i11);
    }

    public static /* synthetic */ void a(final N n10) {
        n10.getClass();
        H.a.d().execute(new Runnable() { // from class: O.I
            @Override // java.lang.Runnable
            public final void run() {
                N.b(this.f22794a);
            }
        });
    }

    public static /* synthetic */ com.google.common.util.concurrent.q d(N n10, final a aVar, int i10, d0.a aVar2, d0.a aVar3, Surface surface) {
        n10.getClass();
        o2.i.g(surface);
        try {
            aVar.l();
            Q q10 = new Q(surface, n10.t(), i10, n10.f22805g.e(), aVar2, aVar3, n10.f22800b);
            q10.g().addListener(new Runnable() { // from class: O.J
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.e();
                }
            }, H.a.a());
            aVar.t(q10);
            return I.n.p(q10);
        } catch (DeferrableSurface.SurfaceClosedException e10) {
            return I.n.n(e10);
        }
    }

    private void x() {
        G.o.a();
        o0.h hVarG = o0.h.g(this.f22802d, this.f22807i, this.f22806h, u(), this.f22800b, this.f22803e);
        o0 o0Var = this.f22809k;
        if (o0Var != null) {
            o0Var.u(hVarG);
        }
        Iterator<InterfaceC16068a<o0.h>> it = this.f22813o.iterator();
        while (it.hasNext()) {
            it.next().accept(hVarG);
        }
    }

    public void e(Runnable runnable) {
        G.o.a();
        h();
        this.f22811m.add(runnable);
    }

    public void f(InterfaceC16068a<o0.h> interfaceC16068a) {
        o2.i.g(interfaceC16068a);
        this.f22813o.add(interfaceC16068a);
    }

    public final void i() {
        G.o.a();
        this.f22810l.d();
        this.f22812n = true;
    }

    public com.google.common.util.concurrent.q<d0> j(final int i10, final d0.a aVar, final d0.a aVar2) {
        G.o.a();
        h();
        g();
        final a aVar3 = this.f22810l;
        return I.n.y(aVar3.j(), new I.a() { // from class: O.H
            @Override // I.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return N.d(this.f22789a, aVar3, i10, aVar, aVar2, (Surface) obj);
            }
        }, H.a.d());
    }

    public o0 l(InterfaceC3290z interfaceC3290z, boolean z10) {
        G.o.a();
        h();
        o0 o0Var = new o0(this.f22805g.e(), interfaceC3290z, z10, this.f22805g.b(), this.f22805g.c(), new Runnable() { // from class: O.D
            @Override // java.lang.Runnable
            public final void run() {
                N.a(this.f22783a);
            }
        });
        try {
            final DeferrableSurface deferrableSurfaceM = o0Var.m();
            a aVar = this.f22810l;
            Objects.requireNonNull(aVar);
            if (aVar.u(deferrableSurfaceM, new E(aVar))) {
                com.google.common.util.concurrent.q<Void> qVarK = aVar.k();
                Objects.requireNonNull(deferrableSurfaceM);
                qVarK.addListener(new Runnable() { // from class: O.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        deferrableSurfaceM.d();
                    }
                }, H.a.a());
            }
            this.f22809k = o0Var;
            x();
            return o0Var;
        } catch (DeferrableSurface.SurfaceClosedException e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            o0Var.v();
            throw e11;
        }
    }

    public final void m() {
        G.o.a();
        h();
        this.f22810l.d();
    }

    public DeferrableSurface o() {
        G.o.a();
        h();
        g();
        return this.f22810l;
    }

    public void v() {
        G.o.a();
        h();
        if (!this.f22810l.s()) {
            this.f22808j = false;
            this.f22810l.d();
            this.f22810l = new a(this.f22805g.e(), this.f22799a);
            Iterator<Runnable> it = this.f22811m.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public void y(DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
        G.o.a();
        h();
        a aVar = this.f22810l;
        Objects.requireNonNull(aVar);
        aVar.u(deferrableSurface, new E(aVar));
    }
}
