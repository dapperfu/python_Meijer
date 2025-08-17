package com.bazaarvoice.bvandroidsdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
abstract class BVContainerView extends FrameLayout implements BVViewEventListener {
    private static final String TAG = "BVContainerView";
    private boolean seen;

    public BVContainerView(Context context) {
        super(context);
        this.seen = false;
        init();
    }

    void init() {
    }

    public void onAddedToViewHierarchy() {
    }

    public void onTap() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.seen) {
            this.seen = true;
            onAddedToViewHierarchy();
        }
    }

    public BVContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.seen = false;
        init();
    }

    public BVContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.seen = false;
        init();
    }

    @TargetApi(21)
    public BVContainerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.seen = false;
        init();
    }
}
