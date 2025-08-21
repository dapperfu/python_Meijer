package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11694e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f92696a;

    /* renamed from: b, reason: collision with root package name */
    private String f92697b;

    public C11694e(String str, String str2) {
        this.f92696a = str;
        this.f92697b = str2;
    }

    public String a() {
        return this.f92696a;
    }

    public String b() {
        return this.f92697b;
    }

    public String c() {
        try {
            return "{\"primary\":" + l3.c(this.f92696a) + ",\"auxiliary\":" + l3.c(this.f92697b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public C11694e(JSONObject jSONObject) {
        try {
            if (jSONObject.has("primary") && !jSONObject.isNull("primary")) {
                this.f92696a = jSONObject.getString("primary");
            }
            if (!jSONObject.has("auxiliary") || jSONObject.isNull("auxiliary")) {
                return;
            }
            this.f92697b = jSONObject.getString("auxiliary");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
