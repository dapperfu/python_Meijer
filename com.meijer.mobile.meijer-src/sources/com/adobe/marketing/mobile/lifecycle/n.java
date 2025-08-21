package com.adobe.marketing.mobile.lifecycle;

import R5.InterfaceC5123j;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.InterfaceC6543a;
import com.adobe.marketing.mobile.lifecycle.q;
import g6.C14328a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final k f63432a;

    /* renamed from: b, reason: collision with root package name */
    private final q f63433b;

    /* renamed from: c, reason: collision with root package name */
    private final o f63434c;

    /* renamed from: d, reason: collision with root package name */
    private final R5.v f63435d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5123j f63436e;

    /* renamed from: f, reason: collision with root package name */
    private final long f63437f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC6579m f63438g;

    n(R5.v vVar, InterfaceC5123j interfaceC5123j, AbstractC6579m abstractC6579m) {
        this(vVar, interfaceC5123j, null, abstractC6579m);
    }

    private boolean e(long j10, long j11) {
        return j10 <= 0 || j10 > j11;
    }

    n(R5.v vVar, InterfaceC5123j interfaceC5123j, o oVar, AbstractC6579m abstractC6579m) {
        this.f63437f = 1000L;
        this.f63435d = vVar;
        this.f63436e = interfaceC5123j;
        this.f63438g = abstractC6579m;
        this.f63433b = new q();
        this.f63432a = new k(vVar);
        this.f63434c = oVar == null ? new o(interfaceC5123j) : oVar;
    }

    private void c(Map<String, Object> map, C6574h c6574h) {
        if (map == null || map.isEmpty()) {
            R5.t.e("Lifecycle", "LifecycleV2Extension", "Not dispatching application close event as xdm data was null", new Object[0]);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("xdm", map);
        this.f63438g.c(new C6574h.b("Application Close (Background)", "com.adobe.eventType.lifecycle", "com.adobe.eventSource.applicationClose").d(map2).b(c6574h).a());
    }

    private void d(Map<String, Object> map, Map<String, String> map2, C6574h c6574h) {
        if (map == null || map.isEmpty()) {
            R5.t.e("Lifecycle", "LifecycleV2Extension", "Not dispatching application launch event as xdm data was null", new Object[0]);
            return;
        }
        HashMap map3 = new HashMap();
        map3.put("xdm", map);
        if (map2 != null && !map2.isEmpty()) {
            map3.put("data", map2);
        }
        this.f63438g.c(new C6574h.b("Application Launch (Foreground)", "com.adobe.eventType.lifecycle", "com.adobe.eventSource.applicationLaunch").d(map3).b(c6574h).a());
    }

    private boolean f() {
        R5.v vVar = this.f63435d;
        String string = vVar != null ? vVar.getString("v2LastAppVersion", "") : "";
        return (this.f63436e == null || g6.i.a(string) || string.equalsIgnoreCase(h.e(this.f63436e))) ? false : true;
    }

    private void h() {
        InterfaceC5123j interfaceC5123j;
        R5.v vVar = this.f63435d;
        if (vVar == null || (interfaceC5123j = this.f63436e) == null) {
            return;
        }
        vVar.d("v2LastAppVersion", h.e(interfaceC5123j));
    }

    void g(final C6574h c6574h) {
        this.f63433b.e(q.a.PAUSE, new InterfaceC6543a() { // from class: com.adobe.marketing.mobile.lifecycle.l
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                n.b(this.f63427a, c6574h, (Boolean) obj);
            }
        });
    }

    void i(final C6574h c6574h, final boolean z10) {
        this.f63433b.e(q.a.START, new InterfaceC6543a() { // from class: com.adobe.marketing.mobile.lifecycle.m
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                n.a(this.f63429a, z10, c6574h, (Boolean) obj);
            }
        });
    }

    void j(C6574h c6574h) {
        this.f63432a.h(c6574h.u());
    }

    public static /* synthetic */ void a(n nVar, boolean z10, C6574h c6574h, Boolean bool) {
        nVar.getClass();
        if (!bool.booleanValue()) {
            return;
        }
        if (!z10 && nVar.e(nVar.f63432a.b(), nVar.f63432a.a())) {
            nVar.c(nVar.f63434c.a(nVar.f63432a.b(), nVar.f63432a.c(), c6574h.u() - 1000, true), c6574h);
        }
        long jU = c6574h.u();
        nVar.f63432a.g(jU);
        nVar.d(nVar.f63434c.b(jU, z10, nVar.f()), C14328a.q(c6574h.o(), "additionalcontextdata", null), c6574h);
        nVar.h();
    }

    public static /* synthetic */ void b(n nVar, C6574h c6574h, Boolean bool) {
        nVar.getClass();
        if (!bool.booleanValue()) {
            return;
        }
        long jU = c6574h.u();
        nVar.f63432a.f(jU);
        nVar.c(nVar.f63434c.a(nVar.f63432a.b(), jU, jU, false), c6574h);
    }
}
