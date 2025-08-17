package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import i.C14575a;
import j.C14791a;

/* loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f46504d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    private final C5626b f46505a;

    /* renamed from: b, reason: collision with root package name */
    private final C5639o f46506b;

    /* renamed from: c, reason: collision with root package name */
    private final C5630f f46507c;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136537p);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        M mV = M.v(getContext(), attributeSet, f46504d, i10, 0);
        if (mV.s(0)) {
            setDropDownBackgroundDrawable(mV.g(0));
        }
        mV.x();
        C5626b c5626b = new C5626b(this);
        this.f46505a = c5626b;
        c5626b.e(attributeSet, i10);
        C5639o c5639o = new C5639o(this);
        this.f46506b = c5639o;
        c5639o.m(attributeSet, i10);
        c5639o.b();
        C5630f c5630f = new C5630f(this);
        this.f46507c = c5630f;
        c5630f.c(attributeSet, i10);
        a(c5630f);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46505a;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46505a;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46506b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46506b.k();
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f46507c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f46507c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46505a;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46505a;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46506b.w(colorStateList);
        this.f46506b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46506b.x(mode);
        this.f46506b.b();
    }

    void a(C5630f c5630f) {
        KeyListener keyListener = getKeyListener();
        if (c5630f.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c5630f.a(keyListener);
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
        C5626b c5626b = this.f46505a;
        if (c5626b != null) {
            c5626b.b();
        }
        C5639o c5639o = this.f46506b;
        if (c5639o != null) {
            c5639o.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f46507c.d(C5632h.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5626b c5626b = this.f46505a;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46505a;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46506b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46506b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C14791a.b(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5639o c5639o = this.f46506b;
        if (c5639o != null) {
            c5639o.q(context, i10);
        }
    }
}
