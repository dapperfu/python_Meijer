package com.adobe.marketing.mobile.lifecycle;

import io.constructor.data.local.PreferencesHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f62617a = "XDMLifecycleApplication";

    /* renamed from: b, reason: collision with root package name */
    private t f62618b;

    /* renamed from: c, reason: collision with root package name */
    private String f62619c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f62620d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f62621e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f62622f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f62623g;

    /* renamed from: h, reason: collision with root package name */
    private r f62624h;

    /* renamed from: i, reason: collision with root package name */
    private String f62625i;

    /* renamed from: j, reason: collision with root package name */
    private int f62626j;

    /* renamed from: k, reason: collision with root package name */
    private String f62627k;

    Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = this.f62619c;
        if (str != null) {
            map.put(PreferencesHelper.PREF_ID, str);
        }
        String str2 = this.f62625i;
        if (str2 != null) {
            map.put("name", str2);
        }
        String str3 = this.f62627k;
        if (str3 != null) {
            map.put("version", str3);
        }
        boolean z10 = this.f62620d;
        if (z10) {
            map.put("isClose", Boolean.valueOf(z10));
        }
        boolean z11 = this.f62621e;
        if (z11) {
            map.put("isInstall", Boolean.valueOf(z11));
        }
        boolean z12 = this.f62622f;
        if (z12) {
            map.put("isLaunch", Boolean.valueOf(z12));
        }
        boolean z13 = this.f62623g;
        if (z13) {
            map.put("isUpgrade", Boolean.valueOf(z13));
        }
        t tVar = this.f62618b;
        if (tVar != null) {
            map.put("closeType", tVar.toString());
        }
        int i10 = this.f62626j;
        if (i10 > 0) {
            map.put("sessionLength", Integer.valueOf(i10));
        }
        r rVar = this.f62624h;
        if (rVar != null) {
            map.put("_dc", rVar.b());
        }
        return map;
    }

    void b(t tVar) {
        this.f62618b = tVar;
    }

    void c(String str) {
        this.f62619c = str;
    }

    void d(boolean z10) {
        this.f62620d = z10;
    }

    void e(boolean z10) {
        this.f62621e = z10;
    }

    void f(boolean z10) {
        this.f62622f = z10;
    }

    void g(boolean z10) {
        this.f62623g = z10;
    }

    void h(String str) {
        try {
            this.f62624h = new r(str);
        } catch (IllegalArgumentException unused) {
            Q5.t.f("Lifecycle", "XDMLifecycleApplication", "Language tag '%s' failed validation and will be dropped. Values for XDM field 'application._dc.language' must conform to BCP 47.", str);
        }
    }

    void i(String str) {
        this.f62625i = str;
    }

    void j(int i10) {
        this.f62626j = i10;
    }

    void k(String str) {
        this.f62627k = str;
    }

    s() {
    }
}
