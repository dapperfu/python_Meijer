package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class h8 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f93059a;

    /* renamed from: b, reason: collision with root package name */
    private u1.k f93060b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<p6> f93061c;

    protected h8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                this.f93059a = jSONObject.getString("value");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.f93060b = u1.k.a(jSONObject.getString("type"));
            }
            if (!jSONObject.has("conversions") || jSONObject.isNull("conversions")) {
                return;
            }
            this.f93061c = ModelFactory.getInstance().getRuleConversionContract(jSONObject.getJSONArray("conversions"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected ArrayList<p6> a() {
        return this.f93061c;
    }

    protected u1.k b() {
        return this.f93060b;
    }

    protected String c() {
        return this.f93059a;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"value\":");
            sb2.append(l3.c(this.f93059a));
            sb2.append(",\"type\":");
            u1.k kVar = this.f93060b;
            sb2.append(l3.c(kVar != null ? kVar.toString() : null));
            sb2.append(",\"conversions\":");
            sb2.append(ModelFactory.getInstance().getRuleConversionsAsJsonString(this.f93061c));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
