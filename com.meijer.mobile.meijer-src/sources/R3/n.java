package R3;

import Ee.L;
import U3.r;
import a3.t;
import a3.y;
import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.D;
import e3.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import x3.B;
import x3.C18064c;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.N;
import x3.O;
import x3.P;

/* loaded from: classes4.dex */
public final class n implements InterfaceC18077p, J {

    /* renamed from: G, reason: collision with root package name */
    @Deprecated
    public static final x3.u f31765G = new x3.u() { // from class: R3.m
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return n.n();
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private a[] f31766A;

    /* renamed from: B, reason: collision with root package name */
    private long[][] f31767B;

    /* renamed from: C, reason: collision with root package name */
    private int f31768C;

    /* renamed from: D, reason: collision with root package name */
    private long f31769D;

    /* renamed from: E, reason: collision with root package name */
    private int f31770E;

    /* renamed from: F, reason: collision with root package name */
    private M3.a f31771F;

    /* renamed from: a, reason: collision with root package name */
    private final r.a f31772a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31773b;

    /* renamed from: c, reason: collision with root package name */
    private final D f31774c;

    /* renamed from: d, reason: collision with root package name */
    private final D f31775d;

    /* renamed from: e, reason: collision with root package name */
    private final D f31776e;

    /* renamed from: f, reason: collision with root package name */
    private final D f31777f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<c.b> f31778g;

    /* renamed from: h, reason: collision with root package name */
    private final q f31779h;

    /* renamed from: i, reason: collision with root package name */
    private final List<y.a> f31780i;

    /* renamed from: j, reason: collision with root package name */
    private L<N> f31781j;

    /* renamed from: k, reason: collision with root package name */
    private int f31782k;

    /* renamed from: l, reason: collision with root package name */
    private int f31783l;

    /* renamed from: m, reason: collision with root package name */
    private long f31784m;

    /* renamed from: n, reason: collision with root package name */
    private int f31785n;

    /* renamed from: o, reason: collision with root package name */
    private D f31786o;

    /* renamed from: p, reason: collision with root package name */
    private int f31787p;

    /* renamed from: q, reason: collision with root package name */
    private int f31788q;

    /* renamed from: r, reason: collision with root package name */
    private int f31789r;

    /* renamed from: s, reason: collision with root package name */
    private int f31790s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f31791t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f31792u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f31793v;

    /* renamed from: w, reason: collision with root package name */
    private long f31794w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f31795x;

    /* renamed from: y, reason: collision with root package name */
    private long f31796y;

    /* renamed from: z, reason: collision with root package name */
    private x3.r f31797z;

    @Deprecated
    public n() {
        this(r.a.f37064a, 16);
    }

    private boolean M(y yVar) {
        e3.b bVarA;
        if (yVar != null && (this.f31773b & 64) != 0 && (bVarA = j.a(yVar, "auxiliary.tracks.offset")) != null) {
            long jO = new D(bVarA.f129407b).O();
            if (jO > 0) {
                this.f31794w = jO;
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ t m(t tVar) {
        return tVar;
    }

    private static long[][] p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f31799b.f31853b];
            jArr2[i10] = aVarArr[i10].f31799b.f31857f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            w wVar = aVarArr[i12].f31799b;
            j10 += wVar.f31855d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = wVar.f31857f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void s() {
        this.f31782k = 0;
        this.f31785n = 0;
    }

    @Override // x3.J
    public J.a d(long j10) {
        return u(j10, -1);
    }

    @Override // x3.J
    public boolean g() {
        return true;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final t f31798a;

        /* renamed from: b, reason: collision with root package name */
        public final w f31799b;

        /* renamed from: c, reason: collision with root package name */
        public final O f31800c;

        /* renamed from: d, reason: collision with root package name */
        public final P f31801d;

        /* renamed from: e, reason: collision with root package name */
        public int f31802e;

        public a(t tVar, w wVar, O o10) {
            P p10;
            this.f31798a = tVar;
            this.f31799b = wVar;
            this.f31800c = o10;
            if ("audio/true-hd".equals(tVar.f31823g.f44767o)) {
                p10 = new P();
            } else {
                p10 = null;
            }
            this.f31801d = p10;
        }
    }

    public n(r.a aVar, int i10) {
        this.f31772a = aVar;
        this.f31773b = i10;
        this.f31781j = L.x();
        this.f31782k = (i10 & 4) != 0 ? 3 : 0;
        this.f31779h = new q();
        this.f31780i = new ArrayList();
        this.f31777f = new D(16);
        this.f31778g = new ArrayDeque<>();
        this.f31774c = new D(e3.f.f129420a);
        this.f31775d = new D(6);
        this.f31776e = new D();
        this.f31787p = -1;
        this.f31797z = x3.r.f170341y3;
        this.f31766A = new a[0];
    }

    private void A(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f31776e.S(8);
        interfaceC18078q.m(this.f31776e.e(), 0, 8);
        b.e(this.f31776e);
        interfaceC18078q.k(this.f31776e.f());
        interfaceC18078q.d();
    }

    private void B(long j10) throws ParserException {
        while (!this.f31778g.isEmpty() && this.f31778g.peek().f129411b == j10) {
            c.b bVarPop = this.f31778g.pop();
            if (bVarPop.f129410a == 1836019574) {
                E(bVarPop);
                this.f31778g.clear();
                if (!this.f31793v) {
                    this.f31782k = 2;
                }
            } else if (!this.f31778g.isEmpty()) {
                this.f31778g.peek().b(bVarPop);
            }
        }
        if (this.f31782k != 2) {
            s();
        }
    }

    private void C() {
        if (this.f31770E != 2 || (this.f31773b & 2) == 0) {
            return;
        }
        O oT = this.f31797z.t(0, 4);
        M3.a aVar = this.f31771F;
        oT.b(new t.b().n0(aVar == null ? null : new y(aVar)).N());
        this.f31797z.p();
        this.f31797z.g(new J.b(-9223372036854775807L));
    }

    private static int D(D d10) {
        d10.W(8);
        int iO = o(d10.q());
        if (iO != 0) {
            return iO;
        }
        d10.X(4);
        while (d10.a() > 0) {
            int iO2 = o(d10.q());
            if (iO2 != 0) {
                return iO2;
            }
        }
        return 0;
    }

    private void E(c.b bVar) throws ParserException {
        List<Integer> list;
        y yVar;
        y yVar2;
        List<w> list2;
        int i10;
        y yVar3;
        ArrayList arrayList;
        int i11;
        c.b bVarD = bVar.d(1835365473);
        List<Integer> arrayList2 = new ArrayList<>();
        if (bVarD != null) {
            y yVarR = b.r(bVarD);
            if (this.f31795x) {
                C13599a.i(yVarR);
                z(yVarR);
                arrayList2 = t(yVarR);
            } else if (M(yVarR)) {
                this.f31793v = true;
                return;
            }
            yVar = yVarR;
            list = arrayList2;
        } else {
            list = arrayList2;
            yVar = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z10 = this.f31770E == 1;
        B b10 = new B();
        c.C2039c c2039cE = bVar.e(1969517665);
        if (c2039cE != null) {
            y yVarF = b.F(c2039cE);
            b10.c(yVarF);
            yVar2 = yVarF;
        } else {
            yVar2 = null;
        }
        y yVar4 = new y(b.t(((c.C2039c) C13599a.e(bVar.e(1836476516))).f129414b));
        List<w> listE = b.E(bVar, b10, -9223372036854775807L, null, (this.f31773b & 1) != 0, z10, new De.g() { // from class: R3.l
            @Override // De.g
            public final Object apply(Object obj) {
                return n.m((t) obj);
            }
        });
        if (this.f31795x) {
            C13599a.h(list.size() == listE.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listE.size())));
        }
        String strB = k.b(listE);
        int i12 = 0;
        int i13 = 0;
        long j10 = -9223372036854775807L;
        int size = -1;
        while (i12 < listE.size()) {
            w wVar = listE.get(i12);
            if (wVar.f31853b == 0) {
                list2 = listE;
                i10 = i13;
                yVar3 = yVar;
                arrayList = arrayList3;
            } else {
                t tVar = wVar.f31852a;
                list2 = listE;
                ArrayList arrayList4 = arrayList3;
                i10 = i13 + 1;
                String str = strB;
                a aVar = new a(tVar, wVar, this.f31797z.t(i13, tVar.f31818b));
                y yVar5 = yVar;
                long j11 = tVar.f31821e;
                if (j11 == -9223372036854775807L) {
                    j11 = wVar.f31859h;
                }
                aVar.f31800c.f(j11);
                long jMax = Math.max(j10, j11);
                int i14 = "audio/true-hd".equals(tVar.f31823g.f44767o) ? wVar.f31856e * 16 : wVar.f31856e + 30;
                t.b bVarB = tVar.f31823g.b();
                bVarB.k0(i14);
                if (tVar.f31818b == 2) {
                    a3.t tVar2 = tVar.f31823g;
                    int i15 = tVar2.f44758f;
                    if ((this.f31773b & 8) != 0) {
                        i15 |= size == -1 ? 1 : 2;
                    }
                    if (tVar2.f44776x == -1.0f && j11 > 0 && (i11 = wVar.f31853b) > 0) {
                        bVarB.b0(i11 / (j11 / 1000000.0f));
                    }
                    if (this.f31795x) {
                        i15 |= 32768;
                        bVarB.P(list.get(i12).intValue());
                    }
                    bVarB.s0(i15);
                }
                j.l(tVar.f31818b, b10, bVarB);
                yVar3 = yVar5;
                j.m(tVar.f31818b, yVar3, bVarB, this.f31780i.isEmpty() ? null : new y(this.f31780i), yVar2, yVar4);
                strB = str;
                bVarB.U(strB);
                aVar.f31800c.b(bVarB.N());
                if (tVar.f31818b == 2 && size == -1) {
                    size = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(aVar);
                j10 = jMax;
            }
            i12++;
            arrayList3 = arrayList;
            listE = list2;
            yVar = yVar3;
            i13 = i10;
        }
        this.f31768C = size;
        this.f31769D = j10;
        a[] aVarArr = (a[]) arrayList3.toArray(new a[0]);
        this.f31766A = aVarArr;
        this.f31767B = p(aVarArr);
        this.f31797z.p();
        this.f31797z.g(this);
    }

    private void F(long j10) {
        if (this.f31783l == 1836086884) {
            int i10 = this.f31785n;
            this.f31771F = new M3.a(0L, j10, -9223372036854775807L, j10 + i10, this.f31784m - i10);
        }
    }

    private boolean G(InterfaceC18078q interfaceC18078q) throws IOException {
        c.b bVarPeek;
        if (this.f31785n == 0) {
            if (!interfaceC18078q.f(this.f31777f.e(), 0, 8, true)) {
                C();
                return false;
            }
            this.f31785n = 8;
            this.f31777f.W(0);
            this.f31784m = this.f31777f.J();
            this.f31783l = this.f31777f.q();
        }
        long j10 = this.f31784m;
        if (j10 == 1) {
            interfaceC18078q.readFully(this.f31777f.e(), 8, 8);
            this.f31785n += 8;
            this.f31784m = this.f31777f.O();
        } else if (j10 == 0) {
            long length = interfaceC18078q.getLength();
            if (length == -1 && (bVarPeek = this.f31778g.peek()) != null) {
                length = bVarPeek.f129411b;
            }
            if (length != -1) {
                this.f31784m = (length - interfaceC18078q.getPosition()) + this.f31785n;
            }
        }
        if (this.f31784m < this.f31785n) {
            throw ParserException.c("Atom size less than header length (unsupported).");
        }
        if (K(this.f31783l)) {
            long position = interfaceC18078q.getPosition();
            long j11 = this.f31784m;
            int i10 = this.f31785n;
            long j12 = (position + j11) - i10;
            if (j11 != i10 && this.f31783l == 1835365473) {
                A(interfaceC18078q);
            }
            this.f31778g.push(new c.b(this.f31783l, j12));
            if (this.f31784m == this.f31785n) {
                B(j12);
            } else {
                s();
            }
        } else if (L(this.f31783l)) {
            C13599a.g(this.f31785n == 8);
            C13599a.g(this.f31784m <= 2147483647L);
            D d10 = new D((int) this.f31784m);
            System.arraycopy(this.f31777f.e(), 0, d10.e(), 0, 8);
            this.f31786o = d10;
            this.f31782k = 1;
        } else {
            F(interfaceC18078q.getPosition() - this.f31785n);
            this.f31786o = null;
            this.f31782k = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean H(x3.InterfaceC18078q r10, x3.I r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f31784m
            int r2 = r9.f31785n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            d3.D r4 = r9.f31786o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.e()
            int r8 = r9.f31785n
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.f31783l
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.f31792u = r5
            int r10 = D(r4)
            r9.f31770E = r10
            goto L5e
        L2b:
            java.util.ArrayDeque<e3.c$b> r10 = r9.f31778g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque<e3.c$b> r10 = r9.f31778g
            java.lang.Object r10 = r10.peek()
            e3.c$b r10 = (e3.c.b) r10
            e3.c$c r0 = new e3.c$c
            int r1 = r9.f31783l
            r0.<init>(r1, r4)
            r10.c(r0)
            goto L5e
        L46:
            boolean r4 = r9.f31792u
            if (r4 != 0) goto L53
            int r4 = r9.f31783l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.f31770E = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.k(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f170165a = r7
            r10 = r5
        L68:
            r9.B(r2)
            boolean r0 = r9.f31793v
            if (r0 == 0) goto L78
            r9.f31795x = r5
            long r0 = r9.f31794w
            r11.f170165a = r0
            r9.f31793v = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r10 = r9.f31782k
            r11 = 2
            if (r10 == r11) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.n.H(x3.q, x3.I):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    private int I(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        O.a aVar;
        ?? r12;
        int iO;
        long position = interfaceC18078q.getPosition();
        if (this.f31787p == -1) {
            int iX = x(position);
            this.f31787p = iX;
            if (iX == -1) {
                return -1;
            }
        }
        a aVar2 = this.f31766A[this.f31787p];
        O o10 = aVar2.f31800c;
        int i11 = aVar2.f31802e;
        w wVar = aVar2.f31799b;
        long j10 = wVar.f31854c[i11] + this.f31796y;
        int i12 = wVar.f31855d[i11];
        P p10 = aVar2.f31801d;
        long j11 = (j10 - position) + this.f31788q;
        if (j11 < 0 || j11 >= 262144) {
            i10.f170165a = j10;
            return 1;
        }
        if (aVar2.f31798a.f31824h == 1) {
            j11 += 8;
            i12 -= 8;
        }
        interfaceC18078q.k((int) j11);
        if (!q(aVar2.f31798a.f31823g)) {
            this.f31791t = true;
        }
        t tVar = aVar2.f31798a;
        if (tVar.f31827k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f31823g.f44767o)) {
                if (this.f31789r == 0) {
                    C18064c.a(i12, this.f31776e);
                    o10.d(this.f31776e, 7);
                    this.f31789r += 7;
                }
                i12 += 7;
            } else if (p10 != null) {
                p10.d(interfaceC18078q);
            }
            while (true) {
                int i13 = this.f31789r;
                if (i13 >= i12) {
                    break;
                }
                int iG = o10.g(interfaceC18078q, i12 - i13, false);
                this.f31788q += iG;
                this.f31789r += iG;
                this.f31790s -= iG;
            }
        } else {
            byte[] bArrE = this.f31775d.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i14 = 4 - aVar2.f31798a.f31827k;
            i12 += i14;
            while (this.f31789r < i12) {
                int i15 = this.f31790s;
                if (i15 == 0) {
                    t tVar2 = aVar2.f31798a;
                    int i16 = tVar2.f31827k;
                    if (this.f31791t || e3.f.o(tVar2.f31823g) + i16 > aVar2.f31799b.f31855d[i11] - this.f31788q) {
                        iO = 0;
                    } else {
                        iO = e3.f.o(aVar2.f31798a.f31823g);
                        i16 = aVar2.f31798a.f31827k + iO;
                    }
                    interfaceC18078q.readFully(bArrE, i14, i16);
                    this.f31788q += i16;
                    this.f31775d.W(0);
                    int iQ = this.f31775d.q();
                    if (iQ < 0) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.f31790s = iQ - iO;
                    this.f31774c.W(0);
                    o10.d(this.f31774c, 4);
                    this.f31789r += 4;
                    if (iO > 0) {
                        o10.d(this.f31775d, iO);
                        this.f31789r += iO;
                        if (e3.f.k(bArrE, 4, iO, aVar2.f31798a.f31823g)) {
                            this.f31791t = true;
                        }
                    }
                } else {
                    int iG2 = o10.g(interfaceC18078q, i15, false);
                    this.f31788q += iG2;
                    this.f31789r += iG2;
                    this.f31790s -= iG2;
                }
            }
            aVar = null;
        }
        int i17 = i12;
        w wVar2 = aVar2.f31799b;
        long j12 = wVar2.f31857f[i11];
        int i18 = wVar2.f31858g[i11];
        if (!this.f31791t) {
            i18 |= 67108864;
        }
        int i19 = i18;
        if (p10 != null) {
            boolean z10 = false;
            p10.c(o10, j12, i19, i17, 0, null);
            r12 = z10;
            if (i11 + 1 == aVar2.f31799b.f31853b) {
                p10.a(o10, aVar);
                r12 = z10;
            }
        } else {
            r12 = 0;
            o10.c(j12, i19, i17, 0, null);
        }
        aVar2.f31802e++;
        this.f31787p = -1;
        this.f31788q = r12;
        this.f31789r = r12;
        this.f31790s = r12;
        this.f31791t = r12;
        return r12;
    }

    private int J(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        int iC = this.f31779h.c(interfaceC18078q, i10, this.f31780i);
        if (iC == 1 && i10.f170165a == 0) {
            s();
        }
        return iC;
    }

    private void N(a aVar, long j10) {
        w wVar = aVar.f31799b;
        int iA = wVar.a(j10);
        if (iA == -1) {
            iA = wVar.b(j10);
        }
        aVar.f31802e = iA;
    }

    public static /* synthetic */ InterfaceC18077p[] n() {
        return new InterfaceC18077p[]{new n(r.a.f37064a, 16)};
    }

    private boolean q(a3.t tVar) {
        return Objects.equals(tVar.f44767o, "video/avc") ? (this.f31773b & 32) != 0 : Objects.equals(tVar.f44767o, "video/hevc") && (this.f31773b & 128) != 0;
    }

    public static int r(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private List<Integer> t(y yVar) {
        List<Integer> listD = ((e3.b) C13599a.i(j.a(yVar, "auxiliary.tracks.map"))).d();
        ArrayList arrayList = new ArrayList(listD.size());
        for (int i10 = 0; i10 < listD.size(); i10++) {
            int iIntValue = listD.get(i10).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private int x(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f31766A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f31802e;
            w wVar = aVar.f31799b;
            if (i13 != wVar.f31853b) {
                long j14 = wVar.f31854c[i13];
                long j15 = ((long[][]) d3.P.h(this.f31767B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    private void z(y yVar) {
        e3.b bVarA = j.a(yVar, "auxiliary.tracks.interleaved");
        if (bVarA == null || bVarA.f129407b[0] != 0) {
            return;
        }
        this.f31796y = this.f31794w + 16;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f31778g.clear();
        this.f31785n = 0;
        this.f31787p = -1;
        this.f31788q = 0;
        this.f31789r = 0;
        this.f31790s = 0;
        this.f31791t = false;
        if (j10 == 0) {
            if (this.f31782k != 3) {
                s();
                return;
            } else {
                this.f31779h.g();
                this.f31780i.clear();
                return;
            }
        }
        for (a aVar : this.f31766A) {
            N(aVar, j11);
            P p10 = aVar.f31801d;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        while (true) {
            int i11 = this.f31782k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return I(interfaceC18078q, i10);
                    }
                    if (i11 == 3) {
                        return J(interfaceC18078q, i10);
                    }
                    throw new IllegalStateException();
                }
                if (H(interfaceC18078q, i10)) {
                    return 1;
                }
            } else if (!G(interfaceC18078q)) {
                return -1;
            }
        }
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        if ((this.f31773b & 16) == 0) {
            rVar = new U3.s(rVar, this.f31772a);
        }
        this.f31797z = rVar;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        N nD = s.d(interfaceC18078q, (this.f31773b & 2) != 0);
        this.f31781j = nD != null ? L.y(nD) : L.x();
        return nD == null;
    }

    @Override // x3.J
    public long l() {
        return this.f31769D;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x3.J.a u(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            R3.n$a[] r4 = r0.f31766A
            int r5 = r4.length
            if (r5 != 0) goto L13
            x3.J$a r1 = new x3.J$a
            x3.K r2 = x3.K.f170170c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f31768C
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            R3.w r4 = r4.f31799b
            int r6 = w(r4, r1)
            if (r6 != r5) goto L35
            x3.J$a r1 = new x3.J$a
            x3.K r2 = x3.K.f170170c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f31857f
            r12 = r11[r6]
            long[] r11 = r4.f31854c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f31853b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f31857f
            r9 = r2[r1]
            long[] r2 = r4.f31854c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            R3.n$a[] r4 = r0.f31766A
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f31768C
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            R3.w r4 = r4.f31799b
            long r5 = y(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = y(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            x3.K r3 = new x3.K
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            x3.J$a r1 = new x3.J$a
            r1.<init>(r3)
            return r1
        L8f:
            x3.K r4 = new x3.K
            r4.<init>(r9, r1)
            x3.J$a r1 = new x3.J$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.n.u(long, int):x3.J$a");
    }

    @Override // x3.InterfaceC18077p
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public L<N> i() {
        return this.f31781j;
    }

    private static boolean K(int i10) {
        if (i10 != 1836019574 && i10 != 1953653099 && i10 != 1835297121 && i10 != 1835626086 && i10 != 1937007212 && i10 != 1701082227 && i10 != 1835365473 && i10 != 1635284069) {
            return false;
        }
        return true;
    }

    private static boolean L(int i10) {
        if (i10 != 1835296868 && i10 != 1836476516 && i10 != 1751411826 && i10 != 1937011556 && i10 != 1937011827 && i10 != 1937011571 && i10 != 1668576371 && i10 != 1701606260 && i10 != 1937011555 && i10 != 1937011578 && i10 != 1937013298 && i10 != 1937007471 && i10 != 1668232756 && i10 != 1953196132 && i10 != 1718909296 && i10 != 1969517665 && i10 != 1801812339 && i10 != 1768715124) {
            return false;
        }
        return true;
    }

    private static int o(int i10) {
        if (i10 != 1751476579) {
            if (i10 != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static int w(w wVar, long j10) {
        int iA = wVar.a(j10);
        if (iA == -1) {
            return wVar.b(j10);
        }
        return iA;
    }

    private static long y(w wVar, long j10, long j11) {
        int iW = w(wVar, j10);
        if (iW == -1) {
            return j11;
        }
        return Math.min(wVar.f31854c[iW], j11);
    }
}
