package com.bazaarvoice.bvandroidsdk;

import N6.b;
import N6.c;
import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;

/* loaded from: classes4.dex */
public class FeedbackSubmissionRequest extends ConversationsSubmissionRequest {
    private final String contentId;
    private final String contentType;
    private final String feedbackType;
    private final String feedbackVote;
    private final String reasonFlaggedText;
    private final String userId;

    public static final class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        private final String contentId;
        private String contentType;
        private String feedbackType;
        private String feedbackVote;
        private String reasonFlaggedText;
        private String userId;

        public Builder(String str) {
            super(Action.Preview);
            this.contentId = str;
        }

        public FeedbackSubmissionRequest build() {
            return new FeedbackSubmissionRequest(this);
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return PhotoUpload.ContentType.QUESTION;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return VideoUpload.ContentType.QUESTION;
        }

        public Builder reasonFlaggedText(String str) {
            this.reasonFlaggedText = str;
            return this;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        public Builder userId(String str) {
            this.userId = str;
            return this;
        }

        public Builder feedbackContentType(N6.a aVar) {
            this.contentType = aVar.b();
            return this;
        }

        public Builder feedbackType(b bVar) {
            this.feedbackType = bVar.b();
            return this;
        }

        public Builder feedbackVote(c cVar) {
            this.feedbackVote = cVar.b();
            return this;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    String getContentId() {
        return this.contentId;
    }

    String getContentType() {
        return this.contentType;
    }

    String getFeedbackType() {
        return this.feedbackType;
    }

    String getFeedbackVote() {
        return this.feedbackVote;
    }

    String getReasonFlaggedText() {
        return this.reasonFlaggedText;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest
    String getUserId() {
        return this.userId;
    }

    FeedbackSubmissionRequest(Builder builder) {
        super(builder);
        this.contentId = builder.contentId;
        this.contentType = builder.contentType;
        this.feedbackType = builder.feedbackType;
        this.userId = builder.userId;
        this.feedbackVote = builder.feedbackVote;
        this.reasonFlaggedText = builder.reasonFlaggedText;
    }
}
