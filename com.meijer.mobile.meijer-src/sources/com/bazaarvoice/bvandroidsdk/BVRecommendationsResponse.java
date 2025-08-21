package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class BVRecommendationsResponse {
    private boolean didSucceed;
    private Throwable errorThrowable;
    private ShopperProfile shopperProfile;

    Throwable getErrorThrowable() {
        return this.errorThrowable;
    }

    public List<BVProduct> getRecommendedProducts() {
        ShopperProfile shopperProfile = this.shopperProfile;
        return (shopperProfile == null || shopperProfile.getProfile() == null || this.shopperProfile.getProfile().getRecommendedProducts() == null) ? new ArrayList() : this.shopperProfile.getProfile().getRecommendedProducts();
    }

    ShopperProfile getShopperProfile() {
        return this.shopperProfile;
    }

    boolean isDidSucceed() {
        return this.didSucceed;
    }

    BVRecommendationsResponse(boolean z10, Throwable th2, ShopperProfile shopperProfile) {
        this.didSucceed = z10;
        this.errorThrowable = th2;
        this.shopperProfile = shopperProfile;
    }
}
