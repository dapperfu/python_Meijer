package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class u7 {

    /* renamed from: a, reason: collision with root package name */
    private w5 f93157a;

    /* renamed from: b, reason: collision with root package name */
    private w5 f93158b;

    public u7(w5 w5Var, w5 w5Var2) {
        this.f93157a = w5Var;
        this.f93158b = w5Var2;
    }

    public w5 a() {
        return this.f93158b;
    }

    public w5 b() {
        return this.f93157a;
    }

    protected String c() {
        try {
            String strB = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"light\":");
            w5 w5Var = this.f93157a;
            sb2.append(w5Var == null ? com.google.maps.android.BuildConfig.TRAVIS : w5Var.b());
            sb2.append(",\"dark\":");
            w5 w5Var2 = this.f93158b;
            if (w5Var2 != null) {
                strB = w5Var2.b();
            }
            sb2.append(strB);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public u7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("light") && !jSONObject.isNull("light")) {
                this.f93157a = new w5(jSONObject.getJSONObject("light"));
            }
            if (!jSONObject.has("dark") || jSONObject.isNull("dark")) {
                return;
            }
            this.f93158b = new w5(jSONObject.getJSONObject("dark"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
