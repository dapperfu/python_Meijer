package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class w5 {

    /* renamed from: a, reason: collision with root package name */
    private v5 f94059a;

    public w5(v5 v5Var) {
        this.f94059a = v5Var;
    }

    public v5 a() {
        return this.f94059a;
    }

    public String b() {
        try {
            String strD = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"palette\":");
            v5 v5Var = this.f94059a;
            if (v5Var != null) {
                strD = v5Var.d();
            }
            sb2.append(strD);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public w5(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("palette") || jSONObject.isNull("palette")) {
                return;
            }
            this.f94059a = new v5(jSONObject.getJSONObject("palette"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
