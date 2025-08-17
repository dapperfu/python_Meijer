package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class b2 {

    /* renamed from: a, reason: collision with root package name */
    private String f91646a;

    /* renamed from: b, reason: collision with root package name */
    private DynamicData f91647b;

    protected b2(JSONObject jSONObject) {
        try {
            if (jSONObject.has("uuid") && !jSONObject.isNull("uuid")) {
                this.f91646a = jSONObject.getString("uuid");
            }
            if (!jSONObject.has("dynamicData") || jSONObject.isNull("dynamicData")) {
                return;
            }
            this.f91647b = new DynamicData(jSONObject.getJSONObject("dynamicData"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected DynamicData a() {
        return this.f91647b;
    }

    protected String b() {
        return this.f91646a;
    }

    protected void a(String str) {
        this.f91646a = str;
    }
}
