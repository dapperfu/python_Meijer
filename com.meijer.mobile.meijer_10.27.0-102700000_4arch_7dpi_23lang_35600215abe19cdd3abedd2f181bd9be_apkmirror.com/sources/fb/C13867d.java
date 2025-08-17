package fb;

import Ib.h;
import Ib.k;
import android.app.Application;
import android.os.Handler;
import db.C13501a;
import gt.C14310a;
import gt.C14311b;
import nt.C15944b;
import ot.C16176b;
import pt.C16415a;
import pt.C16418d;
import pt.C16419e;
import pt.InterfaceC16417c;
import qb.C16489c;
import r5.C16723a;
import tt.C17137a;
import ut.C17318d;
import xt.C18094b;
import zt.C18575e;

/* renamed from: fb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13867d {
    public static void a(Application application) {
        C13865b.b(application);
        if (C15944b.f152789n == null) {
            C15944b.f152789n = application.getApplicationContext();
        }
        if (C15944b.f152788m == null) {
            C15944b c15944b = new C15944b();
            C15944b.f152788m = c15944b;
            C13865b c13865bA = C13865b.a();
            Ib.e eVar = c13865bA.f130881j;
            Ib.f fVar = c13865bA.f130880i;
            Bb.e eVar2 = c13865bA.f130874c;
            Bb.b bVar = c13865bA.f130876e;
            h hVarA = eVar.a();
            st.b bVar2 = c15944b.f152799j;
            c15944b.f152791b = new C16418d(fVar, new C16415a(C15944b.f152789n), new C16419e(C15944b.f152789n), c13865bA.f130887p, new C18094b(), new k(hVarA), bVar2, new C17137a());
            c15944b.f152792c = new qt.e(new qt.c(C15944b.f152789n));
            Dt.a aVar = new Dt.a(C15944b.f152789n, eVar2, c13865bA.f130867J);
            c15944b.f152801l = aVar;
            aVar.c();
            c15944b.f152793d = new C16176b(c15944b.f152801l);
            C16723a c16723a = new C16723a();
            c15944b.f152794e = c16723a;
            C17318d c17318d = new C17318d(C15944b.f152789n, c15944b.f152797h, c15944b.f152792c, c15944b.f152791b, c15944b.f152793d, c16723a, eVar2, bVar, c13865bA.f130862E, c13865bA.f130867J, c13865bA.f130860C);
            c15944b.f152795f = c17318d;
            c17318d.f163466k.c();
            c17318d.f163476u.c();
            c17318d.f163477v.c();
            c17318d.f163478w.c();
            C17318d c17318d2 = c15944b.f152795f;
            c17318d2.f163474s.b(new zt.h(c15944b.f152792c));
            c15944b.f152795f.f163474s.b(new zt.h(c15944b.f152792c));
            Dt.c cVar = c15944b.f152795f.f163470o;
            if (cVar != null) {
                InterfaceC16417c interfaceC16417c = c15944b.f152791b;
                C18575e c18575e = new C18575e(cVar, c13865bA.f130867J, c13865bA.f130862E);
                if (interfaceC16417c instanceof C16418d) {
                    C16418d c16418d = (C16418d) interfaceC16417c;
                    c16418d.f156638l = c18575e;
                    c18575e.e(c16418d);
                }
                cVar.e(c18575e);
                c15944b.f152790a = c18575e;
                C14310a c14310a = new C14310a(c15944b, c13865bA);
                c15944b.f152796g = c14310a;
                c14310a.f134084a.c();
                C14311b c14311b = new C14311b(c15944b.f152796g, c13865bA.f130894w, eVar2);
                c15944b.f152800k = c14311b;
                if (c14311b.f134092b.v()) {
                    c14311b.b();
                }
            } else {
                throw new IllegalStateException("Current Location must be initialized when LocationBuilder is created");
            }
        }
        C13501a.d(application);
        C13869f.b(application);
        C16489c.d(application);
        if (C13865b.a().f130861D.c()) {
            C13501a c13501aC = C13501a.c();
            Ua.a aVarB = Ua.a.b(C13501a.f127304C, new Handler());
            c13501aC.f127326t = aVarB;
            aVarB.c(c13501aC.f127316j);
            c13501aC.f127326t.c(c13501aC.f127329w);
            c13501aC.f127326t.c(C13501a.c().f127309c);
        }
    }
}
