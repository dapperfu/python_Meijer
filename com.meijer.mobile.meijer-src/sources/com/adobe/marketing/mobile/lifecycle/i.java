package com.adobe.marketing.mobile.lifecycle;

import R5.InterfaceC5123j;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.F;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.lifecycle.e;
import g6.C14328a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final R5.v f63421a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6579m f63422b;

    /* renamed from: c, reason: collision with root package name */
    private final f f63423c;

    private void a(long j10, long j11, long j12, C6574h c6574h) {
        HashMap map = new HashMap();
        map.put("lifecyclecontextdata", this.f63423c.c());
        map.put("sessionevent", "start");
        map.put("maxsessionlength", Long.valueOf(a.f63394a));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        map.put("starttimestampmillis", Long.valueOf(timeUnit.toMillis(j10)));
        map.put("previoussessionstarttimestampmillis", Long.valueOf(timeUnit.toMillis(j11)));
        map.put("previoussessionpausetimestampmillis", Long.valueOf(timeUnit.toMillis(j12)));
        this.f63422b.c(new C6574h.b("LifecycleStart", "com.adobe.eventType.lifecycle", "com.adobe.eventSource.responseContent").d(map).b(c6574h).a());
    }

    private String b(C6574h c6574h) {
        H hE = this.f63422b.e("com.adobe.module.identity", c6574h, false, F.ANY);
        if (hE == null || hE.a() != I.SET) {
            return null;
        }
        return C14328a.o(hE.b(), "advertisingidentifier", null);
    }

    private long c(Map<String, Object> map) {
        return C14328a.n(map, "lifecycle.sessionTimeout", 300L);
    }

    private void g(C6574h c6574h, long j10, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("maxsessionlength", Long.valueOf(a.f63394a));
        map2.put("lifecyclecontextdata", map);
        map2.put("starttimestampmillis", Long.valueOf(TimeUnit.SECONDS.toMillis(j10)));
        this.f63422b.b(map2, c6574h);
    }

    void d() {
        g(null, 0L, this.f63423c.b());
    }

    void e(C6574h c6574h) {
        this.f63423c.f(c6574h);
    }

    i(R5.v vVar, InterfaceC5123j interfaceC5123j, AbstractC6579m abstractC6579m) {
        this.f63421a = vVar;
        this.f63422b = abstractC6579m;
        this.f63423c = new f(vVar, interfaceC5123j);
    }

    void f(C6574h c6574h, Map<String, Object> map, boolean z10) {
        R5.v vVar;
        long jV = c6574h.v();
        e.a aVarH = this.f63423c.h(jV, C14328a.q(c6574h.o(), "additionalcontextdata", null), b(c6574h), c(map), z10);
        if (aVarH == null && (vVar = this.f63421a) != null) {
            g(c6574h, vVar.getLong("SessionStart", 0L), this.f63423c.c());
            return;
        }
        g(c6574h, jV, this.f63423c.c());
        if (aVarH != null) {
            a(jV, aVarH.b(), aVarH.a(), c6574h);
        }
    }
}
