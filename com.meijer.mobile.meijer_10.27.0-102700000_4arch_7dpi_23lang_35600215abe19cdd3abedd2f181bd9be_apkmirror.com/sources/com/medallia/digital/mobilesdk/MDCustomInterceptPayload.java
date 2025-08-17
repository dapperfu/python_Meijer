package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class MDCustomInterceptPayload implements Serializable {
    String declineText;
    String deferText;
    String provideFeedbackText;
    String subtitleText;
    String titleText;

    public MDCustomInterceptPayload(MDCustomInterceptPayload mDCustomInterceptPayload) {
        this.titleText = mDCustomInterceptPayload.titleText;
        this.subtitleText = mDCustomInterceptPayload.subtitleText;
        this.provideFeedbackText = mDCustomInterceptPayload.provideFeedbackText;
        this.declineText = mDCustomInterceptPayload.declineText;
        this.deferText = mDCustomInterceptPayload.deferText;
    }

    public String getDeclineText() {
        return this.declineText;
    }

    public String getDeferText() {
        return this.deferText;
    }

    public String getProvideFeedbackText() {
        return this.provideFeedbackText;
    }

    public String getSubtitleText() {
        return this.subtitleText;
    }

    public String getTitleText() {
        return this.titleText;
    }

    protected String toJsonString() {
        try {
            return "{\"titleText\":" + l3.c(this.titleText) + ",\"subtitleText\":" + l3.c(this.subtitleText) + ",\"provideFeedbackText\":" + l3.c(this.provideFeedbackText) + ",\"declineText\":" + l3.c(this.declineText) + ",\"deferText\":" + l3.c(this.deferText) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    MDCustomInterceptPayload(String str, String str2, String str3, String str4, String str5) {
        this.titleText = str;
        this.subtitleText = str2;
        this.provideFeedbackText = str3;
        this.declineText = str4;
        this.deferText = str5;
    }
}
