package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes8.dex */
class v1<T> implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f94002a;

    /* renamed from: b, reason: collision with root package name */
    private MDEngagementType f94003b;

    /* renamed from: c, reason: collision with root package name */
    private e8<T> f94004c;

    /* renamed from: d, reason: collision with root package name */
    private e8<Boolean> f94005d;

    public v1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("engagementId") && !jSONObject.isNull("engagementId")) {
                this.f94002a = jSONObject.getString("engagementId");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.f94003b = MDEngagementType.fromString(jSONObject.getString("type"));
            }
            if (jSONObject.has("criteria") && !jSONObject.isNull("criteria")) {
                this.f94004c = ModelFactory.getInstance().getTriggerChildContract(jSONObject.getJSONObject("criteria"));
            }
            if (!jSONObject.has("shouldEvaluate") || jSONObject.isNull("shouldEvaluate")) {
                return;
            }
            this.f94005d = ModelFactory.getInstance().getTriggerChildContract(jSONObject.getJSONObject("shouldEvaluate"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected String a() {
        return this.f94002a;
    }

    protected e8<T> b() {
        return this.f94004c;
    }

    protected MDEngagementType c() {
        return this.f94003b;
    }

    protected e8<Boolean> d() {
        return this.f94005d;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"engagementId\":");
            sb2.append(l3.c(this.f94002a));
            sb2.append(",\"type\":");
            MDEngagementType mDEngagementType = this.f94003b;
            sb2.append(l3.c(mDEngagementType != null ? mDEngagementType.toString() : null));
            sb2.append(",\"criteria\":");
            e8<T> e8Var = this.f94004c;
            String jsonString = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(e8Var != null ? e8Var.toJsonString() : com.google.maps.android.BuildConfig.TRAVIS);
            sb2.append(",\"shouldEvaluate\":");
            e8<Boolean> e8Var2 = this.f94005d;
            if (e8Var2 != null) {
                jsonString = e8Var2.toJsonString();
            }
            sb2.append(jsonString);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
