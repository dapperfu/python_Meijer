package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsInclude;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
class IncludedContentBase<ConversationsIncludeType extends ConversationsInclude> extends IncludeableContent<ConversationsIncludeType> {

    @InterfaceC15617c(alternate = {"additionalFields"}, value = "AdditionalFields")
    private Map<String, Object> additionalFields;

    @InterfaceC15617c(alternate = {"authorId"}, value = "AuthorId")
    private String authorId;

    @InterfaceC15617c(alternate = {"badges"}, value = "Badges")
    private Map<String, Badge> badges;

    @InterfaceC15617c(alternate = {"campaignId"}, value = "CampaignId")
    private String campaignId;

    @InterfaceC15617c(alternate = {"contentLocale"}, value = "ContentLocale")
    private String contentLocale;

    @InterfaceC15617c(alternate = {"contextDataValues"}, value = "ContextDataValues")
    private Map<String, ContextDataValue> contextDataValues;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC15617c(alternate = {PreferencesHelper.PREF_ID}, value = "Id")
    private String f63014id;

    @InterfaceC15617c(alternate = {"isFeatured"}, value = "IsFeatured")
    private Boolean isFeatured;
    private transient Date lastModeratedDate;

    @InterfaceC15617c(alternate = {"lastModeratedTime"}, value = "LastModeratedTime")
    private String lastModeratedTime;
    private transient Date lastModificationDate;

    @InterfaceC15617c(alternate = {"lastModificationTime"}, value = "LastModificationTime")
    private String lastModificationTime;

    @InterfaceC15617c(alternate = {"moderationStatus"}, value = "ModerationStatus")
    private String moderationStatus;

    @InterfaceC15617c(alternate = {"photos"}, value = "Photos")
    private List<Photo> photos;

    @InterfaceC15617c(alternate = {"productRecommendationIds"}, value = "ProductRecommendationIds")
    private List<String> productRecommendationIds;
    private transient Date submissionDate;

    @InterfaceC15617c(alternate = {"submissionId", "submissionID"}, value = "SubmissionId")
    private String submissionId;

    @InterfaceC15617c(alternate = {"submissionTime"}, value = "SubmissionTime")
    private String submissionTime;

    @InterfaceC15617c(alternate = {"totalFeedbackCount"}, value = "TotalFeedbackCount")
    private Integer totalFeedbackCount;

    @InterfaceC15617c(alternate = {"totalNegativeFeedbackCount"}, value = "TotalNegativeFeedbackCount")
    private Integer totalNegativeFeedbackCount;

    @InterfaceC15617c(alternate = {"totalPositiveFeedbackCount"}, value = "TotalPositiveFeedbackCount")
    private Integer totalPositiveFeedbackCount;

    @InterfaceC15617c(alternate = {"userLocation"}, value = "UserLocation")
    private String userLocation;

    @InterfaceC15617c(alternate = {"userNickname"}, value = "UserNickname")
    private String userNickname;

    @InterfaceC15617c(alternate = {"videos"}, value = "Videos")
    private List<Videos> videos;

    static class ProductIncludedContentBase extends IncludedContentBase {
        private transient Product product;

        @InterfaceC15617c(alternate = {"productExternalID"}, value = "ProductId")
        private String productId;

        /* JADX WARN: Type inference failed for: r0v5, types: [com.bazaarvoice.bvandroidsdk.ConversationsInclude] */
        public Product getProduct() {
            if (this.product == null && super.getIncludedIn() != null && super.getIncludedIn().getItemMap() != null) {
                this.product = (Product) getIncludedIn().getItemMap().get(this.productId);
            }
            return this.product;
        }

        public String getProductId() {
            return this.productId;
        }

        ProductIncludedContentBase() {
        }
    }

    public Map<String, Object> getAdditionalFields() {
        return this.additionalFields;
    }

    public String getAuthorId() {
        return this.authorId;
    }

    public List<Badge> getBadgeList() {
        if (this.badges == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Badge>> it = this.badges.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public Map<String, Badge> getBadges() {
        return this.badges;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public String getContentLocale() {
        return this.contentLocale;
    }

    public List<ContextDataValue> getContextDataValueList() {
        if (this.contextDataValues == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ContextDataValue>> it = this.contextDataValues.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public Map<String, ContextDataValue> getContextDataValues() {
        return this.contextDataValues;
    }

    public Boolean getFeatured() {
        return this.isFeatured;
    }

    public String getId() {
        return this.f63014id;
    }

    public Date getLastModeratedDate() {
        if (this.lastModeratedDate == null) {
            this.lastModeratedDate = DateUtil.dateFromString(this.lastModeratedTime);
        }
        return this.lastModeratedDate;
    }

    public Date getLastModificationDate() {
        if (this.lastModificationDate == null) {
            this.lastModificationDate = DateUtil.dateFromString(this.lastModificationTime);
        }
        return this.lastModificationDate;
    }

    public String getModerationStatus() {
        return this.moderationStatus;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public List<String> getProductRecommendationIds() {
        return this.productRecommendationIds;
    }

    public Date getSubmissionDate() {
        String str;
        if (this.submissionDate == null && (str = this.submissionTime) != null) {
            this.submissionDate = DateUtil.dateFromString(str);
        }
        return this.submissionDate;
    }

    public String getSubmissionId() {
        return this.submissionId;
    }

    public Integer getTotalFeedbackCount() {
        return this.totalFeedbackCount;
    }

    public Integer getTotalNegativeFeedbackCount() {
        return this.totalNegativeFeedbackCount;
    }

    public Integer getTotalPositiveFeedbackCount() {
        return this.totalPositiveFeedbackCount;
    }

    public String getUserLocation() {
        return this.userLocation;
    }

    public String getUserNickname() {
        return this.userNickname;
    }

    public List<Videos> getVideos() {
        return this.videos;
    }

    IncludedContentBase() {
    }
}
