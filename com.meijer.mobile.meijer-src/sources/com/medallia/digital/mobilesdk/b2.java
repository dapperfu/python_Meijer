package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class b2 {

    /* renamed from: a, reason: collision with root package name */
    private String f92485a;

    /* renamed from: b, reason: collision with root package name */
    private DynamicData f92486b;

    protected b2(JSONObject jSONObject) {
        try {
            if (jSONObject.has("uuid") && !jSONObject.isNull("uuid")) {
                this.f92485a = jSONObject.getString("uuid");
            }
            if (!jSONObject.has("dynamicData") || jSONObject.isNull("dynamicData")) {
                return;
            }
            this.f92486b = new DynamicData(jSONObject.getJSONObject("dynamicData"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected DynamicData a() {
        return this.f92486b;
    }

    protected String b() {
        return this.f92485a;
    }

    protected void a(String str) {
        this.f92485a = str;
    }
}
