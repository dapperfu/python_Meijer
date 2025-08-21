package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.CustomParameter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class c1 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f92512a;

    /* renamed from: b, reason: collision with root package name */
    private String f92513b;

    public c1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("name") && !jSONObject.isNull("name")) {
                this.f92512a = jSONObject.getString("name");
            }
            if (!jSONObject.has("type") || jSONObject.isNull("type")) {
                return;
            }
            this.f92513b = jSONObject.getString("type");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    public String a() {
        return this.f92512a;
    }

    public String b() {
        return this.f92513b;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            return "{\"name\":\"" + this.f92512a + "\",\"type\":\"" + this.f92513b + "\"}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public boolean a(CustomParameter customParameter) {
        String strB = b();
        strB.getClass();
        switch (strB) {
            case "Number":
                return customParameter.a() == CustomParameter.CustomParameterType.TypeInteger || customParameter.a() == CustomParameter.CustomParameterType.TypeLong || customParameter.a() == CustomParameter.CustomParameterType.TypeFloat || customParameter.a() == CustomParameter.CustomParameterType.TypeDouble;
            case "Text":
                return customParameter.a() == CustomParameter.CustomParameterType.TypeString;
            case "Boolean":
                return customParameter.a() == CustomParameter.CustomParameterType.TypeBoolean;
            default:
                return false;
        }
    }
}
