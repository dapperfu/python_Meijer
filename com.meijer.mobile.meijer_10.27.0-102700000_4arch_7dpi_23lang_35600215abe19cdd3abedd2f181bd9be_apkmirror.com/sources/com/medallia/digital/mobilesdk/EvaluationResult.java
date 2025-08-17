package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes7.dex */
class EvaluationResult implements x0 {
    private String engagementId;
    private MDEngagementType engagementType;
    private Long nextEvaluationTime;

    protected EvaluationResult(String str, Long l10, MDEngagementType mDEngagementType) {
        this.engagementId = str;
        this.nextEvaluationTime = l10;
        this.engagementType = mDEngagementType;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDEngagementType getEngagementType() {
        return this.engagementType;
    }

    Long getNextEvaluationTime() {
        return this.nextEvaluationTime;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"engagementId\":");
            sb2.append(l3.c(this.engagementId));
            sb2.append(",\"nextEvaluationTime\":");
            sb2.append(this.nextEvaluationTime);
            sb2.append(",\"engagementType\":");
            MDEngagementType mDEngagementType = this.engagementType;
            sb2.append(l3.c(mDEngagementType != null ? mDEngagementType.toString() : null));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected EvaluationResult(JSONObject jSONObject) {
        try {
            if (jSONObject.has("engagementId") && !jSONObject.isNull("engagementId")) {
                this.engagementId = jSONObject.getString("engagementId");
            }
            if (jSONObject.has("nextEvaluationTime") && !jSONObject.isNull("nextEvaluationTime")) {
                this.nextEvaluationTime = Long.valueOf(jSONObject.getLong("nextEvaluationTime"));
            }
            if (!jSONObject.has("engagementType") || jSONObject.isNull("engagementType")) {
                return;
            }
            this.engagementType = MDEngagementType.fromString(jSONObject.getString("engagementType"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
