package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C11569e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f91857a;

    /* renamed from: b, reason: collision with root package name */
    private String f91858b;

    public C11569e(String str, String str2) {
        this.f91857a = str;
        this.f91858b = str2;
    }

    public String a() {
        return this.f91857a;
    }

    public String b() {
        return this.f91858b;
    }

    public String c() {
        try {
            return "{\"primary\":" + l3.c(this.f91857a) + ",\"auxiliary\":" + l3.c(this.f91858b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public C11569e(JSONObject jSONObject) {
        try {
            if (jSONObject.has("primary") && !jSONObject.isNull("primary")) {
                this.f91857a = jSONObject.getString("primary");
            }
            if (!jSONObject.has("auxiliary") || jSONObject.isNull("auxiliary")) {
                return;
            }
            this.f91858b = jSONObject.getString("auxiliary");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
