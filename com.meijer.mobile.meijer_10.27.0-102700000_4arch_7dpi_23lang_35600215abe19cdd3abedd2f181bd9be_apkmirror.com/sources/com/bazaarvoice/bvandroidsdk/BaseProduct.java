package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public abstract class BaseProduct<AttributeType> extends IncludeableContent implements BVDisplayableProductContent {
    private List<String> EANs;
    private List<String> ISBNs;
    private List<String> UPCs;

    @InterfaceC15617c("Attributes")
    private Map<String, AttributeType> attributes;

    @InterfaceC15617c("AttributesOrder")
    private List<String> attributesOrder;

    @InterfaceC15617c("Brand")
    private Map<String, Object> brand;

    @InterfaceC15617c("BrandExternalId")
    private String brandExternalId;

    @InterfaceC15617c("CategoryId")
    private String categoryId;

    @InterfaceC15617c("FamilyIds")
    private List<String> familyIds;

    @InterfaceC15617c("FilteredReviewStatistics")
    private ReviewStatistics filteredReviewStatistics;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC15617c("Id")
    private String f63003id;

    @InterfaceC15617c("ImageUrl")
    private String imageUrl;

    @InterfaceC15617c("ManufacturerPartNumbers")
    private List<String> manufacturerPartNumbers;

    @InterfaceC15617c("ModelNumbers")
    private List<String> modelNumbers;

    @InterfaceC15617c("Name")
    private String name;

    @InterfaceC15617c(alternate = {"Description"}, value = "ProductDescription")
    private String productDescription;

    @InterfaceC15617c("ProductPageUrl")
    private String productPageUrl;

    @InterfaceC15617c("ReviewStatistics")
    private ReviewStatistics reviewStatistics;
    private transient List<BaseReview> reviews;

    @InterfaceC15617c("ReviewIds")
    private List<String> reviewsIds;

    @InterfaceC15617c("StoryStatistics")
    private StoryStatistics storyStatistics;

    public Map<String, AttributeType> getAttributes() {
        return this.attributes;
    }

    public List<String> getAttributesOrder() {
        return this.attributesOrder;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public float getAverageRating() {
        ReviewStatistics reviewStatistics = this.reviewStatistics;
        if (reviewStatistics != null) {
            return reviewStatistics.getAverageOverallRating().floatValue();
        }
        return 0.0f;
    }

    public Map<String, Object> getBrand() {
        return this.brand;
    }

    public String getBrandExternalId() {
        return this.brandExternalId;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getDisplayImageUrl() {
        return this.imageUrl;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getDisplayName() {
        return this.name;
    }

    public List<String> getEANs() {
        return this.EANs;
    }

    public List<String> getFamilyIds() {
        return this.familyIds;
    }

    public List<String> getISBNs() {
        return this.ISBNs;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getId() {
        return this.f63003id;
    }

    @Deprecated
    public String getImageUrl() {
        return this.imageUrl;
    }

    public List<String> getManufacturerPartNumbers() {
        return this.manufacturerPartNumbers;
    }

    public List<String> getModelNumbers() {
        return this.modelNumbers;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public String getProductPageUrl() {
        return this.productPageUrl;
    }

    protected <ReviewType extends BaseReview> List<ReviewType> getReviewList() {
        if (this.reviews == null && this.reviewsIds != null && super.getIncludedIn().getReviewsList() != null) {
            this.reviews = new ArrayList();
            Iterator<String> it = this.reviewsIds.iterator();
            while (it.hasNext()) {
                ReviewType reviewtype = super.getIncludedIn().getReviewMap().get(it.next());
                if (reviewtype != null) {
                    this.reviews.add(reviewtype);
                }
            }
        }
        return (List<ReviewType>) this.reviews;
    }

    public ReviewStatistics getReviewStatistics() {
        ReviewStatistics reviewStatistics = this.filteredReviewStatistics;
        return reviewStatistics != null ? reviewStatistics : this.reviewStatistics;
    }

    public List<String> getReviewsIds() {
        return this.reviewsIds;
    }

    public List<String> getUPCs() {
        return this.UPCs;
    }

    @Override // com.bazaarvoice.bvandroidsdk.IncludeableContent
    public /* bridge */ /* synthetic */ ConversationsInclude getIncludedIn() {
        return super.getIncludedIn();
    }
}
