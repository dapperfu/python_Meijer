package V1;

import V1.e;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f39613a = new boolean[3];

    static void a(f fVar, U1.d dVar, e eVar) {
        eVar.f39502j = -1;
        eVar.f39504k = -1;
        e.b bVar = fVar.f39470M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f39470M[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f39459B.f39443e;
            int iP = fVar.P() - eVar.f39461D.f39443e;
            d dVar2 = eVar.f39459B;
            dVar2.f39445g = dVar.q(dVar2);
            d dVar3 = eVar.f39461D;
            dVar3.f39445g = dVar.q(dVar3);
            dVar.f(eVar.f39459B.f39445g, i10);
            dVar.f(eVar.f39461D.f39445g, iP);
            eVar.f39502j = 2;
            eVar.k0(i10, iP);
        }
        if (fVar.f39470M[1] == bVar2 || eVar.f39470M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f39460C.f39443e;
        int iV = fVar.v() - eVar.f39462E.f39443e;
        d dVar4 = eVar.f39460C;
        dVar4.f39445g = dVar.q(dVar4);
        d dVar5 = eVar.f39462E;
        dVar5.f39445g = dVar.q(dVar5);
        dVar.f(eVar.f39460C.f39445g, i11);
        dVar.f(eVar.f39462E.f39445g, iV);
        if (eVar.f39482Y > 0 || eVar.O() == 8) {
            d dVar6 = eVar.f39463F;
            dVar6.f39445g = dVar.q(dVar6);
            dVar.f(eVar.f39463F.f39445g, eVar.f39482Y + i11);
        }
        eVar.f39504k = 2;
        eVar.z0(i11, iV);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
