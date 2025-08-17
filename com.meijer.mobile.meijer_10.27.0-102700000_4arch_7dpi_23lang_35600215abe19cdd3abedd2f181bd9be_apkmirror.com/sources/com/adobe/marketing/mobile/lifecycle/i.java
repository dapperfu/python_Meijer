package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.F;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.lifecycle.e;
import f6.C13845a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final Q5.v f62582a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6454m f62583b;

    /* renamed from: c, reason: collision with root package name */
    private final f f62584c;

    private void a(long j10, long j11, long j12, C6449h c6449h) {
        HashMap map = new HashMap();
        map.put("lifecyclecontextdata", this.f62584c.c());
        map.put("sessionevent", "start");
        map.put("maxsessionlength", Long.valueOf(a.f62555a));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        map.put("starttimestampmillis", Long.valueOf(timeUnit.toMillis(j10)));
        map.put("previoussessionstarttimestampmillis", Long.valueOf(timeUnit.toMillis(j11)));
        map.put("previoussessionpausetimestampmillis", Long.valueOf(timeUnit.toMillis(j12)));
        this.f62583b.c(new C6449h.b("LifecycleStart", "com.adobe.eventType.lifecycle", "com.adobe.eventSource.responseContent").d(map).b(c6449h).a());
    }

    private String b(C6449h c6449h) {
        H hE = this.f62583b.e("com.adobe.module.identity", c6449h, false, F.ANY);
        if (hE == null || hE.a() != I.SET) {
            return null;
        }
        return C13845a.o(hE.b(), "advertisingidentifier", null);
    }

    private long c(Map<String, Object> map) {
        return C13845a.n(map, "lifecycle.sessionTimeout", 300L);
    }

    private void g(C6449h c6449h, long j10, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("maxsessionlength", Long.valueOf(a.f62555a));
        map2.put("lifecyclecontextdata", map);
        map2.put("starttimestampmillis", Long.valueOf(TimeUnit.SECONDS.toMillis(j10)));
        this.f62583b.b(map2, c6449h);
    }

    void d() {
        g(null, 0L, this.f62584c.b());
    }

    void e(C6449h c6449h) {
        this.f62584c.f(c6449h);
    }

    i(Q5.v vVar, InterfaceC5078j interfaceC5078j, AbstractC6454m abstractC6454m) {
        this.f62582a = vVar;
        this.f62583b = abstractC6454m;
        this.f62584c = new f(vVar, interfaceC5078j);
    }

    void f(C6449h c6449h, Map<String, Object> map, boolean z10) {
        Q5.v vVar;
        long jV = c6449h.v();
        e.a aVarH = this.f62584c.h(jV, C13845a.q(c6449h.o(), "additionalcontextdata", null), b(c6449h), c(map), z10);
        if (aVarH == null && (vVar = this.f62582a) != null) {
            g(c6449h, vVar.getLong("SessionStart", 0L), this.f62584c.c());
            return;
        }
        g(c6449h, jV, this.f62584c.c());
        if (aVarH != null) {
            a(jV, aVarH.b(), aVarH.a(), c6449h);
        }
    }
}
