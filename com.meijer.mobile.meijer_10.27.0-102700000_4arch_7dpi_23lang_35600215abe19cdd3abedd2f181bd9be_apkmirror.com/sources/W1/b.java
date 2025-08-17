package W1;

import V1.d;
import V1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<V1.e> f38333a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f38334b = new a();

    /* renamed from: c, reason: collision with root package name */
    private V1.f f38335c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e.b f38336a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f38337b;

        /* renamed from: c, reason: collision with root package name */
        public int f38338c;

        /* renamed from: d, reason: collision with root package name */
        public int f38339d;

        /* renamed from: e, reason: collision with root package name */
        public int f38340e;

        /* renamed from: f, reason: collision with root package name */
        public int f38341f;

        /* renamed from: g, reason: collision with root package name */
        public int f38342g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f38343h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f38344i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f38345j;
    }

    /* renamed from: W1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0823b {
        void a();

        void b(V1.e eVar, a aVar);
    }

    private boolean a(InterfaceC0823b interfaceC0823b, V1.e eVar, boolean z10) {
        this.f38334b.f38336a = eVar.y();
        this.f38334b.f38337b = eVar.M();
        this.f38334b.f38338c = eVar.P();
        this.f38334b.f38339d = eVar.v();
        a aVar = this.f38334b;
        aVar.f38344i = false;
        aVar.f38345j = z10;
        e.b bVar = aVar.f38336a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar == bVar2;
        boolean z12 = aVar.f38337b == bVar2;
        boolean z13 = z11 && eVar.f36614Q > 0.0f;
        boolean z14 = z12 && eVar.f36614Q > 0.0f;
        if (z13 && eVar.f36650n[0] == 4) {
            aVar.f38336a = e.b.FIXED;
        }
        if (z14 && eVar.f36650n[1] == 4) {
            aVar.f38337b = e.b.FIXED;
        }
        interfaceC0823b.b(eVar, aVar);
        eVar.E0(this.f38334b.f38340e);
        eVar.h0(this.f38334b.f38341f);
        eVar.g0(this.f38334b.f38343h);
        eVar.b0(this.f38334b.f38342g);
        a aVar2 = this.f38334b;
        aVar2.f38345j = false;
        return aVar2.f38344i;
    }

    private void b(V1.f fVar) {
        int size = fVar.f36767w0.size();
        InterfaceC0823b interfaceC0823bU0 = fVar.U0();
        for (int i10 = 0; i10 < size; i10++) {
            V1.e eVar = fVar.f36767w0.get(i10);
            if (!(eVar instanceof V1.h) && (!eVar.f36632e.f38396e.f38366j || !eVar.f36634f.f38396e.f38366j)) {
                e.b bVarS = eVar.s(0);
                e.b bVarS2 = eVar.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || eVar.f36646l == 1 || bVarS2 != bVar || eVar.f36648m == 1) {
                    a(interfaceC0823bU0, eVar, false);
                }
            }
        }
        interfaceC0823bU0.a();
    }

    public long d(V1.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zR0;
        int i19;
        long j10;
        boolean z10;
        boolean z11;
        int i20;
        InterfaceC0823b interfaceC0823b;
        boolean z12;
        boolean z13;
        boolean zT0;
        int i21;
        InterfaceC0823b interfaceC0823bU0 = fVar.U0();
        int size = fVar.f36767w0.size();
        int iP = fVar.P();
        int iV = fVar.v();
        boolean zB = V1.k.b(i10, 128);
        boolean z14 = zB || V1.k.b(i10, 64);
        if (z14) {
            for (int i22 = 0; i22 < size; i22++) {
                V1.e eVar = fVar.f36767w0.get(i22);
                e.b bVarY = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z15 = (bVarY == bVar) && (eVar.M() == bVar) && eVar.t() > 0.0f;
                if ((eVar.V() && z15) || ((eVar.X() && z15) || (eVar instanceof V1.l) || eVar.V() || eVar.X())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            boolean z16 = U1.d.f35633r;
        }
        int i23 = 2;
        if (z14 && ((i13 == 1073741824 && i15 == 1073741824) || zB)) {
            int iMin = Math.min(fVar.C(), i14);
            int iMin2 = Math.min(fVar.B(), i16);
            if (i13 == 1073741824 && fVar.P() != iMin) {
                fVar.E0(iMin);
                fVar.X0();
            }
            if (i15 == 1073741824 && fVar.v() != iMin2) {
                fVar.h0(iMin2);
                fVar.X0();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zR0 = fVar.R0(zB);
                i19 = 2;
            } else {
                boolean zS0 = fVar.S0(zB);
                if (i13 == 1073741824) {
                    zT0 = zS0 & fVar.T0(zB, 0);
                    i21 = 1;
                } else {
                    zT0 = zS0;
                    i21 = 0;
                }
                if (i15 == 1073741824) {
                    boolean zT02 = fVar.T0(zB, 1) & zT0;
                    i19 = i21 + 1;
                    zR0 = zT02;
                } else {
                    i19 = i21;
                    zR0 = zT0;
                }
            }
            if (zR0) {
                fVar.I0(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zR0 = false;
            i19 = 0;
        }
        long j11 = 0;
        if (zR0 && i19 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int iV0 = fVar.V0();
        int size2 = this.f38333a.size();
        if (size > 0) {
            c(fVar, "First pass", iP, iV);
        }
        if (size2 > 0) {
            e.b bVarY2 = fVar.y();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z17 = bVarY2 == bVar2;
            boolean z18 = fVar.M() == bVar2;
            int iMax = Math.max(fVar.P(), this.f38335c.E());
            int iMax2 = Math.max(fVar.v(), this.f38335c.D());
            int i24 = 0;
            boolean zA = false;
            while (i24 < size2) {
                long j12 = j11;
                V1.e eVar2 = this.f38333a.get(i24);
                if (eVar2 instanceof V1.l) {
                    int iP2 = eVar2.P();
                    int iV2 = eVar2.v();
                    boolean zA2 = zA | a(interfaceC0823bU0, eVar2, true);
                    z12 = z18;
                    int iP3 = eVar2.P();
                    int iV3 = eVar2.v();
                    if (iP3 != iP2) {
                        eVar2.E0(iP3);
                        if (z17 && eVar2.I() > iMax) {
                            iMax = Math.max(iMax, eVar2.I() + eVar2.m(d.b.RIGHT).c());
                        }
                        z13 = true;
                    } else {
                        z13 = zA2;
                    }
                    if (iV3 != iV2) {
                        eVar2.h0(iV3);
                        if (z12 && eVar2.p() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.p() + eVar2.m(d.b.BOTTOM).c());
                        }
                        z13 = true;
                    }
                    zA = z13 | ((V1.l) eVar2).V0();
                } else {
                    z12 = z18;
                }
                i24++;
                j11 = j12;
                z18 = z12;
                i23 = 2;
            }
            j10 = j11;
            boolean z19 = z18;
            int i25 = 0;
            for (int i26 = i23; i25 < i26; i26 = 2) {
                int i27 = 0;
                while (i27 < size2) {
                    V1.e eVar3 = this.f38333a.get(i27);
                    if (((eVar3 instanceof V1.i) && !(eVar3 instanceof V1.l)) || (eVar3 instanceof V1.h) || eVar3.O() == 8 || ((eVar3.f36632e.f38396e.f38366j && eVar3.f36634f.f38396e.f38366j) || (eVar3 instanceof V1.l))) {
                        i20 = i25;
                        interfaceC0823b = interfaceC0823bU0;
                    } else {
                        int iP4 = eVar3.P();
                        int iV4 = eVar3.v();
                        int iN = eVar3.n();
                        i20 = i25;
                        zA |= a(interfaceC0823bU0, eVar3, true);
                        int iP5 = eVar3.P();
                        interfaceC0823b = interfaceC0823bU0;
                        int iV5 = eVar3.v();
                        if (iP5 != iP4) {
                            eVar3.E0(iP5);
                            if (z17 && eVar3.I() > iMax) {
                                iMax = Math.max(iMax, eVar3.I() + eVar3.m(d.b.RIGHT).c());
                            }
                            zA = true;
                        }
                        if (iV5 != iV4) {
                            eVar3.h0(iV5);
                            if (z19 && eVar3.p() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.p() + eVar3.m(d.b.BOTTOM).c());
                            }
                            zA = true;
                        }
                        if (eVar3.S() && iN != eVar3.n()) {
                            zA = true;
                        }
                    }
                    i27++;
                    interfaceC0823bU0 = interfaceC0823b;
                    i25 = i20;
                }
                int i28 = i25;
                InterfaceC0823b interfaceC0823b2 = interfaceC0823bU0;
                if (zA) {
                    c(fVar, "intermediate pass", iP, iV);
                    zA = false;
                }
                i25 = i28 + 1;
                interfaceC0823bU0 = interfaceC0823b2;
            }
            if (zA) {
                c(fVar, "2nd pass", iP, iV);
                if (fVar.P() < iMax) {
                    fVar.E0(iMax);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (fVar.v() < iMax2) {
                    fVar.h0(iMax2);
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    c(fVar, "3rd pass", iP, iV);
                }
            }
        } else {
            j10 = 0;
        }
        fVar.g1(iV0);
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(V1.f r7) {
        /*
            r6 = this;
            java.util.ArrayList<V1.e> r0 = r6.f38333a
            r0.clear()
            java.util.ArrayList<V1.e> r0 = r7.f36767w0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList<V1.e> r2 = r7.f36767w0
            java.lang.Object r2 = r2.get(r1)
            V1.e r2 = (V1.e) r2
            V1.e$b r3 = r2.y()
            V1.e$b r4 = V1.e.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            V1.e$b r3 = r2.y()
            V1.e$b r5 = V1.e.b.MATCH_PARENT
            if (r3 == r5) goto L32
            V1.e$b r3 = r2.M()
            if (r3 == r4) goto L32
            V1.e$b r3 = r2.M()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList<V1.e> r3 = r6.f38333a
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.X0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.b.e(V1.f):void");
    }

    public b(V1.f fVar) {
        this.f38335c = fVar;
    }

    private void c(V1.f fVar, String str, int i10, int i11) {
        int iE = fVar.E();
        int iD = fVar.D();
        fVar.u0(0);
        fVar.t0(0);
        fVar.E0(i10);
        fVar.h0(i11);
        fVar.u0(iE);
        fVar.t0(iD);
        this.f38335c.K0();
    }
}
