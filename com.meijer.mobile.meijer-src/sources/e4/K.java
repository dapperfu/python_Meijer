package e4;

import U3.r;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.P;
import e4.L;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;

/* loaded from: classes4.dex */
public final class K implements InterfaceC18077p {

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final x3.u f129573v = new x3.u() { // from class: e4.J
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return K.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f129574a;

    /* renamed from: b, reason: collision with root package name */
    private final int f129575b;

    /* renamed from: c, reason: collision with root package name */
    private final int f129576c;

    /* renamed from: d, reason: collision with root package name */
    private final List<d3.J> f129577d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.D f129578e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseIntArray f129579f;

    /* renamed from: g, reason: collision with root package name */
    private final L.c f129580g;

    /* renamed from: h, reason: collision with root package name */
    private final r.a f129581h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<L> f129582i;

    /* renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f129583j;

    /* renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f129584k;

    /* renamed from: l, reason: collision with root package name */
    private final I f129585l;

    /* renamed from: m, reason: collision with root package name */
    private H f129586m;

    /* renamed from: n, reason: collision with root package name */
    private x3.r f129587n;

    /* renamed from: o, reason: collision with root package name */
    private int f129588o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f129589p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f129590q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f129591r;

    /* renamed from: s, reason: collision with root package name */
    private L f129592s;

    /* renamed from: t, reason: collision with root package name */
    private int f129593t;

    /* renamed from: u, reason: collision with root package name */
    private int f129594u;

    private class a implements D {

        /* renamed from: a, reason: collision with root package name */
        private final d3.C f129595a = new d3.C(new byte[4]);

        @Override // e4.D
        public void b(d3.J j10, x3.r rVar, L.d dVar) {
        }

        public a() {
        }

        @Override // e4.D
        public void a(d3.D d10) {
            if (d10.H() == 0 && (d10.H() & 128) != 0) {
                d10.X(6);
                int iA = d10.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    d10.k(this.f129595a, 4);
                    int iH = this.f129595a.h(16);
                    this.f129595a.r(3);
                    if (iH == 0) {
                        this.f129595a.r(13);
                    } else {
                        int iH2 = this.f129595a.h(13);
                        if (K.this.f129582i.get(iH2) == null) {
                            K.this.f129582i.put(iH2, new E(K.this.new b(iH2)));
                            K.m(K.this);
                        }
                    }
                }
                if (K.this.f129574a != 2) {
                    K.this.f129582i.remove(0);
                }
            }
        }
    }

    private class b implements D {

        /* renamed from: a, reason: collision with root package name */
        private final d3.C f129597a = new d3.C(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<L> f129598b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f129599c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f129600d;

        @Override // e4.D
        public void b(d3.J j10, x3.r rVar, L.d dVar) {
        }

        public b(int i10) {
            this.f129600d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private e4.L.b c(d3.D r17, int r18) {
            /*
                Method dump skipped, instructions count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.K.b.c(d3.D, int):e4.L$b");
        }

        @Override // e4.D
        public void a(d3.D d10) {
            d3.J j10;
            if (d10.H() != 2) {
                return;
            }
            if (K.this.f129574a == 1 || K.this.f129574a == 2 || K.this.f129588o == 1) {
                j10 = (d3.J) K.this.f129577d.get(0);
            } else {
                j10 = new d3.J(((d3.J) K.this.f129577d.get(0)).d());
                K.this.f129577d.add(j10);
            }
            if ((d10.H() & 128) == 0) {
                return;
            }
            d10.X(1);
            int iP = d10.P();
            int i10 = 3;
            d10.X(3);
            d10.k(this.f129597a, 2);
            this.f129597a.r(3);
            int i11 = 13;
            K.this.f129594u = this.f129597a.h(13);
            d10.k(this.f129597a, 2);
            int i12 = 4;
            this.f129597a.r(4);
            d10.X(this.f129597a.h(12));
            if (K.this.f129574a == 2 && K.this.f129592s == null) {
                L.b bVar = new L.b(21, null, 0, null, P.f127893f);
                K k10 = K.this;
                k10.f129592s = k10.f129580g.a(21, bVar);
                if (K.this.f129592s != null) {
                    K.this.f129592s.b(j10, K.this.f129587n, new L.d(iP, 21, 8192));
                }
            }
            this.f129598b.clear();
            this.f129599c.clear();
            int iA = d10.a();
            while (iA > 0) {
                d10.k(this.f129597a, 5);
                int iH = this.f129597a.h(8);
                this.f129597a.r(i10);
                int iH2 = this.f129597a.h(i11);
                this.f129597a.r(i12);
                int iH3 = this.f129597a.h(12);
                L.b bVarC = c(d10, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f129605a;
                }
                iA -= iH3 + 5;
                int i13 = K.this.f129574a == 2 ? iH : iH2;
                if (!K.this.f129583j.get(i13)) {
                    L lA = (K.this.f129574a == 2 && iH == 21) ? K.this.f129592s : K.this.f129580g.a(iH, bVarC);
                    if (K.this.f129574a != 2 || iH2 < this.f129599c.get(i13, 8192)) {
                        this.f129599c.put(i13, iH2);
                        this.f129598b.put(i13, lA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f129599c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f129599c.keyAt(i14);
                int iValueAt = this.f129599c.valueAt(i14);
                K.this.f129583j.put(iKeyAt, true);
                K.this.f129584k.put(iValueAt, true);
                L lValueAt = this.f129598b.valueAt(i14);
                if (lValueAt != null) {
                    if (lValueAt != K.this.f129592s) {
                        lValueAt.b(j10, K.this.f129587n, new L.d(iP, iKeyAt, 8192));
                    }
                    K.this.f129582i.put(iValueAt, lValueAt);
                }
            }
            if (K.this.f129574a == 2) {
                if (K.this.f129589p) {
                    return;
                }
                K.this.f129587n.p();
                K.this.f129588o = 0;
                K.this.f129589p = true;
                return;
            }
            K.this.f129582i.remove(this.f129600d);
            K k11 = K.this;
            k11.f129588o = k11.f129574a == 1 ? 0 : K.this.f129588o - 1;
            if (K.this.f129588o == 0) {
                K.this.f129587n.p();
                K.this.f129589p = true;
            }
        }
    }

    public K(int i10, r.a aVar) {
        this(1, i10, aVar, new d3.J(0L), new C13767j(0), 112800);
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public K(int i10, int i11, r.a aVar, d3.J j10, L.c cVar, int i12) {
        this.f129580g = (L.c) C13599a.e(cVar);
        this.f129576c = i12;
        this.f129574a = i10;
        this.f129575b = i11;
        this.f129581h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f129577d = Collections.singletonList(j10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f129577d = arrayList;
            arrayList.add(j10);
        }
        this.f129578e = new d3.D(new byte[9400], 0);
        this.f129583j = new SparseBooleanArray();
        this.f129584k = new SparseBooleanArray();
        this.f129582i = new SparseArray<>();
        this.f129579f = new SparseIntArray();
        this.f129585l = new I(i12);
        this.f129587n = x3.r.f170341y3;
        this.f129594u = -1;
        z();
    }

    private boolean A(int i10) {
        return this.f129574a == 2 || this.f129589p || !this.f129584k.get(i10, false);
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new K(1, r.a.f37064a)};
    }

    static /* synthetic */ int m(K k10) {
        int i10 = k10.f129588o;
        k10.f129588o = i10 + 1;
        return i10;
    }

    private boolean w(InterfaceC18078q interfaceC18078q) throws IOException {
        byte[] bArrE = this.f129578e.e();
        if (9400 - this.f129578e.f() < 188) {
            int iA = this.f129578e.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f129578e.f(), bArrE, 0, iA);
            }
            this.f129578e.U(bArrE, iA);
        }
        while (this.f129578e.a() < 188) {
            int iG = this.f129578e.g();
            int i10 = interfaceC18078q.read(bArrE, iG, 9400 - iG);
            if (i10 == -1) {
                return false;
            }
            this.f129578e.V(iG + i10);
        }
        return true;
    }

    private int x() throws ParserException {
        int iF = this.f129578e.f();
        int iG = this.f129578e.g();
        int iA = M.a(this.f129578e.e(), iF, iG);
        this.f129578e.W(iA);
        int i10 = iA + 188;
        if (i10 <= iG) {
            this.f129593t = 0;
            return i10;
        }
        int i11 = this.f129593t + (iA - iF);
        this.f129593t = i11;
        if (this.f129574a != 2 || i11 <= 376) {
            return i10;
        }
        throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void y(long j10) {
        if (this.f129590q) {
            return;
        }
        this.f129590q = true;
        if (this.f129585l.b() == -9223372036854775807L) {
            this.f129587n.g(new J.b(this.f129585l.b()));
            return;
        }
        H h10 = new H(this.f129585l.c(), this.f129585l.b(), j10, this.f129594u, this.f129576c);
        this.f129586m = h10;
        this.f129587n.g(h10.b());
    }

    private void z() {
        this.f129583j.clear();
        this.f129582i.clear();
        SparseArray<L> sparseArrayB = this.f129580g.b();
        int size = sparseArrayB.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f129582i.put(sparseArrayB.keyAt(i10), sparseArrayB.valueAt(i10));
        }
        this.f129582i.put(0, new E(new a()));
        this.f129592s = null;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        H h10;
        C13599a.g(this.f129574a != 2);
        int size = this.f129577d.size();
        for (int i10 = 0; i10 < size; i10++) {
            d3.J j12 = this.f129577d.get(i10);
            boolean z10 = j12.f() == -9223372036854775807L;
            if (!z10) {
                long jD = j12.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                j12.i(j11);
            }
        }
        if (j11 != 0 && (h10 = this.f129586m) != null) {
            h10.h(j11);
        }
        this.f129578e.S(0);
        this.f129579f.clear();
        for (int i11 = 0; i11 < this.f129582i.size(); i11++) {
            this.f129582i.valueAt(i11).c();
        }
        this.f129593t = 0;
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        int i11;
        long length = interfaceC18078q.getLength();
        boolean z10 = this.f129574a == 2;
        if (this.f129589p) {
            if (length != -1 && !z10 && !this.f129585l.d()) {
                return this.f129585l.e(interfaceC18078q, i10, this.f129594u);
            }
            y(length);
            if (this.f129591r) {
                this.f129591r = false;
                a(0L, 0L);
                if (interfaceC18078q.getPosition() != 0) {
                    i10.f170165a = 0L;
                    return 1;
                }
            }
            H h10 = this.f129586m;
            if (h10 != null && h10.d()) {
                return this.f129586m.c(interfaceC18078q, i10);
            }
        }
        if (!w(interfaceC18078q)) {
            for (int i12 = 0; i12 < this.f129582i.size(); i12++) {
                L lValueAt = this.f129582i.valueAt(i12);
                if (lValueAt instanceof y) {
                    y yVar = (y) lValueAt;
                    if (yVar.d(z10)) {
                        yVar.a(new d3.D(), 1);
                    }
                }
            }
            return -1;
        }
        int iX = x();
        int iG = this.f129578e.g();
        if (iX > iG) {
            return 0;
        }
        int iQ = this.f129578e.q();
        if ((8388608 & iQ) != 0) {
            this.f129578e.W(iX);
            return 0;
        }
        int i13 = (4194304 & iQ) != 0 ? 1 : 0;
        int i14 = (2096896 & iQ) >> 8;
        boolean z11 = (iQ & 32) != 0;
        L l10 = (iQ & 16) != 0 ? this.f129582i.get(i14) : null;
        if (l10 == null) {
            this.f129578e.W(iX);
            return 0;
        }
        if (this.f129574a != 2) {
            int i15 = iQ & 15;
            i11 = 0;
            int i16 = this.f129579f.get(i14, i15 - 1);
            this.f129579f.put(i14, i15);
            if (i16 == i15) {
                this.f129578e.W(iX);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                l10.c();
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            int iH = this.f129578e.H();
            i13 |= (this.f129578e.H() & 64) != 0 ? 2 : i11;
            this.f129578e.X(iH - 1);
        }
        boolean z12 = this.f129589p;
        if (A(i14)) {
            this.f129578e.V(iX);
            l10.a(this.f129578e, i13);
            this.f129578e.V(iG);
        }
        if (this.f129574a != 2 && !z12 && this.f129589p && length != -1) {
            this.f129591r = true;
        }
        this.f129578e.W(iX);
        return i11;
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        if ((this.f129575b & 1) == 0) {
            rVar = new U3.s(rVar, this.f129581h);
        }
        this.f129587n = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // x3.InterfaceC18077p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(x3.InterfaceC18078q r7) throws java.io.IOException {
        /*
            r6 = this;
            d3.D r0 = r6.f129578e
            byte[] r0 = r0.e()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.m(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.k(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.K.j(x3.q):boolean");
    }
}
