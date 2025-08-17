package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    private final C5626b f46553a;

    /* renamed from: b, reason: collision with root package name */
    private final C5639o f46554b;

    /* renamed from: c, reason: collision with root package name */
    private C5631g f46555c;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        H.a(this, getContext());
        C5626b c5626b = new C5626b(this);
        this.f46553a = c5626b;
        c5626b.e(attributeSet, i10);
        C5639o c5639o = new C5639o(this);
        this.f46554b = c5639o;
        c5639o.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    private C5631g getEmojiTextViewHelper() {
        if (this.f46555c == null) {
            this.f46555c = new C5631g(this);
        }
        return this.f46555c;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46553a;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46553a;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46554b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46554b.k();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46553a;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46553a;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46554b.w(colorStateList);
        this.f46554b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46554b.x(mode);
        this.f46554b.b();
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5626b c5626b = this.f46553a;
        if (c5626b != null) {
            c5626b.b();
        }
        C5639o c5639o = this.f46554b;
        if (c5639o != null) {
            c5639o.b();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5626b c5626b = this.f46553a;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46553a;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46554b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46554b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }
}
