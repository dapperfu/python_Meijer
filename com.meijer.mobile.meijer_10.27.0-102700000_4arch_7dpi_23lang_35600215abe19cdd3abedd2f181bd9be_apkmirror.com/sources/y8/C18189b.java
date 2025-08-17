package y8;

import g8.C14219b;
import g8.l;
import g8.u;
import g8.x;
import g8.z;
import k8.EnumC15115a;
import x8.f;

/* renamed from: y8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18189b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f170334a = x.f133195a + "SelfMonitoring";

    public static void a(String str, String str2) {
        if (str == null || str.isEmpty() || !u.b()) {
            return;
        }
        C14219b c14219bE = C14219b.e();
        if (c14219bE.f().F() && c14219bE.c().f141621d != EnumC15115a.APP_MON) {
            n8.b bVarE = n8.b.e();
            if (bVarE.p()) {
                return;
            }
            int i10 = c14219bE.f133003c;
            if (x.f133196b) {
                f.u(f170334a, "Handle self monitoring event name=\"" + str + "\" payload=\"" + str2 + "\"");
            }
            z zVar = new z(str, str2, bVarE, i10);
            l.k().b();
            l.t(zVar);
            bVarE.a();
        }
    }
}
