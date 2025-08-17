package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class p6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private u1.g f92707a;

    /* renamed from: b, reason: collision with root package name */
    private String f92708b;

    protected p6(JSONObject jSONObject) {
        try {
            if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                this.f92708b = jSONObject.getString("value");
            }
            if (!jSONObject.has("ruleConversion") || jSONObject.isNull("ruleConversion")) {
                return;
            }
            this.f92707a = u1.g.a(jSONObject.getString("ruleConversion"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected u1.g a() {
        return this.f92707a;
    }

    protected String b() {
        return this.f92708b;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"value\":");
            sb2.append(l3.c(this.f92708b));
            sb2.append(",\"ruleConversion\":");
            u1.g gVar = this.f92707a;
            sb2.append(l3.c(gVar != null ? gVar.toString() : null));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
