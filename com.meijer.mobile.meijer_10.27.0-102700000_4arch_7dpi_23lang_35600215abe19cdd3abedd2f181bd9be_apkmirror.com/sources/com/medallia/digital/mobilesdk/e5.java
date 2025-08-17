package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class e5 extends b0 implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final int f91897j = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f91898a;

    /* renamed from: b, reason: collision with root package name */
    private String f91899b;

    /* renamed from: c, reason: collision with root package name */
    private String f91900c;

    /* renamed from: d, reason: collision with root package name */
    private String f91901d;

    /* renamed from: e, reason: collision with root package name */
    private String f91902e;

    /* renamed from: f, reason: collision with root package name */
    private String f91903f;

    /* renamed from: g, reason: collision with root package name */
    private long f91904g;

    /* renamed from: h, reason: collision with root package name */
    private String f91905h;

    /* renamed from: i, reason: collision with root package name */
    private int f91906i;

    e5(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, int i10) {
        this.f91898a = str;
        this.f91899b = str2;
        this.f91900c = str3;
        this.f91901d = str4;
        this.f91902e = str5;
        this.f91903f = str6;
        this.f91904g = j10;
        this.f91905h = str7;
        this.f91906i = i10;
    }

    public String a() {
        return this.f91905h;
    }

    public String b() {
        return this.f91899b;
    }

    public String c() {
        return this.f91902e;
    }

    public String d() {
        return this.f91898a;
    }

    public String e() {
        return this.f91900c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e5 e5Var = (e5) obj;
            String str = this.f91898a;
            if (str == null ? e5Var.f91898a != null : !str.equals(e5Var.f91898a)) {
                return false;
            }
            String str2 = this.f91899b;
            if (str2 == null ? e5Var.f91899b != null : !str2.equals(e5Var.f91899b)) {
                return false;
            }
            String str3 = this.f91900c;
            if (str3 == null ? e5Var.f91900c != null : !str3.equals(e5Var.f91900c)) {
                return false;
            }
            String str4 = this.f91901d;
            if (str4 == null ? e5Var.f91901d != null : !str4.equals(e5Var.f91901d)) {
                return false;
            }
            String str5 = this.f91902e;
            if (str5 == null ? e5Var.f91902e != null : !str5.equals(e5Var.f91902e)) {
                return false;
            }
            String str6 = this.f91903f;
            if (str6 == null ? e5Var.f91903f != null : !str6.equals(e5Var.f91903f)) {
                return false;
            }
            String str7 = this.f91905h;
            if (str7 == null ? e5Var.f91905h != null : !str7.equals(e5Var.f91905h)) {
                return false;
            }
            if (this.f91904g != e5Var.f91904g) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f91903f;
    }

    public int g() {
        return this.f91906i;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.MediaFeedback;
    }

    public String getFormId() {
        return this.f91901d;
    }

    public long h() {
        return this.f91904g;
    }

    public int hashCode() {
        String str = this.f91898a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f91897j;
        String str2 = this.f91899b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f91897j;
        String str3 = this.f91900c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f91897j;
        String str4 = this.f91901d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f91897j;
        String str5 = this.f91902e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * f91897j;
        String str6 = this.f91903f;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * f91897j;
        return (int) (((iHashCode6 + (this.f91905h != null ? r2.hashCode() : 0)) * f91897j) + this.f91904g);
    }

    protected void i() {
        this.f91906i++;
    }

    String toJsonString() {
        try {
            return "{\"mediaCaptureClientCorrelationId\":" + l3.c(this.f91898a) + ",\"feedbackClientCorrelationId\":" + l3.c(this.f91899b) + ",\"mediaPath\":" + l3.c(this.f91900c) + ",\"formId\":" + l3.c(this.f91901d) + ",\"formName\":" + l3.c(this.f91902e) + ",\"mediaType\":" + l3.c(this.f91903f) + ",\"ecId\":" + l3.c(this.f91905h) + ",\"timestamp\":" + this.f91904g + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    e5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("mediaCaptureClientCorrelationId") && !jSONObject.isNull("mediaCaptureClientCorrelationId")) {
                this.f91898a = jSONObject.getString("mediaCaptureClientCorrelationId");
            }
            if (jSONObject.has("feedbackClientCorrelationId") && !jSONObject.isNull("feedbackClientCorrelationId")) {
                this.f91899b = jSONObject.getString("feedbackClientCorrelationId");
            }
            if (jSONObject.has("mediaPath") && !jSONObject.isNull("mediaPath")) {
                this.f91900c = jSONObject.getString("mediaPath");
            }
            if (jSONObject.has("mediaType") && !jSONObject.isNull("mediaType")) {
                this.f91903f = jSONObject.getString("mediaType");
            }
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.f91901d = jSONObject.getString("formId");
            }
            if (jSONObject.has("formName") && !jSONObject.isNull("formName")) {
                this.f91902e = jSONObject.getString("formName");
            }
            if (jSONObject.has("numberOfRetries") && !jSONObject.isNull("numberOfRetries")) {
                this.f91906i = jSONObject.getInt("numberOfRetries");
            }
            if (jSONObject.has("ecId") && !jSONObject.isNull("ecId")) {
                this.f91905h = jSONObject.getString("ecId");
            }
            if (!jSONObject.has("timestamp") || jSONObject.isNull("timestamp")) {
                return;
            }
            this.f91904g = jSONObject.getLong("timestamp");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    public void a(String str) {
        this.f91899b = str;
    }

    public void b(String str) {
        this.f91900c = str;
    }
}
