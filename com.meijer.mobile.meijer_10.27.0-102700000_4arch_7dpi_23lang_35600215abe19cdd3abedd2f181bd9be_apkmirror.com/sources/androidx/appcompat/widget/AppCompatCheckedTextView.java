package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import i.C14575a;
import j.C14791a;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    private final C5627c f46490a;

    /* renamed from: b, reason: collision with root package name */
    private final C5626b f46491b;

    /* renamed from: c, reason: collision with root package name */
    private final C5639o f46492c;

    /* renamed from: d, reason: collision with root package name */
    private C5631g f46493d;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136540s);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C5627c c5627c = this.f46490a;
        if (c5627c != null) {
            c5627c.e();
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5639o c5639o = new C5639o(this);
        this.f46492c = c5639o;
        c5639o.m(attributeSet, i10);
        c5639o.b();
        C5626b c5626b = new C5626b(this);
        this.f46491b = c5626b;
        c5626b.e(attributeSet, i10);
        C5627c c5627c = new C5627c(this);
        this.f46490a = c5627c;
        c5627c.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    private C5631g getEmojiTextViewHelper() {
        if (this.f46493d == null) {
            this.f46493d = new C5631g(this);
        }
        return this.f46493d;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46491b;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46491b;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C5627c c5627c = this.f46490a;
        if (c5627c != null) {
            return c5627c.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C5627c c5627c = this.f46490a;
        if (c5627c != null) {
            return c5627c.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46492c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46492c.k();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46491b;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46491b;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C5627c c5627c = this.f46490a;
        if (c5627c != null) {
            c5627c.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C5627c c5627c = this.f46490a;
        if (c5627c != null) {
            c5627c.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46492c.w(colorStateList);
        this.f46492c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46492c.x(mode);
        this.f46492c.b();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5639o c5639o = this.f46492c;
        if (c5639o != null) {
            c5639o.b();
        }
        C5626b c5626b = this.f46491b;
        if (c5626b != null) {
            c5626b.b();
        }
        C5627c c5627c = this.f46490a;
        if (c5627c != null) {
            c5627c.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C5632h.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5626b c5626b = this.f46491b;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46491b;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46492c;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46492c;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5639o c5639o = this.f46492c;
        if (c5639o != null) {
            c5639o.q(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C14791a.b(getContext(), i10));
    }
}
