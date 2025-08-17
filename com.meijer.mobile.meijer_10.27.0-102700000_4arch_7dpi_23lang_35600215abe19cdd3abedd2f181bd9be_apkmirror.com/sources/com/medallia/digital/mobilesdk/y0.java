package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class y0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f93539a;

    /* renamed from: b, reason: collision with root package name */
    private String f93540b;

    public y0(String str, String str2) {
        this.f93539a = str;
        this.f93540b = str2;
    }

    public String a() {
        return this.f93539a;
    }

    public String b() {
        return this.f93540b;
    }

    public String c() {
        try {
            return "{\"canvas\":" + l3.c(this.f93539a) + ",\"header\":" + l3.c(this.f93540b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public y0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("canvas") && !jSONObject.isNull("canvas")) {
                this.f93539a = jSONObject.getString("canvas");
            }
            if (!jSONObject.has("header") || jSONObject.isNull("header")) {
                return;
            }
            this.f93540b = jSONObject.getString("header");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
