package V1;

import V1.e;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f36753a = new boolean[3];

    static void a(f fVar, U1.d dVar, e eVar) {
        eVar.f36642j = -1;
        eVar.f36644k = -1;
        e.b bVar = fVar.f36610M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f36610M[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f36599B.f36583e;
            int iP = fVar.P() - eVar.f36601D.f36583e;
            d dVar2 = eVar.f36599B;
            dVar2.f36585g = dVar.q(dVar2);
            d dVar3 = eVar.f36601D;
            dVar3.f36585g = dVar.q(dVar3);
            dVar.f(eVar.f36599B.f36585g, i10);
            dVar.f(eVar.f36601D.f36585g, iP);
            eVar.f36642j = 2;
            eVar.k0(i10, iP);
        }
        if (fVar.f36610M[1] == bVar2 || eVar.f36610M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f36600C.f36583e;
        int iV = fVar.v() - eVar.f36602E.f36583e;
        d dVar4 = eVar.f36600C;
        dVar4.f36585g = dVar.q(dVar4);
        d dVar5 = eVar.f36602E;
        dVar5.f36585g = dVar.q(dVar5);
        dVar.f(eVar.f36600C.f36585g, i11);
        dVar.f(eVar.f36602E.f36585g, iV);
        if (eVar.f36622Y > 0 || eVar.O() == 8) {
            d dVar6 = eVar.f36603F;
            dVar6.f36585g = dVar.q(dVar6);
            dVar.f(eVar.f36603F.f36585g, eVar.f36622Y + i11);
        }
        eVar.f36644k = 2;
        eVar.z0(i11, iV);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
