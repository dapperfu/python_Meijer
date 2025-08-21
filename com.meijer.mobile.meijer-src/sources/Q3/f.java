package Q3;

import L3.h;
import L3.l;
import L3.n;
import Q3.g;
import a3.t;
import a3.y;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13599a;
import d3.D;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import x3.B;
import x3.C18074m;
import x3.F;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.O;
import x3.r;
import x3.u;

/* loaded from: classes4.dex */
public final class f implements InterfaceC18077p {

    /* renamed from: v, reason: collision with root package name */
    public static final u f27723v = new u() { // from class: Q3.d
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return f.d();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private static final h.a f27724w = new h.a() { // from class: Q3.e
        @Override // L3.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.f(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f27725a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27726b;

    /* renamed from: c, reason: collision with root package name */
    private final D f27727c;

    /* renamed from: d, reason: collision with root package name */
    private final F.a f27728d;

    /* renamed from: e, reason: collision with root package name */
    private final B f27729e;

    /* renamed from: f, reason: collision with root package name */
    private final x3.D f27730f;

    /* renamed from: g, reason: collision with root package name */
    private final O f27731g;

    /* renamed from: h, reason: collision with root package name */
    private r f27732h;

    /* renamed from: i, reason: collision with root package name */
    private O f27733i;

    /* renamed from: j, reason: collision with root package name */
    private O f27734j;

    /* renamed from: k, reason: collision with root package name */
    private int f27735k;

    /* renamed from: l, reason: collision with root package name */
    private y f27736l;

    /* renamed from: m, reason: collision with root package name */
    private long f27737m;

    /* renamed from: n, reason: collision with root package name */
    private long f27738n;

    /* renamed from: o, reason: collision with root package name */
    private long f27739o;

    /* renamed from: p, reason: collision with root package name */
    private long f27740p;

    /* renamed from: q, reason: collision with root package name */
    private int f27741q;

    /* renamed from: r, reason: collision with root package name */
    private g f27742r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27743s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27744t;

    /* renamed from: u, reason: collision with root package name */
    private long f27745u;

    public f() {
        this(0);
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f27735k = 0;
        this.f27737m = -9223372036854775807L;
        this.f27738n = 0L;
        this.f27741q = 0;
        this.f27745u = j11;
        g gVar = this.f27742r;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f27744t = true;
        this.f27734j = this.f27731g;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        return x(interfaceC18078q, true);
    }

    public void l() {
        this.f27743s = true;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new f()};
    }

    public static /* synthetic */ boolean f(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void g() {
        C13599a.i(this.f27733i);
        P.h(this.f27732h);
    }

    private long k(long j10) {
        return this.f27737m + ((j10 * 1000000) / this.f27728d.f170161d);
    }

    private g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f27753c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - iVar.f27751a.f170160c;
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - iVar.f27751a.f170160c;
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j13, j10 + iVar.f27751a.f170160c, Je.f.d(P.X0(j16, 8000000L, jA, roundingMode)), Je.f.d(He.d.b(j16, iVar.f27752b, roundingMode)), false);
    }

    private g n(InterfaceC18078q interfaceC18078q, boolean z10) throws IOException {
        interfaceC18078q.m(this.f27727c.e(), 0, 4);
        this.f27727c.W(0);
        this.f27728d.a(this.f27727c.q());
        return new a(interfaceC18078q.getLength(), interfaceC18078q.getPosition(), this.f27728d, z10);
    }

    private static long o(y yVar) {
        if (yVar == null) {
            return -9223372036854775807L;
        }
        int iE = yVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            y.a aVarD = yVar.d(i10);
            if (aVarD instanceof n) {
                n nVar = (n) aVarD;
                if (nVar.f18001a.equals("TLEN")) {
                    return P.M0(Long.parseLong(nVar.f18015d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static c r(y yVar, long j10) {
        if (yVar == null) {
            return null;
        }
        int iE = yVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            y.a aVarD = yVar.d(i10);
            if (aVarD instanceof l) {
                return c.a(j10, (l) aVarD, o(yVar));
            }
        }
        return null;
    }

    private g s(InterfaceC18078q interfaceC18078q) throws IOException {
        int i10;
        int i11;
        D d10 = new D(this.f27728d.f170160c);
        interfaceC18078q.m(d10.e(), 0, this.f27728d.f170160c);
        F.a aVar = this.f27728d;
        int i12 = 21;
        if ((aVar.f170158a & 1) != 0) {
            if (aVar.f170162e != 1) {
                i12 = 36;
            }
        } else if (aVar.f170162e == 1) {
            i12 = 13;
        }
        int iP = p(d10, i12);
        if (iP != 1231971951) {
            if (iP == 1447187017) {
                h hVarA = h.a(interfaceC18078q.getLength(), interfaceC18078q.getPosition(), this.f27728d, d10);
                interfaceC18078q.k(this.f27728d.f170160c);
                return hVarA;
            }
            if (iP != 1483304551) {
                interfaceC18078q.d();
                return null;
            }
        }
        i iVarB = i.b(this.f27728d, d10);
        if (!this.f27729e.a() && (i10 = iVarB.f27754d) != -1 && (i11 = iVarB.f27755e) != -1) {
            B b10 = this.f27729e;
            b10.f170130a = i10;
            b10.f170131b = i11;
        }
        long position = interfaceC18078q.getPosition();
        if (interfaceC18078q.getLength() != -1 && iVarB.f27753c != -1 && interfaceC18078q.getLength() != iVarB.f27753c + position) {
            d3.r.g("Mp3Extractor", "Data size mismatch between stream (" + interfaceC18078q.getLength() + ") and Xing frame (" + (iVarB.f27753c + position) + "), using Xing value.");
        }
        interfaceC18078q.k(this.f27728d.f170160c);
        return iP == 1483304551 ? j.a(iVarB, position) : m(position, iVarB, interfaceC18078q.getLength());
    }

    private void t() {
        g gVar = this.f27742r;
        if ((gVar instanceof a) && gVar.g()) {
            long j10 = this.f27740p;
            if (j10 == -1 || j10 == this.f27742r.f()) {
                return;
            }
            this.f27742r = ((a) this.f27742r).e(this.f27740p);
            ((r) C13599a.e(this.f27732h)).g(this.f27742r);
            ((O) C13599a.e(this.f27733i)).f(this.f27742r.l());
        }
    }

    private boolean u(InterfaceC18078q interfaceC18078q) throws IOException {
        g gVar = this.f27742r;
        if (gVar != null) {
            long jF = gVar.f();
            if (jF != -1 && interfaceC18078q.g() > jF - 4) {
                return true;
            }
        }
        try {
            return !interfaceC18078q.b(this.f27727c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int v(InterfaceC18078q interfaceC18078q) throws Throwable {
        if (this.f27735k == 0) {
            try {
                x(interfaceC18078q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f27742r == null) {
            g gVarH = h(interfaceC18078q);
            this.f27742r = gVarH;
            this.f27732h.g(gVarH);
            t.b bVarN0 = new t.b().U("audio/mpeg").u0(this.f27728d.f170159b).k0(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).R(this.f27728d.f170162e).v0(this.f27728d.f170161d).Z(this.f27729e.f170130a).a0(this.f27729e.f170131b).n0((this.f27725a & 8) != 0 ? null : this.f27736l);
            if (this.f27742r.k() != -2147483647) {
                bVarN0.Q(this.f27742r.k());
            }
            this.f27734j.b(bVarN0.N());
            this.f27739o = interfaceC18078q.getPosition();
        } else if (this.f27739o != 0) {
            long position = interfaceC18078q.getPosition();
            long j10 = this.f27739o;
            if (position < j10) {
                interfaceC18078q.k((int) (j10 - position));
            }
        }
        return w(interfaceC18078q);
    }

    private int w(InterfaceC18078q interfaceC18078q) throws IOException {
        if (this.f27741q == 0) {
            interfaceC18078q.d();
            if (u(interfaceC18078q)) {
                return -1;
            }
            this.f27727c.W(0);
            int iQ = this.f27727c.q();
            if (!q(iQ, this.f27735k) || F.j(iQ) == -1) {
                interfaceC18078q.k(1);
                this.f27735k = 0;
                return 0;
            }
            this.f27728d.a(iQ);
            if (this.f27737m == -9223372036854775807L) {
                this.f27737m = this.f27742r.h(interfaceC18078q.getPosition());
                if (this.f27726b != -9223372036854775807L) {
                    this.f27737m += this.f27726b - this.f27742r.h(0L);
                }
            }
            this.f27741q = this.f27728d.f170160c;
            long position = interfaceC18078q.getPosition();
            F.a aVar = this.f27728d;
            this.f27740p = position + aVar.f170160c;
            g gVar = this.f27742r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(k(this.f27738n + aVar.f170164g), this.f27740p);
                if (this.f27744t && bVar.a(this.f27745u)) {
                    this.f27744t = false;
                    this.f27734j = this.f27733i;
                }
            }
        }
        int iG = this.f27734j.g(interfaceC18078q, this.f27741q, true);
        if (iG == -1) {
            return -1;
        }
        int i10 = this.f27741q - iG;
        this.f27741q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f27734j.c(k(this.f27738n), 1, this.f27728d.f170160c, 0, null);
        this.f27738n += this.f27728d.f170164g;
        this.f27741q = 0;
        return 0;
    }

    private boolean x(InterfaceC18078q interfaceC18078q, boolean z10) throws Throwable {
        int iG;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        interfaceC18078q.d();
        if (interfaceC18078q.getPosition() == 0) {
            y yVarA = this.f27730f.a(interfaceC18078q, (this.f27725a & 8) == 0 ? null : f27724w);
            this.f27736l = yVarA;
            if (yVarA != null) {
                this.f27729e.c(yVarA);
            }
            iG = (int) interfaceC18078q.g();
            if (!z10) {
                interfaceC18078q.k(iG);
            }
            i10 = 0;
        } else {
            iG = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!u(interfaceC18078q)) {
                this.f27727c.W(0);
                int iQ = this.f27727c.q();
                if ((i10 == 0 || q(iQ, i10)) && (iJ = F.j(iQ)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f27728d.a(iQ);
                        i10 = iQ;
                    }
                    interfaceC18078q.i(iJ - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        t();
                        throw new EOFException();
                    }
                    if (z10) {
                        interfaceC18078q.d();
                        interfaceC18078q.i(iG + i14);
                    } else {
                        interfaceC18078q.k(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                t();
                throw new EOFException();
            }
        }
        if (z10) {
            interfaceC18078q.k(iG + i13);
        } else {
            interfaceC18078q.d();
        }
        this.f27735k = i10;
        return true;
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f27732h = rVar;
        O oT = rVar.t(0, 1);
        this.f27733i = oT;
        this.f27734j = oT;
        this.f27732h.p();
    }

    public f(int i10, long j10) {
        this.f27725a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f27726b = j10;
        this.f27727c = new D(10);
        this.f27728d = new F.a();
        this.f27729e = new B();
        this.f27737m = -9223372036854775807L;
        this.f27730f = new x3.D();
        C18074m c18074m = new C18074m();
        this.f27731g = c18074m;
        this.f27734j = c18074m;
        this.f27740p = -1L;
    }

    private g h(InterfaceC18078q interfaceC18078q) throws IOException {
        long jO;
        long jF;
        g gVarS = s(interfaceC18078q);
        c cVarR = r(this.f27736l, interfaceC18078q.getPosition());
        if (this.f27743s) {
            return new g.a();
        }
        if ((this.f27725a & 4) != 0) {
            if (cVarR != null) {
                jO = cVarR.l();
                jF = cVarR.f();
            } else if (gVarS != null) {
                jO = gVarS.l();
                jF = gVarS.f();
            } else {
                jO = o(this.f27736l);
                jF = -1;
            }
            gVarS = new b(jO, interfaceC18078q.getPosition(), jF);
        } else if (cVarR != null) {
            gVarS = cVarR;
        } else if (gVarS == null) {
            gVarS = null;
        }
        boolean z10 = true;
        if (gVarS == null || (!gVarS.g() && (this.f27725a & 1) != 0)) {
            if ((this.f27725a & 2) == 0) {
                z10 = false;
            }
            gVarS = n(interfaceC18078q, z10);
        }
        if (gVarS != null) {
            this.f27733i.f(gVarS.l());
        }
        return gVarS;
    }

    private static int p(D d10, int i10) {
        if (d10.g() >= i10 + 4) {
            d10.W(i10);
            int iQ = d10.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (d10.g() >= 40) {
            d10.W(36);
            if (d10.q() == 1447187017) {
                return 1447187017;
            }
            return 0;
        }
        return 0;
    }

    private static boolean q(int i10, long j10) {
        if ((i10 & (-128000)) == (j10 & (-128000))) {
            return true;
        }
        return false;
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws Throwable {
        g();
        int iV = v(interfaceC18078q);
        if (iV == -1 && (this.f27742r instanceof b)) {
            long jK = k(this.f27738n);
            if (this.f27742r.l() != jK) {
                ((b) this.f27742r).c(jK);
                this.f27732h.g(this.f27742r);
                this.f27733i.f(this.f27742r.l());
            }
        }
        return iV;
    }
}
