package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum AuthorOptions {
    ;

    public enum Filter implements UGCOption {
        ID("Id"),
        CONTENT_LOCALE("ContentLocale"),
        HAS_PHOTOS("HasPhotos"),
        HAS_VIDEOS("HasVideos"),
        LAST_MODERATED_TIME("LastModeratedTime"),
        MODERATOR_CODE("ModeratorCode"),
        SUBMISSION_TIME("SubmissionTime"),
        TOTAL_ANSWER_COUNT("TotalAnswerCount"),
        TOTAL_QUESTION_COUNT("TotalQuestionCount"),
        TOTAL_REVIEW_COUNT("TotalReviewCount"),
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

    public enum SortOptions {
        ID("Id"),
        CONTENT_LOCALE("ContentLocale"),
        HAS_PHOTOS("HasPhotos"),
        HAS_VIDEOS("HasVideos"),
        LAST_MODERATED_TIME("LastModeratedTime"),
        SUBMISSION_TIME("SubmissionTime"),
        TOTAL_ANSWER_COUNT("TotalAnswerCount"),
        TOTAL_QUESTION_COUNT("TotalQuestionCount"),
        TOTAL_REVIEW_COUNT("TotalReviewCount"),
        USER_LOCATION("UserLocation");

        private String value;

        public String getValue() {
            return this.value;
        }

        SortOptions(String str) {
            this.value = str;
        }
    }
}
