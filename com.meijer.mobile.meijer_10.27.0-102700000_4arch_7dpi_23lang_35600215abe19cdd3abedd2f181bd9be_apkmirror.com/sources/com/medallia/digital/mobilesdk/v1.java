package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes7.dex */
class v1<T> implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f93163a;

    /* renamed from: b, reason: collision with root package name */
    private MDEngagementType f93164b;

    /* renamed from: c, reason: collision with root package name */
    private e8<T> f93165c;

    /* renamed from: d, reason: collision with root package name */
    private e8<Boolean> f93166d;

    public v1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("engagementId") && !jSONObject.isNull("engagementId")) {
                this.f93163a = jSONObject.getString("engagementId");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.f93164b = MDEngagementType.fromString(jSONObject.getString("type"));
            }
            if (jSONObject.has("criteria") && !jSONObject.isNull("criteria")) {
                this.f93165c = ModelFactory.getInstance().getTriggerChildContract(jSONObject.getJSONObject("criteria"));
            }
            if (!jSONObject.has("shouldEvaluate") || jSONObject.isNull("shouldEvaluate")) {
                return;
            }
            this.f93166d = ModelFactory.getInstance().getTriggerChildContract(jSONObject.getJSONObject("shouldEvaluate"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected String a() {
        return this.f93163a;
    }

    protected e8<T> b() {
        return this.f93165c;
    }

    protected MDEngagementType c() {
        return this.f93164b;
    }

    protected e8<Boolean> d() {
        return this.f93166d;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"engagementId\":");
            sb2.append(l3.c(this.f93163a));
            sb2.append(",\"type\":");
            MDEngagementType mDEngagementType = this.f93164b;
            sb2.append(l3.c(mDEngagementType != null ? mDEngagementType.toString() : null));
            sb2.append(",\"criteria\":");
            e8<T> e8Var = this.f93165c;
            String jsonString = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(e8Var != null ? e8Var.toJsonString() : com.google.maps.android.BuildConfig.TRAVIS);
            sb2.append(",\"shouldEvaluate\":");
            e8<Boolean> e8Var2 = this.f93166d;
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
