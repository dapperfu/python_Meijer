package z3;

import Ee.y0;
import U3.r;
import U3.s;
import a3.t;
import a3.z;
import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.D;
import java.io.IOException;
import java.util.ArrayList;
import x3.G;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.O;

/* loaded from: classes2.dex */
public final class b implements InterfaceC18077p {

    /* renamed from: a, reason: collision with root package name */
    private final D f172292a;

    /* renamed from: b, reason: collision with root package name */
    private final c f172293b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f172294c;

    /* renamed from: d, reason: collision with root package name */
    private final r.a f172295d;

    /* renamed from: e, reason: collision with root package name */
    private int f172296e;

    /* renamed from: f, reason: collision with root package name */
    private x3.r f172297f;

    /* renamed from: g, reason: collision with root package name */
    private z3.c f172298g;

    /* renamed from: h, reason: collision with root package name */
    private long f172299h;

    /* renamed from: i, reason: collision with root package name */
    private e[] f172300i;

    /* renamed from: j, reason: collision with root package name */
    private long f172301j;

    /* renamed from: k, reason: collision with root package name */
    private e f172302k;

    /* renamed from: l, reason: collision with root package name */
    private int f172303l;

    /* renamed from: m, reason: collision with root package name */
    private long f172304m;

    /* renamed from: n, reason: collision with root package name */
    private long f172305n;

    /* renamed from: o, reason: collision with root package name */
    private int f172306o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f172307p;

    /* renamed from: z3.b$b, reason: collision with other inner class name */
    private class C2778b implements J {

        /* renamed from: a, reason: collision with root package name */
        private final long f172308a;

        @Override // x3.J
        public boolean g() {
            return true;
        }

        public C2778b(long j10) {
            this.f172308a = j10;
        }

        @Override // x3.J
        public J.a d(long j10) {
            J.a aVarI = b.this.f172300i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f172300i.length; i10++) {
                J.a aVarI2 = b.this.f172300i[i10].i(j10);
                if (aVarI2.f170166a.f170172b < aVarI.f170166a.f170172b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // x3.J
        public long l() {
            return this.f172308a;
        }
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        this.f172296e = 0;
        if (this.f172294c) {
            rVar = new s(rVar, this.f172295d);
        }
        this.f172297f = rVar;
        this.f172301j = -1L;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f172310a;

        /* renamed from: b, reason: collision with root package name */
        public int f172311b;

        /* renamed from: c, reason: collision with root package name */
        public int f172312c;

        private c() {
        }

        public void a(D d10) {
            this.f172310a = d10.u();
            this.f172311b = d10.u();
            this.f172312c = 0;
        }

        public void b(D d10) throws ParserException {
            a(d10);
            if (this.f172310a == 1414744396) {
                this.f172312c = d10.u();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.f172310a, null);
        }
    }

    private e g(int i10) {
        for (e eVar : this.f172300i) {
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
        t tVar = gVar.f172340a;
        t.b bVarB = tVar.b();
        bVarB.e0(i10);
        int i11 = dVar.f172322f;
        if (i11 != 0) {
            bVarB.k0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.h0(hVar.f172341a);
        }
        int iK = z.k(tVar.f44767o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        O oT = this.f172297f.t(i10, iK);
        oT.b(bVarB.N());
        oT.f(jA);
        this.f172299h = Math.max(this.f172299h, jA);
        return new e(i10, dVar, oT);
    }

    private boolean o(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        boolean z10;
        if (this.f172301j != -1) {
            long position = interfaceC18078q.getPosition();
            long j10 = this.f172301j;
            if (j10 < position || j10 > 262144 + position) {
                i10.f170165a = j10;
                z10 = true;
            } else {
                interfaceC18078q.k((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f172301j = -1L;
        return z10;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f172301j = -1L;
        this.f172302k = null;
        for (e eVar : this.f172300i) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f172296e = 6;
        } else if (this.f172300i.length == 0) {
            this.f172296e = 0;
        } else {
            this.f172296e = 3;
        }
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.m(this.f172292a.e(), 0, 12);
        this.f172292a.W(0);
        if (this.f172292a.u() != 1179011410) {
            return false;
        }
        this.f172292a.X(4);
        return this.f172292a.u() == 541677121;
    }

    public b(int i10, r.a aVar) {
        this.f172295d = aVar;
        this.f172294c = (i10 & 1) == 0;
        this.f172292a = new D(12);
        this.f172293b = new c();
        this.f172297f = new G();
        this.f172300i = new e[0];
        this.f172304m = -1L;
        this.f172305n = -1L;
        this.f172303l = -1;
        this.f172299h = -9223372036854775807L;
    }

    private static void f(InterfaceC18078q interfaceC18078q) throws IOException {
        if ((interfaceC18078q.getPosition() & 1) == 1) {
            interfaceC18078q.k(1);
        }
    }

    private void h(D d10) throws IOException {
        f fVarC = f.c(1819436136, d10);
        if (fVarC.getType() == 1819436136) {
            z3.c cVar = (z3.c) fVarC.b(z3.c.class);
            if (cVar != null) {
                this.f172298g = cVar;
                this.f172299h = cVar.f172315c * cVar.f172313a;
                ArrayList arrayList = new ArrayList();
                y0<InterfaceC18441a> it = fVarC.f172338a.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    InterfaceC18441a next = it.next();
                    if (next.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        e eVarM = m((f) next, i10);
                        if (eVarM != null) {
                            arrayList.add(eVarM);
                        }
                        i10 = i11;
                    }
                }
                this.f172300i = (e[]) arrayList.toArray(new e[0]);
                this.f172297f.p();
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
        for (e eVar : this.f172300i) {
            eVar.c();
        }
        this.f172307p = true;
        if (this.f172300i.length == 0) {
            this.f172297f.g(new J.b(this.f172299h));
        } else {
            this.f172297f.g(new C2778b(this.f172299h));
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
        long j11 = this.f172304m;
        if (jU <= j11) {
            j10 = j11 + 8;
        }
        d10.W(iF);
        return j10;
    }

    private int n(InterfaceC18078q interfaceC18078q) throws IOException {
        if (interfaceC18078q.getPosition() >= this.f172305n) {
            return -1;
        }
        e eVar = this.f172302k;
        if (eVar != null) {
            if (eVar.m(interfaceC18078q)) {
                this.f172302k = null;
            }
        } else {
            f(interfaceC18078q);
            int i10 = 12;
            interfaceC18078q.m(this.f172292a.e(), 0, 12);
            this.f172292a.W(0);
            int iU = this.f172292a.u();
            if (iU == 1414744396) {
                this.f172292a.W(8);
                if (this.f172292a.u() != 1769369453) {
                    i10 = 8;
                }
                interfaceC18078q.k(i10);
                interfaceC18078q.d();
                return 0;
            }
            int iU2 = this.f172292a.u();
            if (iU == 1263424842) {
                this.f172301j = interfaceC18078q.getPosition() + iU2 + 8;
                return 0;
            }
            interfaceC18078q.k(8);
            interfaceC18078q.d();
            e eVarG = g(iU);
            if (eVarG == null) {
                this.f172301j = interfaceC18078q.getPosition() + iU2;
                return 0;
            }
            eVarG.n(iU2);
            this.f172302k = eVarG;
        }
        return 0;
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        if (o(interfaceC18078q, i10)) {
            return 1;
        }
        switch (this.f172296e) {
            case 0:
                if (j(interfaceC18078q)) {
                    interfaceC18078q.k(12);
                    this.f172296e = 1;
                    return 0;
                }
                throw ParserException.a("AVI Header List not found", null);
            case 1:
                interfaceC18078q.readFully(this.f172292a.e(), 0, 12);
                this.f172292a.W(0);
                this.f172293b.b(this.f172292a);
                c cVar = this.f172293b;
                if (cVar.f172312c == 1819436136) {
                    this.f172303l = cVar.f172311b;
                    this.f172296e = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.f172293b.f172312c, null);
            case 2:
                int i11 = this.f172303l - 4;
                D d10 = new D(i11);
                interfaceC18078q.readFully(d10.e(), 0, i11);
                h(d10);
                this.f172296e = 3;
                return 0;
            case 3:
                if (this.f172304m != -1) {
                    long position = interfaceC18078q.getPosition();
                    long j10 = this.f172304m;
                    if (position != j10) {
                        this.f172301j = j10;
                        return 0;
                    }
                }
                interfaceC18078q.m(this.f172292a.e(), 0, 12);
                interfaceC18078q.d();
                this.f172292a.W(0);
                this.f172293b.a(this.f172292a);
                int iU = this.f172292a.u();
                int i12 = this.f172293b.f172310a;
                if (i12 == 1179011410) {
                    interfaceC18078q.k(12);
                    return 0;
                }
                if (i12 == 1414744396 && iU == 1769369453) {
                    long position2 = interfaceC18078q.getPosition();
                    this.f172304m = position2;
                    this.f172305n = position2 + this.f172293b.f172311b + 8;
                    if (!this.f172307p) {
                        if (((z3.c) C13599a.e(this.f172298g)).a()) {
                            this.f172296e = 4;
                            this.f172301j = this.f172305n;
                            return 0;
                        }
                        this.f172297f.g(new J.b(this.f172299h));
                        this.f172307p = true;
                    }
                    this.f172301j = interfaceC18078q.getPosition() + 12;
                    this.f172296e = 6;
                    return 0;
                }
                this.f172301j = interfaceC18078q.getPosition() + this.f172293b.f172311b + 8;
                return 0;
            case 4:
                interfaceC18078q.readFully(this.f172292a.e(), 0, 8);
                this.f172292a.W(0);
                int iU2 = this.f172292a.u();
                int iU3 = this.f172292a.u();
                if (iU2 == 829973609) {
                    this.f172296e = 5;
                    this.f172306o = iU3;
                } else {
                    this.f172301j = interfaceC18078q.getPosition() + iU3;
                }
                return 0;
            case 5:
                D d11 = new D(this.f172306o);
                interfaceC18078q.readFully(d11.e(), 0, this.f172306o);
                k(d11);
                this.f172296e = 6;
                this.f172301j = this.f172304m;
                return 0;
            case 6:
                return n(interfaceC18078q);
            default:
                throw new AssertionError();
        }
    }
}
