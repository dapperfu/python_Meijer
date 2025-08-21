package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class t7 {

    /* renamed from: a, reason: collision with root package name */
    private u7 f93899a;

    public t7(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("themeData") || jSONObject.isNull("themeData")) {
                return;
            }
            this.f93899a = new u7(jSONObject.getJSONObject("themeData"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    public u7 a() {
        return this.f93899a;
    }

    protected String b() {
        try {
            String strC = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"themeData\":");
            u7 u7Var = this.f93899a;
            if (u7Var != null) {
                strC = u7Var.c();
            }
            sb2.append(strC);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
