package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class AnswerSubmissionResponse extends ConversationsSubmissionResponse {

    @InterfaceC16127c("Answer")
    private SubmittedAnswer answer;

    @InterfaceC16127c("Locale")
    private String locale;

    public SubmittedAnswer getAnswer() {
        return this.answer;
    }

    public String getLocale() {
        return this.locale;
    }
}
