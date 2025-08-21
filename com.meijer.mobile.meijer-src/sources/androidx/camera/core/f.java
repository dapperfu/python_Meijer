package androidx.camera.core;

import C.C3037w;
import C.C3040z;
import C.p0;
import F.InterfaceC3289y;
import F.InterfaceC3290z;
import F.T;
import R.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f extends p0 {

    /* renamed from: w, reason: collision with root package name */
    public static final d f47484w = new d();

    /* renamed from: x, reason: collision with root package name */
    private static final Boolean f47485x = null;

    /* renamed from: q, reason: collision with root package name */
    final i f47486q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f47487r;

    /* renamed from: s, reason: collision with root package name */
    private a f47488s;

    /* renamed from: t, reason: collision with root package name */
    w.b f47489t;

    /* renamed from: u, reason: collision with root package name */
    private DeferrableSurface f47490u;

    /* renamed from: v, reason: collision with root package name */
    private w.c f47491v;

    public interface a {
        default Size a() {
            return null;
        }

        void b(n nVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements D.a<f, androidx.camera.core.impl.n, c> {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.s f47492a;

        public c() {
            this(androidx.camera.core.impl.s.b0());
        }

        @Deprecated
        public c l(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(androidx.camera.core.impl.q.f47675n, Integer.valueOf(i10));
            return this;
        }

        private c(androidx.camera.core.impl.s sVar) {
            this.f47492a = sVar;
            Class cls = (Class) sVar.h(J.k.f15321c, null);
            if (cls == null || cls.equals(f.class)) {
                g(E.b.IMAGE_ANALYSIS);
                m(f.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        static c d(androidx.camera.core.impl.k kVar) {
            return new c(androidx.camera.core.impl.s.c0(kVar));
        }

        @Override // C.InterfaceC3038x
        public androidx.camera.core.impl.r a() {
            return this.f47492a;
        }

        @Override // androidx.camera.core.impl.D.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.n b() {
            return new androidx.camera.core.impl.n(t.a0(this.f47492a));
        }

        public c i(C3037w c3037w) {
            if (!Objects.equals(C3037w.f3991d, c3037w)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            a().r(androidx.camera.core.impl.p.f47674m, c3037w);
            return this;
        }

        public f c() {
            androidx.camera.core.impl.n nVarB = b();
            androidx.camera.core.impl.q.w(nVarB);
            return new f(nVarB);
        }

        public c f(int i10) {
            a().r(androidx.camera.core.impl.n.f47652J, Integer.valueOf(i10));
            return this;
        }

        public c g(E.b bVar) {
            a().r(D.f47548F, bVar);
            return this;
        }

        public c h(Size size) {
            a().r(androidx.camera.core.impl.q.f47680s, size);
            return this;
        }

        public c j(R.c cVar) {
            a().r(androidx.camera.core.impl.q.f47683v, cVar);
            return this;
        }

        public c k(int i10) {
            a().r(D.f47544B, Integer.valueOf(i10));
            return this;
        }

        public c m(Class<f> cls) {
            a().r(J.k.f15321c, cls);
            if (a().h(J.k.f15320b, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c n(String str) {
            a().r(J.k.f15320b, str);
            return this;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Size f47493a;

        /* renamed from: b, reason: collision with root package name */
        private static final C3037w f47494b;

        /* renamed from: c, reason: collision with root package name */
        private static final R.c f47495c;

        /* renamed from: d, reason: collision with root package name */
        private static final androidx.camera.core.impl.n f47496d;

        static {
            Size size = new Size(640, 480);
            f47493a = size;
            C3037w c3037w = C3037w.f3991d;
            f47494b = c3037w;
            R.c cVarA = new c.a().d(R.a.f31496c).f(new R.d(N.c.f20522c, 1)).a();
            f47495c = cVarA;
            f47496d = new c().h(size).k(1).l(0).j(cVarA).i(c3037w).b();
        }

        public androidx.camera.core.impl.n a() {
            return f47496d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public static /* synthetic */ List b0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // C.p0
    public void I() {
        this.f47486q.f();
    }

    @Override // C.p0
    protected x N(androidx.camera.core.impl.k kVar) {
        this.f47489t.g(kVar);
        V(C3040z.a(new Object[]{this.f47489t.o()}));
        return e().g().d(kVar).a();
    }

    @Override // C.p0
    public D<?> k(boolean z10, E e10) {
        d dVar = f47484w;
        androidx.camera.core.impl.k kVarA = e10.a(dVar.a().O(), 1);
        if (z10) {
            kVarA = androidx.camera.core.impl.k.P(kVarA, dVar.a());
        }
        if (kVarA == null) {
            return null;
        }
        return z(kVarA).b();
    }

    public void k0(Executor executor, final a aVar) {
        synchronized (this.f47487r) {
            try {
                this.f47486q.p(executor, new a() { // from class: C.A
                    @Override // androidx.camera.core.f.a
                    public final void b(androidx.camera.core.n nVar) {
                        aVar.b(nVar);
                    }
                });
                if (this.f47488s == null) {
                    E();
                }
                this.f47488s = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + o();
    }

    f(androidx.camera.core.impl.n nVar) {
        super(nVar);
        this.f47487r = new Object();
        if (((androidx.camera.core.impl.n) j()).Y(0) == 1) {
            this.f47486q = new j();
        } else {
            this.f47486q = new k(nVar.V(H.a.b()));
        }
        this.f47486q.r(h0());
        this.f47486q.s(j0());
    }

    public static /* synthetic */ void Y(f fVar, w wVar, w.g gVar) {
        if (fVar.g() == null) {
            return;
        }
        fVar.c0();
        fVar.f47486q.g();
        w.b bVarD0 = fVar.d0(fVar.i(), (androidx.camera.core.impl.n) fVar.j(), (x) o2.i.g(fVar.e()));
        fVar.f47489t = bVarD0;
        fVar.V(C3040z.a(new Object[]{bVarD0.o()}));
        fVar.G();
    }

    public static /* synthetic */ void Z(q qVar, q qVar2) {
        qVar.j();
        if (qVar2 != null) {
            qVar2.j();
        }
    }

    private boolean i0(InterfaceC3290z interfaceC3290z) {
        if (!j0() || q(interfaceC3290z) % 180 == 0) {
            return false;
        }
        return true;
    }

    private void l0() {
        InterfaceC3290z interfaceC3290zG = g();
        if (interfaceC3290zG != null) {
            this.f47486q.u(q(interfaceC3290zG));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C.p0
    protected D<?> K(InterfaceC3289y interfaceC3289y, D.a<?, ?, ?> aVar) {
        final Size size;
        c.a aVarB;
        Boolean boolG0 = g0();
        boolean zA = interfaceC3289y.d().a(OnePixelShiftQuirk.class);
        i iVar = this.f47486q;
        if (boolG0 != null) {
            zA = boolG0.booleanValue();
        }
        iVar.q(zA);
        synchronized (this.f47487r) {
            try {
                a aVar2 = this.f47488s;
                if (aVar2 != null) {
                    size = aVar2.a();
                } else {
                    size = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size == null) {
            return aVar.b();
        }
        if (interfaceC3289y.h(((Integer) aVar.a().h(androidx.camera.core.impl.q.f47676o, 0)).intValue()) % 180 == 90) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        D dB = aVar.b();
        k.a<Size> aVar3 = androidx.camera.core.impl.q.f47679r;
        if (!dB.c(aVar3)) {
            aVar.a().r(aVar3, size);
        }
        D dB2 = aVar.b();
        k.a aVar4 = androidx.camera.core.impl.q.f47683v;
        if (dB2.c(aVar4)) {
            R.c cVar = (R.c) c().h(aVar4, null);
            if (cVar == null) {
                aVarB = new c.a();
            } else {
                aVarB = c.a.b(cVar);
            }
            if (cVar == null || cVar.d() == null) {
                aVarB.f(new R.d(size, 1));
            }
            if (cVar == null) {
                aVarB.e(new R.b() { // from class: C.B
                    @Override // R.b
                    public final List a(List list, int i10) {
                        return androidx.camera.core.f.b0(size, list, i10);
                    }
                });
            }
            aVar.a().r(aVar4, aVarB.a());
        }
        return aVar.b();
    }

    @Override // C.p0
    protected x O(x xVar, x xVar2) {
        w.b bVarD0 = d0(i(), (androidx.camera.core.impl.n) j(), xVar);
        this.f47489t = bVarD0;
        V(C3040z.a(new Object[]{bVarD0.o()}));
        return xVar;
    }

    @Override // C.p0
    public void P() {
        c0();
        this.f47486q.j();
    }

    @Override // C.p0
    public void S(Matrix matrix) {
        super.S(matrix);
        this.f47486q.v(matrix);
    }

    @Override // C.p0
    public void T(Rect rect) {
        super.T(rect);
        this.f47486q.w(rect);
    }

    void c0() {
        G.o.a();
        w.c cVar = this.f47491v;
        if (cVar != null) {
            cVar.b();
            this.f47491v = null;
        }
        DeferrableSurface deferrableSurface = this.f47490u;
        if (deferrableSurface != null) {
            deferrableSurface.d();
            this.f47490u = null;
        }
    }

    w.b d0(String str, androidx.camera.core.impl.n nVar, x xVar) {
        int iF0;
        final q qVar;
        boolean zI0;
        int width;
        int height;
        int i10;
        boolean z10;
        final q qVar2;
        G.o.a();
        Size sizeE = xVar.e();
        Executor executor = (Executor) o2.i.g(nVar.V(H.a.b()));
        boolean z11 = true;
        if (e0() == 1) {
            iF0 = f0();
        } else {
            iF0 = 4;
        }
        int i11 = iF0;
        if (nVar.a0() != null) {
            qVar = new q(nVar.a0().a(sizeE.getWidth(), sizeE.getHeight(), m(), i11, 0L));
        } else {
            qVar = new q(o.a(sizeE.getWidth(), sizeE.getHeight(), m(), i11));
        }
        if (g() != null) {
            zI0 = i0(g());
        } else {
            zI0 = false;
        }
        if (zI0) {
            width = sizeE.getHeight();
        } else {
            width = sizeE.getWidth();
        }
        if (zI0) {
            height = sizeE.getWidth();
        } else {
            height = sizeE.getHeight();
        }
        if (h0() == 2) {
            i10 = 1;
        } else {
            i10 = 35;
        }
        if (m() == 35 && h0() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m() != 35 || ((g() == null || q(g()) == 0) && !Boolean.TRUE.equals(g0()))) {
            z11 = false;
        }
        if (!z10 && !z11) {
            qVar2 = null;
        } else {
            qVar2 = new q(o.a(width, height, i10, qVar.e()));
        }
        if (qVar2 != null) {
            this.f47486q.t(qVar2);
        }
        l0();
        qVar.f(this.f47486q, executor);
        w.b bVarP = w.b.p(nVar, xVar.e());
        if (xVar.d() != null) {
            bVarP.g(xVar.d());
        }
        DeferrableSurface deferrableSurface = this.f47490u;
        if (deferrableSurface != null) {
            deferrableSurface.d();
        }
        T t10 = new T(qVar.getSurface(), sizeE, m());
        this.f47490u = t10;
        t10.k().addListener(new Runnable() { // from class: C.C
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.f.Z(qVar, qVar2);
            }
        }, H.a.d());
        bVarP.r(xVar.c());
        bVarP.m(this.f47490u, xVar.b(), null, -1);
        w.c cVar = this.f47491v;
        if (cVar != null) {
            cVar.b();
        }
        w.c cVar2 = new w.c(new w.d() { // from class: C.D
            @Override // androidx.camera.core.impl.w.d
            public final void a(androidx.camera.core.impl.w wVar, w.g gVar) {
                androidx.camera.core.f.Y(this.f3736a, wVar, gVar);
            }
        });
        this.f47491v = cVar2;
        bVarP.q(cVar2);
        return bVarP;
    }

    public int e0() {
        return ((androidx.camera.core.impl.n) j()).Y(0);
    }

    public int f0() {
        return ((androidx.camera.core.impl.n) j()).Z(6);
    }

    public Boolean g0() {
        return ((androidx.camera.core.impl.n) j()).b0(f47485x);
    }

    public int h0() {
        return ((androidx.camera.core.impl.n) j()).c0(1);
    }

    public boolean j0() {
        return ((androidx.camera.core.impl.n) j()).d0(Boolean.FALSE).booleanValue();
    }

    @Override // C.p0
    public D.a<?, ?, ?> z(androidx.camera.core.impl.k kVar) {
        return c.d(kVar);
    }
}
