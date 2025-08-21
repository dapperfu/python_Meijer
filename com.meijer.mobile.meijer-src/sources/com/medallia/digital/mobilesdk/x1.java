package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class x1 {

    /* renamed from: a, reason: collision with root package name */
    private String f94064a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f94065b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<String> f94066c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f94067d;

    x1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("eventName") && !jSONObject.isNull("eventName")) {
                this.f94064a = jSONObject.getString("eventName");
            }
            if (jSONObject.has("analyticsEnabled") && !jSONObject.isNull("analyticsEnabled")) {
                this.f94065b = jSONObject.getBoolean("analyticsEnabled");
            }
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData") && (jSONObject.get("extraData") instanceof JSONArray)) {
                this.f94066c = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("extraData"));
            }
            if (!jSONObject.has("isSampling") || jSONObject.isNull("isSampling")) {
                return;
            }
            this.f94067d = jSONObject.getBoolean("isSampling");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    String a() {
        return this.f94064a;
    }

    ArrayList<String> b() {
        return this.f94066c;
    }

    boolean c() {
        return this.f94065b;
    }

    boolean d() {
        return this.f94067d;
    }

    String e() {
        try {
            return "{\"eventName\":" + l3.c(this.f94064a) + ",\"analyticsEnabled\":" + this.f94065b + ",\"extraData\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f94066c) + ",\"isSampling\":" + this.f94067d + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
