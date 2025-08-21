package A8;

import i8.C14695b;
import i8.l;
import i8.u;
import i8.x;
import i8.z;
import m8.EnumC15686a;
import z8.f;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f183a = x.f137411a + "SelfMonitoring";

    public static void a(String str, String str2) {
        if (str == null || str.isEmpty() || !u.b()) {
            return;
        }
        C14695b c14695bE = C14695b.e();
        if (c14695bE.f().F() && c14695bE.c().f150767d != EnumC15686a.APP_MON) {
            p8.b bVarE = p8.b.e();
            if (bVarE.p()) {
                return;
            }
            int i10 = c14695bE.f137219c;
            if (x.f137412b) {
                f.u(f183a, "Handle self monitoring event name=\"" + str + "\" payload=\"" + str2 + "\"");
            }
            z zVar = new z(str, str2, bVarE, i10);
            l.k().b();
            l.t(zVar);
            bVarE.a();
        }
    }
}
