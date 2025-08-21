package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public final class Author extends IncludedContentBase {

    @InterfaceC16127c("Location")
    private String location;

    @InterfaceC16127c("QAStatistics")
    private QAStatistics qaStatistics;

    @InterfaceC16127c("ReviewStatistics")
    private ReviewStatistics reviewStatistics;

    @InterfaceC16127c("SecondaryRatings")
    private Map<String, SecondaryRating> secondaryRatings;

    @InterfaceC16127c("TagDimensions")
    private Map<String, DimensionElement> tagDimensions;

    public String getLocation() {
        return this.location;
    }

    public QAStatistics getQaStatistics() {
        return this.qaStatistics;
    }

    public ReviewStatistics getReviewStatistics() {
        return this.reviewStatistics;
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

    public Map<String, DimensionElement> getTagDimensions() {
        return this.tagDimensions;
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
