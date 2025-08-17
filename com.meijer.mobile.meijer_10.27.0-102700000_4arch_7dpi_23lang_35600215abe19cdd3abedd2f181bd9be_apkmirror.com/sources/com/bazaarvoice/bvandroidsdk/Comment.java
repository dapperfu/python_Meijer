package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.IncludedContentBase;
import java.util.Date;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class Comment extends IncludedContentBase.ProductIncludedContentBase {

    @InterfaceC15617c("CID")
    private String cid;

    @InterfaceC15617c("CommentText")
    private String commentText;

    @InterfaceC15617c("IsSyndicated")
    private boolean isSyndicated;

    @InterfaceC15617c("ReviewId")
    private String reviewId;

    @InterfaceC15617c("SourceClient")
    private String sourceClient;

    @InterfaceC15617c("SyndicationSource")
    private SyndicatedSource syndicatedSource;

    @InterfaceC15617c("Title")
    private String title;

    public String getCid() {
        return this.cid;
    }

    public String getCommentText() {
        return this.commentText;
    }

    public String getReviewId() {
        return this.reviewId;
    }

    public String getSourceClient() {
        return this.sourceClient;
    }

    public SyndicatedSource getSyndicatedSource() {
        return this.syndicatedSource;
    }

    public String getTitle() {
        return this.title;
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
