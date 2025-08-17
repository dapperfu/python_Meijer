package com.bazaarvoice.bvandroidsdk;

import java.util.Date;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class Answer extends IncludedContentBase<ConversationsIncludeProduct> {

    @InterfaceC15617c("AnswerText")
    private String answerText;

    @InterfaceC15617c("BrandImageLogoURL")
    private String brandImageLogoUrl;

    @InterfaceC15617c("IsSyndicated")
    private boolean isSyndicated;
    private transient Question question;

    @InterfaceC15617c("QuestionId")
    private String questionId;

    @InterfaceC15617c(alternate = {"sourceClient"}, value = "SourceClient")
    private String sourceClient;

    @InterfaceC15617c("SyndicationSource")
    private SyndicatedSource syndicatedSource;

    public String getAnswerText() {
        return this.answerText;
    }

    public String getBrandImageLogoUrl() {
        return this.brandImageLogoUrl;
    }

    public Question getQuestion() {
        if (this.question == null && getIncludedIn() != null && ((ConversationsIncludeProduct) getIncludedIn()).getQuestions() != null) {
            this.question = ((ConversationsIncludeProduct) getIncludedIn()).getQuestionMap().get(this.questionId);
        }
        return this.question;
    }

    public String getSourceClient() {
        return this.sourceClient;
    }

    public SyndicatedSource getSyndicatedSource() {
        return this.syndicatedSource;
    }

    public boolean isSyndicated() {
        return this.isSyndicated;
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Map getAdditionalFields() {
        return super.getAdditionalFields();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getAuthorId() {
        return super.getAuthorId();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ List getBadgeList() {
        return super.getBadgeList();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Map getBadges() {
        return super.getBadges();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getCampaignId() {
        return super.getCampaignId();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getContentLocale() {
        return super.getContentLocale();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ List getContextDataValueList() {
        return super.getContextDataValueList();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Map getContextDataValues() {
        return super.getContextDataValues();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Boolean getFeatured() {
        return super.getFeatured();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getId() {
        return super.getId();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludeableContent
    public /* bridge */ /* synthetic */ ConversationsInclude getIncludedIn() {
        return super.getIncludedIn();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Date getLastModeratedDate() {
        return super.getLastModeratedDate();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Date getLastModificationDate() {
        return super.getLastModificationDate();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getModerationStatus() {
        return super.getModerationStatus();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ List getPhotos() {
        return super.getPhotos();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ List getProductRecommendationIds() {
        return super.getProductRecommendationIds();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Date getSubmissionDate() {
        return super.getSubmissionDate();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getSubmissionId() {
        return super.getSubmissionId();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Integer getTotalFeedbackCount() {
        return super.getTotalFeedbackCount();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Integer getTotalNegativeFeedbackCount() {
        return super.getTotalNegativeFeedbackCount();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ Integer getTotalPositiveFeedbackCount() {
        return super.getTotalPositiveFeedbackCount();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getUserLocation() {
        return super.getUserLocation();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ String getUserNickname() {
        return super.getUserNickname();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase
    public /* bridge */ /* synthetic */ List getVideos() {
        return super.getVideos();
    }
}
