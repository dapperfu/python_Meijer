package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
abstract class BVNotificationData {

    @InterfaceC16127c("reviewPromptDisplayText")
    private String contentTitleText;

    @InterfaceC16127c("headsUpEnabled")
    private boolean headsUpEnabled;

    @InterfaceC16127c("reviewPromptNoReview")
    private String negativeText;

    @InterfaceC16127c("reviewPromptRemindText")
    private String neutralText;

    @InterfaceC16127c("notificationDelay")
    private int notificationDelay;

    @InterfaceC16127c("notificationsEnabled")
    private boolean notificationsEnabled;

    @InterfaceC16127c("reviewPromptYesReview")
    private String positiveText;

    @InterfaceC16127c("reviewRemindLaterDuration")
    private int reviewRemindLaterDuration;

    @InterfaceC16127c("reviewPromptSubtitleText")
    private String summaryText;

    @InterfaceC16127c("urlScheme")
    private String urlScheme;

    public String getContentTitleText() {
        return this.contentTitleText;
    }

    public String getNegativeText() {
        return this.negativeText;
    }

    public String getNeutralText() {
        return this.neutralText;
    }

    public int getNotificationDelay() {
        return this.notificationDelay;
    }

    public long getNotificationDelayMillis() {
        return this.notificationDelay * 1000;
    }

    public String getPositiveText() {
        return this.positiveText;
    }

    public int getReviewRemindLaterDuration() {
        return this.reviewRemindLaterDuration;
    }

    public long getReviewRemindLaterDurationMillis() {
        return this.reviewRemindLaterDuration * 1000;
    }

    public String getSummaryText() {
        return this.summaryText;
    }

    public String getUrlScheme() {
        return this.urlScheme;
    }

    public boolean isHeadsUpEnabled() {
        return this.headsUpEnabled;
    }

    public boolean isNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    public String toString() {
        return "BVNotificationData{notificationsEnabled=" + this.notificationsEnabled + ", positiveText='" + this.positiveText + "', negativeText='" + this.negativeText + "', neutralText='" + this.neutralText + "', headsUpEnabled=" + this.headsUpEnabled + ", notificationDelay=" + this.notificationDelay + ", reviewRemindLaterDuration=" + this.reviewRemindLaterDuration + ", contentTitleText='" + this.contentTitleText + "', summaryText='" + this.summaryText + "', urlScheme='" + this.urlScheme + "'}";
    }

    BVNotificationData() {
    }
}
