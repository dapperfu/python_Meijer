package R1;

import Q1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i {
    public static o a(Q1.e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int iZ0;
        int i11 = i10 == 0 ? eVar.f27572H0 : eVar.f27574I0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f31622b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof Q1.i) && (iZ0 = ((Q1.i) eVar).Z0(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i13);
                    if (oVar3.c() == iZ0) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof Q1.g) {
                Q1.g gVar = (Q1.g) eVar;
                gVar.X0().b(gVar.Y0() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.f27572H0 = oVar.c();
                eVar.f27579N.b(i10, arrayList, oVar);
                eVar.f27581P.b(i10, arrayList, oVar);
            } else {
                eVar.f27574I0 = oVar.c();
                eVar.f27580O.b(i10, arrayList, oVar);
                eVar.f27583R.b(i10, arrayList, oVar);
                eVar.f27582Q.b(i10, arrayList, oVar);
            }
            eVar.f27586U.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(Q1.f r17, R1.b.InterfaceC0733b r18) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.i.c(Q1.f, R1.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }

    private static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f31622b) {
                return oVar;
            }
        }
        return null;
    }
}
