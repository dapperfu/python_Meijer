package com.flipp.sfml.views;

import Ra.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class CategoryStateWrapper extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f64209b = {d.f31981a};

    /* renamed from: a, reason: collision with root package name */
    private boolean f64210a;

    public CategoryStateWrapper(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        view.setDuplicateParentStateEnabled(true);
        super.addView(view, i10, layoutParams);
    }

    public CategoryStateWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f64210a) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f64209b);
        }
        return iArrOnCreateDrawableState;
    }

    public void setHighlighted(boolean z10) {
        this.f64210a = z10;
        refreshDrawableState();
    }

    public CategoryStateWrapper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f64210a = false;
    }
}
