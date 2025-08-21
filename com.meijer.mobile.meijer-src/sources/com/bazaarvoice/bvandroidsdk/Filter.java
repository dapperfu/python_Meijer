package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class Filter {
    static final String paramKey = "Filter";
    private final EqualityOperator equalityOperator;
    private final List<String> filterValues;
    private final UGCOption option;

    enum Type implements UGCOption {
        Id("Id"),
        ProductId("ProductId"),
        AverageOverallRating("AverageOverallRating"),
        CategoryAncestorId("CategoryAncestorId"),
        CategoryId("CategoryId"),
        IsActive("IsActive"),
        IsDisabled("IsDisabled"),
        LastAnswerTime("LastAnswerTime"),
        LastQuestionTime("LastQuestionTime"),
        LastReviewTime("LastReviewTime"),
        LastStoryTime("LastStoryTime"),
        Name("Name"),
        RatingsOnlyReviewCount("RatingsOnlyReviewCount"),
        TotalAnswerCount("TotalAnswerCount"),
        TotalQuestionCount("TotalQuestionCount"),
        TotalReviewCount("TotalReviewCount"),
        TotalStoryCount("TotalStoryCount");


        /* renamed from: a, reason: collision with root package name */
        ReviewOptions.Sort f63851a = ReviewOptions.Sort.CampaignId;
        private final String key;

        @Override // com.bazaarvoice.bvandroidsdk.UGCOption
        public String getKey() {
            return this.key;
        }

        Type(String str) {
            this.key = str;
        }
    }

    Filter(UGCOption uGCOption, EqualityOperator equalityOperator, String str) {
        this.option = uGCOption;
        this.equalityOperator = equalityOperator;
        ArrayList arrayList = new ArrayList();
        this.filterValues = arrayList;
        arrayList.add(str);
    }

    public String toString() {
        Collections.sort(this.filterValues);
        return String.format("%s:%s:%s", this.option.getKey(), this.equalityOperator.getKey(), StringUtils.componentsSeparatedByWithEscapes(this.filterValues, ","));
    }

    Filter(UGCOption uGCOption, EqualityOperator equalityOperator, List<String> list) {
        this.option = uGCOption;
        this.equalityOperator = equalityOperator;
        this.filterValues = list;
        Collections.sort(list);
    }
}
