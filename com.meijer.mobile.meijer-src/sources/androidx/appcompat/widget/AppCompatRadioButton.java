package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import i.C14578a;
import j.C14879a;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements androidx.core.widget.m {

    /* renamed from: a, reason: collision with root package name */
    private final C5770d f46732a;

    /* renamed from: b, reason: collision with root package name */
    private final C5768b f46733b;

    /* renamed from: c, reason: collision with root package name */
    private final C5781o f46734c;

    /* renamed from: d, reason: collision with root package name */
    private C5773g f46735d;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136271K);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5770d c5770d = this.f46732a;
        if (c5770d != null) {
            c5770d.e();
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5770d c5770d = new C5770d(this);
        this.f46732a = c5770d;
        c5770d.d(attributeSet, i10);
        C5768b c5768b = new C5768b(this);
        this.f46733b = c5768b;
        c5768b.e(attributeSet, i10);
        C5781o c5781o = new C5781o(this);
        this.f46734c = c5781o;
        c5781o.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    private C5773g getEmojiTextViewHelper() {
        if (this.f46735d == null) {
            this.f46735d = new C5773g(this);
        }
        return this.f46735d;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5768b c5768b = this.f46733b;
        if (c5768b != null) {
            return c5768b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5768b c5768b = this.f46733b;
        if (c5768b != null) {
            return c5768b.d();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportButtonTintList() {
        C5770d c5770d = this.f46732a;
        if (c5770d != null) {
            return c5770d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C5770d c5770d = this.f46732a;
        if (c5770d != null) {
            return c5770d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46734c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46734c.k();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5768b c5768b = this.f46733b;
        if (c5768b != null) {
            c5768b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5768b c5768b = this.f46733b;
        if (c5768b != null) {
            c5768b.j(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C5770d c5770d = this.f46732a;
        if (c5770d != null) {
            c5770d.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C5770d c5770d = this.f46732a;
        if (c5770d != null) {
            c5770d.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46734c.w(colorStateList);
        this.f46734c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46734c.x(mode);
        this.f46734c.b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5768b c5768b = this.f46733b;
        if (c5768b != null) {
            c5768b.b();
        }
        C5781o c5781o = this.f46734c;
        if (c5781o != null) {
            c5781o.b();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5768b c5768b = this.f46733b;
        if (c5768b != null) {
            c5768b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5768b c5768b = this.f46733b;
        if (c5768b != null) {
            c5768b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46734c;
        if (c5781o != null) {
            c5781o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46734c;
        if (c5781o != null) {
            c5781o.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C14879a.b(getContext(), i10));
    }
}
