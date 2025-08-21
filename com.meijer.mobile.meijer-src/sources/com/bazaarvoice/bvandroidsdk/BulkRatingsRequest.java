package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BulkRatingOptions;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.Filter;
import java.util.List;

/* loaded from: classes4.dex */
public class BulkRatingsRequest extends ConversationsDisplayRequest {
    private boolean incentivizedStats;
    private final List<String> productIds;
    private final BulkRatingOptions.StatsType statsType;

    public static final class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private boolean incentivizedStats;
        private final List<String> productIds;
        private final BulkRatingOptions.StatsType statsType;

        public Builder addFilter(BulkRatingOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            addFilter(new Filter(filter, equalityOperator, str));
            return this;
        }

        public BulkRatingsRequest build() {
            return new BulkRatingsRequest(this);
        }

        public Builder(List<String> list, BulkRatingOptions.StatsType statsType) {
            this.productIds = list;
            addFilter(new Filter(Filter.Type.ProductId, EqualityOperator.EQ, list));
            this.statsType = statsType;
            this.incentivizedStats = false;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.BulkRatingsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.BulkRatingsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }

        public Builder addIncentivizedStats(Boolean bool) {
            this.incentivizedStats = bool.booleanValue();
            return this;
        }
    }

    private BulkRatingsRequest(Builder builder) {
        super(builder);
        this.statsType = builder.statsType;
        this.productIds = builder.productIds;
        this.incentivizedStats = builder.incentivizedStats;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        if (this.productIds.size() < 1 || this.productIds.size() > 50) {
            return new BazaarException(String.format("Too many productIds requested: %d. Must be between 1 and 50.", Integer.valueOf(this.productIds.size())));
        }
        return null;
    }

    Boolean getIncentivizedStats() {
        return Boolean.valueOf(this.incentivizedStats);
    }

    List<String> getProductIds() {
        return this.productIds;
    }

    BulkRatingOptions.StatsType getStatsType() {
        return this.statsType;
    }
}
