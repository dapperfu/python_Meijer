package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import i.C14575a;
import j.C14791a;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements androidx.core.widget.m {

    /* renamed from: a, reason: collision with root package name */
    private final C5628d f46486a;

    /* renamed from: b, reason: collision with root package name */
    private final C5626b f46487b;

    /* renamed from: c, reason: collision with root package name */
    private final C5639o f46488c;

    /* renamed from: d, reason: collision with root package name */
    private C5631g f46489d;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136539r);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5628d c5628d = this.f46486a;
        if (c5628d != null) {
            c5628d.e();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5628d c5628d = new C5628d(this);
        this.f46486a = c5628d;
        c5628d.d(attributeSet, i10);
        C5626b c5626b = new C5626b(this);
        this.f46487b = c5626b;
        c5626b.e(attributeSet, i10);
        C5639o c5639o = new C5639o(this);
        this.f46488c = c5639o;
        c5639o.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    private C5631g getEmojiTextViewHelper() {
        if (this.f46489d == null) {
            this.f46489d = new C5631g(this);
        }
        return this.f46489d;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46487b;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46487b;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportButtonTintList() {
        C5628d c5628d = this.f46486a;
        if (c5628d != null) {
            return c5628d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C5628d c5628d = this.f46486a;
        if (c5628d != null) {
            return c5628d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46488c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46488c.k();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46487b;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46487b;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C5628d c5628d = this.f46486a;
        if (c5628d != null) {
            c5628d.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C5628d c5628d = this.f46486a;
        if (c5628d != null) {
            c5628d.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46488c.w(colorStateList);
        this.f46488c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46488c.x(mode);
        this.f46488c.b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5626b c5626b = this.f46487b;
        if (c5626b != null) {
            c5626b.b();
        }
        C5639o c5639o = this.f46488c;
        if (c5639o != null) {
            c5639o.b();
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
        C5626b c5626b = this.f46487b;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46487b;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46488c;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46488c;
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C14791a.b(getContext(), i10));
    }
}
