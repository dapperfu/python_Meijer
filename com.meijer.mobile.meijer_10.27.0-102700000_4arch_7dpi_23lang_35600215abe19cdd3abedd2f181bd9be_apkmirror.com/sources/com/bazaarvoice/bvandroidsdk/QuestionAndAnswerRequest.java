package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.AnswerOptions;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.Filter;
import com.bazaarvoice.bvandroidsdk.QuestionOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class QuestionAndAnswerRequest extends ConversationsDisplayRequest {
    private final List<Sort> answerSorts;
    private final int limit;
    private final int offset;
    private final String productId;
    private final List<Sort> questionSorts;
    private final String searchPhrase;

    public static final class Builder extends ConversationsDisplayRequest.Builder<Builder> {
        private final int limit;
        private final int offset;
        private String productId;
        private String searchPhrase;
        private final List<Sort> questionSorts = new ArrayList();
        private final List<Sort> answerSorts = new ArrayList();

        public Builder addAnswerSort(AnswerOptions.Sort sort, SortOrder sortOrder) {
            this.answerSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        public Builder addFilter(QuestionOptions.Filter filter, EqualityOperator equalityOperator, String str) {
            addFilter(new Filter(filter, equalityOperator, str));
            return this;
        }

        public Builder addQuestionSort(QuestionOptions.Sort sort, SortOrder sortOrder) {
            this.questionSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        public Builder addSort(QuestionOptions.Sort sort, SortOrder sortOrder) {
            this.questionSorts.add(new Sort(sort, sortOrder));
            return this;
        }

        public QuestionAndAnswerRequest build() {
            return new QuestionAndAnswerRequest(this);
        }

        public Builder includeSearchPhrase(String str) {
            this.searchPhrase = str;
            return this;
        }

        public Builder(String str, int i10, int i11) {
            this.limit = i10;
            this.offset = i11;
            this.productId = str;
            addFilter(new Filter(Filter.Type.ProductId, EqualityOperator.EQ, str));
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.QuestionAndAnswerRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bazaarvoice.bvandroidsdk.QuestionAndAnswerRequest$Builder, java.lang.Object] */
        @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest.Builder
        public /* bridge */ /* synthetic */ Builder addCustomDisplayParameter(String str, String str2) {
            return super.addCustomDisplayParameter(str, str2);
        }
    }

    private QuestionAndAnswerRequest(Builder builder) {
        super(builder);
        this.questionSorts = builder.questionSorts;
        this.answerSorts = builder.answerSorts;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.searchPhrase = builder.searchPhrase;
        this.productId = builder.productId;
    }

    List<Sort> getAnswerSorts() {
        return this.answerSorts;
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

    String getProductId() {
        return this.productId;
    }

    List<Sort> getQuestionSorts() {
        return this.questionSorts;
    }

    String getSearchPhrase() {
        return this.searchPhrase;
    }
}
