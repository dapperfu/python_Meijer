package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    private u4 f94051a;

    /* renamed from: b, reason: collision with root package name */
    private u4 f94052b;

    /* renamed from: c, reason: collision with root package name */
    private u4 f94053c;

    /* renamed from: d, reason: collision with root package name */
    private u4 f94054d;

    /* renamed from: e, reason: collision with root package name */
    private u4 f94055e;

    /* renamed from: f, reason: collision with root package name */
    private u4 f94056f;

    /* renamed from: g, reason: collision with root package name */
    private u4 f94057g;

    /* renamed from: h, reason: collision with root package name */
    private u4 f94058h;

    w4(u4 u4Var) {
        this.f94051a = u4Var;
        this.f94052b = u4Var;
        this.f94053c = u4Var;
        this.f94054d = u4Var;
        this.f94055e = u4Var;
        this.f94056f = u4Var;
        this.f94057g = u4Var;
        this.f94058h = u4Var;
    }

    protected u4 a() {
        return this.f94051a;
    }

    protected u4 b() {
        return this.f94054d;
    }

    protected u4 c() {
        return this.f94052b;
    }

    public u4 d() {
        return this.f94055e;
    }

    protected u4 e() {
        return this.f94053c;
    }

    protected u4 f() {
        return this.f94058h;
    }

    protected u4 g() {
        return this.f94057g;
    }

    protected u4 h() {
        return this.f94056f;
    }

    protected String i() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"accessTokenRequestConfig\":");
            u4 u4Var = this.f94051a;
            String strB = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(u4Var == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var.b());
            sb2.append(",\"configurationRequestConfig\":");
            u4 u4Var2 = this.f94052b;
            sb2.append(u4Var2 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var2.b());
            sb2.append(",\"feedbackRequestConfig\":");
            u4 u4Var3 = this.f94053c;
            sb2.append(u4Var3 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var3.b());
            sb2.append(",\"analyticsRequestConfig\":");
            u4 u4Var4 = this.f94054d;
            sb2.append(u4Var4 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var4.b());
            sb2.append(",\"resourcesRequestConfig\":");
            u4 u4Var5 = this.f94056f;
            sb2.append(u4Var5 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var5.b());
            sb2.append(",\"ocqRequestConfig\":");
            u4 u4Var6 = this.f94057g;
            sb2.append(u4Var6 == null ? com.google.maps.android.BuildConfig.TRAVIS : u4Var6.b());
            sb2.append(",\"mediaCaptureRequestConfig\":");
            u4 u4Var7 = this.f94058h;
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
                this.f94051a = new u4(jSONObject.getJSONObject("accessTokenRequestConfig"));
            }
            if (jSONObject.has("configurationRequestConfig") && !jSONObject.isNull("configurationRequestConfig")) {
                this.f94052b = new u4(jSONObject.getJSONObject("configurationRequestConfig"));
            }
            if (jSONObject.has("feedbackRequestConfig") && !jSONObject.isNull("feedbackRequestConfig")) {
                this.f94053c = new u4(jSONObject.getJSONObject("feedbackRequestConfig"));
            }
            if (jSONObject.has("analyticsRequestConfig") && !jSONObject.isNull("analyticsRequestConfig")) {
                this.f94054d = new u4(jSONObject.getJSONObject("analyticsRequestConfig"));
            }
            if (jSONObject.has("digitalAnalyticsRequestConfig") && !jSONObject.isNull("digitalAnalyticsRequestConfig")) {
                this.f94055e = new u4(jSONObject.getJSONObject("digitalAnalyticsRequestConfig"));
            }
            if (jSONObject.has("ocqRequestConfig") && !jSONObject.isNull("ocqRequestConfig")) {
                this.f94057g = new u4(jSONObject.getJSONObject("ocqRequestConfig"));
            }
            if (jSONObject.has("mediaCaptureRequestConfig") && !jSONObject.isNull("mediaCaptureRequestConfig")) {
                this.f94058h = new u4(jSONObject.getJSONObject("mediaCaptureRequestConfig"));
            }
            if (!jSONObject.has("resourcesRequestConfig") || jSONObject.isNull("resourcesRequestConfig")) {
                return;
            }
            this.f94056f = new u4(jSONObject.getJSONObject("resourcesRequestConfig"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
