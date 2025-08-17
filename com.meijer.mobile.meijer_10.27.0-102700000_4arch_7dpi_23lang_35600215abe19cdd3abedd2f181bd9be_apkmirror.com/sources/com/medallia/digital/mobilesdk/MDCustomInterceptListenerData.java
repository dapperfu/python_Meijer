package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
public class MDCustomInterceptListenerData {
    private MDCustomInterceptPayload customInterceptPayload;
    private String engagementId;
    private MDEngagementType engagementType;
    private long formPreloadTimestamp;
    private long targetingEvaluationTimestamp;

    protected MDCustomInterceptListenerData(long j10, long j11, String str, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
        updateParams(j10, j11, str, mDEngagementType, mDCustomInterceptPayload);
    }

    private void updateParams(long j10, long j11, String str, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
        this.formPreloadTimestamp = j10;
        this.targetingEvaluationTimestamp = j11;
        this.engagementId = str;
        this.engagementType = mDEngagementType;
        this.customInterceptPayload = mDCustomInterceptPayload;
    }

    public MDCustomInterceptPayload getCustomInterceptPayload() {
        return this.customInterceptPayload;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDEngagementType getEngagementType() {
        return this.engagementType;
    }

    public long getFormPreloadTimestamp() {
        return this.formPreloadTimestamp;
    }

    public long getTargetingEvaluationTimestamp() {
        return this.targetingEvaluationTimestamp;
    }
}
