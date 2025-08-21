package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.C6574h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6562t implements r {
    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void a() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void b() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void f(int i10) {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void g(C6567y c6567y) {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String c() {
        return "com.adobe.griffon.mobile";
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String d() {
        return "fakeEvent";
    }

    C6562t() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void e(C6555l c6555l) {
        HashMap<String, Object> mapA = c6555l.a();
        if (mapA != null && !mapA.isEmpty()) {
            if (!(mapA.get("eventName") instanceof String)) {
                R5.t.f("Assurance", "AssurancePluginFakeEventGenerator", "Event name is invalid, Ignoring to generate fake event to eventHub", new Object[0]);
                return;
            }
            if (!(mapA.get("eventType") instanceof String)) {
                R5.t.f("Assurance", "AssurancePluginFakeEventGenerator", "Event type is invalid, Ignoring to generate fake event to eventHub", new Object[0]);
                return;
            }
            if (!(mapA.get("eventSource") instanceof String)) {
                R5.t.f("Assurance", "AssurancePluginFakeEventGenerator", "Event source is invalid, Ignoring to generate fake event to eventHub", new Object[0]);
                return;
            }
            Map<String, Object> map = new HashMap<>();
            if (mapA.get("eventData") instanceof Map) {
                map = (Map) mapA.get("eventData");
            }
            com.adobe.marketing.mobile.B.e(new C6574h.b((String) mapA.get("eventName"), (String) mapA.get("eventType"), (String) mapA.get("eventSource")).d(map).a());
            return;
        }
        R5.t.f("Assurance", "AssurancePluginFakeEventGenerator", "empty details obtained, Ignoring to generate fake event to eventHub", new Object[0]);
    }
}
