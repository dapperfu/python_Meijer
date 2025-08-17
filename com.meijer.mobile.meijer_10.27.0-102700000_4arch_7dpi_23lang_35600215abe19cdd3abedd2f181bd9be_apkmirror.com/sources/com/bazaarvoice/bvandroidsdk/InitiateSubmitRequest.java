package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;
import java.util.List;

/* loaded from: classes4.dex */
public class InitiateSubmitRequest extends ConversationsSubmissionRequest {
    private final boolean isExtended;
    private final boolean isHostedAuth;
    private List<String> productIds;

    public static final class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        private boolean isExtended;
        private boolean isHostedAuth;
        private List<String> productIds;

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return null;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return null;
        }

        public Builder(List<String> list, String str) {
            super(Action.Submit);
            this.productIds = list;
            locale(str);
        }

        public InitiateSubmitRequest build() {
            return new InitiateSubmitRequest(this);
        }

        public Builder extended(boolean z10) {
            this.isExtended = z10;
            return this;
        }

        public Builder hostedAuth(boolean z10) {
            this.isHostedAuth = z10;
            return this;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private InitiateSubmitRequest(Builder builder) {
        super(builder);
        this.productIds = builder.productIds;
        this.isExtended = builder.isExtended;
        this.isHostedAuth = builder.isHostedAuth;
    }

    public List<String> getProductIds() {
        return this.productIds;
    }

    public boolean isExtended() {
        return this.isExtended;
    }

    public boolean isHostedAuth() {
        return this.isHostedAuth;
    }
}
