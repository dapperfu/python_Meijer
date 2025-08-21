package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVEventValues;

/* loaded from: classes4.dex */
public final class AnswersRecyclerView extends BVRecyclerView {
    private String productId;

    public AnswersRecyclerView(Context context) {
        super(context);
        this.productId = "";
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        return this.productId;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public void onFirstTimeOnScreen() {
        new ConversationsAnalyticsManager(BVSDK.getInstance().getBvPixel(), BVSDK.getInstance().getBvUserProvidedData().getBvConfig().getClientId()).sendUsedFeatureInViewEvent(this.productId, "AnswersRecyclerView", BVEventValues.BVProductType.CONVERSATIONS_QANDA);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewGroupEventListener
    public void onViewGroupInteractedWith() {
        new ConversationsAnalyticsManager(BVSDK.getInstance().getBvPixel(), BVSDK.getInstance().getBvUserProvidedData().getBvConfig().getClientId()).sendUsedFeatureScrolledEvent(this.productId, BVEventValues.BVProductType.CONVERSATIONS_QANDA);
    }

    public AnswersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.productId = "";
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVRecyclerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onAddedToViewHierarchy() {
        super.onAddedToViewHierarchy();
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

    public AnswersRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.productId = "";
    }
}
