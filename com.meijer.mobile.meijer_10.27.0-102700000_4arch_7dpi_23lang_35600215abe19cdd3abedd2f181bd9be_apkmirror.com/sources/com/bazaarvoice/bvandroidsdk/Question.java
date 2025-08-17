package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.IncludedContentBase;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class Question extends IncludedContentBase.ProductIncludedContentBase {

    @InterfaceC15617c("AnswerIds")
    private List<String> answerIds;
    private transient List<Answer> answers;

    @InterfaceC15617c("IsSyndicated")
    private boolean isSyndicated;

    @InterfaceC15617c("QuestionDetails")
    private String questionDetails;

    @InterfaceC15617c("QuestionSummary")
    private String questionSummary;

    @InterfaceC15617c(alternate = {"sourceClient"}, value = "SourceClient")
    private String sourceClient;

    @InterfaceC15617c("SyndicationSource")
    private SyndicatedSource syndicatedSource;

    @InterfaceC15617c("TagDimensions")
    private Map<String, DimensionElement> tagDimensions;

    @InterfaceC15617c("TotalAnswerCount")
    private Integer totalAnswerCount;

    @InterfaceC15617c("TotalInappropriateFeedbackCount")
    private Integer totalInappropriateFeedbackCount;

    public List<Answer> getAnswers() {
        if (this.answers == null && this.answerIds != null && super.getIncludedIn().getAnswers() != null) {
            this.answers = new ArrayList();
            Iterator<String> it = this.answerIds.iterator();
            while (it.hasNext()) {
                Answer answer = super.getIncludedIn().getAnswerMap().get(it.next());
                if (answer != null) {
                    this.answers.add(answer);
                }
            }
        }
        return this.answers;
    }

    public String getQuestionDetails() {
        return this.questionDetails;
    }

    public String getQuestionSummary() {
        return this.questionSummary;
    }

    public String getSourceClient() {
        return this.sourceClient;
    }

    public SyndicatedSource getSyndicatedSource() {
        return this.syndicatedSource;
    }

    public Map<String, DimensionElement> getTagDimensions() {
        return this.tagDimensions;
    }

    public Integer getTotalAnswerCount() {
        return this.totalAnswerCount;
    }

    public Integer getTotalInappropriateFeedbackCount() {
        return this.totalInappropriateFeedbackCount;
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

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase.ProductIncludedContentBase
    public /* bridge */ /* synthetic */ Product getProduct() {
        return super.getProduct();
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludedContentBase.ProductIncludedContentBase
    public /* bridge */ /* synthetic */ String getProductId() {
        return super.getProductId();
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
