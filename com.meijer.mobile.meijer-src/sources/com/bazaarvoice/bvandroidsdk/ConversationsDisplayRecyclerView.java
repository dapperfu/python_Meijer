package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVConversationsClient;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayResponse;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ConversationsDisplayRecyclerView<RequestType extends ConversationsDisplayRequest, ResponseType extends ConversationsDisplayResponse> extends BVRecyclerView implements BVConversationsClient.DisplayLoader<RequestType, ResponseType> {
    LoadCallDisplay<RequestType, ResponseType> call;
    ConversationsAnalyticsManager convAnMan;
    boolean onScreen;
    String productId;

    ConversationsDisplayRecyclerView(Context context) {
        super(context);
        this.onScreen = false;
    }

    abstract BVEventValues.BVProductType getBVProductType();

    abstract BVEventValues.BVProductType getBvProductType();

    abstract String getContainerId();

    abstract String getProductIdFromRequest(RequestType requesttype);

    @Override // com.bazaarvoice.bvandroidsdk.BVConversationsClient.DisplayLoader
    public void loadAsync(LoadCallDisplay<RequestType, ResponseType> loadCallDisplay, ConversationsCallback<ResponseType> conversationsCallback) {
        ConversationsDisplayRequest request = loadCallDisplay.getRequest();
        this.convAnMan = loadCallDisplay.getConversationsAnalyticsManager();
        this.productId = getProductIdFromRequest(request);
        this.call = loadCallDisplay;
        loadCallDisplay.loadAsync(conversationsCallback);
        trySendUsedFeatureInViewEvent();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public void onFirstTimeOnScreen() {
        this.onScreen = true;
        trySendUsedFeatureInViewEvent();
    }

    private void trySendUsedFeatureInViewEvent() {
        String str;
        ConversationsAnalyticsManager conversationsAnalyticsManager;
        if (!this.onScreen || (str = this.productId) == null || (conversationsAnalyticsManager = this.convAnMan) == null) {
            return;
        }
        conversationsAnalyticsManager.sendUsedFeatureInViewEvent(str, getContainerId(), getBvProductType());
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        return this.productId;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewGroupEventListener
    public void onViewGroupInteractedWith() {
        ConversationsAnalyticsManager conversationsAnalyticsManager = this.convAnMan;
        if (conversationsAnalyticsManager != null) {
            conversationsAnalyticsManager.sendUsedFeatureScrolledEvent(this.productId, getBvProductType());
        }
    }

    ConversationsDisplayRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScreen = false;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onAddedToViewHierarchy() {
        super.onAddedToViewHierarchy();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LoadCallDisplay<RequestType, ResponseType> loadCallDisplay = this.call;
        if (loadCallDisplay != null) {
            loadCallDisplay.cancel();
            this.call = null;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onTap() {
        super.onTap();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onVisibleOnScreenStateChanged(boolean z10) {
        super.onVisibleOnScreenStateChanged(z10);
    }

    ConversationsDisplayRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.onScreen = false;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVConversationsClient.DisplayLoader
    public void loadAsync(LoadCallDisplay<RequestType, ResponseType> loadCallDisplay, ConversationsDisplayCallback<ResponseType> conversationsDisplayCallback) {
        ConversationsDisplayRequest request = loadCallDisplay.getRequest();
        this.convAnMan = loadCallDisplay.getConversationsAnalyticsManager();
        this.productId = getProductIdFromRequest(request);
        this.call = loadCallDisplay;
        loadCallDisplay.loadAsync(conversationsDisplayCallback);
        trySendUsedFeatureInViewEvent();
    }
}
