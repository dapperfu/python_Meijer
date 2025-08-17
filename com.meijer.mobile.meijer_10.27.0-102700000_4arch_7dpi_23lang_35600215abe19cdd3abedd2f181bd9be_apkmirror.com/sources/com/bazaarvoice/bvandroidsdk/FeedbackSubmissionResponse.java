package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class FeedbackSubmissionResponse extends ConversationsSubmissionResponse {

    @InterfaceC15617c("Feedback")
    private SubmittedFeedback feedback;

    @InterfaceC15617c("Locale")
    private String locale;

    public SubmittedFeedback getFeedback() {
        return this.feedback;
    }

    public String getLocale() {
        return this.locale;
    }
}
