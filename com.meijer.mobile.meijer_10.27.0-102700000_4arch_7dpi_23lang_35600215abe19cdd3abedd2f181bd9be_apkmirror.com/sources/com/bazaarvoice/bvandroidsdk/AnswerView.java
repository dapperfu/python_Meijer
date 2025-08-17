package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;

@Deprecated
/* loaded from: classes4.dex */
public final class AnswerView extends ConversationsUgcView {
    public AnswerView(Context context) {
        super(context);
    }

    public AnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsUgcView
    String getViewName() {
        return AnswerView.class.getSimpleName();
    }

    public AnswerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsUgcView, com.bazaarvoice.bvandroidsdk.EventView.ProductView
    public /* bridge */ /* synthetic */ String getProductId() {
        return super.getProductId();
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
    public /* bridge */ /* synthetic */ void onFirstTimeOnScreen() {
        super.onFirstTimeOnScreen();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.BVViewEventListener
    public /* bridge */ /* synthetic */ void onTap() {
        super.onTap();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVView, com.bazaarvoice.bvandroidsdk.EventView.EventViewListener
    public /* bridge */ /* synthetic */ void onVisibleOnScreenStateChanged(boolean z10) {
        super.onVisibleOnScreenStateChanged(z10);
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsUgcView
    public /* bridge */ /* synthetic */ void setProduct(Product product) {
        super.setProduct(product);
    }

    public AnswerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
