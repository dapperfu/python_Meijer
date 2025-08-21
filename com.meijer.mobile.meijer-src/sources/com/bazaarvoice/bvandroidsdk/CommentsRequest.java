package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.CommentOptions;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class CommentsRequest extends ConversationsDisplayRequest {
    private final Map<CommentIncludeType, Integer> includeTypeLimitMap;
    private final List<CommentIncludeType> includeTypes;
    private final int limit;
    private final int offset;
    private final List<Sort> sorts;

    public static class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private final Map<CommentIncludeType, Integer> includeTypeLimitMap;
        private final List<CommentIncludeType> includeTypes;
        private final int limit;
        private final int offset;
        private final List<Sort> sorts;

        private Builder(Filter filter, int i10, int i11) {
            addFilter(filter);
            this.limit = i10;
            this.offset = i11;
            this.sorts = new ArrayList();
            this.includeTypes = new ArrayList();
            this.includeTypeLimitMap = new HashMap();
        }

        public Builder addFilter(CommentOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            addFilter(new Filter(filter, equalityOperator, str));
            return this;
        }

        public Builder addIncludeContent(CommentIncludeType commentIncludeType, int i10) {
            this.includeTypes.add(commentIncludeType);
            this.includeTypeLimitMap.put(commentIncludeType, Integer.valueOf(i10));
            return this;
        }

        public Builder addSort(CommentOptions.Sort sort, SortOrder sortOrder) {
            this.sorts.add(new Sort(sort, sortOrder));
            return this;
        }

        public CommentsRequest build() {
            return new CommentsRequest(this);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.CommentsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.CommentsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }

        public Builder(String str, int i10, int i11) {
            this(new Filter(CommentOptions.Filter.REVIEW_ID, EqualityOperator.EQ, str), i10, i11);
        }

        public Builder(String str) {
            this(new Filter(CommentOptions.Filter.ID, EqualityOperator.EQ, str), 1, 0);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    Map<CommentIncludeType, Integer> getIncludeTypeLimitMap() {
        return this.includeTypeLimitMap;
    }

    List<CommentIncludeType> getIncludeTypes() {
        return this.includeTypes;
    }

    int getLimit() {
        return this.limit;
    }

    int getOffset() {
        return this.offset;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest
    List<Sort> getSorts() {
        return this.sorts;
    }

    CommentsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.sorts = builder.sorts;
        this.includeTypes = builder.includeTypes;
        this.includeTypeLimitMap = builder.includeTypeLimitMap;
    }
}
