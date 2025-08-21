package com.scandit.datacapture.barcode.internal.module.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g extends ViewGroup implements FSDispatchDraw {

    /* renamed from: a, reason: collision with root package name */
    public final Outline f124283a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f124284b;

    /* renamed from: c, reason: collision with root package name */
    public final View f124285c;

    /* renamed from: d, reason: collision with root package name */
    public float f124286d;

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_70ac4860d2a1ee0223cc3a0e1391d4c9(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_70ac4860d2a1ee0223cc3a0e1391d4c9(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_70ac4860d2a1ee0223cc3a0e1391d4c9(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f124283a = outline;
        this.f124284b = new Path();
        View view = new View(context);
        this.f124285c = view;
        addView(view);
        view.setOutlineProvider(new f(this));
        setClipChildren(false);
        setClipToPadding(false);
        view.setClipToOutline(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.f124284b;
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            fsSuperDispatchDraw_70ac4860d2a1ee0223cc3a0e1391d4c9(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final float getElevation() {
        return this.f124285c.getElevation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f124285c.layout(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void setElevation(float f10) {
        this.f124285c.setElevation(f10);
        this.f124285c.clearAnimation();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f124285c.measure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.f124286d;
        this.f124284b.rewind();
        this.f124284b.addRoundRect(getLeft(), getTop(), measuredWidth, measuredHeight, f10, f10, Path.Direction.CW);
        this.f124283a.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
    }
}
