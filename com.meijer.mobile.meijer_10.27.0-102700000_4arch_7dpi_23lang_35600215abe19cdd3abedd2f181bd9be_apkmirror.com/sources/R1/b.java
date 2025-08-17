package R1;

import Q1.d;
import Q1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Q1.e> f31553a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f31554b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Q1.f f31555c;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f31556k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f31557l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f31558m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f31559a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f31560b;

        /* renamed from: c, reason: collision with root package name */
        public int f31561c;

        /* renamed from: d, reason: collision with root package name */
        public int f31562d;

        /* renamed from: e, reason: collision with root package name */
        public int f31563e;

        /* renamed from: f, reason: collision with root package name */
        public int f31564f;

        /* renamed from: g, reason: collision with root package name */
        public int f31565g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f31566h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f31567i;

        /* renamed from: j, reason: collision with root package name */
        public int f31568j;
    }

    /* renamed from: R1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0714b {
        void a();

        void b(Q1.e eVar, a aVar);
    }

    private boolean a(InterfaceC0714b interfaceC0714b, Q1.e eVar, int i10) {
        this.f31554b.f31559a = eVar.v();
        this.f31554b.f31560b = eVar.K();
        this.f31554b.f31561c = eVar.M();
        this.f31554b.f31562d = eVar.s();
        a aVar = this.f31554b;
        aVar.f31567i = false;
        aVar.f31568j = i10;
        e.b bVar = aVar.f31559a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f31560b == bVar2;
        boolean z12 = z10 && eVar.f29584c0 > 0.0f;
        boolean z13 = z11 && eVar.f29584c0 > 0.0f;
        if (z12 && eVar.f29627y[0] == 4) {
            aVar.f31559a = e.b.FIXED;
        }
        if (z13 && eVar.f29627y[1] == 4) {
            aVar.f31560b = e.b.FIXED;
        }
        interfaceC0714b.b(eVar, aVar);
        eVar.R0(this.f31554b.f31563e);
        eVar.w0(this.f31554b.f31564f);
        eVar.v0(this.f31554b.f31566h);
        eVar.l0(this.f31554b.f31565g);
        a aVar2 = this.f31554b;
        aVar2.f31568j = a.f31556k;
        return aVar2.f31567i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(Q1.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<Q1.e> r0 = r13.f29693K0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.w1(r1)
            R1.b$b r2 = r13.p1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<Q1.e> r5 = r13.f29693K0
            java.lang.Object r5 = r5.get(r4)
            Q1.e r5 = (Q1.e) r5
            boolean r6 = r5 instanceof Q1.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof Q1.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.a0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            R1.l r6 = r5.f29587e
            if (r6 == 0) goto L47
            R1.n r7 = r5.f29589f
            if (r7 == 0) goto L47
            R1.g r6 = r6.f31637e
            boolean r6 = r6.f31589j
            if (r6 == 0) goto L47
            R1.g r6 = r7.f31637e
            boolean r6 = r6.f31589j
            if (r6 == 0) goto L47
            goto La0
        L47:
            Q1.e$b r6 = r5.p(r3)
            r7 = 1
            Q1.e$b r8 = r5.p(r7)
            Q1.e$b r9 = Q1.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f29623w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f29625x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.w1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof Q1.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f29623w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.Y()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f29625x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.Y()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f29584c0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = R1.b.a.f31556k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.b.b(Q1.f):void");
    }

    public long d(Q1.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zO1;
        int i19;
        int i20;
        int i21;
        Q1.f fVar2;
        long j10;
        int i22;
        int i23;
        boolean z10;
        b bVar = this;
        InterfaceC0714b interfaceC0714bP1 = fVar.p1();
        int size = fVar.f29693K0.size();
        int iM = fVar.M();
        int iS = fVar.s();
        boolean zB = Q1.j.b(i10, 128);
        boolean z11 = zB || Q1.j.b(i10, 64);
        if (z11) {
            for (int i24 = 0; i24 < size; i24++) {
                Q1.e eVar = fVar.f29693K0.get(i24);
                e.b bVarV = eVar.v();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z12 = (bVarV == bVar2) && (eVar.K() == bVar2) && eVar.q() > 0.0f;
                if ((eVar.Y() && z12) || ((eVar.Z() && z12) || (eVar instanceof Q1.k) || eVar.Y() || eVar.Z())) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            boolean z13 = M1.d.f18824r;
        }
        boolean z14 = z11 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i25 = 2;
        if (z14) {
            int iMin = Math.min(fVar.z(), i14);
            int iMin2 = Math.min(fVar.y(), i16);
            if (i13 == 1073741824 && fVar.M() != iMin) {
                fVar.R0(iMin);
                fVar.s1();
            }
            if (i15 == 1073741824 && fVar.s() != iMin2) {
                fVar.w0(iMin2);
                fVar.s1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zO1 = fVar.m1(zB);
                i19 = 2;
            } else {
                boolean zN1 = fVar.n1(zB);
                if (i13 == 1073741824) {
                    zN1 &= fVar.o1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zO1 = fVar.o1(zB, 1) & zN1;
                    i19++;
                } else {
                    zO1 = zN1;
                }
            }
            if (zO1) {
                fVar.V0(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zO1 = false;
            i19 = 0;
        }
        long j11 = 0;
        if (zO1 && i19 == 2) {
            return 0L;
        }
        int iQ1 = fVar.q1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f31553a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, iM, iS);
            i20 = iM;
            i21 = iS;
        } else {
            i20 = iM;
            i21 = iS;
        }
        if (size2 > 0) {
            e.b bVarV2 = fVar.v();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z15 = bVarV2 == bVar3;
            boolean z16 = fVar.K() == bVar3;
            int iMax = Math.max(fVar.M(), bVar.f31555c.B());
            int iMax2 = Math.max(fVar.s(), bVar.f31555c.A());
            int i26 = 0;
            boolean zB1 = false;
            while (i26 < size2) {
                long j12 = j11;
                Q1.e eVar2 = bVar.f31553a.get(i26);
                if (eVar2 instanceof Q1.k) {
                    int iM2 = eVar2.M();
                    int iS2 = eVar2.s();
                    boolean zA = zB1 | bVar.a(interfaceC0714bP1, eVar2, a.f31557l);
                    i23 = i20;
                    int iM3 = eVar2.M();
                    z10 = z14;
                    int iS3 = eVar2.s();
                    if (iM3 != iM2) {
                        eVar2.R0(iM3);
                        if (z15 && eVar2.F() > iMax) {
                            iMax = Math.max(iMax, eVar2.F() + eVar2.j(d.b.RIGHT).e());
                        }
                        zA = true;
                    }
                    if (iS3 != iS2) {
                        eVar2.w0(iS3);
                        if (z16 && eVar2.m() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.m() + eVar2.j(d.b.BOTTOM).e());
                        }
                        zA = true;
                    }
                    zB1 = zA | ((Q1.k) eVar2).b1();
                } else {
                    i23 = i20;
                    z10 = z14;
                }
                i26++;
                i20 = i23;
                j11 = j12;
                z14 = z10;
                i25 = 2;
            }
            int i27 = i20;
            boolean z17 = z14;
            j10 = j11;
            int i28 = i25;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    Q1.e eVar3 = bVar.f31553a.get(i30);
                    if (((eVar3 instanceof Q1.h) && !(eVar3 instanceof Q1.k)) || (eVar3 instanceof Q1.g) || eVar3.L() == 8 || ((z17 && eVar3.f29587e.f31637e.f31589j && eVar3.f29589f.f31637e.f31589j) || (eVar3 instanceof Q1.k))) {
                        i22 = i29;
                    } else {
                        int iM4 = eVar3.M();
                        int iS4 = eVar3.s();
                        int iK = eVar3.k();
                        int i31 = a.f31557l;
                        if (i29 == 1) {
                            i31 = a.f31558m;
                        }
                        boolean zA2 = zB1 | bVar.a(interfaceC0714bP1, eVar3, i31);
                        int iM5 = eVar3.M();
                        i22 = i29;
                        int iS5 = eVar3.s();
                        if (iM5 != iM4) {
                            eVar3.R0(iM5);
                            if (z15 && eVar3.F() > iMax) {
                                iMax = Math.max(iMax, eVar3.F() + eVar3.j(d.b.RIGHT).e());
                            }
                            zA2 = true;
                        }
                        if (iS5 != iS4) {
                            eVar3.w0(iS5);
                            if (z16 && eVar3.m() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.m() + eVar3.j(d.b.BOTTOM).e());
                            }
                            zA2 = true;
                        }
                        zB1 = (!eVar3.P() || iK == eVar3.k()) ? zA2 : true;
                    }
                    i30++;
                    bVar = this;
                    i29 = i22;
                }
                int i32 = i29;
                if (!zB1) {
                    break;
                }
                i29 = i32 + 1;
                c(fVar, "intermediate pass", i29, i27, i21);
                i28 = 2;
                zB1 = false;
                bVar = this;
            }
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            j10 = 0;
        }
        fVar2.z1(iQ1);
        return j10;
    }

    public void e(Q1.f fVar) {
        this.f31553a.clear();
        int size = fVar.f29693K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Q1.e eVar = fVar.f29693K0.get(i10);
            e.b bVarV = eVar.v();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarV == bVar || eVar.K() == bVar) {
                this.f31553a.add(eVar);
            }
        }
        fVar.s1();
    }

    public b(Q1.f fVar) {
        this.f31555c = fVar;
    }

    private void c(Q1.f fVar, String str, int i10, int i11, int i12) {
        int iB = fVar.B();
        int iA = fVar.A();
        fVar.I0(0);
        fVar.H0(0);
        fVar.R0(i11);
        fVar.w0(i12);
        fVar.I0(iB);
        fVar.H0(iA);
        this.f31555c.A1(i10);
        this.f31555c.Z0();
    }
}
