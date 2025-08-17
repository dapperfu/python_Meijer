package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class StoreReviewSubmissionRequest extends BaseReviewSubmissionRequest {

    public static class Builder extends BaseReviewBuilder<Builder> {
        public StoreReviewSubmissionRequest build() {
            return new StoreReviewSubmissionRequest(this);
        }

        public Builder(Action action, String str) {
            super(action, str);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addAdditionalField(String str, String str2) {
            return super.addAdditionalField(str, str2);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addContextDataValueBoolean(String str, boolean z10) {
            return super.addContextDataValueBoolean(str, z10);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addContextDataValueString(String str, String str2) {
            return super.addContextDataValueString(str, str2);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addFreeFormTag(String str, String str2) {
            return super.addFreeFormTag(str, str2);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addPredefinedTag(String str, String str2, String str3) {
            return super.addPredefinedTag(str, str2, str3);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addRatingQuestion(String str, int i10) {
            return super.addRatingQuestion(str, i10);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addRatingSlider(String str, String str2) {
            return super.addRatingSlider(str, str2);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder addVideoUrl(String str, String str2) {
            return super.addVideoUrl(str, str2);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder isRecommended(Boolean bool) {
            return super.isRecommended(bool);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder netPromoterComment(String str) {
            return super.netPromoterComment(str);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder netPromoterScore(Integer num) {
            return super.netPromoterScore(num);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder rating(int i10) {
            return super.rating(i10);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder reviewText(String str) {
            return super.reviewText(str);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder sendEmailAlertWhenCommented(Boolean bool) {
            return super.sendEmailAlertWhenCommented(bool);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BaseReviewBuilder
        public /* bridge */ /* synthetic */ BaseReviewBuilder title(String str) {
            return super.title(str);
        }
    }

    StoreReviewSubmissionRequest(Builder builder) {
        super(builder);
    }
}
