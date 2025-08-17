package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class AnswerSubmissionResponse extends ConversationsSubmissionResponse {

    @InterfaceC15617c("Answer")
    private SubmittedAnswer answer;

    @InterfaceC15617c("Locale")
    private String locale;

    public SubmittedAnswer getAnswer() {
        return this.answer;
    }

    public String getLocale() {
        return this.locale;
    }
}
