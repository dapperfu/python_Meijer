package com.adobe.marketing.mobile.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private String f63471a;

    /* renamed from: b, reason: collision with root package name */
    private String f63472b;

    /* renamed from: c, reason: collision with root package name */
    private String f63473c;

    /* renamed from: d, reason: collision with root package name */
    private int f63474d;

    /* renamed from: e, reason: collision with root package name */
    private int f63475e;

    /* renamed from: f, reason: collision with root package name */
    private v f63476f;

    Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = this.f63471a;
        if (str != null) {
            map.put("manufacturer", str);
        }
        String str2 = this.f63473c;
        if (str2 != null) {
            map.put("model", str2);
        }
        String str3 = this.f63472b;
        if (str3 != null) {
            map.put("modelNumber", str3);
        }
        int i10 = this.f63474d;
        if (i10 > 0) {
            map.put("screenHeight", Integer.valueOf(i10));
        }
        int i11 = this.f63475e;
        if (i11 > 0) {
            map.put("screenWidth", Integer.valueOf(i11));
        }
        v vVar = this.f63476f;
        if (vVar != null) {
            map.put("type", vVar.toString());
        }
        return map;
    }

    void b(String str) {
        this.f63471a = str;
    }

    void c(String str) {
        this.f63473c = str;
    }

    void d(String str) {
        this.f63472b = str;
    }

    void e(int i10) {
        this.f63474d = i10;
    }

    void f(int i10) {
        this.f63475e = i10;
    }

    void g(v vVar) {
        this.f63476f = vVar;
    }

    u() {
    }
}
