package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import i.C14578a;
import j.C14879a;

/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f46706d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    private final C5768b f46707a;

    /* renamed from: b, reason: collision with root package name */
    private final C5781o f46708b;

    /* renamed from: c, reason: collision with root package name */
    private final C5772f f46709c;

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136294p);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        M mV = M.v(getContext(), attributeSet, f46706d, i10, 0);
        if (mV.s(0)) {
            setDropDownBackgroundDrawable(mV.g(0));
        }
        mV.x();
        C5768b c5768b = new C5768b(this);
        this.f46707a = c5768b;
        c5768b.e(attributeSet, i10);
        C5781o c5781o = new C5781o(this);
        this.f46708b = c5781o;
        c5781o.m(attributeSet, i10);
        c5781o.b();
        C5772f c5772f = new C5772f(this);
        this.f46709c = c5772f;
        c5772f.c(attributeSet, i10);
        a(c5772f);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5768b c5768b = this.f46707a;
        if (c5768b != null) {
            return c5768b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5768b c5768b = this.f46707a;
        if (c5768b != null) {
            return c5768b.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46708b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46708b.k();
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f46709c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f46709c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5768b c5768b = this.f46707a;
        if (c5768b != null) {
            c5768b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5768b c5768b = this.f46707a;
        if (c5768b != null) {
            c5768b.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46708b.w(colorStateList);
        this.f46708b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46708b.x(mode);
        this.f46708b.b();
    }

    void a(C5772f c5772f) {
        KeyListener keyListener = getKeyListener();
        if (c5772f.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c5772f.a(keyListener);
            if (keyListenerA != keyListener) {
                super.setKeyListener(keyListenerA);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5768b c5768b = this.f46707a;
        if (c5768b != null) {
            c5768b.b();
        }
        C5781o c5781o = this.f46708b;
        if (c5781o != null) {
            c5781o.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f46709c.d(C5774h.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5768b c5768b = this.f46707a;
        if (c5768b != null) {
            c5768b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5768b c5768b = this.f46707a;
        if (c5768b != null) {
            c5768b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46708b;
        if (c5781o != null) {
            c5781o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46708b;
        if (c5781o != null) {
            c5781o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C14879a.b(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5781o c5781o = this.f46708b;
        if (c5781o != null) {
            c5781o.q(context, i10);
        }
    }
}
