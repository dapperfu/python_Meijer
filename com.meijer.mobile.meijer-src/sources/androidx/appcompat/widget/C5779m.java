package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import d2.C13595a;
import i.C14587j;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5779m extends C5777k {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f47215d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f47216e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f47217f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f47218g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f47219h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f47220i;

    private void f() {
        Drawable drawable = this.f47216e;
        if (drawable != null) {
            if (this.f47219h || this.f47220i) {
                Drawable drawableR = C13595a.r(drawable.mutate());
                this.f47216e = drawableR;
                if (this.f47219h) {
                    C13595a.o(drawableR, this.f47217f);
                }
                if (this.f47220i) {
                    C13595a.p(this.f47216e, this.f47218g);
                }
                if (this.f47216e.isStateful()) {
                    this.f47216e.setState(this.f47215d.getDrawableState());
                }
            }
        }
    }

    void g(Canvas canvas) {
        if (this.f47216e != null) {
            int max = this.f47215d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f47216e.getIntrinsicWidth();
                int intrinsicHeight = this.f47216e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f47216e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f47215d.getWidth() - this.f47215d.getPaddingLeft()) - this.f47215d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f47215d.getPaddingLeft(), this.f47215d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f47216e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f47216e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f47215d.getDrawableState())) {
            this.f47215d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f47216e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f47216e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f47216e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f47215d);
            C13595a.m(drawable, this.f47215d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f47215d.getDrawableState());
            }
            f();
        }
        this.f47215d.invalidate();
    }

    C5779m(SeekBar seekBar) {
        super(seekBar);
        this.f47217f = null;
        this.f47218g = null;
        this.f47219h = false;
        this.f47220i = false;
        this.f47215d = seekBar;
    }

    @Override // androidx.appcompat.widget.C5777k
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        M mV = M.v(this.f47215d.getContext(), attributeSet, C14587j.f136528T, i10, 0);
        SeekBar seekBar = this.f47215d;
        ViewCompat.k0(seekBar, seekBar.getContext(), C14587j.f136528T, attributeSet, mV.r(), i10, 0);
        Drawable drawableH = mV.h(C14587j.f136532U);
        if (drawableH != null) {
            this.f47215d.setThumb(drawableH);
        }
        j(mV.g(C14587j.f136536V));
        if (mV.s(C14587j.f136544X)) {
            this.f47218g = C5790y.e(mV.k(C14587j.f136544X, -1), this.f47218g);
            this.f47220i = true;
        }
        if (mV.s(C14587j.f136540W)) {
            this.f47217f = mV.c(C14587j.f136540W);
            this.f47219h = true;
        }
        mV.x();
        f();
    }
}
