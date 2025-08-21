package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.Filter;
import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ReviewDisplayRequestBuilder<BuilderType, RequestType> extends ConversationsDisplayRequest.Builder<BuilderType> {
    protected final Map<String, String> additionalFields;
    protected final Map<String, String> contextDataValues;
    protected String feature;
    protected Boolean incentivizedStats;
    protected final int limit;
    protected final int offset;
    protected final String productId;
    protected final List<RelevancySort> relevancySorts;
    protected List<ReviewIncludeType> reviewIncludeTypes;
    protected String searchPhrase;
    protected final List<BVSecondaryRatingFilter> secondaryRatingFilters;
    protected Boolean secondaryratingstats;
    protected final List<Sort> sorts;
    protected final ArrayList<PDPContentType> statistics;
    protected final Map<String, String> tagFilters;
    protected Boolean tagStats;

    public ReviewDisplayRequestBuilder(String str, int i10, int i11) {
        this.sorts = new ArrayList();
        this.relevancySorts = new ArrayList();
        this.reviewIncludeTypes = new ArrayList();
        this.statistics = new ArrayList<>();
        this.limit = i10;
        this.offset = i11;
        addFilter(new Filter(Filter.Type.ProductId, EqualityOperator.EQ, str));
        this.productId = str;
        Boolean bool = Boolean.FALSE;
        this.incentivizedStats = bool;
        this.secondaryratingstats = bool;
        this.tagStats = bool;
        this.contextDataValues = new HashMap();
        this.secondaryRatingFilters = new ArrayList();
        this.tagFilters = new HashMap();
        this.additionalFields = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addFilter(ReviewOptions.Filter filter, EqualityOperator equalityOperator, String str) {
        addFilter(new Filter(filter, equalityOperator, str));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addIncludeContent(ReviewIncludeType reviewIncludeType) {
        this.reviewIncludeTypes.add(reviewIncludeType);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addPDPContentType(PDPContentType pDPContentType) {
        this.statistics.add(pDPContentType);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addSort(ReviewOptions.Sort sort, SortOrder sortOrder) {
        this.sorts.add(new Sort(sort, sortOrder));
        return this;
    }

    public abstract RequestType build();

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addAdditionalFields(String str, String str2) {
        this.additionalFields.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addFeature(String str) {
        this.feature = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addFilter(ReviewOptions.Filter filter, EqualityOperator equalityOperator, List<String> list) {
        addFilter(new Filter(filter, equalityOperator, list));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addFilterContextDataValue(String str, String str2) {
        this.contextDataValues.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addFilterTag(String str, String str2) {
        this.tagFilters.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addIncentivizedStats(Boolean bool) {
        this.incentivizedStats = bool;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addIncludeContent(ReviewIncludeType... reviewIncludeTypeArr) {
        this.reviewIncludeTypes.addAll(Arrays.asList(reviewIncludeTypeArr));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addPDPContentType(PDPContentType... pDPContentTypeArr) {
        this.statistics.addAll(Arrays.asList(pDPContentTypeArr));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addSecondaryRatingFilters(String str, EqualityOperator equalityOperator, String str2) {
        this.secondaryRatingFilters.add(new BVSecondaryRatingFilter(str, equalityOperator, str2));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addSecondaryRatingStats(Boolean bool) {
        this.secondaryratingstats = bool;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addSort(ReviewOptions.RelevancySort relevancySort, RelevancySortOrder relevancySortOrder) {
        this.relevancySorts.add(new RelevancySort(relevancySort, relevancySortOrder));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addTagStats(Boolean bool) {
        this.tagStats = bool;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType includeSearchPhrase(String str) {
        this.searchPhrase = str;
        return this;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
    public /* bridge */ /* synthetic */ Object addAdditionalField(String str, String str2) {
        return super.addAdditionalField(str, str2);
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
    public /* bridge */ /* synthetic */ Object addCustomDisplayParameter(String str, String str2) {
        return super.addCustomDisplayParameter(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderType addSort(ReviewOptions.Sort sort, List<String> list) {
        this.sorts.add(new Sort(sort, list));
        return this;
    }

    public ReviewDisplayRequestBuilder(ReviewOptions.PrimaryFilter primaryFilter, String str, int i10, int i11) {
        this.sorts = new ArrayList();
        this.relevancySorts = new ArrayList();
        this.reviewIncludeTypes = new ArrayList();
        this.statistics = new ArrayList<>();
        this.limit = i10;
        this.offset = i11;
        this.productId = null;
        addFilter(new Filter(primaryFilter, EqualityOperator.EQ, str));
        Boolean bool = Boolean.FALSE;
        this.incentivizedStats = bool;
        this.secondaryratingstats = bool;
        this.tagStats = bool;
        this.feature = new String();
        this.contextDataValues = new HashMap();
        this.secondaryRatingFilters = new ArrayList();
        this.tagFilters = new HashMap();
        this.additionalFields = new HashMap();
    }
}
