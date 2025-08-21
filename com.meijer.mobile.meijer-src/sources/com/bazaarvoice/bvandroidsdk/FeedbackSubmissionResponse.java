package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class FeedbackSubmissionResponse extends ConversationsSubmissionResponse {

    @InterfaceC16127c("Feedback")
    private SubmittedFeedback feedback;

    @InterfaceC16127c("Locale")
    private String locale;

    public SubmittedFeedback getFeedback() {
        return this.feedback;
    }

    public String getLocale() {
        return this.locale;
    }
}
