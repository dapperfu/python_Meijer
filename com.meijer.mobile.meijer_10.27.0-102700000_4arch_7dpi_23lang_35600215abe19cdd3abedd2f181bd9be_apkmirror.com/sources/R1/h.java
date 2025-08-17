package R1;

import Q1.d;
import Q1.e;
import R1.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f31602a = new b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f31603b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f31604c = 0;

    private static void b(int i10, Q1.e eVar, b.InterfaceC0714b interfaceC0714b, boolean z10) {
        Q1.d dVar;
        Q1.d dVar2;
        boolean z11;
        Q1.d dVar3;
        Q1.d dVar4;
        if (eVar.W()) {
            return;
        }
        boolean z12 = true;
        f31603b++;
        if (!(eVar instanceof Q1.f) && eVar.b0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                Q1.f.v1(i11, eVar, interfaceC0714b, new b.a(), b.a.f31556k);
            }
        }
        Q1.d dVarJ = eVar.j(d.b.LEFT);
        Q1.d dVarJ2 = eVar.j(d.b.RIGHT);
        int iD = dVarJ.d();
        int iD2 = dVarJ2.d();
        if (dVarJ.c() != null && dVarJ.m()) {
            Iterator<Q1.d> it = dVarJ.c().iterator();
            while (it.hasNext()) {
                Q1.d next = it.next();
                Q1.e eVar2 = next.f29526d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.b0() && zA) {
                    z11 = z12;
                    Q1.f.v1(i12, eVar2, interfaceC0714b, new b.a(), b.a.f31556k);
                } else {
                    z11 = z12;
                }
                boolean z13 = ((next == eVar2.f29566N && (dVar4 = eVar2.f29568P.f29528f) != null && dVar4.m()) || (next == eVar2.f29568P && (dVar3 = eVar2.f29566N.f29528f) != null && dVar3.m())) ? z11 : false;
                e.b bVarV = eVar2.v();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarV != bVar || zA) {
                    if (!eVar2.b0()) {
                        Q1.d dVar5 = eVar2.f29566N;
                        if (next == dVar5 && eVar2.f29568P.f29528f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.q0(iE, eVar2.M() + iE);
                            b(i12, eVar2, interfaceC0714b, z10);
                        } else {
                            Q1.d dVar6 = eVar2.f29568P;
                            if (next == dVar6 && dVar5.f29528f == null) {
                                int iE2 = iD - dVar6.e();
                                eVar2.q0(iE2 - eVar2.M(), iE2);
                                b(i12, eVar2, interfaceC0714b, z10);
                            } else if (z13 && !eVar2.Y()) {
                                d(i12, interfaceC0714b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.v() == bVar && eVar2.f29544A >= 0 && eVar2.f29629z >= 0 && ((eVar2.L() == 8 || (eVar2.f29623w == 0 && eVar2.q() == 0.0f)) && !eVar2.Y() && !eVar2.a0() && z13 && !eVar2.Y())) {
                    e(i12, eVar, interfaceC0714b, eVar2, z10);
                }
                z12 = z11;
            }
        }
        boolean z14 = z12;
        if (eVar instanceof Q1.g) {
            return;
        }
        if (dVarJ2.c() != null && dVarJ2.m()) {
            Iterator<Q1.d> it2 = dVarJ2.c().iterator();
            while (it2.hasNext()) {
                Q1.d next2 = it2.next();
                Q1.e eVar3 = next2.f29526d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.b0() && zA2) {
                    Q1.f.v1(i13, eVar3, interfaceC0714b, new b.a(), b.a.f31556k);
                }
                boolean z15 = ((next2 == eVar3.f29566N && (dVar2 = eVar3.f29568P.f29528f) != null && dVar2.m()) || (next2 == eVar3.f29568P && (dVar = eVar3.f29566N.f29528f) != null && dVar.m())) ? z14 : false;
                e.b bVarV2 = eVar3.v();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarV2 != bVar2 || zA2) {
                    if (!eVar3.b0()) {
                        Q1.d dVar7 = eVar3.f29566N;
                        if (next2 == dVar7 && eVar3.f29568P.f29528f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.q0(iE3, eVar3.M() + iE3);
                            b(i13, eVar3, interfaceC0714b, z10);
                        } else {
                            Q1.d dVar8 = eVar3.f29568P;
                            if (next2 == dVar8 && dVar7.f29528f == null) {
                                int iE4 = iD2 - dVar8.e();
                                eVar3.q0(iE4 - eVar3.M(), iE4);
                                b(i13, eVar3, interfaceC0714b, z10);
                            } else if (z15 && !eVar3.Y()) {
                                d(i13, interfaceC0714b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.v() == bVar2 && eVar3.f29544A >= 0 && eVar3.f29629z >= 0 && (eVar3.L() == 8 || (eVar3.f29623w == 0 && eVar3.q() == 0.0f))) {
                    if (!eVar3.Y() && !eVar3.a0() && z15 && !eVar3.Y()) {
                        e(i13, eVar, interfaceC0714b, eVar3, z10);
                    }
                }
            }
        }
        eVar.f0();
    }

    private static void i(int i10, Q1.e eVar, b.InterfaceC0714b interfaceC0714b) {
        Q1.d dVar;
        Q1.d dVar2;
        Q1.d dVar3;
        Q1.d dVar4;
        if (eVar.e0()) {
            return;
        }
        boolean z10 = true;
        f31604c++;
        if (!(eVar instanceof Q1.f) && eVar.b0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                Q1.f.v1(i11, eVar, interfaceC0714b, new b.a(), b.a.f31556k);
            }
        }
        Q1.d dVarJ = eVar.j(d.b.TOP);
        Q1.d dVarJ2 = eVar.j(d.b.BOTTOM);
        int iD = dVarJ.d();
        int iD2 = dVarJ2.d();
        if (dVarJ.c() != null && dVarJ.m()) {
            Iterator<Q1.d> it = dVarJ.c().iterator();
            while (it.hasNext()) {
                Q1.d next = it.next();
                Q1.e eVar2 = next.f29526d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.b0() && zA) {
                    Q1.f.v1(i12, eVar2, interfaceC0714b, new b.a(), b.a.f31556k);
                }
                boolean z11 = ((next == eVar2.f29567O && (dVar4 = eVar2.f29569Q.f29528f) != null && dVar4.m()) || (next == eVar2.f29569Q && (dVar3 = eVar2.f29567O.f29528f) != null && dVar3.m())) ? z10 : false;
                e.b bVarK = eVar2.K();
                boolean z12 = z10;
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarK != bVar || zA) {
                    if (!eVar2.b0()) {
                        Q1.d dVar5 = eVar2.f29567O;
                        if (next == dVar5 && eVar2.f29569Q.f29528f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.t0(iE, eVar2.s() + iE);
                            i(i12, eVar2, interfaceC0714b);
                        } else {
                            Q1.d dVar6 = eVar2.f29569Q;
                            if (next == dVar6 && dVar5.f29528f == null) {
                                int iE2 = iD - dVar6.e();
                                eVar2.t0(iE2 - eVar2.s(), iE2);
                                i(i12, eVar2, interfaceC0714b);
                            } else if (z11 && !eVar2.Z()) {
                                f(i12, interfaceC0714b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.K() == bVar && eVar2.f29550D >= 0 && eVar2.f29548C >= 0 && ((eVar2.L() == 8 || (eVar2.f29625x == 0 && eVar2.q() == 0.0f)) && !eVar2.Z() && !eVar2.a0() && z11 && !eVar2.Z())) {
                    g(i12, eVar, interfaceC0714b, eVar2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (eVar instanceof Q1.g) {
            return;
        }
        if (dVarJ2.c() != null && dVarJ2.m()) {
            Iterator<Q1.d> it2 = dVarJ2.c().iterator();
            while (it2.hasNext()) {
                Q1.d next2 = it2.next();
                Q1.e eVar3 = next2.f29526d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.b0() && zA2) {
                    Q1.f.v1(i13, eVar3, interfaceC0714b, new b.a(), b.a.f31556k);
                }
                boolean z14 = ((next2 == eVar3.f29567O && (dVar2 = eVar3.f29569Q.f29528f) != null && dVar2.m()) || (next2 == eVar3.f29569Q && (dVar = eVar3.f29567O.f29528f) != null && dVar.m())) ? z13 : false;
                e.b bVarK2 = eVar3.K();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarK2 != bVar2 || zA2) {
                    if (!eVar3.b0()) {
                        Q1.d dVar7 = eVar3.f29567O;
                        if (next2 == dVar7 && eVar3.f29569Q.f29528f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.t0(iE3, eVar3.s() + iE3);
                            i(i13, eVar3, interfaceC0714b);
                        } else {
                            Q1.d dVar8 = eVar3.f29569Q;
                            if (next2 == dVar8 && dVar7.f29528f == null) {
                                int iE4 = iD2 - dVar8.e();
                                eVar3.t0(iE4 - eVar3.s(), iE4);
                                i(i13, eVar3, interfaceC0714b);
                            } else if (z14 && !eVar3.Z()) {
                                f(i13, interfaceC0714b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.K() == bVar2 && eVar3.f29550D >= 0 && eVar3.f29548C >= 0 && (eVar3.L() == 8 || (eVar3.f29625x == 0 && eVar3.q() == 0.0f))) {
                    if (!eVar3.Z() && !eVar3.a0() && z14 && !eVar3.Z()) {
                        g(i13, eVar, interfaceC0714b, eVar3);
                    }
                }
            }
        }
        Q1.d dVarJ3 = eVar.j(d.b.BASELINE);
        if (dVarJ3.c() != null && dVarJ3.m()) {
            int iD3 = dVarJ3.d();
            Iterator<Q1.d> it3 = dVarJ3.c().iterator();
            while (it3.hasNext()) {
                Q1.d next3 = it3.next();
                Q1.e eVar4 = next3.f29526d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, eVar4);
                if (eVar4.b0() && zA3) {
                    Q1.f.v1(i14, eVar4, interfaceC0714b, new b.a(), b.a.f31556k);
                }
                if (eVar4.K() != e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.b0() && next3 == eVar4.f29570R) {
                        eVar4.p0(next3.e() + iD3);
                        i(i14, eVar4, interfaceC0714b);
                    }
                }
            }
        }
        eVar.g0();
    }

    private static boolean a(int i10, Q1.e eVar) {
        Q1.f fVar;
        boolean z10;
        boolean z11;
        e.b bVar;
        e.b bVar2;
        e.b bVarV = eVar.v();
        e.b bVarK = eVar.K();
        if (eVar.D() != null) {
            fVar = (Q1.f) eVar.D();
        } else {
            fVar = null;
        }
        if (fVar != null) {
            fVar.v();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.K();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        if (bVarV != bVar5 && !eVar.c0() && bVarV != e.b.WRAP_CONTENT && ((bVarV != (bVar2 = e.b.MATCH_CONSTRAINT) || eVar.f29623w != 0 || eVar.f29584c0 != 0.0f || !eVar.Q(0)) && (bVarV != bVar2 || eVar.f29623w != 1 || !eVar.T(0, eVar.M())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (bVarK != bVar5 && !eVar.d0() && bVarK != e.b.WRAP_CONTENT && ((bVarK != (bVar = e.b.MATCH_CONSTRAINT) || eVar.f29625x != 0 || eVar.f29584c0 != 0.0f || !eVar.Q(1)) && (bVarK != bVar || eVar.f29625x != 1 || !eVar.T(1, eVar.s())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (eVar.f29584c0 > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    private static void c(int i10, Q1.a aVar, b.InterfaceC0714b interfaceC0714b, int i11, boolean z10) {
        if (aVar.a1()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0714b, z10);
            } else {
                i(i10 + 1, aVar, interfaceC0714b);
            }
        }
    }

    private static void d(int i10, b.InterfaceC0714b interfaceC0714b, Q1.e eVar, boolean z10) {
        float f10;
        float fT = eVar.t();
        int iD = eVar.f29566N.f29528f.d();
        int iD2 = eVar.f29568P.f29528f.d();
        int iE = eVar.f29566N.e() + iD;
        int iE2 = iD2 - eVar.f29568P.e();
        if (iD == iD2) {
            fT = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iM = eVar.M();
        int i11 = (iD2 - iD) - iM;
        if (iD > iD2) {
            i11 = (iD - iD2) - iM;
        }
        if (i11 > 0) {
            f10 = (fT * i11) + 0.5f;
        } else {
            f10 = fT * i11;
        }
        int i12 = ((int) f10) + iD;
        int i13 = i12 + iM;
        if (iD > iD2) {
            i13 = i12 - iM;
        }
        eVar.q0(i12, i13);
        b(i10 + 1, eVar, interfaceC0714b, z10);
    }

    private static void e(int i10, Q1.e eVar, b.InterfaceC0714b interfaceC0714b, Q1.e eVar2, boolean z10) {
        int iM;
        float fT = eVar2.t();
        int iD = eVar2.f29566N.f29528f.d() + eVar2.f29566N.e();
        int iD2 = eVar2.f29568P.f29528f.d() - eVar2.f29568P.e();
        if (iD2 >= iD) {
            int iM2 = eVar2.M();
            if (eVar2.L() != 8) {
                int i11 = eVar2.f29623w;
                if (i11 == 2) {
                    if (eVar instanceof Q1.f) {
                        iM = eVar.M();
                    } else {
                        iM = eVar.D().M();
                    }
                    iM2 = (int) (eVar2.t() * 0.5f * iM);
                } else if (i11 == 0) {
                    iM2 = iD2 - iD;
                }
                iM2 = Math.max(eVar2.f29629z, iM2);
                int i12 = eVar2.f29544A;
                if (i12 > 0) {
                    iM2 = Math.min(i12, iM2);
                }
            }
            int i13 = iD + ((int) ((fT * ((iD2 - iD) - iM2)) + 0.5f));
            eVar2.q0(i13, iM2 + i13);
            b(i10 + 1, eVar2, interfaceC0714b, z10);
        }
    }

    private static void f(int i10, b.InterfaceC0714b interfaceC0714b, Q1.e eVar) {
        float f10;
        float fI = eVar.I();
        int iD = eVar.f29567O.f29528f.d();
        int iD2 = eVar.f29569Q.f29528f.d();
        int iE = eVar.f29567O.e() + iD;
        int iE2 = iD2 - eVar.f29569Q.e();
        if (iD == iD2) {
            fI = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iS = eVar.s();
        int i11 = (iD2 - iD) - iS;
        if (iD > iD2) {
            i11 = (iD - iD2) - iS;
        }
        if (i11 > 0) {
            f10 = (fI * i11) + 0.5f;
        } else {
            f10 = fI * i11;
        }
        int i12 = (int) f10;
        int i13 = iD + i12;
        int i14 = i13 + iS;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iS;
        }
        eVar.t0(i13, i14);
        i(i10 + 1, eVar, interfaceC0714b);
    }

    private static void g(int i10, Q1.e eVar, b.InterfaceC0714b interfaceC0714b, Q1.e eVar2) {
        int iS;
        float fI = eVar2.I();
        int iD = eVar2.f29567O.f29528f.d() + eVar2.f29567O.e();
        int iD2 = eVar2.f29569Q.f29528f.d() - eVar2.f29569Q.e();
        if (iD2 >= iD) {
            int iS2 = eVar2.s();
            if (eVar2.L() != 8) {
                int i11 = eVar2.f29625x;
                if (i11 == 2) {
                    if (eVar instanceof Q1.f) {
                        iS = eVar.s();
                    } else {
                        iS = eVar.D().s();
                    }
                    iS2 = (int) (fI * 0.5f * iS);
                } else if (i11 == 0) {
                    iS2 = iD2 - iD;
                }
                iS2 = Math.max(eVar2.f29548C, iS2);
                int i12 = eVar2.f29550D;
                if (i12 > 0) {
                    iS2 = Math.min(i12, iS2);
                }
            }
            int i13 = iD + ((int) ((fI * ((iD2 - iD) - iS2)) + 0.5f));
            eVar2.t0(i13, iS2 + i13);
            i(i10 + 1, eVar2, interfaceC0714b);
        }
    }

    public static void h(Q1.f fVar, b.InterfaceC0714b interfaceC0714b) {
        e.b bVarV = fVar.v();
        e.b bVarK = fVar.K();
        f31603b = 0;
        f31604c = 0;
        fVar.j0();
        ArrayList<Q1.e> arrayListY0 = fVar.Y0();
        int size = arrayListY0.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayListY0.get(i10).j0();
        }
        boolean zT1 = fVar.t1();
        if (bVarV == e.b.FIXED) {
            fVar.q0(0, fVar.M());
        } else {
            fVar.r0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            Q1.e eVar = arrayListY0.get(i11);
            if (eVar instanceof Q1.g) {
                Q1.g gVar = (Q1.g) eVar;
                if (gVar.Y0() == 1) {
                    if (gVar.Z0() != -1) {
                        gVar.c1(gVar.Z0());
                    } else if (gVar.a1() != -1 && fVar.c0()) {
                        gVar.c1(fVar.M() - gVar.a1());
                    } else if (fVar.c0()) {
                        gVar.c1((int) ((gVar.b1() * fVar.M()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof Q1.a) && ((Q1.a) eVar).e1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                Q1.e eVar2 = arrayListY0.get(i12);
                if (eVar2 instanceof Q1.g) {
                    Q1.g gVar2 = (Q1.g) eVar2;
                    if (gVar2.Y0() == 1) {
                        b(0, gVar2, interfaceC0714b, zT1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0714b, zT1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                Q1.e eVar3 = arrayListY0.get(i13);
                if (eVar3 instanceof Q1.a) {
                    Q1.a aVar = (Q1.a) eVar3;
                    if (aVar.e1() == 0) {
                        c(0, aVar, interfaceC0714b, 0, zT1);
                    }
                }
            }
        }
        if (bVarK == e.b.FIXED) {
            fVar.t0(0, fVar.s());
        } else {
            fVar.s0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            Q1.e eVar4 = arrayListY0.get(i14);
            if (eVar4 instanceof Q1.g) {
                Q1.g gVar3 = (Q1.g) eVar4;
                if (gVar3.Y0() == 0) {
                    if (gVar3.Z0() != -1) {
                        gVar3.c1(gVar3.Z0());
                    } else if (gVar3.a1() != -1 && fVar.d0()) {
                        gVar3.c1(fVar.s() - gVar3.a1());
                    } else if (fVar.d0()) {
                        gVar3.c1((int) ((gVar3.b1() * fVar.s()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof Q1.a) && ((Q1.a) eVar4).e1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                Q1.e eVar5 = arrayListY0.get(i15);
                if (eVar5 instanceof Q1.g) {
                    Q1.g gVar4 = (Q1.g) eVar5;
                    if (gVar4.Y0() == 0) {
                        i(1, gVar4, interfaceC0714b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0714b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                Q1.e eVar6 = arrayListY0.get(i16);
                if (eVar6 instanceof Q1.a) {
                    Q1.a aVar2 = (Q1.a) eVar6;
                    if (aVar2.e1() == 1) {
                        c(0, aVar2, interfaceC0714b, 1, zT1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            Q1.e eVar7 = arrayListY0.get(i17);
            if (eVar7.b0() && a(0, eVar7)) {
                Q1.f.v1(0, eVar7, interfaceC0714b, f31602a, b.a.f31556k);
                if (eVar7 instanceof Q1.g) {
                    if (((Q1.g) eVar7).Y0() == 0) {
                        i(0, eVar7, interfaceC0714b);
                    } else {
                        b(0, eVar7, interfaceC0714b, zT1);
                    }
                } else {
                    b(0, eVar7, interfaceC0714b, zT1);
                    i(0, eVar7, interfaceC0714b);
                }
            }
        }
    }
}
