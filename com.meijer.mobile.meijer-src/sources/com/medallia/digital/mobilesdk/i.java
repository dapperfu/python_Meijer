package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private y1 f93062a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f93063b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f93064c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f93065d;

    i(JSONObject jSONObject) {
        try {
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData")) {
                this.f93063b = jSONObject.getJSONObject("extraData");
            }
            if (jSONObject.has("eventDynamicStructure") && !jSONObject.isNull("eventDynamicStructure")) {
                this.f93064c = jSONObject.getJSONObject("eventDynamicStructure");
            }
            if (jSONObject.has("events") && !jSONObject.isNull("events")) {
                this.f93062a = new y1(jSONObject.getJSONObject("events"));
            }
            if (!jSONObject.has("externalData") || jSONObject.isNull("externalData")) {
                return;
            }
            this.f93065d = jSONObject.getJSONObject("externalData");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    JSONObject a() {
        return this.f93064c;
    }

    y1 b() {
        return this.f93062a;
    }

    JSONObject c() {
        return this.f93065d;
    }

    JSONObject d() {
        return this.f93063b;
    }

    String e() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"events\":");
            y1 y1Var = this.f93062a;
            String string = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(y1Var == null ? com.google.maps.android.BuildConfig.TRAVIS : y1Var.w0());
            sb2.append(",\"extraData\":");
            JSONObject jSONObject = this.f93063b;
            sb2.append(jSONObject == null ? com.google.maps.android.BuildConfig.TRAVIS : jSONObject.toString());
            sb2.append(",\"externalData\":");
            JSONObject jSONObject2 = this.f93065d;
            sb2.append(jSONObject2 == null ? com.google.maps.android.BuildConfig.TRAVIS : jSONObject2.toString());
            sb2.append(",\"eventDynamicStructure\":");
            JSONObject jSONObject3 = this.f93064c;
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
