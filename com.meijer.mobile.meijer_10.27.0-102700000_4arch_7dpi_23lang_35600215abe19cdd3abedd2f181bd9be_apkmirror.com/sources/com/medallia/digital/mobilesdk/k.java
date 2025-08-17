package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class k extends b0 {

    /* renamed from: a, reason: collision with root package name */
    private String f92385a;

    /* renamed from: b, reason: collision with root package name */
    private String f92386b;

    /* renamed from: c, reason: collision with root package name */
    private long f92387c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f92388d;

    /* renamed from: e, reason: collision with root package name */
    private Lifetime f92389e;

    /* renamed from: f, reason: collision with root package name */
    private GroupType f92390f;

    k(String str, GroupType groupType, Lifetime lifetime, String str2, long j10, String str3) {
        try {
            this.f92385a = str2;
            this.f92389e = lifetime;
            this.f92390f = groupType;
            this.f92387c = j10;
            this.f92386b = str3;
            this.f92388d = new JSONObject(str);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    String a() {
        return this.f92385a;
    }

    GroupType b() {
        return this.f92390f;
    }

    Lifetime c() {
        return this.f92389e;
    }

    JSONObject d() {
        return this.f92388d;
    }

    String e() {
        return this.f92386b;
    }

    long f() {
        return this.f92387c;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.AnalyticsData;
    }

    public String toJsonString() {
        try {
            return "{\"eventName\":" + l3.c(this.f92385a) + ",\"lifetime\":" + l3.c(this.f92389e.toString()) + ",\"groupType\":" + l3.c(this.f92390f.toString()) + ",\"timestamp\":" + this.f92387c + ",\"sessionId\":" + l3.c(this.f92386b) + ",\"payload\":" + this.f92388d.toString() + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(l8.a(this.f92387c));
        sb2.append("]");
        JSONObject jSONObject = this.f92388d;
        sb2.append(jSONObject != null ? jSONObject.toString() : com.google.maps.android.BuildConfig.TRAVIS);
        return sb2.toString();
    }

    k(String str, JSONObject jSONObject, GroupType groupType, Lifetime lifetime) {
        this.f92386b = d7.b().a(d7.a.SESSION_ID, "");
        this.f92385a = str;
        this.f92387c = System.currentTimeMillis();
        this.f92389e = lifetime;
        this.f92390f = groupType;
        this.f92388d = jSONObject;
    }

    protected void a(String str) {
        this.f92386b = str;
    }

    k(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str, String str2, long j10) {
        try {
            this.f92385a = str;
            this.f92389e = lifetime;
            this.f92390f = groupType;
            this.f92387c = j10;
            this.f92386b = str2;
            this.f92388d = jSONObject;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
