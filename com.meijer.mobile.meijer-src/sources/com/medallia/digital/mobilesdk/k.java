package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class k extends b0 {

    /* renamed from: a, reason: collision with root package name */
    private String f93224a;

    /* renamed from: b, reason: collision with root package name */
    private String f93225b;

    /* renamed from: c, reason: collision with root package name */
    private long f93226c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f93227d;

    /* renamed from: e, reason: collision with root package name */
    private Lifetime f93228e;

    /* renamed from: f, reason: collision with root package name */
    private GroupType f93229f;

    k(String str, GroupType groupType, Lifetime lifetime, String str2, long j10, String str3) {
        try {
            this.f93224a = str2;
            this.f93228e = lifetime;
            this.f93229f = groupType;
            this.f93226c = j10;
            this.f93225b = str3;
            this.f93227d = new JSONObject(str);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    String a() {
        return this.f93224a;
    }

    GroupType b() {
        return this.f93229f;
    }

    Lifetime c() {
        return this.f93228e;
    }

    JSONObject d() {
        return this.f93227d;
    }

    String e() {
        return this.f93225b;
    }

    long f() {
        return this.f93226c;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.AnalyticsData;
    }

    public String toJsonString() {
        try {
            return "{\"eventName\":" + l3.c(this.f93224a) + ",\"lifetime\":" + l3.c(this.f93228e.toString()) + ",\"groupType\":" + l3.c(this.f93229f.toString()) + ",\"timestamp\":" + this.f93226c + ",\"sessionId\":" + l3.c(this.f93225b) + ",\"payload\":" + this.f93227d.toString() + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(l8.a(this.f93226c));
        sb2.append("]");
        JSONObject jSONObject = this.f93227d;
        sb2.append(jSONObject != null ? jSONObject.toString() : com.google.maps.android.BuildConfig.TRAVIS);
        return sb2.toString();
    }

    k(String str, JSONObject jSONObject, GroupType groupType, Lifetime lifetime) {
        this.f93225b = d7.b().a(d7.a.SESSION_ID, "");
        this.f93224a = str;
        this.f93226c = System.currentTimeMillis();
        this.f93228e = lifetime;
        this.f93229f = groupType;
        this.f93227d = jSONObject;
    }

    protected void a(String str) {
        this.f93225b = str;
    }

    k(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str, String str2, long j10) {
        try {
            this.f93224a = str;
            this.f93228e = lifetime;
            this.f93229f = groupType;
            this.f93226c = j10;
            this.f93225b = str2;
            this.f93227d = jSONObject;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
