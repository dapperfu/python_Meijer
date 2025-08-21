package com.bazaarvoice.bvandroidsdk;

import M6.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.BVRecommendations;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class RecommendationsContainerView extends BVContainerView implements BVRecommendations.BVRecommendationsLoader, PersonalizationView {
    private static final String TAG = "RecommendationsContainerView";
    private String categoryId;
    private WeakReference<BVRecommendations.BVRecommendationsCallback> delegateCbRef;
    private PageType pageType;
    private String productId;
    private BVRecommendations.BVRecommendationsCallback receiverCb;
    private ShopperProfile shopperProfile;

    public RecommendationsContainerView(Context context) {
        super(context);
        this.receiverCb = new BVRecommendations.BVRecommendationsCallback() { // from class: com.bazaarvoice.bvandroidsdk.RecommendationsContainerView.1
            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onFailure(Throwable th2) {
                BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, RecommendationsRequest.class.getSimpleName(), new BazaarException(th2.getMessage(), th2)));
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onFailure(th2);
            }

            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onSuccess(BVRecommendationsResponse bVRecommendationsResponse) {
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
                RecommendationsContainerView.this.shopperProfile = bVRecommendationsResponse.getShopperProfile();
                if (RecommendationsContainerView.this.shopperProfile != null) {
                    RecommendationsAnalyticsManager.sendEmbeddedPageView(ReportingGroup.CUSTOM, RecommendationsContainerView.this.productId, RecommendationsContainerView.this.categoryId, RecommendationsContainerView.this.pageType, RecommendationsContainerView.this.shopperProfile);
                }
            }
        };
    }

    @Override // com.bazaarvoice.bvandroidsdk.PersonalizationView
    public ShopperProfile getShopperProfile() {
        return this.shopperProfile;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public void onAddedToViewHierarchy() {
        RecommendationsAnalyticsManager.sendBvViewGroupAddedToHierarchyEvent(ReportingGroup.CUSTOM);
    }

    public RecommendationsContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.receiverCb = new BVRecommendations.BVRecommendationsCallback() { // from class: com.bazaarvoice.bvandroidsdk.RecommendationsContainerView.1
            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onFailure(Throwable th2) {
                BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, RecommendationsRequest.class.getSimpleName(), new BazaarException(th2.getMessage(), th2)));
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onFailure(th2);
            }

            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onSuccess(BVRecommendationsResponse bVRecommendationsResponse) {
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
                RecommendationsContainerView.this.shopperProfile = bVRecommendationsResponse.getShopperProfile();
                if (RecommendationsContainerView.this.shopperProfile != null) {
                    RecommendationsAnalyticsManager.sendEmbeddedPageView(ReportingGroup.CUSTOM, RecommendationsContainerView.this.productId, RecommendationsContainerView.this.categoryId, RecommendationsContainerView.this.pageType, RecommendationsContainerView.this.shopperProfile);
                }
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

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onTap() {
        super.onTap();
    }

    public RecommendationsContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.receiverCb = new BVRecommendations.BVRecommendationsCallback() { // from class: com.bazaarvoice.bvandroidsdk.RecommendationsContainerView.1
            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onFailure(Throwable th2) {
                BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, RecommendationsRequest.class.getSimpleName(), new BazaarException(th2.getMessage(), th2)));
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onFailure(th2);
            }

            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onSuccess(BVRecommendationsResponse bVRecommendationsResponse) {
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
                RecommendationsContainerView.this.shopperProfile = bVRecommendationsResponse.getShopperProfile();
                if (RecommendationsContainerView.this.shopperProfile != null) {
                    RecommendationsAnalyticsManager.sendEmbeddedPageView(ReportingGroup.CUSTOM, RecommendationsContainerView.this.productId, RecommendationsContainerView.this.categoryId, RecommendationsContainerView.this.pageType, RecommendationsContainerView.this.shopperProfile);
                }
            }
        };
    }

    @TargetApi(21)
    public RecommendationsContainerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.receiverCb = new BVRecommendations.BVRecommendationsCallback() { // from class: com.bazaarvoice.bvandroidsdk.RecommendationsContainerView.1
            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onFailure(Throwable th2) {
                BVSDK.getInstance().getBvPixel().track(new BVErrorReport(BVEventValues.BVProductType.CURATIONS, RecommendationsRequest.class.getSimpleName(), new BazaarException(th2.getMessage(), th2)));
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onFailure(th2);
            }

            @Override // com.bazaarvoice.bvandroidsdk.BVRecommendations.BVRecommendationsCallback
            public void onSuccess(BVRecommendationsResponse bVRecommendationsResponse) {
                BVRecommendations.BVRecommendationsCallback bVRecommendationsCallback = (BVRecommendations.BVRecommendationsCallback) RecommendationsContainerView.this.delegateCbRef.get();
                if (bVRecommendationsCallback == null) {
                    return;
                }
                RecommendationsContainerView.this.delegateCbRef.clear();
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
                RecommendationsContainerView.this.shopperProfile = bVRecommendationsResponse.getShopperProfile();
                if (RecommendationsContainerView.this.shopperProfile != null) {
                    RecommendationsAnalyticsManager.sendEmbeddedPageView(ReportingGroup.CUSTOM, RecommendationsContainerView.this.productId, RecommendationsContainerView.this.categoryId, RecommendationsContainerView.this.pageType, RecommendationsContainerView.this.shopperProfile);
                }
            }
        };
    }
}
