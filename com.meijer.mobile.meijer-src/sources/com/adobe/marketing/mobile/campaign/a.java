package com.adobe.marketing.mobile.campaign;

import W5.c;
import g6.C14329b;
import java.util.HashMap;

/* loaded from: classes4.dex */
class a extends l {

    /* renamed from: d, reason: collision with root package name */
    private final V5.t f63233d;

    /* renamed from: e, reason: collision with root package name */
    String f63234e;

    /* renamed from: f, reason: collision with root package name */
    String f63235f;

    /* renamed from: g, reason: collision with root package name */
    String f63236g;

    /* renamed from: h, reason: collision with root package name */
    String f63237h;

    /* renamed from: i, reason: collision with root package name */
    String f63238i;

    /* renamed from: com.adobe.marketing.mobile.campaign.a$a, reason: collision with other inner class name */
    class C1247a implements W5.a {
        @Override // V5.q
        public void a(V5.m<V5.b> mVar, V5.p pVar) {
            R5.t.a("Campaign", "AlertMessage", "Error occurred when attempting to display the alert message", new Object[0]);
        }

        @Override // V5.q
        public void h(V5.m<V5.b> mVar) {
        }

        C1247a() {
        }

        @Override // V5.q
        public void b(V5.m<V5.b> mVar) {
            a.this.j();
        }

        @Override // V5.q
        public void e(V5.m<V5.b> mVar) {
            a.this.i();
        }

        @Override // W5.a
        public void g(V5.m<V5.b> mVar) {
            a.this.j();
        }

        @Override // W5.a
        public void j(V5.m<V5.b> mVar) {
            a.this.j();
            if (g6.i.a(a.this.f63236g)) {
                a.this.c();
                return;
            }
            HashMap map = new HashMap();
            map.put("url", a.this.f63236g);
            a.this.d(map);
        }
    }

    @Override // com.adobe.marketing.mobile.campaign.l
    void h() {
        R5.t.a("Campaign", "AlertMessage", "Attempting to show Alert message with ID %s ", this.f63258a);
        C1247a c1247a = new C1247a();
        this.f63233d.a(new V5.b(new c.a().e(this.f63234e).b(this.f63235f).d(this.f63237h).c(this.f63238i).a(), c1247a), new C14329b()).a();
    }
}
