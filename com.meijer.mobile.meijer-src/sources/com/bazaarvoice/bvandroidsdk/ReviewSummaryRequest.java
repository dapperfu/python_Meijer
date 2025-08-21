package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;

/* loaded from: classes4.dex */
public class ReviewSummaryRequest extends ConversationsDisplayRequest {
    private final String formatType;
    private final String productId;

    public static final class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private String formatType;
        private String productId;

        public Builder addFormatType(String str) {
            this.formatType = str;
            return this;
        }

        public ReviewSummaryRequest build() {
            return new ReviewSummaryRequest(this);
        }

        public Builder(String str) {
            this.productId = str;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.ReviewSummaryRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.ReviewSummaryRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    public String getFormatType() {
        return this.formatType;
    }

    String getProductId() {
        return this.productId;
    }

    ReviewSummaryRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.formatType = builder.formatType;
    }
}
