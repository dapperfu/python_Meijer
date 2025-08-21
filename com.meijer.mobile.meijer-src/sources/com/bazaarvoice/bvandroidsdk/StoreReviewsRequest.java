package com.bazaarvoice.bvandroidsdk;

import java.util.List;

/* loaded from: classes4.dex */
public class StoreReviewsRequest extends ConversationsDisplayRequest {
    private final int limit;
    private final int offset;
    private final List<RelevancySort> relevancySorts;
    private final List<ReviewIncludeType> reviewIncludeTypes;
    private final String searchPhrase;
    private final List<Sort> sorts;
    private final String storeId;

    public static final class Builder extends ReviewDisplayRequestBuilder<Builder, StoreReviewsRequest> {
        private final int limit;
        private final int offset;
        private final String storeId;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bazaarvoice.bvandroidsdk.ReviewDisplayRequestBuilder
        public StoreReviewsRequest build() {
            return new StoreReviewsRequest(this);
        }

        public Builder(String str, int i10, int i11) {
            super(str, i10, i11);
            this.storeId = str;
            this.limit = i10;
            this.offset = i11;
        }
    }

    private StoreReviewsRequest(Builder builder) {
        super(builder);
        this.storeId = builder.storeId;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.sorts = ((ReviewDisplayRequestBuilder) builder).sorts;
        this.relevancySorts = builder.relevancySorts;
        this.searchPhrase = builder.searchPhrase;
        this.reviewIncludeTypes = builder.reviewIncludeTypes;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        int i10 = this.limit;
        if (i10 < 1 || i10 > 100) {
            return new BazaarException(String.format("Invalid `limit` value: Parameter 'limit' has invalid value: %d - must be between 1 and 100.", Integer.valueOf(this.limit)));
        }
        return null;
    }

    int getLimit() {
        return this.limit;
    }

    int getOffset() {
        return this.offset;
    }

    List<RelevancySort> getRelevancySorts() {
        return this.relevancySorts;
    }

    List<ReviewIncludeType> getReviewIncludeTypes() {
        return this.reviewIncludeTypes;
    }

    String getSearchPhrase() {
        return this.searchPhrase;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest
    List<Sort> getSorts() {
        return this.sorts;
    }

    String getStoreId() {
        return this.storeId;
    }
}
