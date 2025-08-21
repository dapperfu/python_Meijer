package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bazaarvoice.bvandroidsdk.EventView;

/* loaded from: classes4.dex */
abstract class BVRecyclerView extends RecyclerView implements BVViewGroupEventListener, EventView.EventViewListener<BVRecyclerView>, EventView.ProductView {
    private static final String TAG = "BVRecyclerView";
    private boolean hasInteracted;
    private RecyclerView.u onScrollListener;
    private boolean seen;

    public BVRecyclerView(Context context) {
        super(context);
        this.hasInteracted = false;
        this.seen = false;
        this.onScrollListener = new RecyclerView.u() { // from class: com.bazaarvoice.bvandroidsdk.BVRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                if (BVRecyclerView.this.hasInteracted && i10 == 0) {
                    BVRecyclerView.this.onViewGroupInteractedWith();
                }
                if (BVRecyclerView.this.hasInteracted || i10 != 1) {
                    return;
                }
                BVRecyclerView.this.onViewGroupInteractedWith();
                BVRecyclerView.this.hasInteracted = true;
            }
        };
        init(context, null);
    }

    public void onAddedToViewHierarchy() {
    }

    public void onFirstTimeOnScreen() {
    }

    public void onTap() {
    }

    public void onViewGroupInteractedWith() {
    }

    public void onVisibleOnScreenStateChanged(boolean z10) {
    }

    void init(Context context, AttributeSet attributeSet) {
        super.addOnScrollListener(this.onScrollListener);
        setWillNotDraw(false);
        EventView.bind(this, this, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.seen) {
            this.seen = true;
            onAddedToViewHierarchy();
        }
    }

    public BVRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hasInteracted = false;
        this.seen = false;
        this.onScrollListener = new RecyclerView.u() { // from class: com.bazaarvoice.bvandroidsdk.BVRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                if (BVRecyclerView.this.hasInteracted && i10 == 0) {
                    BVRecyclerView.this.onViewGroupInteractedWith();
                }
                if (BVRecyclerView.this.hasInteracted || i10 != 1) {
                    return;
                }
                BVRecyclerView.this.onViewGroupInteractedWith();
                BVRecyclerView.this.hasInteracted = true;
            }
        };
        init(context, attributeSet);
    }

    public BVRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.hasInteracted = false;
        this.seen = false;
        this.onScrollListener = new RecyclerView.u() { // from class: com.bazaarvoice.bvandroidsdk.BVRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrollStateChanged(RecyclerView recyclerView, int i102) {
                if (BVRecyclerView.this.hasInteracted && i102 == 0) {
                    BVRecyclerView.this.onViewGroupInteractedWith();
                }
                if (BVRecyclerView.this.hasInteracted || i102 != 1) {
                    return;
                }
                BVRecyclerView.this.onViewGroupInteractedWith();
                BVRecyclerView.this.hasInteracted = true;
            }
        };
        init(context, attributeSet);
    }
}
