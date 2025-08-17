package J8;

import g8.C14217B;
import g8.C14219b;
import g8.p;
import g8.r;
import g8.x;
import t8.C17073a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14727a = x.f133195a + "UserActionSupplier";

    public static r a(String str, C17073a c17073a) {
        r rVarV = r.V();
        r rVarT = null;
        if (rVarV != null && rVarV.G() >= 9) {
            if (x.f133196b) {
                x8.f.u(f14727a, "Maximum depth of actions reached (10). Do not attach lifecycle action to user action '" + rVarV.h() + "'");
            }
            rVarV = null;
        }
        if (rVarV != null && rVarV.t()) {
            if (x.f133196b) {
                x8.f.u(f14727a, "Limit of auto user actions is reached: " + p.f133107t);
            }
        } else {
            rVarT = rVarV;
        }
        if (rVarT == null) {
            rVarT = r.T(str, n8.b.d(false, c17073a.b()), C14219b.e().f133003c);
            rVarT.z(c17073a.b() - rVarT.l().i());
            rVarT.w(c17073a.a());
        }
        rVarT.Q();
        rVarT.l().y(C14217B.a());
        return rVarT;
    }
}
