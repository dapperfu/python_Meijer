package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class i8 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f92246a;

    /* renamed from: b, reason: collision with root package name */
    private String f92247b;

    /* renamed from: c, reason: collision with root package name */
    private C11569e f92248c;

    public i8(String str, String str2, C11569e c11569e) {
        this.f92246a = str;
        this.f92247b = str2;
        this.f92248c = c11569e;
    }

    public String a() {
        C11569e c11569e = this.f92248c;
        if (c11569e == null || c11569e.a() == null) {
            return null;
        }
        return this.f92248c.a();
    }

    public String b() {
        return this.f92247b;
    }

    public String c() {
        return this.f92246a;
    }

    public String d() {
        try {
            String strC = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"headline\":");
            sb2.append(l3.c(this.f92246a));
            sb2.append(",\"header\":");
            sb2.append(l3.c(this.f92247b));
            sb2.append(",\"action\":");
            C11569e c11569e = this.f92248c;
            if (c11569e != null) {
                strC = c11569e.c();
            }
            sb2.append(strC);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public i8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("headline") && !jSONObject.isNull("headline")) {
                this.f92246a = jSONObject.getString("headline");
            }
            if (jSONObject.has("header") && !jSONObject.isNull("header")) {
                this.f92247b = jSONObject.getString("header");
            }
            if (!jSONObject.has("action") || jSONObject.isNull("action")) {
                return;
            }
            this.f92248c = new C11569e(jSONObject.getJSONObject("action"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
