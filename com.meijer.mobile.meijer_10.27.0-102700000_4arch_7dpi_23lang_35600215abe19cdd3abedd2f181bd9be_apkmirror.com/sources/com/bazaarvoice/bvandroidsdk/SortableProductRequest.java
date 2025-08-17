package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.AnswerOptions;
import com.bazaarvoice.bvandroidsdk.AuthorOptions;
import com.bazaarvoice.bvandroidsdk.CommentOptions;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.ProductOptions;
import com.bazaarvoice.bvandroidsdk.QuestionOptions;
import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class SortableProductRequest extends ConversationsDisplayRequest {
    private final List<Sort> answerSorts;
    private final List<Filter> authorFilter;
    private final List<Filter> commentFilter;
    private boolean incentivizedStats;
    private final List<Include> includes;
    private final List<Filter> questionFilter;
    private final List<Sort> questionSorts;
    private final List<Filter> reviewFilter;
    private final List<Sort> reviewSorts;
    private boolean secondaryratingstats;
    private final List<PDPContentType> statistics;
    private boolean tagStats;

    public static abstract class Builder<BuilderType, RequestType> extends ConversationsDisplayRequest.Builder<BuilderType> {
        private final List<Sort> reviewSorts = new ArrayList();
        private final List<Sort> questionSorts = new ArrayList();
        private final List<Sort> answerSorts = new ArrayList();
        List<Filter> reviewFilter = new ArrayList();
        List<Filter> questionFilter = new ArrayList();
        List<Filter> commentFilter = new ArrayList();
        List<Filter> authorFilter = new ArrayList();
        private final List<Include> includes = new ArrayList();
        private final List<PDPContentType> statistics = new ArrayList();
        private boolean incentivizedStats = false;
        private boolean secondaryratingstats = false;
        private boolean tagStats = false;

        public abstract RequestType build();

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addAnswerSort(AnswerOptions.Sort sort, SortOrder sortOrder) {
            this.answerSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addAuthorFilter(AuthorOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            this.authorFilter.add(new Filter(filter, equalityOperator, str));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addCommentFilter(CommentOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            this.commentFilter.add(new Filter(filter, equalityOperator, str));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addFilter(ProductOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            addFilter(new Filter(filter, equalityOperator, str));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addIncludeContent(PDPContentType pDPContentType, Integer num) {
            this.includes.add(new Include(pDPContentType, num.intValue()));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addIncludeStatistics(PDPContentType pDPContentType) {
            this.statistics.add(pDPContentType);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addQuestionFilter(QuestionOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            this.questionFilter.add(new Filter(filter, equalityOperator, str));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addQuestionSort(QuestionOptions.Sort sort, SortOrder sortOrder) {
            this.questionSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addReviewFilter(ReviewOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            this.reviewFilter.add(new Filter(filter, equalityOperator, str));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addReviewSort(ReviewOptions.Sort sort, SortOrder sortOrder) {
            this.reviewSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addSort(ProductOptions.Sort sort, SortOrder sortOrder) {
            addSort(new Sort(sort, sortOrder));
            return this;
        }

        Builder() {
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
        public BuilderType addIncentivizedStats(Boolean bool) {
            this.incentivizedStats = bool.booleanValue();
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addSecondaryRatingStats(Boolean bool) {
            this.secondaryratingstats = bool.booleanValue();
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addTagStats(Boolean bool) {
            this.tagStats = bool.booleanValue();
            return this;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    List<Sort> getAnswerSorts() {
        return this.answerSorts;
    }

    public List<Filter> getAuthorFilter() {
        return this.authorFilter;
    }

    public List<Filter> getCommentFilter() {
        return this.commentFilter;
    }

    Boolean getIncentivizedStats() {
        return Boolean.valueOf(this.incentivizedStats);
    }

    List<Include> getIncludes() {
        return this.includes;
    }

    public List<Filter> getQuestionFilter() {
        return this.questionFilter;
    }

    List<Sort> getQuestionSorts() {
        return this.questionSorts;
    }

    public List<Filter> getReviewFilter() {
        return this.reviewFilter;
    }

    List<Sort> getReviewSorts() {
        return this.reviewSorts;
    }

    Boolean getSecondaryratingStats() {
        return Boolean.valueOf(this.secondaryratingstats);
    }

    List<PDPContentType> getStatistics() {
        return this.statistics;
    }

    Boolean getTagStats() {
        return Boolean.valueOf(this.tagStats);
    }

    SortableProductRequest(Builder builder) {
        super(builder);
        this.reviewSorts = builder.reviewSorts;
        this.questionSorts = builder.questionSorts;
        this.answerSorts = builder.answerSorts;
        this.reviewFilter = builder.reviewFilter;
        this.questionFilter = builder.questionFilter;
        this.commentFilter = builder.commentFilter;
        this.authorFilter = builder.authorFilter;
        this.includes = builder.includes;
        this.statistics = builder.statistics;
        this.incentivizedStats = builder.incentivizedStats;
        this.secondaryratingstats = builder.secondaryratingstats;
        this.tagStats = builder.tagStats;
    }
}
