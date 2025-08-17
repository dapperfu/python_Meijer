package e4;

import U3.r;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import d3.C13466a;
import d3.P;
import e4.L;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;

/* loaded from: classes4.dex */
public final class K implements InterfaceC18011p {

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final x3.u f128237v = new x3.u() { // from class: e4.J
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return K.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f128238a;

    /* renamed from: b, reason: collision with root package name */
    private final int f128239b;

    /* renamed from: c, reason: collision with root package name */
    private final int f128240c;

    /* renamed from: d, reason: collision with root package name */
    private final List<d3.J> f128241d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.D f128242e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseIntArray f128243f;

    /* renamed from: g, reason: collision with root package name */
    private final L.c f128244g;

    /* renamed from: h, reason: collision with root package name */
    private final r.a f128245h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<L> f128246i;

    /* renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f128247j;

    /* renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f128248k;

    /* renamed from: l, reason: collision with root package name */
    private final I f128249l;

    /* renamed from: m, reason: collision with root package name */
    private H f128250m;

    /* renamed from: n, reason: collision with root package name */
    private x3.r f128251n;

    /* renamed from: o, reason: collision with root package name */
    private int f128252o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f128253p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f128254q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f128255r;

    /* renamed from: s, reason: collision with root package name */
    private L f128256s;

    /* renamed from: t, reason: collision with root package name */
    private int f128257t;

    /* renamed from: u, reason: collision with root package name */
    private int f128258u;

    private class a implements D {

        /* renamed from: a, reason: collision with root package name */
        private final d3.C f128259a = new d3.C(new byte[4]);

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
                    d10.k(this.f128259a, 4);
                    int iH = this.f128259a.h(16);
                    this.f128259a.r(3);
                    if (iH == 0) {
                        this.f128259a.r(13);
                    } else {
                        int iH2 = this.f128259a.h(13);
                        if (K.this.f128246i.get(iH2) == null) {
                            K.this.f128246i.put(iH2, new E(K.this.new b(iH2)));
                            K.m(K.this);
                        }
                    }
                }
                if (K.this.f128238a != 2) {
                    K.this.f128246i.remove(0);
                }
            }
        }
    }

    private class b implements D {

        /* renamed from: a, reason: collision with root package name */
        private final d3.C f128261a = new d3.C(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<L> f128262b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f128263c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f128264d;

        @Override // e4.D
        public void b(d3.J j10, x3.r rVar, L.d dVar) {
        }

        public b(int i10) {
            this.f128264d = i10;
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
            if (K.this.f128238a == 1 || K.this.f128238a == 2 || K.this.f128252o == 1) {
                j10 = (d3.J) K.this.f128241d.get(0);
            } else {
                j10 = new d3.J(((d3.J) K.this.f128241d.get(0)).d());
                K.this.f128241d.add(j10);
            }
            if ((d10.H() & 128) == 0) {
                return;
            }
            d10.X(1);
            int iP = d10.P();
            int i10 = 3;
            d10.X(3);
            d10.k(this.f128261a, 2);
            this.f128261a.r(3);
            int i11 = 13;
            K.this.f128258u = this.f128261a.h(13);
            d10.k(this.f128261a, 2);
            int i12 = 4;
            this.f128261a.r(4);
            d10.X(this.f128261a.h(12));
            if (K.this.f128238a == 2 && K.this.f128256s == null) {
                L.b bVar = new L.b(21, null, 0, null, P.f127091f);
                K k10 = K.this;
                k10.f128256s = k10.f128244g.a(21, bVar);
                if (K.this.f128256s != null) {
                    K.this.f128256s.b(j10, K.this.f128251n, new L.d(iP, 21, 8192));
                }
            }
            this.f128262b.clear();
            this.f128263c.clear();
            int iA = d10.a();
            while (iA > 0) {
                d10.k(this.f128261a, 5);
                int iH = this.f128261a.h(8);
                this.f128261a.r(i10);
                int iH2 = this.f128261a.h(i11);
                this.f128261a.r(i12);
                int iH3 = this.f128261a.h(12);
                L.b bVarC = c(d10, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f128269a;
                }
                iA -= iH3 + 5;
                int i13 = K.this.f128238a == 2 ? iH : iH2;
                if (!K.this.f128247j.get(i13)) {
                    L lA = (K.this.f128238a == 2 && iH == 21) ? K.this.f128256s : K.this.f128244g.a(iH, bVarC);
                    if (K.this.f128238a != 2 || iH2 < this.f128263c.get(i13, 8192)) {
                        this.f128263c.put(i13, iH2);
                        this.f128262b.put(i13, lA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f128263c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f128263c.keyAt(i14);
                int iValueAt = this.f128263c.valueAt(i14);
                K.this.f128247j.put(iKeyAt, true);
                K.this.f128248k.put(iValueAt, true);
                L lValueAt = this.f128262b.valueAt(i14);
                if (lValueAt != null) {
                    if (lValueAt != K.this.f128256s) {
                        lValueAt.b(j10, K.this.f128251n, new L.d(iP, iKeyAt, 8192));
                    }
                    K.this.f128246i.put(iValueAt, lValueAt);
                }
            }
            if (K.this.f128238a == 2) {
                if (K.this.f128253p) {
                    return;
                }
                K.this.f128251n.p();
                K.this.f128252o = 0;
                K.this.f128253p = true;
                return;
            }
            K.this.f128246i.remove(this.f128264d);
            K k11 = K.this;
            k11.f128252o = k11.f128238a == 1 ? 0 : K.this.f128252o - 1;
            if (K.this.f128252o == 0) {
                K.this.f128251n.p();
                K.this.f128253p = true;
            }
        }
    }

    public K(int i10, r.a aVar) {
        this(1, i10, aVar, new d3.J(0L), new C13618j(0), 112800);
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public K(int i10, int i11, r.a aVar, d3.J j10, L.c cVar, int i12) {
        this.f128244g = (L.c) C13466a.e(cVar);
        this.f128240c = i12;
        this.f128238a = i10;
        this.f128239b = i11;
        this.f128245h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f128241d = Collections.singletonList(j10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f128241d = arrayList;
            arrayList.add(j10);
        }
        this.f128242e = new d3.D(new byte[9400], 0);
        this.f128247j = new SparseBooleanArray();
        this.f128248k = new SparseBooleanArray();
        this.f128246i = new SparseArray<>();
        this.f128243f = new SparseIntArray();
        this.f128249l = new I(i12);
        this.f128251n = x3.r.f169253y3;
        this.f128258u = -1;
        z();
    }

    private boolean A(int i10) {
        return this.f128238a == 2 || this.f128253p || !this.f128248k.get(i10, false);
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new K(1, r.a.f35728a)};
    }

    static /* synthetic */ int m(K k10) {
        int i10 = k10.f128252o;
        k10.f128252o = i10 + 1;
        return i10;
    }

    private boolean w(InterfaceC18012q interfaceC18012q) throws IOException {
        byte[] bArrE = this.f128242e.e();
        if (9400 - this.f128242e.f() < 188) {
            int iA = this.f128242e.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f128242e.f(), bArrE, 0, iA);
            }
            this.f128242e.U(bArrE, iA);
        }
        while (this.f128242e.a() < 188) {
            int iG = this.f128242e.g();
            int i10 = interfaceC18012q.read(bArrE, iG, 9400 - iG);
            if (i10 == -1) {
                return false;
            }
            this.f128242e.V(iG + i10);
        }
        return true;
    }

    private int x() throws ParserException {
        int iF = this.f128242e.f();
        int iG = this.f128242e.g();
        int iA = M.a(this.f128242e.e(), iF, iG);
        this.f128242e.W(iA);
        int i10 = iA + 188;
        if (i10 <= iG) {
            this.f128257t = 0;
            return i10;
        }
        int i11 = this.f128257t + (iA - iF);
        this.f128257t = i11;
        if (this.f128238a != 2 || i11 <= 376) {
            return i10;
        }
        throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void y(long j10) {
        if (this.f128254q) {
            return;
        }
        this.f128254q = true;
        if (this.f128249l.b() == -9223372036854775807L) {
            this.f128251n.g(new J.b(this.f128249l.b()));
            return;
        }
        H h10 = new H(this.f128249l.c(), this.f128249l.b(), j10, this.f128258u, this.f128240c);
        this.f128250m = h10;
        this.f128251n.g(h10.b());
    }

    private void z() {
        this.f128247j.clear();
        this.f128246i.clear();
        SparseArray<L> sparseArrayB = this.f128244g.b();
        int size = sparseArrayB.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f128246i.put(sparseArrayB.keyAt(i10), sparseArrayB.valueAt(i10));
        }
        this.f128246i.put(0, new E(new a()));
        this.f128256s = null;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        H h10;
        C13466a.g(this.f128238a != 2);
        int size = this.f128241d.size();
        for (int i10 = 0; i10 < size; i10++) {
            d3.J j12 = this.f128241d.get(i10);
            boolean z10 = j12.f() == -9223372036854775807L;
            if (!z10) {
                long jD = j12.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                j12.i(j11);
            }
        }
        if (j11 != 0 && (h10 = this.f128250m) != null) {
            h10.h(j11);
        }
        this.f128242e.S(0);
        this.f128243f.clear();
        for (int i11 = 0; i11 < this.f128246i.size(); i11++) {
            this.f128246i.valueAt(i11).c();
        }
        this.f128257t = 0;
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        int i11;
        long length = interfaceC18012q.getLength();
        boolean z10 = this.f128238a == 2;
        if (this.f128253p) {
            if (length != -1 && !z10 && !this.f128249l.d()) {
                return this.f128249l.e(interfaceC18012q, i10, this.f128258u);
            }
            y(length);
            if (this.f128255r) {
                this.f128255r = false;
                a(0L, 0L);
                if (interfaceC18012q.getPosition() != 0) {
                    i10.f169077a = 0L;
                    return 1;
                }
            }
            H h10 = this.f128250m;
            if (h10 != null && h10.d()) {
                return this.f128250m.c(interfaceC18012q, i10);
            }
        }
        if (!w(interfaceC18012q)) {
            for (int i12 = 0; i12 < this.f128246i.size(); i12++) {
                L lValueAt = this.f128246i.valueAt(i12);
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
        int iG = this.f128242e.g();
        if (iX > iG) {
            return 0;
        }
        int iQ = this.f128242e.q();
        if ((8388608 & iQ) != 0) {
            this.f128242e.W(iX);
            return 0;
        }
        int i13 = (4194304 & iQ) != 0 ? 1 : 0;
        int i14 = (2096896 & iQ) >> 8;
        boolean z11 = (iQ & 32) != 0;
        L l10 = (iQ & 16) != 0 ? this.f128246i.get(i14) : null;
        if (l10 == null) {
            this.f128242e.W(iX);
            return 0;
        }
        if (this.f128238a != 2) {
            int i15 = iQ & 15;
            i11 = 0;
            int i16 = this.f128243f.get(i14, i15 - 1);
            this.f128243f.put(i14, i15);
            if (i16 == i15) {
                this.f128242e.W(iX);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                l10.c();
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            int iH = this.f128242e.H();
            i13 |= (this.f128242e.H() & 64) != 0 ? 2 : i11;
            this.f128242e.X(iH - 1);
        }
        boolean z12 = this.f128253p;
        if (A(i14)) {
            this.f128242e.V(iX);
            l10.a(this.f128242e, i13);
            this.f128242e.V(iG);
        }
        if (this.f128238a != 2 && !z12 && this.f128253p && length != -1) {
            this.f128255r = true;
        }
        this.f128242e.W(iX);
        return i11;
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        if ((this.f128239b & 1) == 0) {
            rVar = new U3.s(rVar, this.f128245h);
        }
        this.f128251n = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // x3.InterfaceC18011p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(x3.InterfaceC18012q r7) throws java.io.IOException {
        /*
            r6 = this;
            d3.D r0 = r6.f128242e
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
