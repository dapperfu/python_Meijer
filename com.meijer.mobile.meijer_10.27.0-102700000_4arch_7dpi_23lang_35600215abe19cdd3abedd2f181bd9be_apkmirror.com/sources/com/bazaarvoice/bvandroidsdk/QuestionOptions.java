package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum QuestionOptions {
    ;

    public enum Filter implements UGCOption {
        Id("Id"),
        AuthorId("AuthorId"),
        CampaignId("CampaignId"),
        CategoryAncestorId("CategoryAncestorId"),
        CategoryId("CategoryId"),
        ContentLocale("ContentLocale"),
        HasAnswers("HasAnswers"),
        HasBestAnswer("HasBestAnswer"),
        HasBrandAnswers("HasBrandAnswers"),
        HasPhotos("HasPhotos"),
        HasStaffAnswers("HasStaffAnswers"),
        HasTags("HasTags"),
        HasVideos("HasVideos"),
        IsFeatured("IsFeatured"),
        IsSubjectActive("IsSubjectActive"),
        LastApprovedAnswerSubmissionTime("LastApprovedAnswerSubmissionTime"),
        LastModeratedTime("LastModeratedTime"),
        LastModificationTime("LastModificationTime"),
        ModeratorCode("ModeratorCode"),
        SubmissionId("SubmissionId"),
        SubmissionTime("SubmissionTime"),
        Summary("Summary"),
        TotalAnswerCount("TotalAnswerCount"),
        TotalFeedbackCount("TotalFeedbackCount"),
        TotalNegativeFeedbackCount("TotalNegativeFeedbackCount"),
        TotalPositiveFeedbackCount("TotalPositiveFeedbackCount"),
        UserLocation("UserLocation");

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
        AuthorId("AuthorId"),
        CampaignId("CampaignId"),
        ContentLocale("ContentLocale"),
        HasAnswers("HasAnswers"),
        HasBestAnswer("HasBestAnswer"),
        HasPhotos("HasPhotos"),
        HasStaffAnswers("HasStaffAnswers"),
        HasVideos("HasVideos"),
        IsFeatured("IsFeatured"),
        IsSubjectActive("IsSubjectActive"),
        LastApprovedAnswerSubmissionTime("LastApprovedAnswerSubmissionTime"),
        LastModeratedTime("LastModeratedTime"),
        LastModificationTime("LastModificationTime"),
        ProductId("ProductId"),
        SubmissionId("SubmissionId"),
        SubmissionTime("SubmissionTime"),
        Summary("Summary"),
        TotalAnswerCount("TotalAnswerCount"),
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
