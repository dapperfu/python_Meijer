package hb;

import Kb.h;
import Kb.k;
import android.app.Application;
import android.os.Handler;
import fb.C13974a;
import gt.C14406a;
import gt.C14407b;
import nt.C16020b;
import ot.C16318b;
import pt.C16541a;
import pt.C16544d;
import pt.C16545e;
import pt.InterfaceC16543c;
import s5.C17020a;
import sb.C17037c;
import tt.C17286a;
import ut.C17470d;
import xt.C18222b;
import zt.C18551e;

/* renamed from: hb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14497d {
    public static void a(Application application) {
        C14495b.b(application);
        if (C16020b.f153241n == null) {
            C16020b.f153241n = application.getApplicationContext();
        }
        if (C16020b.f153240m == null) {
            C16020b c16020b = new C16020b();
            C16020b.f153240m = c16020b;
            C14495b c14495bA = C14495b.a();
            Kb.e eVar = c14495bA.f135227j;
            Kb.f fVar = c14495bA.f135226i;
            Db.e eVar2 = c14495bA.f135220c;
            Db.b bVar = c14495bA.f135222e;
            h hVarA = eVar.a();
            st.b bVar2 = c16020b.f153251j;
            c16020b.f153243b = new C16544d(fVar, new C16541a(C16020b.f153241n), new C16545e(C16020b.f153241n), c14495bA.f135233p, new C18222b(), new k(hVarA), bVar2, new C17286a());
            c16020b.f153244c = new qt.e(new qt.c(C16020b.f153241n));
            Dt.a aVar = new Dt.a(C16020b.f153241n, eVar2, c14495bA.f135213J);
            c16020b.f153253l = aVar;
            aVar.c();
            c16020b.f153245d = new C16318b(c16020b.f153253l);
            C17020a c17020a = new C17020a();
            c16020b.f153246e = c17020a;
            C17470d c17470d = new C17470d(C16020b.f153241n, c16020b.f153249h, c16020b.f153244c, c16020b.f153243b, c16020b.f153245d, c17020a, eVar2, bVar, c14495bA.f135208E, c14495bA.f135213J, c14495bA.f135206C);
            c16020b.f153247f = c17470d;
            c17470d.f164544k.c();
            c17470d.f164554u.c();
            c17470d.f164555v.c();
            c17470d.f164556w.c();
            C17470d c17470d2 = c16020b.f153247f;
            c17470d2.f164552s.b(new zt.h(c16020b.f153244c));
            c16020b.f153247f.f164552s.b(new zt.h(c16020b.f153244c));
            Dt.c cVar = c16020b.f153247f.f164548o;
            if (cVar != null) {
                InterfaceC16543c interfaceC16543c = c16020b.f153243b;
                C18551e c18551e = new C18551e(cVar, c14495bA.f135213J, c14495bA.f135208E);
                if (interfaceC16543c instanceof C16544d) {
                    C16544d c16544d = (C16544d) interfaceC16543c;
                    c16544d.f157411l = c18551e;
                    c18551e.e(c16544d);
                }
                cVar.e(c18551e);
                c16020b.f153242a = c18551e;
                C14406a c14406a = new C14406a(c16020b, c14495bA);
                c16020b.f153248g = c14406a;
                c14406a.f134457a.c();
                C14407b c14407b = new C14407b(c16020b.f153248g, c14495bA.f135240w, eVar2);
                c16020b.f153252k = c14407b;
                if (c14407b.f134465b.v()) {
                    c14407b.b();
                }
            } else {
                throw new IllegalStateException("Current Location must be initialized when LocationBuilder is created");
            }
        }
        C13974a.d(application);
        C14499f.b(application);
        C17037c.d(application);
        if (C14495b.a().f135207D.c()) {
            C13974a c13974aC = C13974a.c();
            Wa.a aVarB = Wa.a.b(C13974a.f131633C, new Handler());
            c13974aC.f131655t = aVarB;
            aVarB.c(c13974aC.f131645j);
            c13974aC.f131655t.c(c13974aC.f131658w);
            c13974aC.f131655t.c(C13974a.c().f131638c);
        }
    }
}
