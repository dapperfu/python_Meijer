package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    private u4 f93212a;

    /* renamed from: b, reason: collision with root package name */
    private u4 f93213b;

    /* renamed from: c, reason: collision with root package name */
    private u4 f93214c;

    /* renamed from: d, reason: collision with root package name */
    private u4 f93215d;

    /* renamed from: e, reason: collision with root package name */
    private u4 f93216e;

    /* renamed from: f, reason: collision with root package name */
    private u4 f93217f;

    /* renamed from: g, reason: collision with root package name */
    private u4 f93218g;

    /* renamed from: h, reason: collision with root package name */
    private u4 f93219h;

    w4(u4 u4Var) {
        this.f93212a = u4Var;
        this.f93213b = u4Var;
        this.f93214c = u4Var;
        this.f93215d = u4Var;
        this.f93216e = u4Var;
        this.f93217f = u4Var;
        this.f93218g = u4Var;
        this.f93219h = u4Var;
    }

    protected u4 a() {
        return this.f93212a;
    }

    protected u4 b() {
        return this.f93215d;
    }

    protected u4 c() {
        return this.f93213b;
    }

    public u4 d() {
        return this.f93216e;
    }

    protected u4 e() {
        return this.f93214c;
    }

    protected u4 f() {
        return this.f93219h;
    }

    protected u4 g() {
        return this.f93218g;
    }

    protected u4 h() {
        return this.f93217f;
    }

    protected String i() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"accessTokenRequestConfig\":");
            u4 u4Var = this.f93212a;
            String strB = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(u4Var == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var.b());
            sb2.append(",\"configurationRequestConfig\":");
            u4 u4Var2 = this.f93213b;
            sb2.append(u4Var2 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var2.b());
            sb2.append(",\"feedbackRequestConfig\":");
            u4 u4Var3 = this.f93214c;
            sb2.append(u4Var3 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var3.b());
            sb2.append(",\"analyticsRequestConfig\":");
            u4 u4Var4 = this.f93215d;
            sb2.append(u4Var4 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var4.b());
            sb2.append(",\"resourcesRequestConfig\":");
            u4 u4Var5 = this.f93217f;
            sb2.append(u4Var5 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var5.b());
            sb2.append(",\"ocqRequestConfig\":");
            u4 u4Var6 = this.f93218g;
            sb2.append(u4Var6 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var6.b());
            sb2.append(",\"mediaCaptureRequestConfig\":");
            u4 u4Var7 = this.f93219h;
            if (u4Var7 != null) {
                strB = u4Var7.b();
            }
            sb2.append(strB);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    w4(JSONObject jSONObject) {
        try {
            if (jSONObject.has("accessTokenRequestConfig") && !jSONObject.isNull("accessTokenRequestConfig")) {
                this.f93212a = new u4(jSONObject.getJSONObject("accessTokenRequestConfig"));
            }
            if (jSONObject.has("configurationRequestConfig") && !jSONObject.isNull("configurationRequestConfig")) {
                this.f93213b = new u4(jSONObject.getJSONObject("configurationRequestConfig"));
            }
            if (jSONObject.has("feedbackRequestConfig") && !jSONObject.isNull("feedbackRequestConfig")) {
                this.f93214c = new u4(jSONObject.getJSONObject("feedbackRequestConfig"));
            }
            if (jSONObject.has("analyticsRequestConfig") && !jSONObject.isNull("analyticsRequestConfig")) {
                this.f93215d = new u4(jSONObject.getJSONObject("analyticsRequestConfig"));
            }
            if (jSONObject.has("digitalAnalyticsRequestConfig") && !jSONObject.isNull("digitalAnalyticsRequestConfig")) {
                this.f93216e = new u4(jSONObject.getJSONObject("digitalAnalyticsRequestConfig"));
            }
            if (jSONObject.has("ocqRequestConfig") && !jSONObject.isNull("ocqRequestConfig")) {
                this.f93218g = new u4(jSONObject.getJSONObject("ocqRequestConfig"));
            }
            if (jSONObject.has("mediaCaptureRequestConfig") && !jSONObject.isNull("mediaCaptureRequestConfig")) {
                this.f93219h = new u4(jSONObject.getJSONObject("mediaCaptureRequestConfig"));
            }
            if (!jSONObject.has("resourcesRequestConfig") || jSONObject.isNull("resourcesRequestConfig")) {
                return;
            }
            this.f93217f = new u4(jSONObject.getJSONObject("resourcesRequestConfig"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
