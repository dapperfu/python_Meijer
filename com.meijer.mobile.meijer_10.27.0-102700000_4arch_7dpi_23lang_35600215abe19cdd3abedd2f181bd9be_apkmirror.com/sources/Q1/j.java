package Q1;

import Q1.e;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f29679a = new boolean[3];

    static void a(f fVar, M1.d dVar, e eVar) {
        eVar.f29617t = -1;
        eVar.f29619u = -1;
        e.b bVar = fVar.f29577Y[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f29577Y[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f29566N.f29529g;
            int iM = fVar.M() - eVar.f29568P.f29529g;
            d dVar2 = eVar.f29566N;
            dVar2.f29531i = dVar.q(dVar2);
            d dVar3 = eVar.f29568P;
            dVar3.f29531i = dVar.q(dVar3);
            dVar.f(eVar.f29566N.f29531i, i10);
            dVar.f(eVar.f29568P.f29531i, iM);
            eVar.f29617t = 2;
            eVar.z0(i10, iM);
        }
        if (fVar.f29577Y[1] == bVar2 || eVar.f29577Y[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f29567O.f29529g;
        int iS = fVar.s() - eVar.f29569Q.f29529g;
        d dVar4 = eVar.f29567O;
        dVar4.f29531i = dVar.q(dVar4);
        d dVar5 = eVar.f29569Q;
        dVar5.f29531i = dVar.q(dVar5);
        dVar.f(eVar.f29567O.f29531i, i11);
        dVar.f(eVar.f29569Q.f29531i, iS);
        if (eVar.f29600k0 > 0 || eVar.L() == 8) {
            d dVar6 = eVar.f29570R;
            dVar6.f29531i = dVar.q(dVar6);
            dVar.f(eVar.f29570R.f29531i, eVar.f29600k0 + i11);
        }
        eVar.f29619u = 2;
        eVar.M0(i11, iS);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
