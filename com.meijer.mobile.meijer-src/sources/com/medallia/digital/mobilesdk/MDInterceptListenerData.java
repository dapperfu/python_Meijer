package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
public class MDInterceptListenerData {
    private String engagementId;
    private MDEngagementType engagementType;
    private MDAppearanceMode interceptAppearanceDisplay;
    private MDAppearanceMode interceptAppearanceSet;
    private String reason;
    private long timestamp;

    protected MDInterceptListenerData(long j10, String str) {
        updateParams(j10, str, null, null, null, null);
    }

    private void updateParams(long j10, String str, MDEngagementType mDEngagementType, String str2, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        this.timestamp = j10;
        this.engagementId = str;
        this.engagementType = mDEngagementType;
        this.reason = str2;
        this.interceptAppearanceSet = mDAppearanceMode;
        this.interceptAppearanceDisplay = mDAppearanceMode2;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDEngagementType getEngagementType() {
        return this.engagementType;
    }

    public MDAppearanceMode getInterceptAppearanceDisplay() {
        return this.interceptAppearanceDisplay;
    }

    public MDAppearanceMode getInterceptAppearanceSet() {
        return this.interceptAppearanceSet;
    }

    public String getReason() {
        return this.reason;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    protected MDInterceptListenerData(long j10, String str, MDEngagementType mDEngagementType) {
        updateParams(j10, str, mDEngagementType, null, null, null);
    }

    protected MDInterceptListenerData(long j10, String str, MDEngagementType mDEngagementType, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        updateParams(j10, str, mDEngagementType, null, mDAppearanceMode, mDAppearanceMode2);
    }

    protected MDInterceptListenerData(long j10, String str, String str2, MDEngagementType mDEngagementType) {
        updateParams(j10, str, mDEngagementType, str2, null, null);
    }
}
