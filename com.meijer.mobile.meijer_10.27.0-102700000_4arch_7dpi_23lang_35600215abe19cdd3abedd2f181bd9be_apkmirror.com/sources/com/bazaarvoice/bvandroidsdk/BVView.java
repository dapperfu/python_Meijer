package com.bazaarvoice.bvandroidsdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bazaarvoice.bvandroidsdk.EventView;

/* loaded from: classes4.dex */
abstract class BVView extends FrameLayout implements BVViewEventListener, EventView.EventViewListener<BVView>, EventView.ProductView {
    private static final String TAG = "BVView";
    private boolean seenInHierarchy;

    BVView(Context context) {
        super(context);
        this.seenInHierarchy = false;
        init();
    }

    void init() {
        setWillNotDraw(false);
        EventView.bind(this, this, this);
    }

    public void onAddedToViewHierarchy() {
    }

    public void onFirstTimeOnScreen() {
    }

    public void onTap() {
    }

    public void onVisibleOnScreenStateChanged(boolean z10) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            onTap();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.seenInHierarchy) {
            this.seenInHierarchy = true;
            onAddedToViewHierarchy();
        }
    }

    BVView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.seenInHierarchy = false;
        init();
    }

    BVView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.seenInHierarchy = false;
        init();
    }

    @TargetApi(21)
    BVView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.seenInHierarchy = false;
        init();
    }
}
