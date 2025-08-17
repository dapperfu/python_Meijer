package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public final class SubmittedFeedback {

    @InterfaceC15617c("Helpfulness")
    private HelpfulnessFeedback helpfulnessFeedback;

    @InterfaceC15617c("Inappropriate")
    private InappropriateFeedback inappropriateFeedback;

    static final class HelpfulnessFeedback {

        @InterfaceC15617c("AuthorId")
        private String authorId;

        @InterfaceC15617c("Vote")
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

        @InterfaceC15617c("AuthorId")
        private String authorId;

        @InterfaceC15617c("ReasonText")
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
