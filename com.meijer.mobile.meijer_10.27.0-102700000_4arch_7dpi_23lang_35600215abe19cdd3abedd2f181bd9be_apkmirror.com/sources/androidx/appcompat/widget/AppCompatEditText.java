package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import i.C14575a;
import p2.C16203c;
import s2.C16848c;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements p2.I {

    /* renamed from: a, reason: collision with root package name */
    private final C5626b f46494a;

    /* renamed from: b, reason: collision with root package name */
    private final C5639o f46495b;

    /* renamed from: c, reason: collision with root package name */
    private final C5638n f46496c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.l f46497d;

    /* renamed from: e, reason: collision with root package name */
    private final C5630f f46498e;

    /* renamed from: f, reason: collision with root package name */
    private a f46499f;

    class a {
        a() {
        }

        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136507D);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5626b c5626b = new C5626b(this);
        this.f46494a = c5626b;
        c5626b.e(attributeSet, i10);
        C5639o c5639o = new C5639o(this);
        this.f46495b = c5639o;
        c5639o.m(attributeSet, i10);
        c5639o.b();
        this.f46496c = new C5638n(this);
        this.f46497d = new androidx.core.widget.l();
        C5630f c5630f = new C5630f(this);
        this.f46498e = c5630f;
        c5630f.c(attributeSet, i10);
        d(c5630f);
    }

    private a getSuperCaller() {
        if (this.f46499f == null) {
            this.f46499f = new a();
        }
        return this.f46499f;
    }

    @Override // p2.I
    public C16203c a(C16203c c16203c) {
        return this.f46497d.a(this, c16203c);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46494a;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46494a;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46495b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46495b.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5638n c5638n;
        return (Build.VERSION.SDK_INT >= 28 || (c5638n = this.f46496c) == null) ? getSuperCaller().a() : c5638n.a();
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f46498e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f46498e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46494a;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46494a;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46495b.w(colorStateList);
        this.f46495b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46495b.x(mode);
        this.f46495b.b();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5638n c5638n;
        if (Build.VERSION.SDK_INT >= 28 || (c5638n = this.f46496c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c5638n.b(textClassifier);
        }
    }

    void d(C5630f c5630f) {
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
        C5626b c5626b = this.f46494a;
        if (c5626b != null) {
            c5626b.b();
        }
        C5639o c5639o = this.f46495b;
        if (c5639o != null) {
            c5639o.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f46495b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = C5632h.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrC = ViewCompat.C(this)) != null) {
            C16848c.d(editorInfo, strArrC);
            inputConnectionA = s2.e.c(this, inputConnectionA, editorInfo);
        }
        return this.f46498e.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C5636l.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C5636l.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5626b c5626b = this.f46494a;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46494a;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46495b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46495b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5639o c5639o = this.f46495b;
        if (c5639o != null) {
            c5639o.q(context, i10);
        }
    }
}
