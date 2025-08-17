package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C11572h {

    /* renamed from: a, reason: collision with root package name */
    private String f92114a;

    /* renamed from: b, reason: collision with root package name */
    private String f92115b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f92116c;

    C11572h(JSONObject jSONObject) {
        try {
            if (jSONObject.has("url") && !jSONObject.isNull("url")) {
                this.f92114a = jSONObject.getString("url");
            }
            if (jSONObject.has("requestType") && !jSONObject.isNull("requestType")) {
                this.f92115b = jSONObject.getString("requestType");
            }
            if (!jSONObject.has("headers") || jSONObject.isNull("headers")) {
                return;
            }
            this.f92116c = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject("headers"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    HashMap<String, String> a() {
        return this.f92116c;
    }

    String b() {
        return this.f92115b;
    }

    String c() {
        return this.f92114a;
    }

    String d() {
        try {
            return "{\"url\":" + l3.c(this.f92114a) + ",\"requestType\":" + l3.c(this.f92115b) + ",\"headers\":" + ModelFactory.getInstance().getStringMapAsJsonString(this.f92116c) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
