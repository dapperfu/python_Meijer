package com.adobe.marketing.mobile.audience;

import Q5.InterfaceC5076h;
import Q5.K;
import Q5.t;
import Q5.v;
import com.adobe.marketing.mobile.D;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final v f62367a;

    /* renamed from: b, reason: collision with root package name */
    private String f62368b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f62369c;

    /* renamed from: d, reason: collision with root package name */
    private D f62370d;

    /* renamed from: e, reason: collision with root package name */
    private long f62371e;

    n() {
        this(null);
    }

    void a() {
        i(null);
        j(null);
    }

    n(v vVar) {
        this.f62368b = null;
        this.f62369c = null;
        this.f62370d = a.f62351a;
        if (vVar != null) {
            this.f62367a = vVar;
        } else {
            InterfaceC5076h interfaceC5076hD = K.f().d();
            this.f62367a = interfaceC5076hD != null ? interfaceC5076hD.a("AAMDataStore") : null;
        }
    }

    long b() {
        return this.f62371e;
    }

    D c() {
        return this.f62370d;
    }

    Map<String, Object> d() {
        HashMap map = new HashMap();
        if (c() != D.OPT_OUT) {
            String strE = e();
            if (!f6.i.a(strE)) {
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
        if (f6.i.a(this.f62368b)) {
            v vVar = this.f62367a;
            if (vVar == null) {
                t.f("Audience", "AudienceState", "Unable to retrieve uuid from persistence - persistence could not be accessed.", new Object[0]);
                return this.f62368b;
            }
            this.f62368b = vVar.getString("AAMUserId", this.f62368b);
        }
        return this.f62368b;
    }

    Map<String, String> f() {
        Map<String, String> map = this.f62369c;
        if (map == null || map.isEmpty()) {
            v vVar = this.f62367a;
            if (vVar == null) {
                t.f("Audience", "AudienceState", "Unable to retrieve visitor profile from persistence - persistence could not be accessed.", new Object[0]);
                return this.f62369c;
            }
            if (vVar.contains("AAMUserProfile")) {
                this.f62369c = this.f62367a.a("AAMUserProfile");
            }
        }
        return this.f62369c;
    }

    void g(long j10) {
        if (j10 >= 0) {
            this.f62371e = j10;
        }
    }

    void h(D d10) {
        this.f62370d = d10;
        if (d10 == D.OPT_OUT) {
            a();
        }
    }

    void j(Map<String, String> map) {
        if (map == null || map.isEmpty() || this.f62370d != D.OPT_OUT) {
            this.f62369c = map;
        }
        if (this.f62367a == null) {
            t.f("Audience", "AudienceState", "Unable to update visitor profile in persistence - persistence collection could not be retrieved.", new Object[0]);
            return;
        }
        if (map == null || map.isEmpty()) {
            this.f62367a.remove("AAMUserProfile");
        } else if (this.f62370d != D.OPT_OUT) {
            this.f62367a.e("AAMUserProfile", map);
        }
    }

    void i(String str) {
        if (f6.i.a(str) || this.f62370d != D.OPT_OUT) {
            this.f62368b = str;
        }
        if (this.f62367a == null) {
            t.f("Audience", "AudienceState", "Unable to update uuid in persistence - persistence collection could not be retrieved.", new Object[0]);
        } else if (f6.i.a(str)) {
            this.f62367a.remove("AAMUserId");
        } else if (this.f62370d != D.OPT_OUT) {
            this.f62367a.d("AAMUserId", str);
        }
    }
}
