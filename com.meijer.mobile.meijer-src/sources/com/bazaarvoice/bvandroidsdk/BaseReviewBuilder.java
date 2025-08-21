package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BaseReviewBuilder;
import com.bazaarvoice.bvandroidsdk.BaseReviewSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class BaseReviewBuilder<ChildBuilderType extends BaseReviewBuilder> extends ConversationsSubmissionRequest.Builder<ChildBuilderType> {
    final Map<String, String> additionalFields;
    final Map<String, String> contextDataValues;
    final Map<String, String> freeFormTags;
    Boolean isRecommended;
    String netPromoterComment;
    Integer netPromoterScore;
    final List<BaseReviewSubmissionRequest.PredefinedTag> predefinedTags;
    final String productId;
    int rating;
    final Map<String, Integer> ratingQuestions;
    final Map<String, String> ratingSliders;
    String reviewText;
    Boolean sendEmailAlertWhenCommented;
    String title;
    List<VideoSubmissionData> videoSubmissionData;

    public ChildBuilderType addAdditionalField(String str, String str2) {
        this.additionalFields.put(str, str2);
        return this;
    }

    public ChildBuilderType addContextDataValueBoolean(String str, boolean z10) {
        this.contextDataValues.put(str, String.valueOf(z10));
        return this;
    }

    public ChildBuilderType addContextDataValueString(String str, String str2) {
        this.contextDataValues.put(str, str2);
        return this;
    }

    public ChildBuilderType addFreeFormTag(String str, String str2) {
        this.freeFormTags.put(str, str2);
        return this;
    }

    public ChildBuilderType addPredefinedTag(String str, String str2, String str3) {
        this.predefinedTags.add(new BaseReviewSubmissionRequest.PredefinedTag(str, str2, str3));
        return this;
    }

    public ChildBuilderType addRatingQuestion(String str, int i10) {
        this.ratingQuestions.put(str, Integer.valueOf(i10));
        return this;
    }

    public ChildBuilderType addRatingSlider(String str, String str2) {
        this.ratingSliders.put(str, str2);
        return this;
    }

    public ChildBuilderType addVideoUrl(String str, String str2) {
        this.videoSubmissionData.add(new VideoSubmissionData(str, str2));
        return this;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
    PhotoUpload.ContentType getPhotoContentType() {
        return PhotoUpload.ContentType.REVIEW;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest.Builder
    VideoUpload.ContentType getVideoContentType() {
        return VideoUpload.ContentType.REVIEW;
    }

    public ChildBuilderType isRecommended(Boolean bool) {
        this.isRecommended = bool;
        return this;
    }

    public ChildBuilderType netPromoterComment(String str) {
        this.netPromoterComment = str;
        return this;
    }

    public ChildBuilderType netPromoterScore(Integer num) {
        this.netPromoterScore = num;
        return this;
    }

    public ChildBuilderType rating(int i10) {
        this.rating = i10;
        return this;
    }

    public ChildBuilderType reviewText(String str) {
        this.reviewText = str;
        return this;
    }

    public ChildBuilderType sendEmailAlertWhenCommented(Boolean bool) {
        this.sendEmailAlertWhenCommented = bool;
        return this;
    }

    public ChildBuilderType title(String str) {
        this.title = str;
        return this;
    }

    BaseReviewBuilder(Action action, String str) {
        super(action);
        this.freeFormTags = new HashMap();
        this.predefinedTags = new ArrayList();
        this.additionalFields = new HashMap();
        this.contextDataValues = new HashMap();
        this.ratingSliders = new HashMap();
        this.ratingQuestions = new HashMap();
        this.videoSubmissionData = new ArrayList();
        this.productId = str;
    }
}
