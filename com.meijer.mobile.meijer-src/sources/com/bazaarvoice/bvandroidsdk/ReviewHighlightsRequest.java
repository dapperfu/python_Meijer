package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;

/* loaded from: classes4.dex */
public class ReviewHighlightsRequest extends ConversationsDisplayRequest {
    String productId;

    public static final class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private String productId;

        public ReviewHighlightsRequest build() {
            return new ReviewHighlightsRequest(this);
        }

        public Builder(String str) {
            this.productId = str;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.ReviewHighlightsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.ReviewHighlightsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private ReviewHighlightsRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
    }

    String getProductId() {
        return this.productId;
    }
}
