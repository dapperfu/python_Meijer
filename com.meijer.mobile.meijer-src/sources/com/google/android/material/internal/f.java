package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;

/* loaded from: classes4.dex */
public class f extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f88033a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f88034b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f88035c;

    /* renamed from: d, reason: collision with root package name */
    private float f88036d;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void a(float f10) {
        if (this.f88036d != f10) {
            this.f88036d = f10;
            g.a(f10, this.f88035c);
            this.f88033a.setAlpha((int) (this.f88035c[0] * 255.0f));
            this.f88034b.setAlpha((int) (this.f88035c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f88033a.draw(canvas);
        this.f88034b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f88033a.getIntrinsicHeight(), this.f88034b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f88033a.getIntrinsicWidth(), this.f88034b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f88033a.getMinimumHeight(), this.f88034b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f88033a.getMinimumWidth(), this.f88034b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f88033a.isStateful() || this.f88034b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f88036d <= 0.5f) {
            this.f88033a.setAlpha(i10);
            this.f88034b.setAlpha(0);
        } else {
            this.f88033a.setAlpha(0);
            this.f88034b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f88033a.setColorFilter(colorFilter);
        this.f88034b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f88033a.setState(iArr) || this.f88034b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f88033a.setBounds(i10, i11, i12, i13);
        this.f88034b.setBounds(i10, i11, i12, i13);
    }
}
