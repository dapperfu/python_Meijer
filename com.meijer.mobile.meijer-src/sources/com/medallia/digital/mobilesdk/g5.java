package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class g5 {

    /* renamed from: a, reason: collision with root package name */
    private String f92936a;

    /* renamed from: b, reason: collision with root package name */
    private String f92937b;

    /* renamed from: c, reason: collision with root package name */
    private String f92938c;

    /* renamed from: d, reason: collision with root package name */
    private String f92939d;

    /* renamed from: e, reason: collision with root package name */
    private int f92940e;

    g5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("componentId") && !jSONObject.isNull("componentId")) {
                this.f92936a = jSONObject.getString("componentId");
            }
            if (jSONObject.has("mediaType") && !jSONObject.isNull("mediaType")) {
                this.f92937b = jSONObject.getString("mediaType");
            }
            if (jSONObject.has("action") && !jSONObject.isNull("action")) {
                this.f92938c = jSONObject.getString("action");
            }
            if (jSONObject.has("ecId") && !jSONObject.isNull("ecId")) {
                this.f92939d = jSONObject.getString("ecId");
            }
            if (!jSONObject.has("maxMediaLength") || jSONObject.isNull("maxMediaLength")) {
                return;
            }
            this.f92940e = jSONObject.getInt("maxMediaLength");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    public String a() {
        return this.f92938c;
    }

    public String b() {
        return this.f92936a;
    }

    public String c() {
        return this.f92939d;
    }

    public String d() {
        String str = this.f92937b;
        if (str != null) {
            return str.toLowerCase();
        }
        return null;
    }

    public int e() {
        return this.f92940e;
    }
}
