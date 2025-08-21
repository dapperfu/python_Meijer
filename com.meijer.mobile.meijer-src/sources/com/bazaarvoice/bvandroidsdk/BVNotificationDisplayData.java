package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
final class BVNotificationDisplayData {
    private String cgcId;
    private String imageUrl;
    private boolean isHeadsUpEnabled;
    private String negativeText;
    private String neutralText;
    private String positiveText;
    private String summaryText;
    private String titleText;

    String getCgcId() {
        return this.cgcId;
    }

    String getImageUrl() {
        return this.imageUrl;
    }

    String getNegativeText() {
        return this.negativeText;
    }

    String getNeutralText() {
        return this.neutralText;
    }

    String getPositiveText() {
        return this.positiveText;
    }

    String getSummaryText() {
        return this.summaryText;
    }

    String getTitleText() {
        return this.titleText;
    }

    boolean isHeadsUpEnabled() {
        return this.isHeadsUpEnabled;
    }

    BVNotificationDisplayData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10) {
        this.cgcId = str;
        this.positiveText = str2;
        this.neutralText = str3;
        this.negativeText = str4;
        this.imageUrl = str5;
        this.titleText = str6;
        this.summaryText = str7;
        this.isHeadsUpEnabled = z10;
    }
}
