package Q3;

import L3.h;
import L3.l;
import L3.n;
import Q3.g;
import a3.t;
import a3.y;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13466a;
import d3.D;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import x3.B;
import x3.C18008m;
import x3.F;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.O;
import x3.r;
import x3.u;

/* loaded from: classes4.dex */
public final class f implements InterfaceC18011p {

    /* renamed from: v, reason: collision with root package name */
    public static final u f29710v = new u() { // from class: Q3.d
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return f.d();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private static final h.a f29711w = new h.a() { // from class: Q3.e
        @Override // L3.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.f(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f29712a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29713b;

    /* renamed from: c, reason: collision with root package name */
    private final D f29714c;

    /* renamed from: d, reason: collision with root package name */
    private final F.a f29715d;

    /* renamed from: e, reason: collision with root package name */
    private final B f29716e;

    /* renamed from: f, reason: collision with root package name */
    private final x3.D f29717f;

    /* renamed from: g, reason: collision with root package name */
    private final O f29718g;

    /* renamed from: h, reason: collision with root package name */
    private r f29719h;

    /* renamed from: i, reason: collision with root package name */
    private O f29720i;

    /* renamed from: j, reason: collision with root package name */
    private O f29721j;

    /* renamed from: k, reason: collision with root package name */
    private int f29722k;

    /* renamed from: l, reason: collision with root package name */
    private y f29723l;

    /* renamed from: m, reason: collision with root package name */
    private long f29724m;

    /* renamed from: n, reason: collision with root package name */
    private long f29725n;

    /* renamed from: o, reason: collision with root package name */
    private long f29726o;

    /* renamed from: p, reason: collision with root package name */
    private long f29727p;

    /* renamed from: q, reason: collision with root package name */
    private int f29728q;

    /* renamed from: r, reason: collision with root package name */
    private g f29729r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29730s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f29731t;

    /* renamed from: u, reason: collision with root package name */
    private long f29732u;

    public f() {
        this(0);
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f29722k = 0;
        this.f29724m = -9223372036854775807L;
        this.f29725n = 0L;
        this.f29728q = 0;
        this.f29732u = j11;
        g gVar = this.f29729r;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f29731t = true;
        this.f29721j = this.f29718g;
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        return x(interfaceC18012q, true);
    }

    public void l() {
        this.f29730s = true;
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new f()};
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
        C13466a.i(this.f29720i);
        P.h(this.f29719h);
    }

    private long k(long j10) {
        return this.f29724m + ((j10 * 1000000) / this.f29715d.f169073d);
    }

    private g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f29740c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - iVar.f29738a.f169072c;
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - iVar.f29738a.f169072c;
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j13, j10 + iVar.f29738a.f169072c, He.f.d(P.X0(j16, 8000000L, jA, roundingMode)), He.f.d(Fe.d.b(j16, iVar.f29739b, roundingMode)), false);
    }

    private g n(InterfaceC18012q interfaceC18012q, boolean z10) throws IOException {
        interfaceC18012q.m(this.f29714c.e(), 0, 4);
        this.f29714c.W(0);
        this.f29715d.a(this.f29714c.q());
        return new a(interfaceC18012q.getLength(), interfaceC18012q.getPosition(), this.f29715d, z10);
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
                if (nVar.f17854a.equals("TLEN")) {
                    return P.M0(Long.parseLong(nVar.f17868d.get(0)));
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

    private g s(InterfaceC18012q interfaceC18012q) throws IOException {
        int i10;
        int i11;
        D d10 = new D(this.f29715d.f169072c);
        interfaceC18012q.m(d10.e(), 0, this.f29715d.f169072c);
        F.a aVar = this.f29715d;
        int i12 = 21;
        if ((aVar.f169070a & 1) != 0) {
            if (aVar.f169074e != 1) {
                i12 = 36;
            }
        } else if (aVar.f169074e == 1) {
            i12 = 13;
        }
        int iP = p(d10, i12);
        if (iP != 1231971951) {
            if (iP == 1447187017) {
                h hVarA = h.a(interfaceC18012q.getLength(), interfaceC18012q.getPosition(), this.f29715d, d10);
                interfaceC18012q.k(this.f29715d.f169072c);
                return hVarA;
            }
            if (iP != 1483304551) {
                interfaceC18012q.d();
                return null;
            }
        }
        i iVarB = i.b(this.f29715d, d10);
        if (!this.f29716e.a() && (i10 = iVarB.f29741d) != -1 && (i11 = iVarB.f29742e) != -1) {
            B b10 = this.f29716e;
            b10.f169042a = i10;
            b10.f169043b = i11;
        }
        long position = interfaceC18012q.getPosition();
        if (interfaceC18012q.getLength() != -1 && iVarB.f29740c != -1 && interfaceC18012q.getLength() != iVarB.f29740c + position) {
            d3.r.g("Mp3Extractor", "Data size mismatch between stream (" + interfaceC18012q.getLength() + ") and Xing frame (" + (iVarB.f29740c + position) + "), using Xing value.");
        }
        interfaceC18012q.k(this.f29715d.f169072c);
        return iP == 1483304551 ? j.a(iVarB, position) : m(position, iVarB, interfaceC18012q.getLength());
    }

    private void t() {
        g gVar = this.f29729r;
        if ((gVar instanceof a) && gVar.g()) {
            long j10 = this.f29727p;
            if (j10 == -1 || j10 == this.f29729r.f()) {
                return;
            }
            this.f29729r = ((a) this.f29729r).e(this.f29727p);
            ((r) C13466a.e(this.f29719h)).g(this.f29729r);
            ((O) C13466a.e(this.f29720i)).f(this.f29729r.l());
        }
    }

    private boolean u(InterfaceC18012q interfaceC18012q) throws IOException {
        g gVar = this.f29729r;
        if (gVar != null) {
            long jF = gVar.f();
            if (jF != -1 && interfaceC18012q.g() > jF - 4) {
                return true;
            }
        }
        try {
            return !interfaceC18012q.b(this.f29714c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int v(InterfaceC18012q interfaceC18012q) throws Throwable {
        if (this.f29722k == 0) {
            try {
                x(interfaceC18012q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f29729r == null) {
            g gVarH = h(interfaceC18012q);
            this.f29729r = gVarH;
            this.f29719h.g(gVarH);
            t.b bVarN0 = new t.b().U("audio/mpeg").u0(this.f29715d.f169071b).k0(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).R(this.f29715d.f169074e).v0(this.f29715d.f169073d).Z(this.f29716e.f169042a).a0(this.f29716e.f169043b).n0((this.f29712a & 8) != 0 ? null : this.f29723l);
            if (this.f29729r.k() != -2147483647) {
                bVarN0.Q(this.f29729r.k());
            }
            this.f29721j.b(bVarN0.N());
            this.f29726o = interfaceC18012q.getPosition();
        } else if (this.f29726o != 0) {
            long position = interfaceC18012q.getPosition();
            long j10 = this.f29726o;
            if (position < j10) {
                interfaceC18012q.k((int) (j10 - position));
            }
        }
        return w(interfaceC18012q);
    }

    private int w(InterfaceC18012q interfaceC18012q) throws IOException {
        if (this.f29728q == 0) {
            interfaceC18012q.d();
            if (u(interfaceC18012q)) {
                return -1;
            }
            this.f29714c.W(0);
            int iQ = this.f29714c.q();
            if (!q(iQ, this.f29722k) || F.j(iQ) == -1) {
                interfaceC18012q.k(1);
                this.f29722k = 0;
                return 0;
            }
            this.f29715d.a(iQ);
            if (this.f29724m == -9223372036854775807L) {
                this.f29724m = this.f29729r.h(interfaceC18012q.getPosition());
                if (this.f29713b != -9223372036854775807L) {
                    this.f29724m += this.f29713b - this.f29729r.h(0L);
                }
            }
            this.f29728q = this.f29715d.f169072c;
            long position = interfaceC18012q.getPosition();
            F.a aVar = this.f29715d;
            this.f29727p = position + aVar.f169072c;
            g gVar = this.f29729r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(k(this.f29725n + aVar.f169076g), this.f29727p);
                if (this.f29731t && bVar.a(this.f29732u)) {
                    this.f29731t = false;
                    this.f29721j = this.f29720i;
                }
            }
        }
        int iG = this.f29721j.g(interfaceC18012q, this.f29728q, true);
        if (iG == -1) {
            return -1;
        }
        int i10 = this.f29728q - iG;
        this.f29728q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f29721j.c(k(this.f29725n), 1, this.f29715d.f169072c, 0, null);
        this.f29725n += this.f29715d.f169076g;
        this.f29728q = 0;
        return 0;
    }

    private boolean x(InterfaceC18012q interfaceC18012q, boolean z10) throws Throwable {
        int iG;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        interfaceC18012q.d();
        if (interfaceC18012q.getPosition() == 0) {
            y yVarA = this.f29717f.a(interfaceC18012q, (this.f29712a & 8) == 0 ? null : f29711w);
            this.f29723l = yVarA;
            if (yVarA != null) {
                this.f29716e.c(yVarA);
            }
            iG = (int) interfaceC18012q.g();
            if (!z10) {
                interfaceC18012q.k(iG);
            }
            i10 = 0;
        } else {
            iG = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!u(interfaceC18012q)) {
                this.f29714c.W(0);
                int iQ = this.f29714c.q();
                if ((i10 == 0 || q(iQ, i10)) && (iJ = F.j(iQ)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f29715d.a(iQ);
                        i10 = iQ;
                    }
                    interfaceC18012q.i(iJ - 4);
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
                        interfaceC18012q.d();
                        interfaceC18012q.i(iG + i14);
                    } else {
                        interfaceC18012q.k(1);
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
            interfaceC18012q.k(iG + i13);
        } else {
            interfaceC18012q.d();
        }
        this.f29722k = i10;
        return true;
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f29719h = rVar;
        O oT = rVar.t(0, 1);
        this.f29720i = oT;
        this.f29721j = oT;
        this.f29719h.p();
    }

    public f(int i10, long j10) {
        this.f29712a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f29713b = j10;
        this.f29714c = new D(10);
        this.f29715d = new F.a();
        this.f29716e = new B();
        this.f29724m = -9223372036854775807L;
        this.f29717f = new x3.D();
        C18008m c18008m = new C18008m();
        this.f29718g = c18008m;
        this.f29721j = c18008m;
        this.f29727p = -1L;
    }

    private g h(InterfaceC18012q interfaceC18012q) throws IOException {
        long jO;
        long jF;
        g gVarS = s(interfaceC18012q);
        c cVarR = r(this.f29723l, interfaceC18012q.getPosition());
        if (this.f29730s) {
            return new g.a();
        }
        if ((this.f29712a & 4) != 0) {
            if (cVarR != null) {
                jO = cVarR.l();
                jF = cVarR.f();
            } else if (gVarS != null) {
                jO = gVarS.l();
                jF = gVarS.f();
            } else {
                jO = o(this.f29723l);
                jF = -1;
            }
            gVarS = new b(jO, interfaceC18012q.getPosition(), jF);
        } else if (cVarR != null) {
            gVarS = cVarR;
        } else if (gVarS == null) {
            gVarS = null;
        }
        boolean z10 = true;
        if (gVarS == null || (!gVarS.g() && (this.f29712a & 1) != 0)) {
            if ((this.f29712a & 2) == 0) {
                z10 = false;
            }
            gVarS = n(interfaceC18012q, z10);
        }
        if (gVarS != null) {
            this.f29720i.f(gVarS.l());
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

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws Throwable {
        g();
        int iV = v(interfaceC18012q);
        if (iV == -1 && (this.f29729r instanceof b)) {
            long jK = k(this.f29725n);
            if (this.f29729r.l() != jK) {
                ((b) this.f29729r).c(jK);
                this.f29719h.g(this.f29729r);
                this.f29720i.f(this.f29729r.l());
            }
        }
        return iV;
    }
}
