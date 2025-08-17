package C;

import F.InterfaceC3627y;
import F.InterfaceC3628z;
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
    public static final b f3326y = new b();

    /* renamed from: z, reason: collision with root package name */
    private static final Executor f3327z = H.a.d();

    /* renamed from: q, reason: collision with root package name */
    private c f3328q;

    /* renamed from: r, reason: collision with root package name */
    private Executor f3329r;

    /* renamed from: s, reason: collision with root package name */
    w.b f3330s;

    /* renamed from: t, reason: collision with root package name */
    private DeferrableSurface f3331t;

    /* renamed from: u, reason: collision with root package name */
    private O.N f3332u;

    /* renamed from: v, reason: collision with root package name */
    o0 f3333v;

    /* renamed from: w, reason: collision with root package name */
    private O.W f3334w;

    /* renamed from: x, reason: collision with root package name */
    private w.c f3335x;

    public static final class a implements D.a<Y, androidx.camera.core.impl.u, a> {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.s f3336a;

        public a() {
            this(androidx.camera.core.impl.s.b0());
        }

        @Deprecated
        public a j(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(androidx.camera.core.impl.q.f47451n, Integer.valueOf(i10));
            return this;
        }

        private a(androidx.camera.core.impl.s sVar) {
            this.f3336a = sVar;
            Class cls = (Class) sVar.h(J.k.f14474c, null);
            if (cls != null && !cls.equals(Y.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            f(E.b.PREVIEW);
            k(Y.class);
            k.a<Integer> aVar = androidx.camera.core.impl.q.f47454q;
            if (((Integer) sVar.h(aVar, -1)).intValue() == -1) {
                sVar.r(aVar, 2);
            }
        }

        static a d(androidx.camera.core.impl.k kVar) {
            return new a(androidx.camera.core.impl.s.c0(kVar));
        }

        @Override // C.InterfaceC2980x
        public androidx.camera.core.impl.r a() {
            return this.f3336a;
        }

        @Override // androidx.camera.core.impl.D.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.u b() {
            return new androidx.camera.core.impl.u(androidx.camera.core.impl.t.a0(this.f3336a));
        }

        public Y c() {
            androidx.camera.core.impl.u uVarB = b();
            androidx.camera.core.impl.q.w(uVarB);
            return new Y(uVarB);
        }

        public a f(E.b bVar) {
            a().r(androidx.camera.core.impl.D.f47324F, bVar);
            return this;
        }

        public a g(C2979w c2979w) {
            a().r(androidx.camera.core.impl.p.f47450m, c2979w);
            return this;
        }

        public a h(R.c cVar) {
            a().r(androidx.camera.core.impl.q.f47459v, cVar);
            return this;
        }

        public a i(int i10) {
            a().r(androidx.camera.core.impl.D.f47320B, Integer.valueOf(i10));
            return this;
        }

        public a k(Class<Y> cls) {
            a().r(J.k.f14474c, cls);
            if (a().h(J.k.f14473b, null) == null) {
                l(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a l(String str) {
            a().r(J.k.f14473b, str);
            return this;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final R.c f3337a;

        /* renamed from: b, reason: collision with root package name */
        private static final androidx.camera.core.impl.u f3338b;

        /* renamed from: c, reason: collision with root package name */
        private static final C2979w f3339c;

        static {
            R.c cVarA = new c.a().d(R.a.f31494c).f(R.d.f31506c).a();
            f3337a = cVarA;
            C2979w c2979w = C2979w.f3532c;
            f3339c = c2979w;
            f3338b = new a().i(2).j(0).h(cVarA).g(c2979w).b();
        }

        public androidx.camera.core.impl.u a() {
            return f3338b;
        }
    }

    public interface c {
        void a(o0 o0Var);
    }

    private void b0(w.b bVar, androidx.camera.core.impl.x xVar) {
        if (this.f3328q != null) {
            bVar.m(this.f3331t, xVar.b(), p(), n());
        }
        w.c cVar = this.f3335x;
        if (cVar != null) {
            cVar.b();
        }
        w.c cVar2 = new w.c(new w.d() { // from class: C.X
            @Override // androidx.camera.core.impl.w.d
            public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                Y.Y(this.f3325a, wVar, gVar);
            }
        });
        this.f3335x = cVar2;
        bVar.q(cVar2);
    }

    private void c0() {
        w.c cVar = this.f3335x;
        if (cVar != null) {
            cVar.b();
            this.f3335x = null;
        }
        DeferrableSurface deferrableSurface = this.f3331t;
        if (deferrableSurface != null) {
            deferrableSurface.d();
            this.f3331t = null;
        }
        O.W w10 = this.f3334w;
        if (w10 != null) {
            w10.f();
            this.f3334w = null;
        }
        O.N n10 = this.f3332u;
        if (n10 != null) {
            n10.i();
            this.f3332u = null;
        }
        this.f3333v = null;
    }

    @Override // C.p0
    protected androidx.camera.core.impl.x N(androidx.camera.core.impl.k kVar) {
        this.f3330s.g(kVar);
        V(C2982z.a(new Object[]{this.f3330s.o()}));
        return e().g().d(kVar).a();
    }

    public void i0(c cVar) {
        j0(f3327z, cVar);
    }

    @Override // C.p0
    public androidx.camera.core.impl.D<?> k(boolean z10, androidx.camera.core.impl.E e10) {
        b bVar = f3326y;
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
        this.f3329r = f3327z;
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
        InterfaceC3628z interfaceC3628zG = g();
        Objects.requireNonNull(interfaceC3628zG);
        final InterfaceC3628z interfaceC3628z = interfaceC3628zG;
        c0();
        if (this.f3332u == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.i(z10);
        Matrix matrixV = v();
        boolean zO = interfaceC3628z.o();
        Rect rectE0 = e0(xVar.e());
        Objects.requireNonNull(rectE0);
        this.f3332u = new O.N(1, 34, xVar, matrixV, zO, rectE0, r(interfaceC3628z, C(interfaceC3628z)), d(), k0(interfaceC3628z));
        AbstractC2967j abstractC2967jL = l();
        if (abstractC2967jL != null) {
            this.f3334w = new O.W(interfaceC3628z, abstractC2967jL.a());
            this.f3332u.e(new Runnable() { // from class: C.U
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3320a.G();
                }
            });
            Q.f fVarJ = Q.f.j(this.f3332u);
            O.N n10 = this.f3334w.j(W.b.c(this.f3332u, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n10);
            n10.e(new Runnable() { // from class: C.V
                @Override // java.lang.Runnable
                public final void run() {
                    Y y10 = this.f3321a;
                    y10.f0(y10.f3332u, interfaceC3628z);
                }
            });
            this.f3333v = n10.k(interfaceC3628z);
            this.f3331t = this.f3332u.o();
        } else {
            this.f3332u.e(new Runnable() { // from class: C.U
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3320a.G();
                }
            });
            o0 o0VarK = this.f3332u.k(interfaceC3628z);
            this.f3333v = o0VarK;
            this.f3331t = o0VarK.m();
        }
        if (this.f3328q != null) {
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
    public void f0(O.N n10, InterfaceC3628z interfaceC3628z) {
        G.o.a();
        if (interfaceC3628z == g()) {
            n10.v();
        }
    }

    private void g0() {
        h0();
        final c cVar = (c) o2.i.g(this.f3328q);
        final o0 o0Var = (o0) o2.i.g(this.f3333v);
        this.f3329r.execute(new Runnable() { // from class: C.W
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(o0Var);
            }
        });
    }

    private void h0() {
        InterfaceC3628z interfaceC3628zG = g();
        O.N n10 = this.f3332u;
        if (interfaceC3628zG != null && n10 != null) {
            n10.z(r(interfaceC3628zG, C(interfaceC3628zG)), d());
        }
    }

    private boolean k0(InterfaceC3628z interfaceC3628z) {
        if (interfaceC3628z.o() && C(interfaceC3628z)) {
            return true;
        }
        return false;
    }

    private void l0(androidx.camera.core.impl.u uVar, androidx.camera.core.impl.x xVar) {
        w.b bVarD0 = d0(uVar, xVar);
        this.f3330s = bVarD0;
        V(C2982z.a(new Object[]{bVarD0.o()}));
    }

    @Override // C.p0
    protected androidx.camera.core.impl.D<?> K(InterfaceC3627y interfaceC3627y, D.a<?, ?, ?> aVar) {
        aVar.a().r(androidx.camera.core.impl.p.f47449l, 34);
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
            this.f3328q = null;
            F();
            return;
        }
        this.f3328q = cVar;
        this.f3329r = executor;
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
