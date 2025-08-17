package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import d2.C13462a;
import i.C14584j;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5637m extends C5635k {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f46991d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f46992e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f46993f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f46994g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46995h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46996i;

    private void f() {
        Drawable drawable = this.f46992e;
        if (drawable != null) {
            if (this.f46995h || this.f46996i) {
                Drawable drawableR = C13462a.r(drawable.mutate());
                this.f46992e = drawableR;
                if (this.f46995h) {
                    C13462a.o(drawableR, this.f46993f);
                }
                if (this.f46996i) {
                    C13462a.p(this.f46992e, this.f46994g);
                }
                if (this.f46992e.isStateful()) {
                    this.f46992e.setState(this.f46991d.getDrawableState());
                }
            }
        }
    }

    void g(Canvas canvas) {
        if (this.f46992e != null) {
            int max = this.f46991d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f46992e.getIntrinsicWidth();
                int intrinsicHeight = this.f46992e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f46992e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f46991d.getWidth() - this.f46991d.getPaddingLeft()) - this.f46991d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f46991d.getPaddingLeft(), this.f46991d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f46992e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f46992e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f46991d.getDrawableState())) {
            this.f46991d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f46992e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f46992e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f46992e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f46991d);
            C13462a.m(drawable, this.f46991d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f46991d.getDrawableState());
            }
            f();
        }
        this.f46991d.invalidate();
    }

    C5637m(SeekBar seekBar) {
        super(seekBar);
        this.f46993f = null;
        this.f46994g = null;
        this.f46995h = false;
        this.f46996i = false;
        this.f46991d = seekBar;
    }

    @Override // androidx.appcompat.widget.C5635k
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        M mV = M.v(this.f46991d.getContext(), attributeSet, C14584j.f136771T, i10, 0);
        SeekBar seekBar = this.f46991d;
        ViewCompat.k0(seekBar, seekBar.getContext(), C14584j.f136771T, attributeSet, mV.r(), i10, 0);
        Drawable drawableH = mV.h(C14584j.f136775U);
        if (drawableH != null) {
            this.f46991d.setThumb(drawableH);
        }
        j(mV.g(C14584j.f136779V));
        if (mV.s(C14584j.f136787X)) {
            this.f46994g = C5648y.e(mV.k(C14584j.f136787X, -1), this.f46994g);
            this.f46996i = true;
        }
        if (mV.s(C14584j.f136783W)) {
            this.f46993f = mV.c(C14584j.f136783W);
            this.f46995h = true;
        }
        mV.x();
        f();
    }
}
