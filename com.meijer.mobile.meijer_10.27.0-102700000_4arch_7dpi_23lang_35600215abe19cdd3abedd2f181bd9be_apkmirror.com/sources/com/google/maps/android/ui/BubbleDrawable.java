package com.google.maps.android.ui;

import Z1.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;
import com.google.maps.android.R;

/* loaded from: classes7.dex */
class BubbleDrawable extends Drawable implements FSDraw {
    private int mColor = -1;
    private final Drawable mMask;
    private final Drawable mShadow;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        this.mMask.setBounds(i10, i11, i12, i13);
        this.mShadow.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mMask.draw(canvas);
        canvas.drawColor(this.mColor, PorterDuff.Mode.SRC_IN);
        this.mShadow.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.mMask.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        throw new UnsupportedOperationException();
    }

    public void setColor(int i10) {
        this.mColor = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    public BubbleDrawable(Context context) {
        this.mMask = b.e(context, R.drawable.amu_bubble_mask);
        this.mShadow = b.e(context, R.drawable.amu_bubble_shadow);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.mMask.setBounds(rect);
        this.mShadow.setBounds(rect);
    }
}
