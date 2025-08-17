package com.adobe.marketing.mobile.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private String f62632a;

    /* renamed from: b, reason: collision with root package name */
    private String f62633b;

    /* renamed from: c, reason: collision with root package name */
    private String f62634c;

    /* renamed from: d, reason: collision with root package name */
    private int f62635d;

    /* renamed from: e, reason: collision with root package name */
    private int f62636e;

    /* renamed from: f, reason: collision with root package name */
    private v f62637f;

    Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = this.f62632a;
        if (str != null) {
            map.put("manufacturer", str);
        }
        String str2 = this.f62634c;
        if (str2 != null) {
            map.put("model", str2);
        }
        String str3 = this.f62633b;
        if (str3 != null) {
            map.put("modelNumber", str3);
        }
        int i10 = this.f62635d;
        if (i10 > 0) {
            map.put("screenHeight", Integer.valueOf(i10));
        }
        int i11 = this.f62636e;
        if (i11 > 0) {
            map.put("screenWidth", Integer.valueOf(i11));
        }
        v vVar = this.f62637f;
        if (vVar != null) {
            map.put("type", vVar.toString());
        }
        return map;
    }

    void b(String str) {
        this.f62632a = str;
    }

    void c(String str) {
        this.f62634c = str;
    }

    void d(String str) {
        this.f62633b = str;
    }

    void e(int i10) {
        this.f62635d = i10;
    }

    void f(int i10) {
        this.f62636e = i10;
    }

    void g(v vVar) {
        this.f62637f = vVar;
    }

    u() {
    }
}
