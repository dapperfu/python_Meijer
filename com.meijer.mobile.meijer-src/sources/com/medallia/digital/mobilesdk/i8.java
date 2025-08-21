package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class i8 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f93085a;

    /* renamed from: b, reason: collision with root package name */
    private String f93086b;

    /* renamed from: c, reason: collision with root package name */
    private C11694e f93087c;

    public i8(String str, String str2, C11694e c11694e) {
        this.f93085a = str;
        this.f93086b = str2;
        this.f93087c = c11694e;
    }

    public String a() {
        C11694e c11694e = this.f93087c;
        if (c11694e == null || c11694e.a() == null) {
            return null;
        }
        return this.f93087c.a();
    }

    public String b() {
        return this.f93086b;
    }

    public String c() {
        return this.f93085a;
    }

    public String d() {
        try {
            String strC = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"headline\":");
            sb2.append(l3.c(this.f93085a));
            sb2.append(",\"header\":");
            sb2.append(l3.c(this.f93086b));
            sb2.append(",\"action\":");
            C11694e c11694e = this.f93087c;
            if (c11694e != null) {
                strC = c11694e.c();
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
                this.f93085a = jSONObject.getString("headline");
            }
            if (jSONObject.has("header") && !jSONObject.isNull("header")) {
                this.f93086b = jSONObject.getString("header");
            }
            if (!jSONObject.has("action") || jSONObject.isNull("action")) {
                return;
            }
            this.f93087c = new C11694e(jSONObject.getJSONObject("action"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
