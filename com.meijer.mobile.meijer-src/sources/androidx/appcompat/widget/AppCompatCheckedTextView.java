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
import i.C14578a;
import j.C14879a;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    private final C5769c f46714a;

    /* renamed from: b, reason: collision with root package name */
    private final C5768b f46715b;

    /* renamed from: c, reason: collision with root package name */
    private final C5781o f46716c;

    /* renamed from: d, reason: collision with root package name */
    private C5773g f46717d;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136297s);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C5769c c5769c = this.f46714a;
        if (c5769c != null) {
            c5769c.e();
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5781o c5781o = new C5781o(this);
        this.f46716c = c5781o;
        c5781o.m(attributeSet, i10);
        c5781o.b();
        C5768b c5768b = new C5768b(this);
        this.f46715b = c5768b;
        c5768b.e(attributeSet, i10);
        C5769c c5769c = new C5769c(this);
        this.f46714a = c5769c;
        c5769c.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    private C5773g getEmojiTextViewHelper() {
        if (this.f46717d == null) {
            this.f46717d = new C5773g(this);
        }
        return this.f46717d;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5768b c5768b = this.f46715b;
        if (c5768b != null) {
            return c5768b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5768b c5768b = this.f46715b;
        if (c5768b != null) {
            return c5768b.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C5769c c5769c = this.f46714a;
        if (c5769c != null) {
            return c5769c.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C5769c c5769c = this.f46714a;
        if (c5769c != null) {
            return c5769c.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46716c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46716c.k();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5768b c5768b = this.f46715b;
        if (c5768b != null) {
            c5768b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5768b c5768b = this.f46715b;
        if (c5768b != null) {
            c5768b.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C5769c c5769c = this.f46714a;
        if (c5769c != null) {
            c5769c.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C5769c c5769c = this.f46714a;
        if (c5769c != null) {
            c5769c.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46716c.w(colorStateList);
        this.f46716c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46716c.x(mode);
        this.f46716c.b();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5781o c5781o = this.f46716c;
        if (c5781o != null) {
            c5781o.b();
        }
        C5768b c5768b = this.f46715b;
        if (c5768b != null) {
            c5768b.b();
        }
        C5769c c5769c = this.f46714a;
        if (c5769c != null) {
            c5769c.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C5774h.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5768b c5768b = this.f46715b;
        if (c5768b != null) {
            c5768b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5768b c5768b = this.f46715b;
        if (c5768b != null) {
            c5768b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46716c;
        if (c5781o != null) {
            c5781o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46716c;
        if (c5781o != null) {
            c5781o.p();
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
        C5781o c5781o = this.f46716c;
        if (c5781o != null) {
            c5781o.q(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C14879a.b(getContext(), i10));
    }
}
