package L8;

import i8.C14693B;
import i8.C14695b;
import i8.p;
import i8.r;
import i8.x;
import v8.C17648a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18064a = x.f137411a + "UserActionSupplier";

    public static r a(String str, C17648a c17648a) {
        r rVarV = r.V();
        r rVarT = null;
        if (rVarV != null && rVarV.G() >= 9) {
            if (x.f137412b) {
                z8.f.u(f18064a, "Maximum depth of actions reached (10). Do not attach lifecycle action to user action '" + rVarV.h() + "'");
            }
            rVarV = null;
        }
        if (rVarV != null && rVarV.t()) {
            if (x.f137412b) {
                z8.f.u(f18064a, "Limit of auto user actions is reached: " + p.f137323t);
            }
        } else {
            rVarT = rVarV;
        }
        if (rVarT == null) {
            rVarT = r.T(str, p8.b.d(false, c17648a.b()), C14695b.e().f137219c);
            rVarT.z(c17648a.b() - rVarT.l().i());
            rVarT.w(c17648a.a());
        }
        rVarT.Q();
        rVarT.l().y(C14693B.a());
        return rVarT;
    }
}
