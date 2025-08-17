package com.adobe.marketing.mobile.lifecycle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private s f62651a;

    /* renamed from: b, reason: collision with root package name */
    private u f62652b;

    /* renamed from: c, reason: collision with root package name */
    private w f62653c;

    /* renamed from: d, reason: collision with root package name */
    private String f62654d;

    /* renamed from: e, reason: collision with root package name */
    private Date f62655e;

    Map<String, Object> a() {
        Map<String, Object> mapA;
        Map<String, Object> mapA2;
        Map<String, Object> mapA3;
        HashMap map = new HashMap();
        s sVar = this.f62651a;
        if (sVar != null && (mapA3 = sVar.a()) != null && !mapA3.isEmpty()) {
            map.put("application", mapA3);
        }
        u uVar = this.f62652b;
        if (uVar != null && (mapA2 = uVar.a()) != null && !mapA2.isEmpty()) {
            map.put("device", mapA2);
        }
        w wVar = this.f62653c;
        if (wVar != null && (mapA = wVar.a()) != null && !mapA.isEmpty()) {
            map.put("environment", mapA);
        }
        String str = this.f62654d;
        if (str != null) {
            map.put("eventType", str);
        }
        Date date = this.f62655e;
        if (date != null) {
            map.put("timestamp", h.a(date));
        }
        return map;
    }

    void b(s sVar) {
        this.f62651a = sVar;
    }

    void c(u uVar) {
        this.f62652b = uVar;
    }

    void d(w wVar) {
        this.f62653c = wVar;
    }

    void e(String str) {
        this.f62654d = str;
    }

    void f(Date date) {
        this.f62655e = date;
    }

    y() {
    }
}
