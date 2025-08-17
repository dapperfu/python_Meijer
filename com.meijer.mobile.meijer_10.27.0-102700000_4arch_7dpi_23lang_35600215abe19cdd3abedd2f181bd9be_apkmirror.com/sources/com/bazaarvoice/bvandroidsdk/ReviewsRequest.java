package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ReviewsRequest extends ConversationsDisplayRequest {
    private final Map<String, String> additionalFields;
    private final Map<String, String> contextDataValues;
    private final String feature;
    private final Boolean incentivizedStat;
    private final int limit;
    private final int offset;
    private final String productId;
    protected final List<RelevancySort> relevancySorts;
    private final List<ReviewIncludeType> reviewIncludeTypes;
    private final String searchPhrase;
    protected final List<BVSecondaryRatingFilter> secondaryRatingFilters;
    private final Boolean secondaryratingstats;
    private final List<Sort> sorts;
    private final List<PDPContentType> statistics;
    private final Map<String, String> tagFilters;
    private final Boolean tagStats;

    public static final class Builder extends ReviewDisplayRequestBuilder<Builder, ReviewsRequest> {
        private final int limit;
        private final int offset;
        private String productId;

        public Builder(String str, int i10, int i11) {
            super(str, i10, i11);
            this.productId = str;
            this.limit = i10;
            this.offset = i11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bazaarvoice.bvandroidsdk.ReviewDisplayRequestBuilder
        public ReviewsRequest build() {
            return new ReviewsRequest(this);
        }

        public Builder(ReviewOptions.PrimaryFilter primaryFilter, String str, int i10, int i11) {
            super(primaryFilter, str, i10, i11);
            this.limit = i10;
            this.offset = i11;
        }
    }

    private ReviewsRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.sorts = ((ReviewDisplayRequestBuilder) builder).sorts;
        this.relevancySorts = builder.relevancySorts;
        this.searchPhrase = builder.searchPhrase;
        this.reviewIncludeTypes = builder.reviewIncludeTypes;
        this.statistics = builder.statistics;
        this.incentivizedStat = builder.incentivizedStats;
        this.tagStats = builder.tagStats;
        this.feature = builder.feature;
        this.contextDataValues = builder.contextDataValues;
        this.additionalFields = builder.additionalFields;
        this.secondaryRatingFilters = builder.secondaryRatingFilters;
        this.secondaryratingstats = builder.secondaryratingstats;
        this.tagFilters = builder.tagFilters;
    }

    public Map<String, String> getAdditionalFields() {
        return this.additionalFields;
    }

    Map<String, String> getContextDataValues() {
        return this.contextDataValues;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        int i10 = this.limit;
        if (i10 < 1 || i10 > 100) {
            return new BazaarException(String.format("Invalid `limit` value: Parameter 'limit' has invalid value: %d - must be between 1 and 100.", Integer.valueOf(this.limit)));
        }
        return null;
    }

    String getFeatures() {
        return this.feature;
    }

    Boolean getIncentivizedStats() {
        return this.incentivizedStat;
    }

    int getLimit() {
        return this.limit;
    }

    int getOffset() {
        return this.offset;
    }

    String getProductId() {
        return this.productId;
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

    public List<BVSecondaryRatingFilter> getSecondaryRatings() {
        return this.secondaryRatingFilters;
    }

    Boolean getSecondaryratingstats() {
        return this.secondaryratingstats;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest
    List<Sort> getSorts() {
        return this.sorts;
    }

    List<PDPContentType> getStatistics() {
        return this.statistics;
    }

    public Map<String, String> getTagFilters() {
        return this.tagFilters;
    }

    Boolean getTagStats() {
        return this.tagStats;
    }
}
