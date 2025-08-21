package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum AnswerOptions {
    ;

    public enum Sort implements UGCOption {
        Id("Id"),
        AuthorId("AuthorId"),
        CampaignId("CampaignId"),
        ContentLocale("ContentLocale"),
        HasPhotos("HasPhotos"),
        IsBestAnswer("IsBestAnswer"),
        IsFeatured("IsFeatured"),
        LastModeratedTime("LastModeratedTime"),
        LastModificationTime("LastModificationTime"),
        ProductId("ProductId"),
        QuestionId("QuestionId"),
        SubmissionId("SubmissionId"),
        SubmissionTime("SubmissionTime"),
        TotalFeedbackCount("TotalFeedbackCount"),
        TotalNegativeFeedbackCount("TotalNegativeFeedbackCount"),
        TotalPositiveFeedbackCount("TotalPositiveFeedbackCount"),
        UserLocation("UserLocation");

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
