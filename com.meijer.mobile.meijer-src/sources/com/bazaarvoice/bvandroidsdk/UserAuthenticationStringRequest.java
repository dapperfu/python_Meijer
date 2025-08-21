package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;

/* loaded from: classes4.dex */
public class UserAuthenticationStringRequest extends ConversationsSubmissionRequest {
    private static final Builder EMPTY_BUILDER = new Builder(Action.Submit);
    private final String authToken;

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private static class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return null;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return null;
        }

        Builder(Action action) {
            super(action);
        }
    }

    public UserAuthenticationStringRequest(String str) {
        super(EMPTY_BUILDER);
        this.authToken = str;
    }

    public String getAuthToken() {
        return this.authToken;
    }
}
