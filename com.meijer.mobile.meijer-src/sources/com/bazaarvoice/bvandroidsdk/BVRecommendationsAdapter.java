package com.bazaarvoice.bvandroidsdk;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.F;

/* loaded from: classes4.dex */
public abstract class BVRecommendationsAdapter<T extends RecyclerView.F> extends RecyclerView.h<T> {
    ShopperProfile shopperProfile;

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i10) {
        if (!(f10.itemView instanceof RecommendationView)) {
            throw new IllegalStateException("ItemView must be of type RecommendationView");
        }
        ShopperProfile shopperProfile = this.shopperProfile;
        if (shopperProfile == null || shopperProfile.getProfile() == null || this.shopperProfile.getProfile().getRecommendedProducts() == null) {
            return;
        }
        ((RecommendationView) f10.itemView).setBvProduct(this.shopperProfile.getProfile().getRecommendedProducts().get(i10));
    }

    public void setShopperProfile(ShopperProfile shopperProfile) {
        this.shopperProfile = shopperProfile;
    }
}
