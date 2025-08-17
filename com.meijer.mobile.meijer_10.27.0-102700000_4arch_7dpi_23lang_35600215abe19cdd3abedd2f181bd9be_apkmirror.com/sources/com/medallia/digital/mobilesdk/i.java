package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private y1 f92223a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f92224b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f92225c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f92226d;

    i(JSONObject jSONObject) {
        try {
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData")) {
                this.f92224b = jSONObject.getJSONObject("extraData");
            }
            if (jSONObject.has("eventDynamicStructure") && !jSONObject.isNull("eventDynamicStructure")) {
                this.f92225c = jSONObject.getJSONObject("eventDynamicStructure");
            }
            if (jSONObject.has("events") && !jSONObject.isNull("events")) {
                this.f92223a = new y1(jSONObject.getJSONObject("events"));
            }
            if (!jSONObject.has("externalData") || jSONObject.isNull("externalData")) {
                return;
            }
            this.f92226d = jSONObject.getJSONObject("externalData");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    JSONObject a() {
        return this.f92225c;
    }

    y1 b() {
        return this.f92223a;
    }

    JSONObject c() {
        return this.f92226d;
    }

    JSONObject d() {
        return this.f92224b;
    }

    String e() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"events\":");
            y1 y1Var = this.f92223a;
            String string = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(y1Var == null ? com.google.maps.android.BuildConfig.TRAVIS : y1Var.w0());
            sb2.append(",\"extraData\":");
            JSONObject jSONObject = this.f92224b;
            sb2.append(jSONObject == null ? com.google.maps.android.BuildConfig.TRAVIS : jSONObject.toString());
            sb2.append(",\"externalData\":");
            JSONObject jSONObject2 = this.f92226d;
            sb2.append(jSONObject2 == null ? com.google.maps.android.BuildConfig.TRAVIS : jSONObject2.toString());
            sb2.append(",\"eventDynamicStructure\":");
            JSONObject jSONObject3 = this.f92225c;
            if (jSONObject3 != null) {
                string = jSONObject3.toString();
            }
            sb2.append(string);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
