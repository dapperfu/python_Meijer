package com.adobe.marketing.mobile.campaign;

import V5.c;
import f6.C13846b;
import java.util.HashMap;

/* loaded from: classes4.dex */
class a extends l {

    /* renamed from: d, reason: collision with root package name */
    private final U5.t f62394d;

    /* renamed from: e, reason: collision with root package name */
    String f62395e;

    /* renamed from: f, reason: collision with root package name */
    String f62396f;

    /* renamed from: g, reason: collision with root package name */
    String f62397g;

    /* renamed from: h, reason: collision with root package name */
    String f62398h;

    /* renamed from: i, reason: collision with root package name */
    String f62399i;

    /* renamed from: com.adobe.marketing.mobile.campaign.a$a, reason: collision with other inner class name */
    class C1237a implements V5.a {
        @Override // U5.q
        public void a(U5.m<U5.b> mVar, U5.p pVar) {
            Q5.t.a("Campaign", "AlertMessage", "Error occurred when attempting to display the alert message", new Object[0]);
        }

        @Override // U5.q
        public void b(U5.m<U5.b> mVar) {
        }

        C1237a() {
        }

        @Override // U5.q
        public void c(U5.m<U5.b> mVar) {
            a.this.j();
        }

        @Override // U5.q
        public void f(U5.m<U5.b> mVar) {
            a.this.i();
        }

        @Override // V5.a
        public void h(U5.m<U5.b> mVar) {
            a.this.j();
        }

        @Override // V5.a
        public void j(U5.m<U5.b> mVar) {
            a.this.j();
            if (f6.i.a(a.this.f62397g)) {
                a.this.c();
                return;
            }
            HashMap map = new HashMap();
            map.put("url", a.this.f62397g);
            a.this.d(map);
        }
    }

    @Override // com.adobe.marketing.mobile.campaign.l
    void h() {
        Q5.t.a("Campaign", "AlertMessage", "Attempting to show Alert message with ID %s ", this.f62419a);
        C1237a c1237a = new C1237a();
        this.f62394d.a(new U5.b(new c.a().e(this.f62395e).b(this.f62396f).d(this.f62398h).c(this.f62399i).a(), c1237a), new C13846b()).a();
    }
}
