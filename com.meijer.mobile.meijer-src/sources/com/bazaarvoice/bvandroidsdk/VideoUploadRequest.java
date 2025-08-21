package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;

/* loaded from: classes4.dex */
public class VideoUploadRequest extends ConversationsSubmissionRequest {
    private final VideoUpload videoUpload;

    public static class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        private final VideoUpload videoUpload;

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return null;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return null;
        }

        public Builder(VideoUpload videoUpload) {
            super(Action.Submit);
            this.videoUpload = videoUpload;
        }

        public VideoUploadRequest build() {
            return new VideoUploadRequest(this);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private VideoUploadRequest(Builder builder) {
        super(builder);
        this.videoUpload = builder.videoUpload;
    }

    public VideoUpload getVideoUpload() {
        return this.videoUpload;
    }
}
