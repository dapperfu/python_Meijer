package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
public class MDFeedbackListenerData {
    private String engagementId;
    private String feedbackClientCorrelationId;
    private String feedbackPayload;
    private long timestamp;

    protected MDFeedbackListenerData(String str, long j10, String str2, String str3) {
        updateParams(str, j10, str2, str3);
    }

    private void updateParams(String str, long j10, String str2, String str3) {
        this.feedbackClientCorrelationId = str;
        this.timestamp = j10;
        this.feedbackPayload = str2;
        this.engagementId = str3;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public String getFeedbackClientCorrelationId() {
        return this.feedbackClientCorrelationId;
    }

    public String getFeedbackPayload() {
        return this.feedbackPayload;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
