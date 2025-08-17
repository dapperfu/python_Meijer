package F3;

import R3.n;
import U3.r;
import a3.t;
import a3.y;
import d3.C13466a;
import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.r;

/* loaded from: classes.dex */
final class b implements InterfaceC18011p {

    /* renamed from: b, reason: collision with root package name */
    private r f10237b;

    /* renamed from: c, reason: collision with root package name */
    private int f10238c;

    /* renamed from: d, reason: collision with root package name */
    private int f10239d;

    /* renamed from: e, reason: collision with root package name */
    private int f10240e;

    /* renamed from: g, reason: collision with root package name */
    private M3.a f10242g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC18012q f10243h;

    /* renamed from: i, reason: collision with root package name */
    private d f10244i;

    /* renamed from: j, reason: collision with root package name */
    private n f10245j;

    /* renamed from: a, reason: collision with root package name */
    private final D f10236a = new D(6);

    /* renamed from: f, reason: collision with root package name */
    private long f10241f = -1;

    private void d(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f10236a.S(2);
        interfaceC18012q.m(this.f10236a.e(), 0, 2);
        interfaceC18012q.i(this.f10236a.P() - 2);
    }

    private void f() {
        ((r) C13466a.e(this.f10237b)).p();
        this.f10237b.g(new J.b(-9223372036854775807L));
        this.f10238c = 6;
    }

    private static M3.a g(String str, long j10) throws IOException {
        c cVarA;
        if (j10 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j10);
    }

    private void h(M3.a aVar) {
        ((r) C13466a.e(this.f10237b)).t(1024, 4).b(new t.b().U("image/jpeg").n0(new y(aVar)).N());
    }

    private int k(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f10236a.S(2);
        interfaceC18012q.m(this.f10236a.e(), 0, 2);
        return this.f10236a.P();
    }

    private void l(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f10236a.S(2);
        interfaceC18012q.readFully(this.f10236a.e(), 0, 2);
        int iP = this.f10236a.P();
        this.f10239d = iP;
        if (iP == 65498) {
            if (this.f10241f != -1) {
                this.f10238c = 4;
                return;
            } else {
                f();
                return;
            }
        }
        if ((iP < 65488 || iP > 65497) && iP != 65281) {
            this.f10238c = 1;
        }
    }

    private void m(InterfaceC18012q interfaceC18012q) throws IOException {
        String strB;
        if (this.f10239d == 65505) {
            D d10 = new D(this.f10240e);
            interfaceC18012q.readFully(d10.e(), 0, this.f10240e);
            if (this.f10242g == null && "http://ns.adobe.com/xap/1.0/".equals(d10.B()) && (strB = d10.B()) != null) {
                M3.a aVarG = g(strB, interfaceC18012q.getLength());
                this.f10242g = aVarG;
                if (aVarG != null) {
                    this.f10241f = aVarG.f18904d;
                }
            }
        } else {
            interfaceC18012q.k(this.f10240e);
        }
        this.f10238c = 0;
    }

    private void n(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f10236a.S(2);
        interfaceC18012q.readFully(this.f10236a.e(), 0, 2);
        this.f10240e = this.f10236a.P() - 2;
        this.f10238c = 2;
    }

    private void o(InterfaceC18012q interfaceC18012q) throws IOException {
        if (!interfaceC18012q.b(this.f10236a.e(), 0, 1, true)) {
            f();
            return;
        }
        interfaceC18012q.d();
        if (this.f10245j == null) {
            this.f10245j = new n(r.a.f35728a, 8);
        }
        d dVar = new d(interfaceC18012q, this.f10241f);
        this.f10244i = dVar;
        if (!this.f10245j.j(dVar)) {
            f();
        } else {
            this.f10245j.c(new e(this.f10241f, (x3.r) C13466a.e(this.f10237b)));
            p();
        }
    }

    private void p() {
        h((M3.a) C13466a.e(this.f10242g));
        this.f10238c = 5;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f10238c = 0;
            this.f10245j = null;
        } else if (this.f10238c == 5) {
            ((n) C13466a.e(this.f10245j)).a(j10, j11);
        }
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        int i11 = this.f10238c;
        if (i11 == 0) {
            l(interfaceC18012q);
            return 0;
        }
        if (i11 == 1) {
            n(interfaceC18012q);
            return 0;
        }
        if (i11 == 2) {
            m(interfaceC18012q);
            return 0;
        }
        if (i11 == 4) {
            long position = interfaceC18012q.getPosition();
            long j10 = this.f10241f;
            if (position != j10) {
                i10.f169077a = j10;
                return 1;
            }
            o(interfaceC18012q);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f10244i == null || interfaceC18012q != this.f10243h) {
            this.f10243h = interfaceC18012q;
            this.f10244i = new d(interfaceC18012q, this.f10241f);
        }
        int iB = ((n) C13466a.e(this.f10245j)).b(this.f10244i, i10);
        if (iB == 1) {
            i10.f169077a += this.f10241f;
        }
        return iB;
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        this.f10237b = rVar;
    }

    @Override // x3.InterfaceC18011p
    public void release() {
        n nVar = this.f10245j;
        if (nVar != null) {
            nVar.release();
        }
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        if (k(interfaceC18012q) != 65496) {
            return false;
        }
        int iK = k(interfaceC18012q);
        this.f10239d = iK;
        if (iK == 65504) {
            d(interfaceC18012q);
            this.f10239d = k(interfaceC18012q);
        }
        if (this.f10239d != 65505) {
            return false;
        }
        interfaceC18012q.i(2);
        this.f10236a.S(6);
        interfaceC18012q.m(this.f10236a.e(), 0, 6);
        if (this.f10236a.J() != 1165519206 || this.f10236a.P() != 0) {
            return false;
        }
        return true;
    }
}
