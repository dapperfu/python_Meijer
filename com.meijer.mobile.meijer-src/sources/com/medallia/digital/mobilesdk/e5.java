package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class e5 extends b0 implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final int f92736j = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f92737a;

    /* renamed from: b, reason: collision with root package name */
    private String f92738b;

    /* renamed from: c, reason: collision with root package name */
    private String f92739c;

    /* renamed from: d, reason: collision with root package name */
    private String f92740d;

    /* renamed from: e, reason: collision with root package name */
    private String f92741e;

    /* renamed from: f, reason: collision with root package name */
    private String f92742f;

    /* renamed from: g, reason: collision with root package name */
    private long f92743g;

    /* renamed from: h, reason: collision with root package name */
    private String f92744h;

    /* renamed from: i, reason: collision with root package name */
    private int f92745i;

    e5(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, int i10) {
        this.f92737a = str;
        this.f92738b = str2;
        this.f92739c = str3;
        this.f92740d = str4;
        this.f92741e = str5;
        this.f92742f = str6;
        this.f92743g = j10;
        this.f92744h = str7;
        this.f92745i = i10;
    }

    public String a() {
        return this.f92744h;
    }

    public String b() {
        return this.f92738b;
    }

    public String c() {
        return this.f92741e;
    }

    public String d() {
        return this.f92737a;
    }

    public String e() {
        return this.f92739c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e5 e5Var = (e5) obj;
            String str = this.f92737a;
            if (str == null ? e5Var.f92737a != null : !str.equals(e5Var.f92737a)) {
                return false;
            }
            String str2 = this.f92738b;
            if (str2 == null ? e5Var.f92738b != null : !str2.equals(e5Var.f92738b)) {
                return false;
            }
            String str3 = this.f92739c;
            if (str3 == null ? e5Var.f92739c != null : !str3.equals(e5Var.f92739c)) {
                return false;
            }
            String str4 = this.f92740d;
            if (str4 == null ? e5Var.f92740d != null : !str4.equals(e5Var.f92740d)) {
                return false;
            }
            String str5 = this.f92741e;
            if (str5 == null ? e5Var.f92741e != null : !str5.equals(e5Var.f92741e)) {
                return false;
            }
            String str6 = this.f92742f;
            if (str6 == null ? e5Var.f92742f != null : !str6.equals(e5Var.f92742f)) {
                return false;
            }
            String str7 = this.f92744h;
            if (str7 == null ? e5Var.f92744h != null : !str7.equals(e5Var.f92744h)) {
                return false;
            }
            if (this.f92743g != e5Var.f92743g) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f92742f;
    }

    public int g() {
        return this.f92745i;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.MediaFeedback;
    }

    public String getFormId() {
        return this.f92740d;
    }

    public long h() {
        return this.f92743g;
    }

    public int hashCode() {
        String str = this.f92737a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92736j;
        String str2 = this.f92738b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f92736j;
        String str3 = this.f92739c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f92736j;
        String str4 = this.f92740d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f92736j;
        String str5 = this.f92741e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * f92736j;
        String str6 = this.f92742f;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * f92736j;
        return (int) (((iHashCode6 + (this.f92744h != null ? r2.hashCode() : 0)) * f92736j) + this.f92743g);
    }

    protected void i() {
        this.f92745i++;
    }

    String toJsonString() {
        try {
            return "{\"mediaCaptureClientCorrelationId\":" + l3.c(this.f92737a) + ",\"feedbackClientCorrelationId\":" + l3.c(this.f92738b) + ",\"mediaPath\":" + l3.c(this.f92739c) + ",\"formId\":" + l3.c(this.f92740d) + ",\"formName\":" + l3.c(this.f92741e) + ",\"mediaType\":" + l3.c(this.f92742f) + ",\"ecId\":" + l3.c(this.f92744h) + ",\"timestamp\":" + this.f92743g + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    e5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("mediaCaptureClientCorrelationId") && !jSONObject.isNull("mediaCaptureClientCorrelationId")) {
                this.f92737a = jSONObject.getString("mediaCaptureClientCorrelationId");
            }
            if (jSONObject.has("feedbackClientCorrelationId") && !jSONObject.isNull("feedbackClientCorrelationId")) {
                this.f92738b = jSONObject.getString("feedbackClientCorrelationId");
            }
            if (jSONObject.has("mediaPath") && !jSONObject.isNull("mediaPath")) {
                this.f92739c = jSONObject.getString("mediaPath");
            }
            if (jSONObject.has("mediaType") && !jSONObject.isNull("mediaType")) {
                this.f92742f = jSONObject.getString("mediaType");
            }
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.f92740d = jSONObject.getString("formId");
            }
            if (jSONObject.has("formName") && !jSONObject.isNull("formName")) {
                this.f92741e = jSONObject.getString("formName");
            }
            if (jSONObject.has("numberOfRetries") && !jSONObject.isNull("numberOfRetries")) {
                this.f92745i = jSONObject.getInt("numberOfRetries");
            }
            if (jSONObject.has("ecId") && !jSONObject.isNull("ecId")) {
                this.f92744h = jSONObject.getString("ecId");
            }
            if (!jSONObject.has("timestamp") || jSONObject.isNull("timestamp")) {
                return;
            }
            this.f92743g = jSONObject.getLong("timestamp");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    public void a(String str) {
        this.f92738b = str;
    }

    public void b(String str) {
        this.f92739c = str;
    }
}
