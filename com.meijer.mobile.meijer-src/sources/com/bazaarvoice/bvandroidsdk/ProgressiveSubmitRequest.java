package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ProgressiveSubmitRequest extends ConversationsSubmissionRequest {
    private boolean includeFields;
    private boolean isHostedAuth;
    private boolean isPreview;
    private String productId;
    private Map<String, Object> submissionFields;
    private String submissionSessionToken;

    public static final class Builder extends ConversationsSubmissionRequest.Builder<Builder> {
        private boolean includeFields;
        private boolean isHostedAuth;
        private boolean isPreview;
        private String productId;
        private Map<String, Object> submissionFields;
        private String submissionSessionToken;

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        PhotoUpload.ContentType getPhotoContentType() {
            return null;
        }

        @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
        VideoUpload.ContentType getVideoContentType() {
            return null;
        }

        public Builder(String str, String str2, String str3) {
            super(Action.Submit);
            this.submissionFields = new HashMap();
            this.productId = str;
            this.submissionSessionToken = str2;
            locale(str3);
        }

        public ProgressiveSubmitRequest build() {
            return new ProgressiveSubmitRequest(this);
        }

        public Builder hostedAuth(boolean z10) {
            this.isHostedAuth = z10;
            return this;
        }

        public Builder includeFields(boolean z10) {
            this.includeFields = z10;
            return this;
        }

        public Builder isPreview(boolean z10) {
            this.isPreview = z10;
            return this;
        }

        public Builder submissionFields(Map<String, Object> map) {
            this.submissionFields = map;
            return this;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    public String getProductId() {
        return this.productId;
    }

    public Map<String, Object> getSubmissionFields() {
        return this.submissionFields;
    }

    public String getSubmissionSessionToken() {
        return this.submissionSessionToken;
    }

    public boolean includeFields() {
        return this.includeFields;
    }

    public boolean isHostedAuth() {
        return this.isHostedAuth;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    ProgressiveSubmitRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.submissionFields = builder.submissionFields;
        this.submissionSessionToken = builder.submissionSessionToken;
        this.isPreview = builder.isPreview;
        this.includeFields = builder.includeFields;
        this.isHostedAuth = builder.isHostedAuth;
    }
}
