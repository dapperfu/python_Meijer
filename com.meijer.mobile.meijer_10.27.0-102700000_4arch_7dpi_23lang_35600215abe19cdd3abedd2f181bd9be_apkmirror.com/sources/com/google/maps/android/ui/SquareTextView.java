package com.google.maps.android.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes7.dex */
public class SquareTextView extends TextView implements FSDraw {
    private int mOffsetLeft;
    private int mOffsetTop;

    public SquareTextView(Context context) {
        super(context);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }

    public void fsSuperDraw_702785fc09ab8a22e53b32f537cb9a68(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.mOffsetLeft / 2, this.mOffsetTop / 2);
        fsSuperDraw_702785fc09ab8a22e53b32f537cb9a68(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.mOffsetTop = measuredWidth - measuredHeight;
            this.mOffsetLeft = 0;
        } else {
            this.mOffsetTop = 0;
            this.mOffsetLeft = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }
}
