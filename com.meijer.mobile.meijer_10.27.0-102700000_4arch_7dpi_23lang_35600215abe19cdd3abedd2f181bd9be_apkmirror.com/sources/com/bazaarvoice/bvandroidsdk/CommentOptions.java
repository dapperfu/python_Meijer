package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum CommentOptions {
    ;

    public enum Filter implements UGCOption {
        ID("Id"),
        AUTHOR_ID("AuthorId"),
        CAMPAIGN_ID("CampaignId"),
        CATEGORY_ANCESTOR_ID("CategoryAncestorId"),
        CONTENT_LOCALE("ContentLocale"),
        IS_FEATURED("IsFeatured"),
        LAST_MODERATED_TIME("LastModeratedTime"),
        LAST_MODIFICATION_TIME("LastModificationTime"),
        MODERATOR_CODE("ModeratorCode"),
        PRODUCT_ID("ProductId"),
        REVIEW_ID("ReviewId"),
        SUBMISSION_ID("SubmissionId"),
        SUBMISSION_TIME("SubmissionTime"),
        TOTAL_FEEDBACK_COUNT("TotalFeedbackCount"),
        TOTAL_NEGATIVE_FEEDBACK_COUNT("TotalNegativeFeedbackCount"),
        TOTAL_POSITIVE_FEEDBACK_COUNT("TotalPositiveFeedbackCount"),
        USER_LOCATION("UserLocation");

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
        ID("Id"),
        AUTHOR_ID("AuthorId"),
        CAMPAIGN_ID("CampaignId"),
        CONTENT_LOCALE("ContentLocale"),
        IS_FEATURED("IsFeatured"),
        LAST_MODERATED_TIME("LastModeratedTime"),
        LAST_MODIFICATION_TIME("LastModificationTime"),
        PRODUCT_ID("ProductId"),
        REVIEW_ID("ReviewId"),
        SUBMISSION_ID("SubmissionId"),
        SUBMISSION_TIME("SubmissionTime"),
        TOTAL_FEEDBACK_COUNT("TotalFeedbackCount"),
        TOTAL_NEGATIVE_FEEDBACK_COUNT("TotalNegativeFeedbackCount"),
        TOTAL_POSITIVE_FEEDBACK_COUNT("TotalPositiveFeedbackCount"),
        USER_LOCATION("UserLocation");

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
