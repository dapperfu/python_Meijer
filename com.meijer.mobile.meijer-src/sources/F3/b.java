package F3;

import R3.n;
import U3.r;
import a3.t;
import a3.y;
import d3.C13599a;
import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.r;

/* loaded from: classes.dex */
final class b implements InterfaceC18077p {

    /* renamed from: b, reason: collision with root package name */
    private r f9004b;

    /* renamed from: c, reason: collision with root package name */
    private int f9005c;

    /* renamed from: d, reason: collision with root package name */
    private int f9006d;

    /* renamed from: e, reason: collision with root package name */
    private int f9007e;

    /* renamed from: g, reason: collision with root package name */
    private M3.a f9009g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC18078q f9010h;

    /* renamed from: i, reason: collision with root package name */
    private d f9011i;

    /* renamed from: j, reason: collision with root package name */
    private n f9012j;

    /* renamed from: a, reason: collision with root package name */
    private final D f9003a = new D(6);

    /* renamed from: f, reason: collision with root package name */
    private long f9008f = -1;

    private void d(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f9003a.S(2);
        interfaceC18078q.m(this.f9003a.e(), 0, 2);
        interfaceC18078q.i(this.f9003a.P() - 2);
    }

    private void f() {
        ((r) C13599a.e(this.f9004b)).p();
        this.f9004b.g(new J.b(-9223372036854775807L));
        this.f9005c = 6;
    }

    private static M3.a g(String str, long j10) throws IOException {
        c cVarA;
        if (j10 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j10);
    }

    private void h(M3.a aVar) {
        ((r) C13599a.e(this.f9004b)).t(1024, 4).b(new t.b().U("image/jpeg").n0(new y(aVar)).N());
    }

    private int k(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f9003a.S(2);
        interfaceC18078q.m(this.f9003a.e(), 0, 2);
        return this.f9003a.P();
    }

    private void l(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f9003a.S(2);
        interfaceC18078q.readFully(this.f9003a.e(), 0, 2);
        int iP = this.f9003a.P();
        this.f9006d = iP;
        if (iP == 65498) {
            if (this.f9008f != -1) {
                this.f9005c = 4;
                return;
            } else {
                f();
                return;
            }
        }
        if ((iP < 65488 || iP > 65497) && iP != 65281) {
            this.f9005c = 1;
        }
    }

    private void m(InterfaceC18078q interfaceC18078q) throws IOException {
        String strB;
        if (this.f9006d == 65505) {
            D d10 = new D(this.f9007e);
            interfaceC18078q.readFully(d10.e(), 0, this.f9007e);
            if (this.f9009g == null && "http://ns.adobe.com/xap/1.0/".equals(d10.B()) && (strB = d10.B()) != null) {
                M3.a aVarG = g(strB, interfaceC18078q.getLength());
                this.f9009g = aVarG;
                if (aVarG != null) {
                    this.f9008f = aVarG.f19645d;
                }
            }
        } else {
            interfaceC18078q.k(this.f9007e);
        }
        this.f9005c = 0;
    }

    private void n(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f9003a.S(2);
        interfaceC18078q.readFully(this.f9003a.e(), 0, 2);
        this.f9007e = this.f9003a.P() - 2;
        this.f9005c = 2;
    }

    private void o(InterfaceC18078q interfaceC18078q) throws IOException {
        if (!interfaceC18078q.b(this.f9003a.e(), 0, 1, true)) {
            f();
            return;
        }
        interfaceC18078q.d();
        if (this.f9012j == null) {
            this.f9012j = new n(r.a.f37064a, 8);
        }
        d dVar = new d(interfaceC18078q, this.f9008f);
        this.f9011i = dVar;
        if (!this.f9012j.j(dVar)) {
            f();
        } else {
            this.f9012j.c(new e(this.f9008f, (x3.r) C13599a.e(this.f9004b)));
            p();
        }
    }

    private void p() {
        h((M3.a) C13599a.e(this.f9009g));
        this.f9005c = 5;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f9005c = 0;
            this.f9012j = null;
        } else if (this.f9005c == 5) {
            ((n) C13599a.e(this.f9012j)).a(j10, j11);
        }
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        int i11 = this.f9005c;
        if (i11 == 0) {
            l(interfaceC18078q);
            return 0;
        }
        if (i11 == 1) {
            n(interfaceC18078q);
            return 0;
        }
        if (i11 == 2) {
            m(interfaceC18078q);
            return 0;
        }
        if (i11 == 4) {
            long position = interfaceC18078q.getPosition();
            long j10 = this.f9008f;
            if (position != j10) {
                i10.f170165a = j10;
                return 1;
            }
            o(interfaceC18078q);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f9011i == null || interfaceC18078q != this.f9010h) {
            this.f9010h = interfaceC18078q;
            this.f9011i = new d(interfaceC18078q, this.f9008f);
        }
        int iB = ((n) C13599a.e(this.f9012j)).b(this.f9011i, i10);
        if (iB == 1) {
            i10.f170165a += this.f9008f;
        }
        return iB;
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        this.f9004b = rVar;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
        n nVar = this.f9012j;
        if (nVar != null) {
            nVar.release();
        }
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        if (k(interfaceC18078q) != 65496) {
            return false;
        }
        int iK = k(interfaceC18078q);
        this.f9006d = iK;
        if (iK == 65504) {
            d(interfaceC18078q);
            this.f9006d = k(interfaceC18078q);
        }
        if (this.f9006d != 65505) {
            return false;
        }
        interfaceC18078q.i(2);
        this.f9003a.S(6);
        interfaceC18078q.m(this.f9003a.e(), 0, 6);
        if (this.f9003a.J() != 1165519206 || this.f9003a.P() != 0) {
            return false;
        }
        return true;
    }
}
