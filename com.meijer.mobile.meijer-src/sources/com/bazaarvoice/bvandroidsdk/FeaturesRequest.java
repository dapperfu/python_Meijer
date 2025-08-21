package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;

/* loaded from: classes4.dex */
public class FeaturesRequest extends ConversationsDisplayRequest {
    private final String language;
    private final String productId;

    public static final class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private String language;
        private String productId;

        public Builder addLanguage(String str) {
            this.language = str;
            return this;
        }

        public FeaturesRequest build() {
            return new FeaturesRequest(this);
        }

        public Builder(String str) {
            this.productId = str;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.FeaturesRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.FeaturesRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    public String getLanguage() {
        return this.language;
    }

    String getProductId() {
        return this.productId;
    }

    FeaturesRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.language = builder.language;
    }
}
