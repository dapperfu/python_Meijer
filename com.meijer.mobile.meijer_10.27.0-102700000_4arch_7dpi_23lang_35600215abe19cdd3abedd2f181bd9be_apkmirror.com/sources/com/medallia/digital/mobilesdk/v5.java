package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class v5 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private y0 f93174a;

    /* renamed from: b, reason: collision with root package name */
    private C11569e f93175b;

    /* renamed from: c, reason: collision with root package name */
    private i8 f93176c;

    public v5(y0 y0Var, C11569e c11569e, i8 i8Var) {
        this.f93174a = y0Var;
        this.f93175b = c11569e;
        this.f93176c = i8Var;
    }

    public C11569e a() {
        return this.f93175b;
    }

    public y0 b() {
        return this.f93174a;
    }

    public i8 c() {
        return this.f93176c;
    }

    protected String d() {
        try {
            String strD = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"core\":");
            y0 y0Var = this.f93174a;
            sb2.append(y0Var == null ? com.google.maps.android.BuildConfig.TRAVIS : y0Var.c());
            sb2.append(",\"action\":");
            C11569e c11569e = this.f93175b;
            sb2.append(c11569e == null ? com.google.maps.android.BuildConfig.TRAVIS : c11569e.c());
            sb2.append(",\"typography\":");
            i8 i8Var = this.f93176c;
            if (i8Var != null) {
                strD = i8Var.d();
            }
            sb2.append(strD);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public v5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("core") && !jSONObject.isNull("core")) {
                this.f93174a = new y0(jSONObject.getJSONObject("core"));
            }
            if (jSONObject.has("action") && !jSONObject.isNull("action")) {
                this.f93175b = new C11569e(jSONObject.getJSONObject("action"));
            }
            if (!jSONObject.has("typography") || jSONObject.isNull("typography")) {
                return;
            }
            this.f93176c = new i8(jSONObject.getJSONObject("typography"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
