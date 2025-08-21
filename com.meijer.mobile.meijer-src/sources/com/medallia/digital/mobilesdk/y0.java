package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class y0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f94378a;

    /* renamed from: b, reason: collision with root package name */
    private String f94379b;

    public y0(String str, String str2) {
        this.f94378a = str;
        this.f94379b = str2;
    }

    public String a() {
        return this.f94378a;
    }

    public String b() {
        return this.f94379b;
    }

    public String c() {
        try {
            return "{\"canvas\":" + l3.c(this.f94378a) + ",\"header\":" + l3.c(this.f94379b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public y0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("canvas") && !jSONObject.isNull("canvas")) {
                this.f94378a = jSONObject.getString("canvas");
            }
            if (!jSONObject.has("header") || jSONObject.isNull("header")) {
                return;
            }
            this.f94379b = jSONObject.getString("header");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
