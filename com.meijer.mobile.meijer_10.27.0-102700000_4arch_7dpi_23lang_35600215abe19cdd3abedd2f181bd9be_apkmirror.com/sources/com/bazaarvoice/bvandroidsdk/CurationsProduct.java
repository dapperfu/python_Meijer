package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class CurationsProduct implements BVDisplayableProductContent {

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC15617c("Id")
    protected String f63008id;

    @InterfaceC15617c("Description")
    protected String productDescription;

    @InterfaceC15617c("ImageUrl")
    protected String productImageUrl;

    @InterfaceC15617c("Name")
    protected String productName;

    @InterfaceC15617c("ProductPageUrl")
    protected String productPageUrl;

    @InterfaceC15617c("ReviewStatistics")
    protected ReviewStatistics productReviewStatistics;

    public class ReviewStatistics {

        @InterfaceC15617c("AverageOverallRating")
        protected float avgRating;

        @InterfaceC15617c("TotalReviewCount")
        protected int numReviews;

        public ReviewStatistics() {
        }

        public float getAvgRating() {
            return this.avgRating;
        }

        public int getNumReviews() {
            return this.numReviews;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public float getAverageRating() {
        return this.productReviewStatistics.getAvgRating();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getDisplayImageUrl() {
        return this.productImageUrl;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getDisplayName() {
        return this.productName;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVDisplayableProductContent
    public String getId() {
        return this.f63008id;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    @Deprecated
    public String getProductImageUrl() {
        return this.productImageUrl;
    }

    @Deprecated
    public String getProductName() {
        return this.productName;
    }

    public String getProductPageUrl() {
        return this.productPageUrl;
    }

    public ReviewStatistics getProductReviewStatistics() {
        return this.productReviewStatistics;
    }
}
