package com.adobe.marketing.mobile.audience;

import R5.InterfaceC5121h;
import R5.K;
import R5.t;
import R5.v;
import com.adobe.marketing.mobile.D;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final v f63206a;

    /* renamed from: b, reason: collision with root package name */
    private String f63207b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f63208c;

    /* renamed from: d, reason: collision with root package name */
    private D f63209d;

    /* renamed from: e, reason: collision with root package name */
    private long f63210e;

    n() {
        this(null);
    }

    void a() {
        i(null);
        j(null);
    }

    n(v vVar) {
        this.f63207b = null;
        this.f63208c = null;
        this.f63209d = a.f63190a;
        if (vVar != null) {
            this.f63206a = vVar;
        } else {
            InterfaceC5121h interfaceC5121hD = K.f().d();
            this.f63206a = interfaceC5121hD != null ? interfaceC5121hD.a("AAMDataStore") : null;
        }
    }

    long b() {
        return this.f63210e;
    }

    D c() {
        return this.f63209d;
    }

    Map<String, Object> d() {
        HashMap map = new HashMap();
        if (c() != D.OPT_OUT) {
            String strE = e();
            if (!g6.i.a(strE)) {
                map.put("uuid", strE);
            }
            Map<String, String> mapF = f();
            if (mapF != null) {
                map.put("aamprofile", mapF);
            }
        }
        return map;
    }

    String e() {
        if (g6.i.a(this.f63207b)) {
            v vVar = this.f63206a;
            if (vVar == null) {
                t.f("Audience", "AudienceState", "Unable to retrieve uuid from persistence - persistence could not be accessed.", new Object[0]);
                return this.f63207b;
            }
            this.f63207b = vVar.getString("AAMUserId", this.f63207b);
        }
        return this.f63207b;
    }

    Map<String, String> f() {
        Map<String, String> map = this.f63208c;
        if (map == null || map.isEmpty()) {
            v vVar = this.f63206a;
            if (vVar == null) {
                t.f("Audience", "AudienceState", "Unable to retrieve visitor profile from persistence - persistence could not be accessed.", new Object[0]);
                return this.f63208c;
            }
            if (vVar.contains("AAMUserProfile")) {
                this.f63208c = this.f63206a.a("AAMUserProfile");
            }
        }
        return this.f63208c;
    }

    void g(long j10) {
        if (j10 >= 0) {
            this.f63210e = j10;
        }
    }

    void h(D d10) {
        this.f63209d = d10;
        if (d10 == D.OPT_OUT) {
            a();
        }
    }

    void j(Map<String, String> map) {
        if (map == null || map.isEmpty() || this.f63209d != D.OPT_OUT) {
            this.f63208c = map;
        }
        if (this.f63206a == null) {
            t.f("Audience", "AudienceState", "Unable to update visitor profile in persistence - persistence collection could not be retrieved.", new Object[0]);
            return;
        }
        if (map == null || map.isEmpty()) {
            this.f63206a.remove("AAMUserProfile");
        } else if (this.f63209d != D.OPT_OUT) {
            this.f63206a.e("AAMUserProfile", map);
        }
    }

    void i(String str) {
        if (g6.i.a(str) || this.f63209d != D.OPT_OUT) {
            this.f63207b = str;
        }
        if (this.f63206a == null) {
            t.f("Audience", "AudienceState", "Unable to update uuid in persistence - persistence collection could not be retrieved.", new Object[0]);
        } else if (g6.i.a(str)) {
            this.f63206a.remove("AAMUserId");
        } else if (this.f63209d != D.OPT_OUT) {
            this.f63206a.d("AAMUserId", str);
        }
    }
}
