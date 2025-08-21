package s8;

import L8.h;
import i8.l;
import i8.u;
import i8.x;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f160093a = x.f137411a + "StoreActionObserver";

    public void a(C8.a<I8.a> aVar) {
        h hVarH = aVar.h();
        if (hVarH != null && !hVarH.a()) {
            if (u.b()) {
                l.t(new e().a(aVar, hVarH.e(), hVarH.d()));
            }
            L8.f fVarE = aVar.e();
            l.q(fVarE);
            fVarE.J();
            return;
        }
        if (x.f137412b) {
            z8.f.u(f160093a, "Parent action is not available anymore, discard lifecycle action '" + aVar.getName() + "'");
        }
    }
}
