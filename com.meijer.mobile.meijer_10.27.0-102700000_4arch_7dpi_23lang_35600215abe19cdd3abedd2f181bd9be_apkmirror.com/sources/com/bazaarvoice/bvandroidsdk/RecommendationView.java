package com.bazaarvoice.bvandroidsdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

/* loaded from: classes4.dex */
public final class RecommendationView extends BVView {
    private static final String TAG = "RecommendationView";
    private BVProduct bvProduct;

    public RecommendationView(Context context) {
        super(context);
    }

    public RecommendationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        BVProduct bVProduct = this.bvProduct;
        if (bVProduct != null) {
            return bVProduct.getId();
        }
        throw new IllegalStateException("Must associate BVProduct with RecommendationView");
    }

    public void setBvProduct(BVProduct bVProduct) {
        this.bvProduct = bVProduct;
    }

    public RecommendationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    private ShopperProfile getShopperProfileFromParentViews() {
        boolean z10 = false;
        ShopperProfile shopperProfile = null;
        for (ViewParent parent = getParent(); parent != null && !z10; parent = parent.getParent()) {
            if (getParent() instanceof PersonalizationView) {
                shopperProfile = ((PersonalizationView) getParent()).getShopperProfile();
                z10 = true;
            }
        }
        if (z10) {
            return shopperProfile;
        }
        throw new IllegalStateException("RecommendationView must be a child view of RecommendationsContainerView or RecommendationsRecyclerView");
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onAddedToViewHierarchy() {
        super.onAddedToViewHierarchy();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public void onFirstTimeOnScreen() {
        RecommendationsAnalyticsManager.sendFeatureUsedEvent(TAG, getShopperProfileFromParentViews(), this.bvProduct);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public void onTap() {
        RecommendationsAnalyticsManager.sendProductConversionEvent(getShopperProfileFromParentViews(), this.bvProduct);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onVisibleOnScreenStateChanged(boolean z10) {
        super.onVisibleOnScreenStateChanged(z10);
    }

    @TargetApi(21)
    public RecommendationView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
