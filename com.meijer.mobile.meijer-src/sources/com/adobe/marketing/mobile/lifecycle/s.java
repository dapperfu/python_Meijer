package com.adobe.marketing.mobile.lifecycle;

import io.constructor.data.local.PreferencesHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f63456a = "XDMLifecycleApplication";

    /* renamed from: b, reason: collision with root package name */
    private t f63457b;

    /* renamed from: c, reason: collision with root package name */
    private String f63458c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f63459d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f63460e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f63461f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f63462g;

    /* renamed from: h, reason: collision with root package name */
    private r f63463h;

    /* renamed from: i, reason: collision with root package name */
    private String f63464i;

    /* renamed from: j, reason: collision with root package name */
    private int f63465j;

    /* renamed from: k, reason: collision with root package name */
    private String f63466k;

    Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = this.f63458c;
        if (str != null) {
            map.put(PreferencesHelper.PREF_ID, str);
        }
        String str2 = this.f63464i;
        if (str2 != null) {
            map.put("name", str2);
        }
        String str3 = this.f63466k;
        if (str3 != null) {
            map.put("version", str3);
        }
        boolean z10 = this.f63459d;
        if (z10) {
            map.put("isClose", Boolean.valueOf(z10));
        }
        boolean z11 = this.f63460e;
        if (z11) {
            map.put("isInstall", Boolean.valueOf(z11));
        }
        boolean z12 = this.f63461f;
        if (z12) {
            map.put("isLaunch", Boolean.valueOf(z12));
        }
        boolean z13 = this.f63462g;
        if (z13) {
            map.put("isUpgrade", Boolean.valueOf(z13));
        }
        t tVar = this.f63457b;
        if (tVar != null) {
            map.put("closeType", tVar.toString());
        }
        int i10 = this.f63465j;
        if (i10 > 0) {
            map.put("sessionLength", Integer.valueOf(i10));
        }
        r rVar = this.f63463h;
        if (rVar != null) {
            map.put("_dc", rVar.b());
        }
        return map;
    }

    void b(t tVar) {
        this.f63457b = tVar;
    }

    void c(String str) {
        this.f63458c = str;
    }

    void d(boolean z10) {
        this.f63459d = z10;
    }

    void e(boolean z10) {
        this.f63460e = z10;
    }

    void f(boolean z10) {
        this.f63461f = z10;
    }

    void g(boolean z10) {
        this.f63462g = z10;
    }

    void h(String str) {
        try {
            this.f63463h = new r(str);
        } catch (IllegalArgumentException unused) {
            R5.t.f("Lifecycle", "XDMLifecycleApplication", "Language tag '%s' failed validation and will be dropped. Values for XDM field 'application._dc.language' must conform to BCP 47.", str);
        }
    }

    void i(String str) {
        this.f63464i = str;
    }

    void j(int i10) {
        this.f63465j = i10;
    }

    void k(String str) {
        this.f63466k = str;
    }

    s() {
    }
}
