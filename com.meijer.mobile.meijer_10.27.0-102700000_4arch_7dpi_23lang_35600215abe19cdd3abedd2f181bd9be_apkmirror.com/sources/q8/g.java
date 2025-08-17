package q8;

import J8.h;
import g8.l;
import g8.u;
import g8.x;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f156978a = x.f133195a + "StoreActionObserver";

    public void a(A8.a<G8.a> aVar) {
        h hVarG = aVar.g();
        if (hVarG != null && !hVarG.a()) {
            if (u.b()) {
                l.t(new e().a(aVar, hVarG.f(), hVarG.e()));
            }
            J8.f fVarC = aVar.c();
            l.q(fVarC);
            fVarC.J();
            return;
        }
        if (x.f133196b) {
            x8.f.u(f156978a, "Parent action is not available anymore, discard lifecycle action '" + aVar.getName() + "'");
        }
    }
}
