package E;

import E.C3179t;
import E.N;
import E.Y;
import F.AbstractC3273h;
import F.C3274i;
import F.S;
import O.C4347u;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.e;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Objects;
import o2.InterfaceC16068a;

/* renamed from: E.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3179t {

    /* renamed from: b, reason: collision with root package name */
    androidx.camera.core.q f6939b;

    /* renamed from: c, reason: collision with root package name */
    androidx.camera.core.q f6940c;

    /* renamed from: d, reason: collision with root package name */
    private N.a f6941d;

    /* renamed from: e, reason: collision with root package name */
    private c f6942e;

    /* renamed from: a, reason: collision with root package name */
    O f6938a = null;

    /* renamed from: f, reason: collision with root package name */
    private D f6943f = null;

    /* renamed from: E.t$a */
    class a extends AbstractC3273h {
        a() {
        }

        public static /* synthetic */ void e(a aVar) {
            O o10 = C3179t.this.f6938a;
            if (o10 != null) {
                o10.n();
            }
        }

        @Override // F.AbstractC3273h
        public void d(int i10) {
            H.a.d().execute(new Runnable() { // from class: E.s
                @Override // java.lang.Runnable
                public final void run() {
                    C3179t.a.e(this.f6937a);
                }
            });
        }
    }

    /* renamed from: E.t$b */
    class b implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f6945a;

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        b(O o10) {
            this.f6945a = o10;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            G.o.a();
            if (this.f6945a == C3179t.this.f6938a) {
                C.P.l("CaptureNode", "request aborted, id=" + C3179t.this.f6938a.e());
                if (C3179t.this.f6943f != null) {
                    C3179t.this.f6943f.i();
                }
                C3179t.this.f6938a = null;
            }
        }
    }

    /* renamed from: E.t$c */
    static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        private DeferrableSurface f6948b;

        /* renamed from: a, reason: collision with root package name */
        private AbstractC3273h f6947a = new a();

        /* renamed from: c, reason: collision with root package name */
        private DeferrableSurface f6949c = null;

        /* renamed from: E.t$c$a */
        class a extends AbstractC3273h {
            a() {
            }
        }

        abstract C4347u<Y.b> b();

        abstract C.M c();

        abstract int d();

        abstract int e();

        abstract int f();

        abstract Size g();

        abstract C4347u<O> i();

        abstract Size j();

        abstract boolean l();

        static c m(Size size, int i10, int i11, boolean z10, C.M m10, Size size2, int i12) {
            return new C3162b(size, i10, i11, z10, m10, size2, i12, new C4347u(), new C4347u());
        }

        AbstractC3273h a() {
            return this.f6947a;
        }

        DeferrableSurface h() {
            return this.f6949c;
        }

        DeferrableSurface k() {
            DeferrableSurface deferrableSurface = this.f6948b;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        void n(AbstractC3273h abstractC3273h) {
            this.f6947a = abstractC3273h;
        }

        void o(Surface surface, Size size, int i10) {
            this.f6949c = new F.T(surface, size, i10);
        }

        void p(Surface surface) {
            o2.i.j(this.f6948b == null, "The surface is already set.");
            this.f6948b = new F.T(surface, j(), d());
        }

        c() {
        }
    }

    public static /* synthetic */ void e(androidx.camera.core.q qVar) {
        if (qVar != null) {
            qVar.j();
        }
    }

    private static F.S g(C.M m10, int i10, int i11, int i12) {
        return m10 != null ? m10.a(i10, i11, i12, 4, 0L) : androidx.camera.core.o.a(i10, i11, i12, 4);
    }

    private void l(androidx.camera.core.n nVar) {
        if (this.f6938a == null) {
            C.P.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            nVar.close();
        } else {
            N.a aVar = this.f6941d;
            Objects.requireNonNull(aVar);
            aVar.d().accept(N.b.c(this.f6938a, nVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N.a q(c cVar) {
        InterfaceC16068a<O> interfaceC16068a;
        D d10;
        o2.i.j(this.f6942e == null && this.f6939b == null, "CaptureNode does not support recreation yet.");
        this.f6942e = cVar;
        Size sizeJ = cVar.j();
        int iD = cVar.d();
        boolean zL = cVar.l();
        AbstractC3273h aVar = new a();
        if (zL || cVar.c() != null) {
            D d11 = new D(g(cVar.c(), sizeJ.getWidth(), sizeJ.getHeight(), iD));
            this.f6943f = d11;
            interfaceC16068a = new InterfaceC16068a() { // from class: E.m
                @Override // o2.InterfaceC16068a
                public final void accept(Object obj) {
                    C3179t.a(this.f6931a, (O) obj);
                }
            };
            d10 = d11;
        } else {
            androidx.camera.core.p pVar = new androidx.camera.core.p(sizeJ.getWidth(), sizeJ.getHeight(), iD, 4);
            aVar = C3274i.b(aVar, pVar.m());
            interfaceC16068a = new InterfaceC16068a() { // from class: E.l
                @Override // o2.InterfaceC16068a
                public final void accept(Object obj) {
                    this.f6930a.k((O) obj);
                }
            };
            d10 = pVar;
        }
        cVar.n(aVar);
        Surface surface = d10.getSurface();
        Objects.requireNonNull(surface);
        cVar.p(surface);
        this.f6939b = new androidx.camera.core.q(d10);
        d10.f(new S.a() { // from class: E.n
            @Override // F.S.a
            public final void a(F.S s10) {
                C3179t.d(this.f6932a, s10);
            }
        }, H.a.d());
        if (cVar.g() != null) {
            F.S sG = g(cVar.c(), cVar.g().getWidth(), cVar.g().getHeight(), cVar.f());
            sG.f(new S.a() { // from class: E.o
                @Override // F.S.a
                public final void a(F.S s10) {
                    C3179t.b(this.f6933a, s10);
                }
            }, H.a.d());
            this.f6940c = new androidx.camera.core.q(sG);
            cVar.o(sG.getSurface(), cVar.g(), cVar.f());
        }
        cVar.i().a(interfaceC16068a);
        cVar.b().a(new InterfaceC16068a() { // from class: E.p
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                this.f6934a.o((Y.b) obj);
            }
        });
        N.a aVarE = N.a.e(cVar.d(), cVar.e());
        this.f6941d = aVarE;
        return aVarE;
    }

    C3179t() {
    }

    public static /* synthetic */ void a(C3179t c3179t, O o10) {
        c3179t.k(o10);
        c3179t.f6943f.h(o10);
    }

    public static /* synthetic */ void b(C3179t c3179t, F.S s10) {
        c3179t.getClass();
        try {
            androidx.camera.core.n nVarB = s10.b();
            if (nVarB != null) {
                c3179t.l(nVarB);
            }
        } catch (IllegalStateException e10) {
            C.P.d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    public static /* synthetic */ void d(C3179t c3179t, F.S s10) {
        c3179t.getClass();
        try {
            androidx.camera.core.n nVarB = s10.b();
            if (nVarB != null) {
                c3179t.j(nVarB);
                return;
            }
            O o10 = c3179t.f6938a;
            if (o10 != null) {
                c3179t.o(Y.b.c(o10.e(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e10) {
            O o11 = c3179t.f6938a;
            if (o11 != null) {
                c3179t.o(Y.b.c(o11.e(), new ImageCaptureException(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    private void i(androidx.camera.core.n nVar) {
        G.o.a();
        N.a aVar = this.f6941d;
        Objects.requireNonNull(aVar);
        aVar.a().accept(N.b.c(this.f6938a, nVar));
        O o10 = this.f6938a;
        this.f6938a = null;
        o10.q();
    }

    private void n(c cVar, final androidx.camera.core.q qVar, final androidx.camera.core.q qVar2) {
        cVar.k().d();
        cVar.k().k().addListener(new Runnable() { // from class: E.q
            @Override // java.lang.Runnable
            public final void run() {
                qVar.j();
            }
        }, H.a.d());
        if (cVar.h() != null) {
            cVar.h().d();
            cVar.h().k().addListener(new Runnable() { // from class: E.r
                @Override // java.lang.Runnable
                public final void run() {
                    C3179t.e(qVar2);
                }
            }, H.a.d());
        }
    }

    public int h() {
        boolean z10;
        G.o.a();
        if (this.f6939b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "The ImageReader is not initialized.");
        return this.f6939b.i();
    }

    void j(androidx.camera.core.n nVar) {
        G.o.a();
        if (this.f6938a == null) {
            C.P.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + nVar);
            nVar.close();
            return;
        }
        if (((Integer) nVar.S2().a().d(this.f6938a.i())) == null) {
            C.P.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            nVar.close();
        } else {
            i(nVar);
        }
    }

    void k(O o10) {
        boolean z10;
        G.o.a();
        boolean z11 = false;
        if (o10.h().size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "only one capture stage is supported.");
        if (h() > 0) {
            z11 = true;
        }
        o2.i.j(z11, "Too many acquire images. Close image to be able to process next.");
        this.f6938a = o10;
        I.n.j(o10.a(), new b(o10), H.a.a());
    }

    public void m() {
        G.o.a();
        c cVar = this.f6942e;
        Objects.requireNonNull(cVar);
        androidx.camera.core.q qVar = this.f6939b;
        Objects.requireNonNull(qVar);
        n(cVar, qVar, this.f6940c);
    }

    void o(Y.b bVar) {
        G.o.a();
        O o10 = this.f6938a;
        if (o10 != null && o10.e() == bVar.b()) {
            this.f6938a.l(bVar.a());
        }
    }

    public void p(e.a aVar) {
        boolean z10;
        G.o.a();
        if (this.f6939b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "The ImageReader is not initialized.");
        this.f6939b.k(aVar);
    }
}
