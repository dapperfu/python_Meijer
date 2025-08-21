package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class v5 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private y0 f94013a;

    /* renamed from: b, reason: collision with root package name */
    private C11694e f94014b;

    /* renamed from: c, reason: collision with root package name */
    private i8 f94015c;

    public v5(y0 y0Var, C11694e c11694e, i8 i8Var) {
        this.f94013a = y0Var;
        this.f94014b = c11694e;
        this.f94015c = i8Var;
    }

    public C11694e a() {
        return this.f94014b;
    }

    public y0 b() {
        return this.f94013a;
    }

    public i8 c() {
        return this.f94015c;
    }

    protected String d() {
        try {
            String strD = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"core\":");
            y0 y0Var = this.f94013a;
            sb2.append(y0Var == null ? com.google.maps.android.BuildConfig.TRAVIS : y0Var.c());
            sb2.append(",\"action\":");
            C11694e c11694e = this.f94014b;
            sb2.append(c11694e == null ? com.google.maps.android.BuildConfig.TRAVIS : c11694e.c());
            sb2.append(",\"typography\":");
            i8 i8Var = this.f94015c;
            if (i8Var != null) {
                strD = i8Var.d();
            }
            sb2.append(strD);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public v5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("core") && !jSONObject.isNull("core")) {
                this.f94013a = new y0(jSONObject.getJSONObject("core"));
            }
            if (jSONObject.has("action") && !jSONObject.isNull("action")) {
                this.f94014b = new C11694e(jSONObject.getJSONObject("action"));
            }
            if (!jSONObject.has("typography") || jSONObject.isNull("typography")) {
                return;
            }
            this.f94015c = new i8(jSONObject.getJSONObject("typography"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
