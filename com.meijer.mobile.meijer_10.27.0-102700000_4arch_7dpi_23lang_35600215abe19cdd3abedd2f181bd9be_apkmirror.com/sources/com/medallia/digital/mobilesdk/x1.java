package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class x1 {

    /* renamed from: a, reason: collision with root package name */
    private String f93225a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93226b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<String> f93227c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f93228d;

    x1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("eventName") && !jSONObject.isNull("eventName")) {
                this.f93225a = jSONObject.getString("eventName");
            }
            if (jSONObject.has("analyticsEnabled") && !jSONObject.isNull("analyticsEnabled")) {
                this.f93226b = jSONObject.getBoolean("analyticsEnabled");
            }
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData") && (jSONObject.get("extraData") instanceof JSONArray)) {
                this.f93227c = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("extraData"));
            }
            if (!jSONObject.has("isSampling") || jSONObject.isNull("isSampling")) {
                return;
            }
            this.f93228d = jSONObject.getBoolean("isSampling");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    String a() {
        return this.f93225a;
    }

    ArrayList<String> b() {
        return this.f93227c;
    }

    boolean c() {
        return this.f93226b;
    }

    boolean d() {
        return this.f93228d;
    }

    String e() {
        try {
            return "{\"eventName\":" + l3.c(this.f93225a) + ",\"analyticsEnabled\":" + this.f93226b + ",\"extraData\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f93227c) + ",\"isSampling\":" + this.f93228d + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
