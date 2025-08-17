package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;

/* loaded from: classes4.dex */
public class ClippableRoundedCornerLayout extends FrameLayout implements FSDispatchDraw {

    /* renamed from: a, reason: collision with root package name */
    private Path f87075a;

    /* renamed from: b, reason: collision with root package name */
    private float f87076b;

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_6c1c5fbfc28f096e262b2194793ca137(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_6c1c5fbfc28f096e262b2194793ca137(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_6c1c5fbfc28f096e262b2194793ca137(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f87075a == null) {
            fsSuperDispatchDraw_6c1c5fbfc28f096e262b2194793ca137(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f87075a);
        fsSuperDispatchDraw_6c1c5fbfc28f096e262b2194793ca137(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.f87076b;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
