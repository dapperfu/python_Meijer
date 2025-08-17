package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
abstract class BaseReviewSubmissionRequest extends ConversationsSubmissionRequest {
    private final Map<String, String> additionalFields;
    private final Map<String, String> contextDataValues;
    private final Map<String, String> freeFormTags;
    private final Boolean isRecommended;
    private final String netPromoterComment;
    private final Integer netPromoterScore;
    private final List<PredefinedTag> predefinedTags;
    private final String productId;
    private final int rating;
    private final Map<String, Integer> ratingQuestions;
    private final Map<String, String> ratingSliders;
    private final String reviewText;
    private final Boolean sendEmailAlertWhenCommented;
    private final String title;
    private final List<VideoSubmissionData> videoSubmissionData;

    static final class PredefinedTag {
        private final String questionId;
        private final String tagId;
        private final String value;

        public String getQuestionId() {
            return this.questionId;
        }

        public String getTagId() {
            return this.tagId;
        }

        public String getValue() {
            return this.value;
        }

        public PredefinedTag(String str, String str2, String str3) {
            this.questionId = str;
            this.tagId = str2;
            this.value = str3;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsRequest
    BazaarException getError() {
        return null;
    }

    Map<String, String> getAdditionalFields() {
        return this.additionalFields;
    }

    Map<String, String> getContextDataValues() {
        return this.contextDataValues;
    }

    Map<String, String> getFreeFormTags() {
        return this.freeFormTags;
    }

    String getNetPromoterComment() {
        return this.netPromoterComment;
    }

    Integer getNetPromoterScore() {
        return this.netPromoterScore;
    }

    List<PredefinedTag> getPredefinedTags() {
        return this.predefinedTags;
    }

    String getProductId() {
        return this.productId;
    }

    int getRating() {
        return this.rating;
    }

    Map<String, Integer> getRatingQuestions() {
        return this.ratingQuestions;
    }

    Map<String, String> getRatingSliders() {
        return this.ratingSliders;
    }

    Boolean getRecommended() {
        return this.isRecommended;
    }

    String getReviewText() {
        return this.reviewText;
    }

    Boolean getSendEmailAlertWhenCommented() {
        return this.sendEmailAlertWhenCommented;
    }

    String getTitle() {
        return this.title;
    }

    List<VideoSubmissionData> getVideoSubmissionData() {
        return this.videoSubmissionData;
    }

    BaseReviewSubmissionRequest(BaseReviewBuilder baseReviewBuilder) {
        super(baseReviewBuilder);
        this.productId = baseReviewBuilder.productId;
        this.isRecommended = baseReviewBuilder.isRecommended;
        this.sendEmailAlertWhenCommented = baseReviewBuilder.sendEmailAlertWhenCommented;
        this.rating = baseReviewBuilder.rating;
        this.netPromoterScore = baseReviewBuilder.netPromoterScore;
        this.title = baseReviewBuilder.title;
        this.reviewText = baseReviewBuilder.reviewText;
        this.netPromoterComment = baseReviewBuilder.netPromoterComment;
        this.freeFormTags = baseReviewBuilder.freeFormTags;
        this.predefinedTags = baseReviewBuilder.predefinedTags;
        this.additionalFields = baseReviewBuilder.additionalFields;
        this.contextDataValues = baseReviewBuilder.contextDataValues;
        this.ratingSliders = baseReviewBuilder.ratingSliders;
        this.ratingQuestions = baseReviewBuilder.ratingQuestions;
        this.videoSubmissionData = baseReviewBuilder.videoSubmissionData;
    }
}
