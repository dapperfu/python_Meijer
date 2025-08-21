package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;

/* loaded from: classes4.dex */
public class PhotoUploadRequest extends ConversationsSubmissionRequest {
    private final PhotoUpload photoUpload;

    public static class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        private final PhotoUpload photoUpload;

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return null;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return null;
        }

        public Builder(PhotoUpload photoUpload) {
            super(Action.Submit);
            this.photoUpload = photoUpload;
        }

        public PhotoUploadRequest build() {
            return new PhotoUploadRequest(this);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private PhotoUploadRequest(Builder builder) {
        super(builder);
        this.photoUpload = builder.photoUpload;
    }

    public PhotoUpload getPhotoUpload() {
        return this.photoUpload;
    }
}
