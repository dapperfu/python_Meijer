package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;

/* loaded from: classes4.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat implements FSDraw, FSDispatchDraw {

    /* renamed from: p, reason: collision with root package name */
    private Drawable f87921p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f87922q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f87923r;

    /* renamed from: s, reason: collision with root package name */
    private int f87924s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f87925t;

    /* renamed from: u, reason: collision with root package name */
    boolean f87926u;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_ab615463d0f7b9caa58e1cfc2c57a46a(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_ab615463d0f7b9caa58e1cfc2c57a46a(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_ab615463d0f7b9caa58e1cfc2c57a46a(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_ab615463d0f7b9caa58e1cfc2c57a46a(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void fsSuperDraw_ab615463d0f7b9caa58e1cfc2c57a46a(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87922q = new Rect();
        this.f87923r = new Rect();
        this.f87924s = 119;
        this.f87925t = true;
        this.f87926u = false;
        TypedArray typedArrayI = s.i(context, attributeSet, ce.l.f62052T2, i10, 0, new int[0]);
        this.f87924s = typedArrayI.getInt(ce.l.f62074V2, this.f87924s);
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, ce.l.f62063U2);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 != null) {
            setForeground(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
        }
        this.f87925t = typedArrayI.getBoolean(ce.l.f62085W2, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f87921p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f87924s;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f87921p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f87921p);
            }
            this.f87921p = drawable;
            this.f87926u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f87924s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f87924s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f87924s = i10;
            if (i10 == 119 && this.f87921p != null) {
                this.f87921p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        fsSuperDraw_ab615463d0f7b9caa58e1cfc2c57a46a(canvas);
        Drawable drawable = this.f87921p;
        if (drawable != null) {
            if (this.f87926u) {
                this.f87926u = false;
                Rect rect = this.f87922q;
                Rect rect2 = this.f87923r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f87925t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f87924s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f87921p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f87921p;
        if (drawable != null && drawable.isStateful()) {
            this.f87921p.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f87921p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f87926u = z10 | this.f87926u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f87926u = true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f87921p) {
            return false;
        }
        return true;
    }
}
