package com.bazaarvoice.bvandroidsdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public final class CurationsView extends BVView {
    private static final String TAG = "CurationsView";
    private CurationsAnalyticsManager curationsAnalyticsManager;
    private CurationsFeedItem curationsFeedItem;

    public CurationsView(Context context) {
        super(context);
    }

    public CurationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public String getProductId() {
        CurationsFeedItem curationsFeedItem = this.curationsFeedItem;
        if (curationsFeedItem != null) {
            return curationsFeedItem.getProductId();
        }
        throw new IllegalStateException("Must associate CurationsFeedItem with CurationsView");
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView
    void init() {
        this.curationsAnalyticsManager = new CurationsAnalyticsManager(BVSDK.getInstance());
        super.init();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public void onAddedToViewHierarchy() {
        this.curationsAnalyticsManager.sendUGCImpressionEvent(this.curationsFeedItem);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public void onTap() {
        CurationsFeedItem curationsFeedItem = this.curationsFeedItem;
        if (curationsFeedItem == null) {
            throw new IllegalStateException("Must associate CurationsFeedItem with CurationsView");
        }
        this.curationsAnalyticsManager.sendUsedFeatureEventTapped(curationsFeedItem);
    }

    public void setCurationsFeedItem(CurationsFeedItem curationsFeedItem) {
        this.curationsFeedItem = curationsFeedItem;
    }

    public CurationsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, android.view.View
    public /* bridge */ /* synthetic */ void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onFirstTimeOnScreen() {
        super.onFirstTimeOnScreen();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onVisibleOnScreenStateChanged(boolean z10) {
        super.onVisibleOnScreenStateChanged(z10);
    }

    @TargetApi(21)
    public CurationsView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
