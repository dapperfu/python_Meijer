package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.InterfaceC6418a;
import com.adobe.marketing.mobile.lifecycle.q;
import f6.C13845a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final k f62593a;

    /* renamed from: b, reason: collision with root package name */
    private final q f62594b;

    /* renamed from: c, reason: collision with root package name */
    private final o f62595c;

    /* renamed from: d, reason: collision with root package name */
    private final Q5.v f62596d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5078j f62597e;

    /* renamed from: f, reason: collision with root package name */
    private final long f62598f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC6454m f62599g;

    n(Q5.v vVar, InterfaceC5078j interfaceC5078j, AbstractC6454m abstractC6454m) {
        this(vVar, interfaceC5078j, null, abstractC6454m);
    }

    private boolean e(long j10, long j11) {
        return j10 <= 0 || j10 > j11;
    }

    n(Q5.v vVar, InterfaceC5078j interfaceC5078j, o oVar, AbstractC6454m abstractC6454m) {
        this.f62598f = 1000L;
        this.f62596d = vVar;
        this.f62597e = interfaceC5078j;
        this.f62599g = abstractC6454m;
        this.f62594b = new q();
        this.f62593a = new k(vVar);
        this.f62595c = oVar == null ? new o(interfaceC5078j) : oVar;
    }

    private void c(Map<String, Object> map, C6449h c6449h) {
        if (map == null || map.isEmpty()) {
            Q5.t.e("Lifecycle", "LifecycleV2Extension", "Not dispatching application close event as xdm data was null", new Object[0]);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("xdm", map);
        this.f62599g.c(new C6449h.b("Application Close (Background)", "com.adobe.eventType.lifecycle", "com.adobe.eventSource.applicationClose").d(map2).b(c6449h).a());
    }

    private void d(Map<String, Object> map, Map<String, String> map2, C6449h c6449h) {
        if (map == null || map.isEmpty()) {
            Q5.t.e("Lifecycle", "LifecycleV2Extension", "Not dispatching application launch event as xdm data was null", new Object[0]);
            return;
        }
        HashMap map3 = new HashMap();
        map3.put("xdm", map);
        if (map2 != null && !map2.isEmpty()) {
            map3.put("data", map2);
        }
        this.f62599g.c(new C6449h.b("Application Launch (Foreground)", "com.adobe.eventType.lifecycle", "com.adobe.eventSource.applicationLaunch").d(map3).b(c6449h).a());
    }

    private boolean f() {
        Q5.v vVar = this.f62596d;
        String string = vVar != null ? vVar.getString("v2LastAppVersion", "") : "";
        return (this.f62597e == null || f6.i.a(string) || string.equalsIgnoreCase(h.e(this.f62597e))) ? false : true;
    }

    private void h() {
        InterfaceC5078j interfaceC5078j;
        Q5.v vVar = this.f62596d;
        if (vVar == null || (interfaceC5078j = this.f62597e) == null) {
            return;
        }
        vVar.d("v2LastAppVersion", h.e(interfaceC5078j));
    }

    void g(final C6449h c6449h) {
        this.f62594b.e(q.a.PAUSE, new InterfaceC6418a() { // from class: com.adobe.marketing.mobile.lifecycle.l
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                n.b(this.f62588a, c6449h, (Boolean) obj);
            }
        });
    }

    void i(final C6449h c6449h, final boolean z10) {
        this.f62594b.e(q.a.START, new InterfaceC6418a() { // from class: com.adobe.marketing.mobile.lifecycle.m
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                n.a(this.f62590a, z10, c6449h, (Boolean) obj);
            }
        });
    }

    void j(C6449h c6449h) {
        this.f62593a.h(c6449h.u());
    }

    public static /* synthetic */ void a(n nVar, boolean z10, C6449h c6449h, Boolean bool) {
        nVar.getClass();
        if (!bool.booleanValue()) {
            return;
        }
        if (!z10 && nVar.e(nVar.f62593a.b(), nVar.f62593a.a())) {
            nVar.c(nVar.f62595c.a(nVar.f62593a.b(), nVar.f62593a.c(), c6449h.u() - 1000, true), c6449h);
        }
        long jU = c6449h.u();
        nVar.f62593a.g(jU);
        nVar.d(nVar.f62595c.b(jU, z10, nVar.f()), C13845a.q(c6449h.o(), "additionalcontextdata", null), c6449h);
        nVar.h();
    }

    public static /* synthetic */ void b(n nVar, C6449h c6449h, Boolean bool) {
        nVar.getClass();
        if (!bool.booleanValue()) {
            return;
        }
        long jU = c6449h.u();
        nVar.f62593a.f(jU);
        nVar.c(nVar.f62595c.a(nVar.f62593a.b(), jU, jU, false), c6449h);
    }
}
