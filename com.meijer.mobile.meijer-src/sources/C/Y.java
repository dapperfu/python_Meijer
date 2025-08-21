package C;

import F.InterfaceC3289y;
import F.InterfaceC3290z;
import O.W;
import R.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.w;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Y extends p0 {

    /* renamed from: y, reason: collision with root package name */
    public static final b f3784y = new b();

    /* renamed from: z, reason: collision with root package name */
    private static final Executor f3785z = H.a.d();

    /* renamed from: q, reason: collision with root package name */
    private c f3786q;

    /* renamed from: r, reason: collision with root package name */
    private Executor f3787r;

    /* renamed from: s, reason: collision with root package name */
    w.b f3788s;

    /* renamed from: t, reason: collision with root package name */
    private DeferrableSurface f3789t;

    /* renamed from: u, reason: collision with root package name */
    private O.N f3790u;

    /* renamed from: v, reason: collision with root package name */
    o0 f3791v;

    /* renamed from: w, reason: collision with root package name */
    private O.W f3792w;

    /* renamed from: x, reason: collision with root package name */
    private w.c f3793x;

    public static final class a implements D.a<Y, androidx.camera.core.impl.u, a> {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.s f3794a;

        public a() {
            this(androidx.camera.core.impl.s.b0());
        }

        @Deprecated
        public a j(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(androidx.camera.core.impl.q.f47675n, Integer.valueOf(i10));
            return this;
        }

        private a(androidx.camera.core.impl.s sVar) {
            this.f3794a = sVar;
            Class cls = (Class) sVar.h(J.k.f15321c, null);
            if (cls != null && !cls.equals(Y.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            f(E.b.PREVIEW);
            k(Y.class);
            k.a<Integer> aVar = androidx.camera.core.impl.q.f47678q;
            if (((Integer) sVar.h(aVar, -1)).intValue() == -1) {
                sVar.r(aVar, 2);
            }
        }

        static a d(androidx.camera.core.impl.k kVar) {
            return new a(androidx.camera.core.impl.s.c0(kVar));
        }

        @Override // C.InterfaceC3038x
        public androidx.camera.core.impl.r a() {
            return this.f3794a;
        }

        @Override // androidx.camera.core.impl.D.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.u b() {
            return new androidx.camera.core.impl.u(androidx.camera.core.impl.t.a0(this.f3794a));
        }

        public Y c() {
            androidx.camera.core.impl.u uVarB = b();
            androidx.camera.core.impl.q.w(uVarB);
            return new Y(uVarB);
        }

        public a f(E.b bVar) {
            a().r(androidx.camera.core.impl.D.f47548F, bVar);
            return this;
        }

        public a g(C3037w c3037w) {
            a().r(androidx.camera.core.impl.p.f47674m, c3037w);
            return this;
        }

        public a h(R.c cVar) {
            a().r(androidx.camera.core.impl.q.f47683v, cVar);
            return this;
        }

        public a i(int i10) {
            a().r(androidx.camera.core.impl.D.f47544B, Integer.valueOf(i10));
            return this;
        }

        public a k(Class<Y> cls) {
            a().r(J.k.f15321c, cls);
            if (a().h(J.k.f15320b, null) == null) {
                l(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a l(String str) {
            a().r(J.k.f15320b, str);
            return this;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final R.c f3795a;

        /* renamed from: b, reason: collision with root package name */
        private static final androidx.camera.core.impl.u f3796b;

        /* renamed from: c, reason: collision with root package name */
        private static final C3037w f3797c;

        static {
            R.c cVarA = new c.a().d(R.a.f31496c).f(R.d.f31508c).a();
            f3795a = cVarA;
            C3037w c3037w = C3037w.f3990c;
            f3797c = c3037w;
            f3796b = new a().i(2).j(0).h(cVarA).g(c3037w).b();
        }

        public androidx.camera.core.impl.u a() {
            return f3796b;
        }
    }

    public interface c {
        void a(o0 o0Var);
    }

    private void b0(w.b bVar, androidx.camera.core.impl.x xVar) {
        if (this.f3786q != null) {
            bVar.m(this.f3789t, xVar.b(), p(), n());
        }
        w.c cVar = this.f3793x;
        if (cVar != null) {
            cVar.b();
        }
        w.c cVar2 = new w.c(new w.d() { // from class: C.X
            @Override // androidx.camera.core.impl.w.d
            public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                Y.Y(this.f3783a, wVar, gVar);
            }
        });
        this.f3793x = cVar2;
        bVar.q(cVar2);
    }

    private void c0() {
        w.c cVar = this.f3793x;
        if (cVar != null) {
            cVar.b();
            this.f3793x = null;
        }
        DeferrableSurface deferrableSurface = this.f3789t;
        if (deferrableSurface != null) {
            deferrableSurface.d();
            this.f3789t = null;
        }
        O.W w10 = this.f3792w;
        if (w10 != null) {
            w10.f();
            this.f3792w = null;
        }
        O.N n10 = this.f3790u;
        if (n10 != null) {
            n10.i();
            this.f3790u = null;
        }
        this.f3791v = null;
    }

    @Override // C.p0
    protected androidx.camera.core.impl.x N(androidx.camera.core.impl.k kVar) {
        this.f3788s.g(kVar);
        V(C3040z.a(new Object[]{this.f3788s.o()}));
        return e().g().d(kVar).a();
    }

    public void i0(c cVar) {
        j0(f3785z, cVar);
    }

    @Override // C.p0
    public androidx.camera.core.impl.D<?> k(boolean z10, androidx.camera.core.impl.E e10) {
        b bVar = f3784y;
        androidx.camera.core.impl.k kVarA = e10.a(bVar.a().O(), 1);
        if (z10) {
            kVarA = androidx.camera.core.impl.k.P(kVarA, bVar.a());
        }
        if (kVarA == null) {
            return null;
        }
        return z(kVarA).b();
    }

    public String toString() {
        return "Preview:" + o();
    }

    @Override // C.p0
    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    Y(androidx.camera.core.impl.u uVar) {
        super(uVar);
        this.f3787r = f3785z;
    }

    public static /* synthetic */ void Y(Y y10, androidx.camera.core.impl.w wVar, w.g gVar) {
        if (y10.g() == null) {
            return;
        }
        y10.l0((androidx.camera.core.impl.u) y10.j(), y10.e());
        y10.G();
    }

    private w.b d0(androidx.camera.core.impl.u uVar, androidx.camera.core.impl.x xVar) {
        boolean z10;
        G.o.a();
        InterfaceC3290z interfaceC3290zG = g();
        Objects.requireNonNull(interfaceC3290zG);
        final InterfaceC3290z interfaceC3290z = interfaceC3290zG;
        c0();
        if (this.f3790u == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.i(z10);
        Matrix matrixV = v();
        boolean zO = interfaceC3290z.o();
        Rect rectE0 = e0(xVar.e());
        Objects.requireNonNull(rectE0);
        this.f3790u = new O.N(1, 34, xVar, matrixV, zO, rectE0, r(interfaceC3290z, C(interfaceC3290z)), d(), k0(interfaceC3290z));
        AbstractC3025j abstractC3025jL = l();
        if (abstractC3025jL != null) {
            this.f3792w = new O.W(interfaceC3290z, abstractC3025jL.a());
            this.f3790u.e(new Runnable() { // from class: C.U
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3778a.G();
                }
            });
            Q.f fVarJ = Q.f.j(this.f3790u);
            O.N n10 = this.f3792w.j(W.b.c(this.f3790u, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n10);
            n10.e(new Runnable() { // from class: C.V
                @Override // java.lang.Runnable
                public final void run() {
                    Y y10 = this.f3779a;
                    y10.f0(y10.f3790u, interfaceC3290z);
                }
            });
            this.f3791v = n10.k(interfaceC3290z);
            this.f3789t = this.f3790u.o();
        } else {
            this.f3790u.e(new Runnable() { // from class: C.U
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3778a.G();
                }
            });
            o0 o0VarK = this.f3790u.k(interfaceC3290z);
            this.f3791v = o0VarK;
            this.f3789t = o0VarK.m();
        }
        if (this.f3786q != null) {
            g0();
        }
        w.b bVarP = w.b.p(uVar, xVar.e());
        bVarP.r(xVar.c());
        bVarP.v(uVar.E());
        if (xVar.d() != null) {
            bVarP.g(xVar.d());
        }
        b0(bVarP, xVar);
        return bVarP;
    }

    private Rect e0(Size size) {
        if (A() != null) {
            return A();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(O.N n10, InterfaceC3290z interfaceC3290z) {
        G.o.a();
        if (interfaceC3290z == g()) {
            n10.v();
        }
    }

    private void g0() {
        h0();
        final c cVar = (c) o2.i.g(this.f3786q);
        final o0 o0Var = (o0) o2.i.g(this.f3791v);
        this.f3787r.execute(new Runnable() { // from class: C.W
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(o0Var);
            }
        });
    }

    private void h0() {
        InterfaceC3290z interfaceC3290zG = g();
        O.N n10 = this.f3790u;
        if (interfaceC3290zG != null && n10 != null) {
            n10.z(r(interfaceC3290zG, C(interfaceC3290zG)), d());
        }
    }

    private boolean k0(InterfaceC3290z interfaceC3290z) {
        if (interfaceC3290z.o() && C(interfaceC3290z)) {
            return true;
        }
        return false;
    }

    private void l0(androidx.camera.core.impl.u uVar, androidx.camera.core.impl.x xVar) {
        w.b bVarD0 = d0(uVar, xVar);
        this.f3788s = bVarD0;
        V(C3040z.a(new Object[]{bVarD0.o()}));
    }

    @Override // C.p0
    protected androidx.camera.core.impl.D<?> K(InterfaceC3289y interfaceC3289y, D.a<?, ?, ?> aVar) {
        aVar.a().r(androidx.camera.core.impl.p.f47673l, 34);
        return aVar.b();
    }

    @Override // C.p0
    protected androidx.camera.core.impl.x O(androidx.camera.core.impl.x xVar, androidx.camera.core.impl.x xVar2) {
        l0((androidx.camera.core.impl.u) j(), xVar);
        return xVar;
    }

    @Override // C.p0
    public void P() {
        c0();
    }

    @Override // C.p0
    public void T(Rect rect) {
        super.T(rect);
        h0();
    }

    public void j0(Executor executor, c cVar) {
        G.o.a();
        if (cVar == null) {
            this.f3786q = null;
            F();
            return;
        }
        this.f3786q = cVar;
        this.f3787r = executor;
        if (f() != null) {
            l0((androidx.camera.core.impl.u) j(), e());
            G();
        }
        E();
    }

    @Override // C.p0
    public D.a<?, ?, ?> z(androidx.camera.core.impl.k kVar) {
        return a.d(kVar);
    }
}
