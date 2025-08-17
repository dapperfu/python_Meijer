package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum ReviewOptions {
    ;

    public enum Filter implements UGCOption {
        Id("Id"),
        AuthorId("AuthorId"),
        CampaignId("CampaignId"),
        CategoryAncestorId("CategoryAncestorId"),
        ContentLocale("ContentLocale"),
        HasComments("HasComments"),
        HasPhotos("HasPhotos"),
        HasTags("HasTags"),
        HasVideos("HasVideos"),
        IsFeatured("IsFeatured"),
        IsRatingsOnly("IsRatingsOnly"),
        IsRecommended("IsRecommended"),
        IsSubjectActive("IsSubjectActive"),
        IsSyndicated("IsSyndicated"),
        LastModeratedTime("LastModeratedTime"),
        LastModificationTime("LastModificationTime"),
        ModeratorCode("ModeratorCode"),
        ProductId("ProductId"),
        Rating("Rating"),
        SubmissionId("SubmissionId"),
        SubmissionTime("SubmissionTime"),
        TotalCommentCount("TotalCommentCount"),
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

    public enum PrimaryFilter implements UGCOption {
        AuthorId("AuthorId"),
        Id("Id"),
        ProductId("ProductId"),
        SubmissionId("SubmissionId"),
        CategoryAncestorId("CategoryAncestorId"),
        ContentLocale("ContentLocale"),
        HasComments("HasComments"),
        HasPhotos("HasPhotos"),
        HasTags("HasTags"),
        HasVideos("HasVideos"),
        Helpfulness("Helpfulness"),
        IsFeatured("IsFeatured"),
        IsRatingsOnly("IsRatingsOnly"),
        IsRecommended("IsRecommended"),
        IsSubjectActive("IsSubjectActive"),
        IsSyndicated("IsSyndicated"),
        LastModeratedTime("LastModeratedTime"),
        LastModificationTime("LastModificationTime"),
        Rating("Rating"),
        SubmissionTime("SubmissionTime"),
        TotalCommentCount("TotalCommentCount"),
        TotalFeedbackCount("TotalFeedbackCount"),
        TotalNegativeFeedbackCount("TotalNegativeFeedbackCount"),
        TotalPositiveFeedbackCount("TotalPositiveFeedbackCount"),
        UserLocation("UserLocation");

        private final String key;

        @Override // com.bazaarvoice.bvandroidsdk.UGCOption
        public String getKey() {
            return this.key;
        }

        PrimaryFilter(String str) {
            this.key = str;
        }
    }

    public enum RelevancySort implements UGCOption {
        Relevancy("relevancy");

        private final String key;

        @Override // com.bazaarvoice.bvandroidsdk.UGCOption
        public String getKey() {
            return this.key;
        }

        RelevancySort(String str) {
            this.key = str;
        }
    }

    public enum Sort implements UGCOption {
        Id("Id"),
        AuthorId("AuthorId"),
        CampaignId("CampaignId"),
        ContentLocale("ContentLocale"),
        HasComments("HasComments"),
        HasPhotos("HasPhotos"),
        HasTags("HasTags"),
        HasVideos("HasVideos"),
        Helpfulness("Helpfulness"),
        IsFeatured("IsFeatured"),
        IsRatingsOnly("IsRatingsOnly"),
        IsRecommended("IsRecommended"),
        IsSubjectActive("IsSubjectActive"),
        IsSyndicated("IsSyndicated"),
        LastModeratedTime("LastModeratedTime"),
        LastModificationTime("LastModificationTime"),
        ProductId("ProductId"),
        Rating("Rating"),
        SubmissionId("SubmissionId"),
        SubmissionTime("SubmissionTime"),
        TotalCommentCount("TotalCommentCount"),
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
