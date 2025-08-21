package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;

/* loaded from: classes4.dex */
public class CommentSubmissionRequest extends ConversationsSubmissionRequest {
    private final String commentText;
    private final String reviewId;
    private final String title;

    public static class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        private final String commentText;
        private final String reviewId;
        private String title;

        public CommentSubmissionRequest build() {
            return new CommentSubmissionRequest(this);
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return PhotoUpload.ContentType.COMMENT;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return VideoUpload.ContentType.COMMENT;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder(Action action, String str, String str2) {
            super(action);
            this.reviewId = str;
            this.commentText = str2;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    public String getCommentText() {
        return this.commentText;
    }

    public String getReviewId() {
        return this.reviewId;
    }

    public String getTitle() {
        return this.title;
    }

    CommentSubmissionRequest(Builder builder) {
        super(builder);
        this.reviewId = builder.reviewId;
        this.commentText = builder.commentText;
        this.title = builder.title;
    }
}
