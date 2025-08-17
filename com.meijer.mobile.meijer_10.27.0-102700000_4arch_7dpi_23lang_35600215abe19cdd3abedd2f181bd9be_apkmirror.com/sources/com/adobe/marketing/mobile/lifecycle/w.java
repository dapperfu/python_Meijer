package com.adobe.marketing.mobile.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class w {

    /* renamed from: a, reason: collision with root package name */
    private final String f62642a = "XDMLifecycleEnvironment";

    /* renamed from: b, reason: collision with root package name */
    private String f62643b;

    /* renamed from: c, reason: collision with root package name */
    private r f62644c;

    /* renamed from: d, reason: collision with root package name */
    private String f62645d;

    /* renamed from: e, reason: collision with root package name */
    private String f62646e;

    /* renamed from: f, reason: collision with root package name */
    private x f62647f;

    Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = this.f62643b;
        if (str != null) {
            map.put("carrier", str);
        }
        r rVar = this.f62644c;
        if (rVar != null) {
            map.put("_dc", rVar.b());
        }
        String str2 = this.f62645d;
        if (str2 != null) {
            map.put("operatingSystem", str2);
        }
        String str3 = this.f62646e;
        if (str3 != null) {
            map.put("operatingSystemVersion", str3);
        }
        x xVar = this.f62647f;
        if (xVar != null) {
            map.put("type", xVar.toString());
        }
        return map;
    }

    void b(String str) {
        this.f62643b = str;
    }

    void c(String str) {
        try {
            this.f62644c = new r(str);
        } catch (IllegalArgumentException unused) {
            Q5.t.f("Lifecycle", "XDMLifecycleEnvironment", "Language tag '%s' failed validation and will be dropped. Values for XDM field 'environment._dc.language' must conform to BCP 47.", str);
        }
    }

    void d(String str) {
        this.f62645d = str;
    }

    void e(String str) {
        this.f62646e = str;
    }

    void f(x xVar) {
        this.f62647f = xVar;
    }

    w() {
    }
}
