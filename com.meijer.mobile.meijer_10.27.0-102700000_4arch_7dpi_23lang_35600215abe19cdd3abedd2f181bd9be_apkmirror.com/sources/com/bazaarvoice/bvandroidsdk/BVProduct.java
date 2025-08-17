package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class BVProduct implements BVDisplayableProductContent {

    @InterfaceC15617c("avg_rating")
    private float averageRating;

    @InterfaceC15617c("CategoryId")
    private String categoryId;

    @InterfaceC15617c("category_ids")
    private List<String> categoryIds;

    @InterfaceC15617c("image_url")
    private String imageUrl;
    protected boolean impressed = false;

    @InterfaceC15617c("num_reviews")
    private int numReviews;

    @InterfaceC15617c("product")
    private String productId;

    @InterfaceC15617c("name")
    private String productName;

    @InterfaceC15617c("product_page_url")
    private String productPageUrl;
    private RecommendationStats recommendationStats;
    private BVReview review;

    /* renamed from: rs, reason: collision with root package name */
    @InterfaceC15617c("RS")
    private String f63001rs;
    private boolean sponsored;

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public float getAverageRating() {
        return this.averageRating;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public List<String> getCategoryIds() {
        return this.categoryIds;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getDisplayImageUrl() {
        return this.imageUrl;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getDisplayName() {
        return this.productName;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getId() {
        return this.productId;
    }

    @Deprecated
    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getNumReviews() {
        return this.numReviews;
    }

    @Deprecated
    public String getProductId() {
        return this.productId;
    }

    @Deprecated
    public String getProductName() {
        return this.productName;
    }

    public String getProductPageUrl() {
        return this.productPageUrl;
    }

    RecommendationStats getRecommendationStats() {
        return this.recommendationStats;
    }

    public BVReview getReview() {
        return this.review;
    }

    public String getRs() {
        return this.f63001rs;
    }

    public boolean isImpressed() {
        return this.impressed;
    }

    public boolean isSponsored() {
        return this.sponsored;
    }

    void mergeRecommendationStats(RecommendationStats recommendationStats) {
        this.recommendationStats = recommendationStats;
    }

    public String toString() {
        return "BVProduct{, productId='" + this.productId + "', numReviews=" + this.numReviews + ", averageRating=" + this.averageRating + ", imageUrl='" + this.imageUrl + "', productPageUrl='" + this.productPageUrl + "', productName='" + this.productName + "', sponsored=" + this.sponsored + ", review=" + this.review + ", rs=" + this.f63001rs + '}';
    }
}
