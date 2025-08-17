package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.IncludedContentBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public abstract class BaseReview extends IncludedContentBase.ProductIncludedContentBase {

    @InterfaceC15617c(alternate = {"clientResponses"}, value = "ClientResponses")
    private List<Object> clientResponses;

    @InterfaceC15617c(alternate = {"commentIds"}, value = "CommentIds")
    private List<Integer> commentIds;

    @InterfaceC15617c(alternate = {"cons"}, value = "Cons")
    private String cons;

    @InterfaceC15617c(alternate = {"helpfulness"}, value = "Helpfulness")
    private String helpfulness;

    @InterfaceC15617c(alternate = {"isRatingsOnly"}, value = "IsRatingsOnly")
    private Boolean isRatingsOnly;

    @InterfaceC15617c(alternate = {"isRecommended"}, value = "IsRecommended")
    private Boolean isRecommended;

    @InterfaceC15617c(alternate = {"isSyndicated"}, value = "IsSyndicated")
    private Boolean isSyndicated;

    @InterfaceC15617c(alternate = {"originalProductName"}, value = "OriginalProductName")
    private String originalProductName;

    @InterfaceC15617c(alternate = {"pros"}, value = "Pros")
    private String pros;

    @InterfaceC15617c(alternate = {"rating"}, value = "Rating")
    private Integer rating;

    @InterfaceC15617c(alternate = {"ratingRange"}, value = "RatingRange")
    private String ratingRange;

    @InterfaceC15617c(alternate = {"reviewText"}, value = "ReviewText")
    private String reviewText;

    @InterfaceC15617c(alternate = {"secondaryRatings"}, value = "SecondaryRatings")
    private Map<String, SecondaryRating> secondaryRatings;

    @InterfaceC15617c(alternate = {"sendEmailAlertWhenCommented"}, value = "SendEmailAlertWhenCommented")
    private Boolean sendEmailAlertWhenCommented;

    @InterfaceC15617c(alternate = {"sendEmailAlertWhenPublished"}, value = "SendEmailAlertWhenPublished")
    private Boolean sendEmailAlertWhenPublished;

    @InterfaceC15617c(alternate = {"sourceClient"}, value = "SourceClient")
    private String sourceClient;

    @InterfaceC15617c(alternate = {"syndicationSource"}, value = "SyndicationSource")
    private SyndicatedSource syndicatedSource;

    @InterfaceC15617c(alternate = {"tagDimension"}, value = "TagDimensions")
    private Map<String, DimensionElement> tagDimensions;

    @InterfaceC15617c(alternate = {"title"}, value = "Title")
    private String title;

    @InterfaceC15617c(alternate = {"totalCommentCount"}, value = "TotalCommentCount")
    private Integer totalCommentCount;

    @InterfaceC15617c(alternate = {"typicalHoursToPost"}, value = "TypicalHoursToPost")
    private Integer typicalHoursToPost;

    public List<Object> getClientResponses() {
        return this.clientResponses;
    }

    public List<Integer> getCommentIds() {
        return this.commentIds;
    }

    public String getCons() {
        return this.cons;
    }

    public String getHelpfulness() {
        return this.helpfulness;
    }

    public String getOriginalProductName() {
        return this.originalProductName;
    }

    public String getPros() {
        return this.pros;
    }

    public Integer getRating() {
        return this.rating;
    }

    public String getRatingRange() {
        return this.ratingRange;
    }

    public Boolean getRatingsOnly() {
        return this.isRatingsOnly;
    }

    public Boolean getRecommended() {
        return this.isRecommended;
    }

    public String getReviewText() {
        return this.reviewText;
    }

    public List<SecondaryRating> getSecondaryRatingList() {
        if (this.secondaryRatings == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, SecondaryRating>> it = this.secondaryRatings.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public Map<String, SecondaryRating> getSecondaryRatings() {
        return this.secondaryRatings;
    }

    public Boolean getSendEmailAlertWhenCommented() {
        return this.sendEmailAlertWhenCommented;
    }

    public Boolean getSendEmailAlertWhenPublished() {
        return this.sendEmailAlertWhenPublished;
    }

    public String getSourceClient() {
        return this.sourceClient;
    }

    public Boolean getSyndicated() {
        return this.isSyndicated;
    }

    public SyndicatedSource getSyndicatedSource() {
        return this.syndicatedSource;
    }

    public Map<String, DimensionElement> getTagDimensions() {
        return this.tagDimensions;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getTotalCommentCount() {
        return this.totalCommentCount;
    }

    public Integer getTypicalHoursToPost() {
        return this.typicalHoursToPost;
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

    public List<Comment> getComments() {
        return getIncludedIn().getComments();
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
