package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;

/* loaded from: classes4.dex */
public class f extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f87193a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f87194b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f87195c;

    /* renamed from: d, reason: collision with root package name */
    private float f87196d;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void a(float f10) {
        if (this.f87196d != f10) {
            this.f87196d = f10;
            g.a(f10, this.f87195c);
            this.f87193a.setAlpha((int) (this.f87195c[0] * 255.0f));
            this.f87194b.setAlpha((int) (this.f87195c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f87193a.draw(canvas);
        this.f87194b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f87193a.getIntrinsicHeight(), this.f87194b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f87193a.getIntrinsicWidth(), this.f87194b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f87193a.getMinimumHeight(), this.f87194b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f87193a.getMinimumWidth(), this.f87194b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f87193a.isStateful() || this.f87194b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f87196d <= 0.5f) {
            this.f87193a.setAlpha(i10);
            this.f87194b.setAlpha(0);
        } else {
            this.f87193a.setAlpha(0);
            this.f87194b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f87193a.setColorFilter(colorFilter);
        this.f87194b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f87193a.setState(iArr) || this.f87194b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f87193a.setBounds(i10, i11, i12, i13);
        this.f87194b.setBounds(i10, i11, i12, i13);
    }
}
