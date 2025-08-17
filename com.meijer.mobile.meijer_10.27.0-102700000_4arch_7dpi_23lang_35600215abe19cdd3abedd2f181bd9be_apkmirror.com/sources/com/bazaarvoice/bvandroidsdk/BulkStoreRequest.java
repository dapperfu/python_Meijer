package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BulkRatingOptions;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.Filter;
import java.util.List;

/* loaded from: classes4.dex */
public class BulkStoreRequest extends ConversationsDisplayRequest {
    private final int limit;
    private final int offset;
    private final BulkRatingOptions.StatsType statsType;
    private final List<String> storeIds;

    public static final class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private int limit;
        private int offset;
        private final BulkRatingOptions.StatsType statsType;
        private final List<String> storeIds;

        public Builder(List<String> list) {
            this.storeIds = list;
            addFilter(new Filter(Filter.Type.Id, EqualityOperator.EQ, list));
            this.statsType = BulkRatingOptions.StatsType.Reviews;
        }

        public Builder addFilter(BulkRatingOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            addFilter(new Filter(filter, equalityOperator, str));
            return this;
        }

        public BulkStoreRequest build() {
            return new BulkStoreRequest(this);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.BulkStoreRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.BulkStoreRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }

        public Builder(int i10, int i11) {
            this.storeIds = null;
            this.limit = i10;
            this.offset = i11;
            this.statsType = BulkRatingOptions.StatsType.Reviews;
        }
    }

    private BulkStoreRequest(Builder builder) {
        super(builder);
        this.statsType = builder.statsType;
        this.storeIds = builder.storeIds;
        this.limit = builder.limit;
        this.offset = builder.offset;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        List<String> list = this.storeIds;
        if (list == null) {
            return null;
        }
        if (list.size() < 1 || this.storeIds.size() > 20) {
            return new BazaarException(String.format("Too many store Ids requested: %d. Must be between 1 and 20.", Integer.valueOf(this.storeIds.size())));
        }
        return null;
    }

    int getLimit() {
        return this.limit;
    }

    int getOffset() {
        return this.offset;
    }

    BulkRatingOptions.StatsType getStatsType() {
        return this.statsType;
    }

    List<String> getStoreIds() {
        return this.storeIds;
    }
}
