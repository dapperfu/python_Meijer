package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;

/* loaded from: classes7.dex */
public class RotationLayout extends FrameLayout implements FSDispatchDraw {
    private int mRotation;

    public RotationLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_1b4fcbc06aaf50553f004f1bd59975e8(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_1b4fcbc06aaf50553f004f1bd59975e8(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_1b4fcbc06aaf50553f004f1bd59975e8(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.mRotation;
        if (i10 == 0) {
            fsSuperDispatchDraw_1b4fcbc06aaf50553f004f1bd59975e8(canvas);
            return;
        }
        if (i10 == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i10 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        fsSuperDispatchDraw_1b4fcbc06aaf50553f004f1bd59975e8(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12 = this.mRotation;
        if (i12 != 1 && i12 != 3) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, i11);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setViewRotation(int i10) {
        this.mRotation = ((i10 + 360) % 360) / 90;
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
