package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.AnswerOptions;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.Filter;
import com.bazaarvoice.bvandroidsdk.QuestionOptions;
import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AuthorsRequest extends ConversationsDisplayRequest {
    private final List<Sort> answerSorts;
    private final List<Include> includes;
    private final List<Sort> questionSorts;
    private final List<Sort> reviewSorts;
    private final List<IncludeType> statistics;

    public static final class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private final List<Sort> reviewSorts = new ArrayList();
        private final List<Sort> questionSorts = new ArrayList();
        private final List<Sort> answerSorts = new ArrayList();
        private final List<Include> includes = new ArrayList();
        private final List<IncludeType> statistics = new ArrayList();

        public Builder addIncludeContent(PDPContentType pDPContentType, int i10) {
            this.includes.add(new Include(pDPContentType, i10));
            return this;
        }

        public Builder addIncludeStatistics(PDPContentType pDPContentType) {
            this.statistics.add(pDPContentType);
            return this;
        }

        public Builder addAnswerSort(AnswerOptions.Sort sort, SortOrder sortOrder) {
            this.answerSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        public Builder addIncludeContent(AuthorIncludeType authorIncludeType, int i10) {
            this.includes.add(new Include(authorIncludeType, i10));
            return this;
        }

        public Builder addIncludeStatistics(AuthorIncludeType authorIncludeType) {
            if (authorIncludeType == AuthorIncludeType.COMMENTS) {
                FS.log_w("BVSDK", "Including Review Comment Statistics is not supported with an authors request. Skipping.");
                return this;
            }
            this.statistics.add(authorIncludeType);
            return this;
        }

        public Builder addQuestionSort(QuestionOptions.Sort sort, SortOrder sortOrder) {
            this.questionSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        public Builder addReviewSort(ReviewOptions.Sort sort, SortOrder sortOrder) {
            this.reviewSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        public AuthorsRequest build() {
            return new AuthorsRequest(this);
        }

        public Builder(String str) {
            addFilter(new Filter(Filter.Type.Id, EqualityOperator.EQ, str));
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.AuthorsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.AuthorsRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    private AuthorsRequest(Builder builder) {
        super(builder);
        this.reviewSorts = builder.reviewSorts;
        this.questionSorts = builder.questionSorts;
        this.answerSorts = builder.answerSorts;
        this.includes = builder.includes;
        this.statistics = builder.statistics;
    }

    List<Sort> getAnswerSorts() {
        return this.answerSorts;
    }

    List<Include> getIncludes() {
        return this.includes;
    }

    List<Sort> getQuestionSorts() {
        return this.questionSorts;
    }

    List<Sort> getReviewSorts() {
        return this.reviewSorts;
    }

    List<IncludeType> getStatistics() {
        return this.statistics;
    }
}
