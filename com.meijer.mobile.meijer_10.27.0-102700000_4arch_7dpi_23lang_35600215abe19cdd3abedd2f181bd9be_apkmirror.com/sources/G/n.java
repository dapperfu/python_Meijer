package G;

import R.c;

/* loaded from: classes.dex */
public class n {
    public static R.c a(R.c cVar, R.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        c.a aVarB = c.a.b(cVar);
        if (cVar2.b() != null) {
            aVarB.d(cVar2.b());
        }
        if (cVar2.d() != null) {
            aVarB.f(cVar2.d());
        }
        if (cVar2.c() != null) {
            aVarB.e(cVar2.c());
        }
        if (cVar2.a() != 0) {
            aVarB.c(cVar2.a());
        }
        return aVarB.a();
    }
}
