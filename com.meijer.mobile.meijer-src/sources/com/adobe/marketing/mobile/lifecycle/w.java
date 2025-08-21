package com.adobe.marketing.mobile.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class w {

    /* renamed from: a, reason: collision with root package name */
    private final String f63481a = "XDMLifecycleEnvironment";

    /* renamed from: b, reason: collision with root package name */
    private String f63482b;

    /* renamed from: c, reason: collision with root package name */
    private r f63483c;

    /* renamed from: d, reason: collision with root package name */
    private String f63484d;

    /* renamed from: e, reason: collision with root package name */
    private String f63485e;

    /* renamed from: f, reason: collision with root package name */
    private x f63486f;

    Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = this.f63482b;
        if (str != null) {
            map.put("carrier", str);
        }
        r rVar = this.f63483c;
        if (rVar != null) {
            map.put("_dc", rVar.b());
        }
        String str2 = this.f63484d;
        if (str2 != null) {
            map.put("operatingSystem", str2);
        }
        String str3 = this.f63485e;
        if (str3 != null) {
            map.put("operatingSystemVersion", str3);
        }
        x xVar = this.f63486f;
        if (xVar != null) {
            map.put("type", xVar.toString());
        }
        return map;
    }

    void b(String str) {
        this.f63482b = str;
    }

    void c(String str) {
        try {
            this.f63483c = new r(str);
        } catch (IllegalArgumentException unused) {
            R5.t.f("Lifecycle", "XDMLifecycleEnvironment", "Language tag '%s' failed validation and will be dropped. Values for XDM field 'environment._dc.language' must conform to BCP 47.", str);
        }
    }

    void d(String str) {
        this.f63484d = str;
    }

    void e(String str) {
        this.f63485e = str;
    }

    void f(x xVar) {
        this.f63486f = xVar;
    }

    w() {
    }
}
