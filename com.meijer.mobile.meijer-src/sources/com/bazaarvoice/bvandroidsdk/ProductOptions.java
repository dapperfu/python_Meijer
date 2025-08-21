package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum ProductOptions {
    ;

    public enum Filter implements UGCOption {
        Id("Id"),
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

        private final String key;

        @Override // com.bazaarvoice.bvandroidsdk.UGCOption
        public String getKey() {
            return this.key;
        }

        Filter(String str) {
            this.key = str;
        }
    }

    public enum Sort implements UGCOption {
        Id("Id"),
        AverageOverallRating("AverageOverallRating"),
        CategoryId("CategoryId"),
        IsActive("IsActive"),
        IsDisabled("IsDisabled"),
        LastAnswerTime("LastAnswerTime"),
        LastQuestionTime("LastQuestionTime"),
        LastReviewTime("LastReviewTime"),
        LastStoryTime("LastStoryTime"),
        Name("Name"),
        Rating("Rating"),
        RatingsOnlyReviewCount("RatingsOnlyReviewCount"),
        TotalAnswerCount("TotalAnswerCount"),
        TotalQuestionCount("TotalQuestionCount"),
        TotalReviewCount("TotalReviewCount"),
        TotalStoryCount("TotalStoryCount");

        private final String key;

        @Override // com.bazaarvoice.bvandroidsdk.UGCOption
        public String getKey() {
            return this.key;
        }

        Sort(String str) {
            this.key = str;
        }
    }
}
