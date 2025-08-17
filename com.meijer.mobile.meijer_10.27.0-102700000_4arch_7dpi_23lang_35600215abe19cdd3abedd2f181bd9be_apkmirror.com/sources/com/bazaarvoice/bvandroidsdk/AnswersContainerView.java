package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.EventView;

/* loaded from: classes4.dex */
public final class AnswersContainerView extends BVContainerView implements EventView.EventViewListener<AnswersContainerView>, EventView.ProductView {
    private String productId;

    public AnswersContainerView(Context context) {
        super(context);
        this.productId = "";
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public void onVisibleOnScreenStateChanged(boolean z10) {
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        return this.productId;
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public void onFirstTimeOnScreen() {
        new ConversationsAnalyticsManager(BVSDK.getInstance().getBvPixel(), BVSDK.getInstance().getBvUserProvidedData().getBvConfig().getClientId()).sendUsedFeatureInViewEvent(this.productId, "AnswersContainerView", BVEventValues.BVProductType.CONVERSATIONS_QANDA);
    }

    public AnswersContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.productId = "";
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView
    void init() {
        super.init();
        EventView.bind(this, this, this);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onAddedToViewHierarchy() {
        super.onAddedToViewHierarchy();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVContainerView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onTap() {
        super.onTap();
    }

    public AnswersContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.productId = "";
    }

    public AnswersContainerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.productId = "";
    }
}
