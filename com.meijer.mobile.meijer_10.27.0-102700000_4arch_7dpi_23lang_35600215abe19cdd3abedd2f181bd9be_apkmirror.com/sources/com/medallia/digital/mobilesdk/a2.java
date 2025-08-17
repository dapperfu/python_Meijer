package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class a2 {

    /* renamed from: a, reason: collision with root package name */
    private String f91603a;

    protected a2(String str) {
        this.f91603a = str;
    }

    protected String a() {
        return this.f91603a;
    }

    protected a2(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("feedback") || jSONObject.isNull("feedback")) {
                return;
            }
            this.f91603a = jSONObject.getString("feedback");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(String str) {
        this.f91603a = str;
    }
}
