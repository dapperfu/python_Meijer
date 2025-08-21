package Q1;

import Q1.e;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f27692a = new boolean[3];

    static void a(f fVar, M1.d dVar, e eVar) {
        eVar.f27630t = -1;
        eVar.f27632u = -1;
        e.b bVar = fVar.f27590Y[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f27590Y[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f27579N.f27542g;
            int iM = fVar.M() - eVar.f27581P.f27542g;
            d dVar2 = eVar.f27579N;
            dVar2.f27544i = dVar.q(dVar2);
            d dVar3 = eVar.f27581P;
            dVar3.f27544i = dVar.q(dVar3);
            dVar.f(eVar.f27579N.f27544i, i10);
            dVar.f(eVar.f27581P.f27544i, iM);
            eVar.f27630t = 2;
            eVar.z0(i10, iM);
        }
        if (fVar.f27590Y[1] == bVar2 || eVar.f27590Y[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f27580O.f27542g;
        int iS = fVar.s() - eVar.f27582Q.f27542g;
        d dVar4 = eVar.f27580O;
        dVar4.f27544i = dVar.q(dVar4);
        d dVar5 = eVar.f27582Q;
        dVar5.f27544i = dVar.q(dVar5);
        dVar.f(eVar.f27580O.f27544i, i11);
        dVar.f(eVar.f27582Q.f27544i, iS);
        if (eVar.f27613k0 > 0 || eVar.L() == 8) {
            d dVar6 = eVar.f27583R;
            dVar6.f27544i = dVar.q(dVar6);
            dVar.f(eVar.f27583R.f27544i, eVar.f27613k0 + i11);
        }
        eVar.f27632u = 2;
        eVar.M0(i11, iS);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
