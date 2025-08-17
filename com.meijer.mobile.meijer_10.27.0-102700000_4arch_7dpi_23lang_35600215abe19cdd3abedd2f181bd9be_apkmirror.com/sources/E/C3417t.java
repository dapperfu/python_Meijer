package E;

import E.C3417t;
import E.N;
import E.Y;
import F.AbstractC3611h;
import F.C3612i;
import F.S;
import O.C4434u;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.e;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Objects;
import o2.InterfaceC15993a;

/* renamed from: E.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3417t {

    /* renamed from: b, reason: collision with root package name */
    androidx.camera.core.q f7532b;

    /* renamed from: c, reason: collision with root package name */
    androidx.camera.core.q f7533c;

    /* renamed from: d, reason: collision with root package name */
    private N.a f7534d;

    /* renamed from: e, reason: collision with root package name */
    private c f7535e;

    /* renamed from: a, reason: collision with root package name */
    O f7531a = null;

    /* renamed from: f, reason: collision with root package name */
    private D f7536f = null;

    /* renamed from: E.t$a */
    class a extends AbstractC3611h {
        a() {
        }

        public static /* synthetic */ void e(a aVar) {
            O o10 = C3417t.this.f7531a;
            if (o10 != null) {
                o10.n();
            }
        }

        @Override // F.AbstractC3611h
        public void d(int i10) {
            H.a.d().execute(new Runnable() { // from class: E.s
                @Override // java.lang.Runnable
                public final void run() {
                    C3417t.a.e(this.f7530a);
                }
            });
        }
    }

    /* renamed from: E.t$b */
    class b implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f7538a;

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        b(O o10) {
            this.f7538a = o10;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            G.o.a();
            if (this.f7538a == C3417t.this.f7531a) {
                C.P.l("CaptureNode", "request aborted, id=" + C3417t.this.f7531a.e());
                if (C3417t.this.f7536f != null) {
                    C3417t.this.f7536f.i();
                }
                C3417t.this.f7531a = null;
            }
        }
    }

    /* renamed from: E.t$c */
    static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        private DeferrableSurface f7541b;

        /* renamed from: a, reason: collision with root package name */
        private AbstractC3611h f7540a = new a();

        /* renamed from: c, reason: collision with root package name */
        private DeferrableSurface f7542c = null;

        /* renamed from: E.t$c$a */
        class a extends AbstractC3611h {
            a() {
            }
        }

        abstract C4434u<Y.b> b();

        abstract C.M c();

        abstract int d();

        abstract int e();

        abstract int f();

        abstract Size g();

        abstract C4434u<O> i();

        abstract Size j();

        abstract boolean l();

        static c m(Size size, int i10, int i11, boolean z10, C.M m10, Size size2, int i12) {
            return new C3400b(size, i10, i11, z10, m10, size2, i12, new C4434u(), new C4434u());
        }

        AbstractC3611h a() {
            return this.f7540a;
        }

        DeferrableSurface h() {
            return this.f7542c;
        }

        DeferrableSurface k() {
            DeferrableSurface deferrableSurface = this.f7541b;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        void n(AbstractC3611h abstractC3611h) {
            this.f7540a = abstractC3611h;
        }

        void o(Surface surface, Size size, int i10) {
            this.f7542c = new F.T(surface, size, i10);
        }

        void p(Surface surface) {
            o2.i.j(this.f7541b == null, "The surface is already set.");
            this.f7541b = new F.T(surface, j(), d());
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
        if (this.f7531a == null) {
            C.P.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            nVar.close();
        } else {
            N.a aVar = this.f7534d;
            Objects.requireNonNull(aVar);
            aVar.d().accept(N.b.c(this.f7531a, nVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N.a q(c cVar) {
        InterfaceC15993a<O> interfaceC15993a;
        D d10;
        o2.i.j(this.f7535e == null && this.f7532b == null, "CaptureNode does not support recreation yet.");
        this.f7535e = cVar;
        Size sizeJ = cVar.j();
        int iD = cVar.d();
        boolean zL = cVar.l();
        AbstractC3611h aVar = new a();
        if (zL || cVar.c() != null) {
            D d11 = new D(g(cVar.c(), sizeJ.getWidth(), sizeJ.getHeight(), iD));
            this.f7536f = d11;
            interfaceC15993a = new InterfaceC15993a() { // from class: E.m
                @Override // o2.InterfaceC15993a
                public final void accept(Object obj) {
                    C3417t.a(this.f7524a, (O) obj);
                }
            };
            d10 = d11;
        } else {
            androidx.camera.core.p pVar = new androidx.camera.core.p(sizeJ.getWidth(), sizeJ.getHeight(), iD, 4);
            aVar = C3612i.b(aVar, pVar.m());
            interfaceC15993a = new InterfaceC15993a() { // from class: E.l
                @Override // o2.InterfaceC15993a
                public final void accept(Object obj) {
                    this.f7523a.k((O) obj);
                }
            };
            d10 = pVar;
        }
        cVar.n(aVar);
        Surface surface = d10.getSurface();
        Objects.requireNonNull(surface);
        cVar.p(surface);
        this.f7532b = new androidx.camera.core.q(d10);
        d10.f(new S.a() { // from class: E.n
            @Override // F.S.a
            public final void a(F.S s10) {
                C3417t.d(this.f7525a, s10);
            }
        }, H.a.d());
        if (cVar.g() != null) {
            F.S sG = g(cVar.c(), cVar.g().getWidth(), cVar.g().getHeight(), cVar.f());
            sG.f(new S.a() { // from class: E.o
                @Override // F.S.a
                public final void a(F.S s10) {
                    C3417t.b(this.f7526a, s10);
                }
            }, H.a.d());
            this.f7533c = new androidx.camera.core.q(sG);
            cVar.o(sG.getSurface(), cVar.g(), cVar.f());
        }
        cVar.i().a(interfaceC15993a);
        cVar.b().a(new InterfaceC15993a() { // from class: E.p
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                this.f7527a.o((Y.b) obj);
            }
        });
        N.a aVarE = N.a.e(cVar.d(), cVar.e());
        this.f7534d = aVarE;
        return aVarE;
    }

    C3417t() {
    }

    public static /* synthetic */ void a(C3417t c3417t, O o10) {
        c3417t.k(o10);
        c3417t.f7536f.h(o10);
    }

    public static /* synthetic */ void b(C3417t c3417t, F.S s10) {
        c3417t.getClass();
        try {
            androidx.camera.core.n nVarB = s10.b();
            if (nVarB != null) {
                c3417t.l(nVarB);
            }
        } catch (IllegalStateException e10) {
            C.P.d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    public static /* synthetic */ void d(C3417t c3417t, F.S s10) {
        c3417t.getClass();
        try {
            androidx.camera.core.n nVarB = s10.b();
            if (nVarB != null) {
                c3417t.j(nVarB);
                return;
            }
            O o10 = c3417t.f7531a;
            if (o10 != null) {
                c3417t.o(Y.b.c(o10.e(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e10) {
            O o11 = c3417t.f7531a;
            if (o11 != null) {
                c3417t.o(Y.b.c(o11.e(), new ImageCaptureException(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    private void i(androidx.camera.core.n nVar) {
        G.o.a();
        N.a aVar = this.f7534d;
        Objects.requireNonNull(aVar);
        aVar.a().accept(N.b.c(this.f7531a, nVar));
        O o10 = this.f7531a;
        this.f7531a = null;
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
                    C3417t.e(qVar2);
                }
            }, H.a.d());
        }
    }

    public int h() {
        boolean z10;
        G.o.a();
        if (this.f7532b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "The ImageReader is not initialized.");
        return this.f7532b.i();
    }

    void j(androidx.camera.core.n nVar) {
        G.o.a();
        if (this.f7531a == null) {
            C.P.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + nVar);
            nVar.close();
            return;
        }
        if (((Integer) nVar.S2().a().d(this.f7531a.i())) == null) {
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
        this.f7531a = o10;
        I.n.j(o10.a(), new b(o10), H.a.a());
    }

    public void m() {
        G.o.a();
        c cVar = this.f7535e;
        Objects.requireNonNull(cVar);
        androidx.camera.core.q qVar = this.f7532b;
        Objects.requireNonNull(qVar);
        n(cVar, qVar, this.f7533c);
    }

    void o(Y.b bVar) {
        G.o.a();
        O o10 = this.f7531a;
        if (o10 != null && o10.e() == bVar.b()) {
            this.f7531a.l(bVar.a());
        }
    }

    public void p(e.a aVar) {
        boolean z10;
        G.o.a();
        if (this.f7532b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "The ImageReader is not initialized.");
        this.f7532b.k(aVar);
    }
}
