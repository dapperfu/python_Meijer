package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;

/* loaded from: classes4.dex */
public class QuestionSubmissionRequest extends ConversationsSubmissionRequest {
    private final Boolean isUserAnonymous;
    private final String productId;
    private final String questionDetails;
    private final String questionSummary;
    private final Boolean sendEmailAlertWhenAnswered;

    public static final class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        Boolean isUserAnonymous;
        final String productId;
        String questionDetails;
        String questionSummary;
        Boolean sendEmailAlertWhenAnswered;

        public QuestionSubmissionRequest build() {
            return new QuestionSubmissionRequest(this);
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return PhotoUpload.ContentType.QUESTION;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return VideoUpload.ContentType.QUESTION;
        }

        public Builder isUserAnonymous(Boolean bool) {
            this.isUserAnonymous = bool;
            return this;
        }

        public Builder questionDetails(String str) {
            this.questionDetails = str;
            return this;
        }

        public Builder questionSummary(String str) {
            this.questionSummary = str;
            return this;
        }

        public Builder sendEmailAlertWhenAnswered(Boolean bool) {
            this.sendEmailAlertWhenAnswered = bool;
            return this;
        }

        public Builder(Action action, String str) {
            super(action);
            this.productId = str;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private QuestionSubmissionRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.questionSummary = builder.questionSummary;
        this.questionDetails = builder.questionDetails;
        this.isUserAnonymous = builder.isUserAnonymous;
        this.sendEmailAlertWhenAnswered = builder.sendEmailAlertWhenAnswered;
    }

    String getProductId() {
        return this.productId;
    }

    public String getQuestionDetails() {
        return this.questionDetails;
    }

    public String getQuestionSummary() {
        return this.questionSummary;
    }

    public Boolean getSendEmailAlertWhenAnswered() {
        return this.sendEmailAlertWhenAnswered;
    }

    public Boolean getUserAnonymous() {
        return this.isUserAnonymous;
    }
}
