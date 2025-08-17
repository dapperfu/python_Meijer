package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
abstract class BVNotificationData {

    @InterfaceC15617c("reviewPromptDisplayText")
    private String contentTitleText;

    @InterfaceC15617c("headsUpEnabled")
    private boolean headsUpEnabled;

    @InterfaceC15617c("reviewPromptNoReview")
    private String negativeText;

    @InterfaceC15617c("reviewPromptRemindText")
    private String neutralText;

    @InterfaceC15617c("notificationDelay")
    private int notificationDelay;

    @InterfaceC15617c("notificationsEnabled")
    private boolean notificationsEnabled;

    @InterfaceC15617c("reviewPromptYesReview")
    private String positiveText;

    @InterfaceC15617c("reviewRemindLaterDuration")
    private int reviewRemindLaterDuration;

    @InterfaceC15617c("reviewPromptSubtitleText")
    private String summaryText;

    @InterfaceC15617c("urlScheme")
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
