package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public final class SubmittedFeedback {

    @InterfaceC16127c("Helpfulness")
    private HelpfulnessFeedback helpfulnessFeedback;

    @InterfaceC16127c("Inappropriate")
    private InappropriateFeedback inappropriateFeedback;

    static final class HelpfulnessFeedback {

        @InterfaceC16127c("AuthorId")
        private String authorId;

        @InterfaceC16127c("Vote")
        private String vote;

        public String getAuthorId() {
            return this.authorId;
        }

        public String getVote() {
            return this.vote;
        }

        HelpfulnessFeedback() {
        }
    }

    static final class InappropriateFeedback {

        @InterfaceC16127c("AuthorId")
        private String authorId;

        @InterfaceC16127c("ReasonText")
        private String reasonText;

        public String getAuthorId() {
            return this.authorId;
        }

        public String getReasonText() {
            return this.reasonText;
        }

        InappropriateFeedback() {
        }
    }

    public HelpfulnessFeedback getHelpfulnessFeedback() {
        return this.helpfulnessFeedback;
    }

    public InappropriateFeedback getInappropriateFeedback() {
        return this.inappropriateFeedback;
    }
}
