package z3;

import Ce.y0;
import U3.r;
import U3.s;
import a3.t;
import a3.z;
import androidx.media3.common.ParserException;
import d3.C13466a;
import d3.D;
import java.io.IOException;
import java.util.ArrayList;
import x3.G;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.O;

/* loaded from: classes2.dex */
public final class b implements InterfaceC18011p {

    /* renamed from: a, reason: collision with root package name */
    private final D f171496a;

    /* renamed from: b, reason: collision with root package name */
    private final c f171497b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f171498c;

    /* renamed from: d, reason: collision with root package name */
    private final r.a f171499d;

    /* renamed from: e, reason: collision with root package name */
    private int f171500e;

    /* renamed from: f, reason: collision with root package name */
    private x3.r f171501f;

    /* renamed from: g, reason: collision with root package name */
    private z3.c f171502g;

    /* renamed from: h, reason: collision with root package name */
    private long f171503h;

    /* renamed from: i, reason: collision with root package name */
    private e[] f171504i;

    /* renamed from: j, reason: collision with root package name */
    private long f171505j;

    /* renamed from: k, reason: collision with root package name */
    private e f171506k;

    /* renamed from: l, reason: collision with root package name */
    private int f171507l;

    /* renamed from: m, reason: collision with root package name */
    private long f171508m;

    /* renamed from: n, reason: collision with root package name */
    private long f171509n;

    /* renamed from: o, reason: collision with root package name */
    private int f171510o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f171511p;

    /* renamed from: z3.b$b, reason: collision with other inner class name */
    private class C2761b implements J {

        /* renamed from: a, reason: collision with root package name */
        private final long f171512a;

        @Override // x3.J
        public boolean g() {
            return true;
        }

        public C2761b(long j10) {
            this.f171512a = j10;
        }

        @Override // x3.J
        public J.a d(long j10) {
            J.a aVarI = b.this.f171504i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f171504i.length; i10++) {
                J.a aVarI2 = b.this.f171504i[i10].i(j10);
                if (aVarI2.f169078a.f169084b < aVarI.f169078a.f169084b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // x3.J
        public long l() {
            return this.f171512a;
        }
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        this.f171500e = 0;
        if (this.f171498c) {
            rVar = new s(rVar, this.f171499d);
        }
        this.f171501f = rVar;
        this.f171505j = -1L;
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f171514a;

        /* renamed from: b, reason: collision with root package name */
        public int f171515b;

        /* renamed from: c, reason: collision with root package name */
        public int f171516c;

        private c() {
        }

        public void a(D d10) {
            this.f171514a = d10.u();
            this.f171515b = d10.u();
            this.f171516c = 0;
        }

        public void b(D d10) throws ParserException {
            a(d10);
            if (this.f171514a == 1414744396) {
                this.f171516c = d10.u();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.f171514a, null);
        }
    }

    private e g(int i10) {
        for (e eVar : this.f171504i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private e m(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            d3.r.i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            d3.r.i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        t tVar = gVar.f171544a;
        t.b bVarB = tVar.b();
        bVarB.e0(i10);
        int i11 = dVar.f171526f;
        if (i11 != 0) {
            bVarB.k0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.h0(hVar.f171545a);
        }
        int iK = z.k(tVar.f43949o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        O oT = this.f171501f.t(i10, iK);
        oT.b(bVarB.N());
        oT.f(jA);
        this.f171503h = Math.max(this.f171503h, jA);
        return new e(i10, dVar, oT);
    }

    private boolean o(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        boolean z10;
        if (this.f171505j != -1) {
            long position = interfaceC18012q.getPosition();
            long j10 = this.f171505j;
            if (j10 < position || j10 > 262144 + position) {
                i10.f169077a = j10;
                z10 = true;
            } else {
                interfaceC18012q.k((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f171505j = -1L;
        return z10;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f171505j = -1L;
        this.f171506k = null;
        for (e eVar : this.f171504i) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f171500e = 6;
        } else if (this.f171504i.length == 0) {
            this.f171500e = 0;
        } else {
            this.f171500e = 3;
        }
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.m(this.f171496a.e(), 0, 12);
        this.f171496a.W(0);
        if (this.f171496a.u() != 1179011410) {
            return false;
        }
        this.f171496a.X(4);
        return this.f171496a.u() == 541677121;
    }

    public b(int i10, r.a aVar) {
        this.f171499d = aVar;
        this.f171498c = (i10 & 1) == 0;
        this.f171496a = new D(12);
        this.f171497b = new c();
        this.f171501f = new G();
        this.f171504i = new e[0];
        this.f171508m = -1L;
        this.f171509n = -1L;
        this.f171507l = -1;
        this.f171503h = -9223372036854775807L;
    }

    private static void f(InterfaceC18012q interfaceC18012q) throws IOException {
        if ((interfaceC18012q.getPosition() & 1) == 1) {
            interfaceC18012q.k(1);
        }
    }

    private void h(D d10) throws IOException {
        f fVarC = f.c(1819436136, d10);
        if (fVarC.getType() == 1819436136) {
            z3.c cVar = (z3.c) fVarC.b(z3.c.class);
            if (cVar != null) {
                this.f171502g = cVar;
                this.f171503h = cVar.f171519c * cVar.f171517a;
                ArrayList arrayList = new ArrayList();
                y0<InterfaceC18378a> it = fVarC.f171542a.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    InterfaceC18378a next = it.next();
                    if (next.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        e eVarM = m((f) next, i10);
                        if (eVarM != null) {
                            arrayList.add(eVarM);
                        }
                        i10 = i11;
                    }
                }
                this.f171504i = (e[]) arrayList.toArray(new e[0]);
                this.f171501f.p();
                return;
            }
            throw ParserException.a("AviHeader not found", null);
        }
        throw ParserException.a("Unexpected header list type " + fVarC.getType(), null);
    }

    private void k(D d10) {
        int i10;
        long jL = l(d10);
        while (true) {
            boolean z10 = false;
            if (d10.a() < 16) {
                break;
            }
            int iU = d10.u();
            int iU2 = d10.u();
            long jU = d10.u() + jL;
            d10.X(4);
            e eVarG = g(iU);
            if (eVarG != null) {
                if ((iU2 & 16) == 16) {
                    z10 = true;
                }
                eVarG.b(jU, z10);
            }
        }
        for (e eVar : this.f171504i) {
            eVar.c();
        }
        this.f171511p = true;
        if (this.f171504i.length == 0) {
            this.f171501f.g(new J.b(this.f171503h));
        } else {
            this.f171501f.g(new C2761b(this.f171503h));
        }
    }

    private long l(D d10) {
        long j10 = 0;
        if (d10.a() < 16) {
            return 0L;
        }
        int iF = d10.f();
        d10.X(8);
        long jU = d10.u();
        long j11 = this.f171508m;
        if (jU <= j11) {
            j10 = j11 + 8;
        }
        d10.W(iF);
        return j10;
    }

    private int n(InterfaceC18012q interfaceC18012q) throws IOException {
        if (interfaceC18012q.getPosition() >= this.f171509n) {
            return -1;
        }
        e eVar = this.f171506k;
        if (eVar != null) {
            if (eVar.m(interfaceC18012q)) {
                this.f171506k = null;
            }
        } else {
            f(interfaceC18012q);
            int i10 = 12;
            interfaceC18012q.m(this.f171496a.e(), 0, 12);
            this.f171496a.W(0);
            int iU = this.f171496a.u();
            if (iU == 1414744396) {
                this.f171496a.W(8);
                if (this.f171496a.u() != 1769369453) {
                    i10 = 8;
                }
                interfaceC18012q.k(i10);
                interfaceC18012q.d();
                return 0;
            }
            int iU2 = this.f171496a.u();
            if (iU == 1263424842) {
                this.f171505j = interfaceC18012q.getPosition() + iU2 + 8;
                return 0;
            }
            interfaceC18012q.k(8);
            interfaceC18012q.d();
            e eVarG = g(iU);
            if (eVarG == null) {
                this.f171505j = interfaceC18012q.getPosition() + iU2;
                return 0;
            }
            eVarG.n(iU2);
            this.f171506k = eVarG;
        }
        return 0;
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        if (o(interfaceC18012q, i10)) {
            return 1;
        }
        switch (this.f171500e) {
            case 0:
                if (j(interfaceC18012q)) {
                    interfaceC18012q.k(12);
                    this.f171500e = 1;
                    return 0;
                }
                throw ParserException.a("AVI Header List not found", null);
            case 1:
                interfaceC18012q.readFully(this.f171496a.e(), 0, 12);
                this.f171496a.W(0);
                this.f171497b.b(this.f171496a);
                c cVar = this.f171497b;
                if (cVar.f171516c == 1819436136) {
                    this.f171507l = cVar.f171515b;
                    this.f171500e = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.f171497b.f171516c, null);
            case 2:
                int i11 = this.f171507l - 4;
                D d10 = new D(i11);
                interfaceC18012q.readFully(d10.e(), 0, i11);
                h(d10);
                this.f171500e = 3;
                return 0;
            case 3:
                if (this.f171508m != -1) {
                    long position = interfaceC18012q.getPosition();
                    long j10 = this.f171508m;
                    if (position != j10) {
                        this.f171505j = j10;
                        return 0;
                    }
                }
                interfaceC18012q.m(this.f171496a.e(), 0, 12);
                interfaceC18012q.d();
                this.f171496a.W(0);
                this.f171497b.a(this.f171496a);
                int iU = this.f171496a.u();
                int i12 = this.f171497b.f171514a;
                if (i12 == 1179011410) {
                    interfaceC18012q.k(12);
                    return 0;
                }
                if (i12 == 1414744396 && iU == 1769369453) {
                    long position2 = interfaceC18012q.getPosition();
                    this.f171508m = position2;
                    this.f171509n = position2 + this.f171497b.f171515b + 8;
                    if (!this.f171511p) {
                        if (((z3.c) C13466a.e(this.f171502g)).a()) {
                            this.f171500e = 4;
                            this.f171505j = this.f171509n;
                            return 0;
                        }
                        this.f171501f.g(new J.b(this.f171503h));
                        this.f171511p = true;
                    }
                    this.f171505j = interfaceC18012q.getPosition() + 12;
                    this.f171500e = 6;
                    return 0;
                }
                this.f171505j = interfaceC18012q.getPosition() + this.f171497b.f171515b + 8;
                return 0;
            case 4:
                interfaceC18012q.readFully(this.f171496a.e(), 0, 8);
                this.f171496a.W(0);
                int iU2 = this.f171496a.u();
                int iU3 = this.f171496a.u();
                if (iU2 == 829973609) {
                    this.f171500e = 5;
                    this.f171510o = iU3;
                } else {
                    this.f171505j = interfaceC18012q.getPosition() + iU3;
                }
                return 0;
            case 5:
                D d11 = new D(this.f171510o);
                interfaceC18012q.readFully(d11.e(), 0, this.f171510o);
                k(d11);
                this.f171500e = 6;
                this.f171505j = this.f171508m;
                return 0;
            case 6:
                return n(interfaceC18012q);
            default:
                throw new AssertionError();
        }
    }
}
