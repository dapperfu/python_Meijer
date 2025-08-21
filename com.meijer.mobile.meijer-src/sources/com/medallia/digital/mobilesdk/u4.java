package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class u4 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f93987a;

    u4(int i10) {
        this.f93987a = Integer.valueOf(i10);
    }

    protected Integer a() {
        return this.f93987a;
    }

    protected String b() {
        try {
            return "{\"retryAttempts\":" + this.f93987a + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    u4(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("retriesAttempts") || jSONObject.isNull("retriesAttempts")) {
                return;
            }
            this.f93987a = Integer.valueOf(jSONObject.getInt("retriesAttempts"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
