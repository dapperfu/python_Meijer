package com.bazaarvoice.bvandroidsdk;

import M6.b;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.BVRecommendations;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class RecommendationsRecyclerView extends BVRecyclerView implements BVRecommendations.BVRecommendationsLoader, PersonalizationView {
    private static final String TAG = "RecommendationsRecyclerView";
    private String categoryId;
    private WeakReference<BVRecommendations.BVRecommendationsCallback> delegateCbRef;
    private PageType pageType;
    private String productId;
    private BVRecommendations.BVRecommendationsCallback receiverCb;
    private ShopperProfile shopperProfile;

    public RecommendationsRecyclerView(Context context) {
        super(context);
        this.receiverCb = new BVRecommendations.BVRecommendationsCallback() { // from class: com.bazaarvoice.bvandroidsdk.RecommendationsRecyclerView.1
            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onFailure(Throwable th2) {
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsRecyclerView.this.delegateCbRef.get();
                BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, RecommendationsRequest.class.getSimpleName(), new BazaarException(th2.getMessage(), th2)));
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsRecyclerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onFailure(th2);
            }

            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onSuccess(BVRecommendationsResponse bVRecommendationsResponse) {
                RecommendationsRecyclerView.this.shopperProfile = bVRecommendationsResponse.getShopperProfile();
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsRecyclerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsRecyclerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
                RecommendationsAnalyticsManager.sendEmbeddedPageView(ReportingGroup.RECYCLERVIEW, RecommendationsRecyclerView.this.productId, RecommendationsRecyclerView.this.categoryId, RecommendationsRecyclerView.this.pageType, RecommendationsRecyclerView.this.shopperProfile);
            }
        };
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        return this.productId;
    }

    @Override // com.bazaarvoice.bvandroidsdk.PersonalizationView
    public ShopperProfile getShopperProfile() {
        return this.shopperProfile;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public void onAddedToViewHierarchy() {
        RecommendationsAnalyticsManager.sendBvViewGroupAddedToHierarchyEvent(ReportingGroup.RECYCLERVIEW);
    }

    public RecommendationsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.receiverCb = new BVRecommendations.BVRecommendationsCallback() { // from class: com.bazaarvoice.bvandroidsdk.RecommendationsRecyclerView.1
            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onFailure(Throwable th2) {
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsRecyclerView.this.delegateCbRef.get();
                BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, RecommendationsRequest.class.getSimpleName(), new BazaarException(th2.getMessage(), th2)));
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsRecyclerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onFailure(th2);
            }

            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onSuccess(BVRecommendationsResponse bVRecommendationsResponse) {
                RecommendationsRecyclerView.this.shopperProfile = bVRecommendationsResponse.getShopperProfile();
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsRecyclerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsRecyclerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
                RecommendationsAnalyticsManager.sendEmbeddedPageView(ReportingGroup.RECYCLERVIEW, RecommendationsRecyclerView.this.productId, RecommendationsRecyclerView.this.categoryId, RecommendationsRecyclerView.this.pageType, RecommendationsRecyclerView.this.shopperProfile);
            }
        };
    }

    private void updateRecCallInfo(RecommendationsRequest recommendationsRequest, BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback) {
        this.productId = recommendationsRequest.getProductId();
        this.categoryId = recommendationsRequest.getCategoryId();
        this.pageType = recommendationsRequest.getPageType();
        this.delegateCbRef = new WeakReference<>(bVRecommendationsCallback);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsLoader
    public void loadRecommendations(RecommendationsRequest recommendationsRequest, BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback) {
        b.b();
        updateRecCallInfo(recommendationsRequest, bVRecommendationsCallback);
        new BVRecommendations().getRecommendedProducts(recommendationsRequest, this.receiverCb);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onFirstTimeOnScreen() {
        super.onFirstTimeOnScreen();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onTap() {
        super.onTap();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewGroupEventListener
    public void onViewGroupInteractedWith() {
        if (isNestedScrollingEnabled()) {
            RecommendationsAnalyticsManager.sendBvViewGroupInteractedWithEvent(ReportingGroup.RECYCLERVIEW, this.pageType, this.shopperProfile);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onVisibleOnScreenStateChanged(boolean z10) {
        super.onVisibleOnScreenStateChanged(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean startNestedScroll(int i10) {
        if (!isNestedScrollingEnabled()) {
            RecommendationsAnalyticsManager.sendBvViewGroupInteractedWithEvent(ReportingGroup.RECYCLERVIEW, this.pageType, this.shopperProfile);
        }
        return super.startNestedScroll(i10);
    }

    public RecommendationsRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.receiverCb = new BVRecommendations.BVRecommendationsCallback() { // from class: com.bazaarvoice.bvandroidsdk.RecommendationsRecyclerView.1
            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onFailure(Throwable th2) {
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsRecyclerView.this.delegateCbRef.get();
                BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, RecommendationsRequest.class.getSimpleName(), new BazaarException(th2.getMessage(), th2)));
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsRecyclerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onFailure(th2);
            }

            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onSuccess(BVRecommendationsResponse bVRecommendationsResponse) {
                RecommendationsRecyclerView.this.shopperProfile = bVRecommendationsResponse.getShopperProfile();
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsRecyclerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsRecyclerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
                RecommendationsAnalyticsManager.sendEmbeddedPageView(ReportingGroup.RECYCLERVIEW, RecommendationsRecyclerView.this.productId, RecommendationsRecyclerView.this.categoryId, RecommendationsRecyclerView.this.pageType, RecommendationsRecyclerView.this.shopperProfile);
            }
        };
    }
}
