package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class BVProduct implements BVDisplayableProductContent {

    @InterfaceC16127c("avg_rating")
    private float averageRating;

    @InterfaceC16127c("CategoryId")
    private String categoryId;

    @InterfaceC16127c("category_ids")
    private List<String> categoryIds;

    @InterfaceC16127c("image_url")
    private String imageUrl;
    protected boolean impressed = false;

    @InterfaceC16127c("num_reviews")
    private int numReviews;

    @InterfaceC16127c("product")
    private String productId;

    @InterfaceC16127c("name")
    private String productName;

    @InterfaceC16127c("product_page_url")
    private String productPageUrl;
    private RecommendationStats recommendationStats;
    private BVReview review;

    /* renamed from: rs, reason: collision with root package name */
    @InterfaceC16127c("RS")
    private String f63840rs;
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
        return this.f63840rs;
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
        return "BVProduct{, productId='" + this.productId + "', numReviews=" + this.numReviews + ", averageRating=" + this.averageRating + ", imageUrl='" + this.imageUrl + "', productPageUrl='" + this.productPageUrl + "', productName='" + this.productName + "', sponsored=" + this.sponsored + ", review=" + this.review + ", rs=" + this.f63840rs + '}';
    }
}
