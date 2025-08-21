package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;

/* loaded from: classes4.dex */
public class AnswerSubmissionRequest extends ConversationsSubmissionRequest {
    private final String answerText;
    private final String questionId;

    public static final class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        private final String answerText;
        private final String questionId;

        public AnswerSubmissionRequest build() {
            return new AnswerSubmissionRequest(this);
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return PhotoUpload.ContentType.ANSWER;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return VideoUpload.ContentType.ANSWER;
        }

        public Builder(Action action, String str, String str2) {
            super(action);
            this.questionId = str;
            this.answerText = str2;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private AnswerSubmissionRequest(Builder builder) {
        super(builder);
        this.questionId = builder.questionId;
        this.answerText = builder.answerText;
    }

    String getAnswerText() {
        return this.answerText;
    }

    String getQuestionId() {
        return this.questionId;
    }
}
