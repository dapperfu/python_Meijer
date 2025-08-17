package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class h8 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f92220a;

    /* renamed from: b, reason: collision with root package name */
    private u1.k f92221b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<p6> f92222c;

    protected h8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                this.f92220a = jSONObject.getString("value");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.f92221b = u1.k.a(jSONObject.getString("type"));
            }
            if (!jSONObject.has("conversions") || jSONObject.isNull("conversions")) {
                return;
            }
            this.f92222c = ModelFactory.getInstance().getRuleConversionContract(jSONObject.getJSONArray("conversions"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected ArrayList<p6> a() {
        return this.f92222c;
    }

    protected u1.k b() {
        return this.f92221b;
    }

    protected String c() {
        return this.f92220a;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"value\":");
            sb2.append(l3.c(this.f92220a));
            sb2.append(",\"type\":");
            u1.k kVar = this.f92221b;
            sb2.append(l3.c(kVar != null ? kVar.toString() : null));
            sb2.append(",\"conversions\":");
            sb2.append(ModelFactory.getInstance().getRuleConversionsAsJsonString(this.f92222c));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
