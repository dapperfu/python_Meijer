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
import i.C14578a;
import p2.C16348c;
import s2.C16994c;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements p2.I {

    /* renamed from: a, reason: collision with root package name */
    private final C5768b f46718a;

    /* renamed from: b, reason: collision with root package name */
    private final C5781o f46719b;

    /* renamed from: c, reason: collision with root package name */
    private final C5780n f46720c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.l f46721d;

    /* renamed from: e, reason: collision with root package name */
    private final C5772f f46722e;

    /* renamed from: f, reason: collision with root package name */
    private a f46723f;

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
        this(context, attributeSet, C14578a.f136264D);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5768b c5768b = new C5768b(this);
        this.f46718a = c5768b;
        c5768b.e(attributeSet, i10);
        C5781o c5781o = new C5781o(this);
        this.f46719b = c5781o;
        c5781o.m(attributeSet, i10);
        c5781o.b();
        this.f46720c = new C5780n(this);
        this.f46721d = new androidx.core.widget.l();
        C5772f c5772f = new C5772f(this);
        this.f46722e = c5772f;
        c5772f.c(attributeSet, i10);
        d(c5772f);
    }

    private a getSuperCaller() {
        if (this.f46723f == null) {
            this.f46723f = new a();
        }
        return this.f46723f;
    }

    @Override // p2.I
    public C16348c a(C16348c c16348c) {
        return this.f46721d.a(this, c16348c);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5768b c5768b = this.f46718a;
        if (c5768b != null) {
            return c5768b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5768b c5768b = this.f46718a;
        if (c5768b != null) {
            return c5768b.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46719b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46719b.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5780n c5780n;
        return (Build.VERSION.SDK_INT >= 28 || (c5780n = this.f46720c) == null) ? getSuperCaller().a() : c5780n.a();
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f46722e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f46722e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5768b c5768b = this.f46718a;
        if (c5768b != null) {
            c5768b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5768b c5768b = this.f46718a;
        if (c5768b != null) {
            c5768b.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46719b.w(colorStateList);
        this.f46719b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46719b.x(mode);
        this.f46719b.b();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5780n c5780n;
        if (Build.VERSION.SDK_INT >= 28 || (c5780n = this.f46720c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c5780n.b(textClassifier);
        }
    }

    void d(C5772f c5772f) {
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
        C5768b c5768b = this.f46718a;
        if (c5768b != null) {
            c5768b.b();
        }
        C5781o c5781o = this.f46719b;
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
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f46719b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = C5774h.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrC = ViewCompat.C(this)) != null) {
            C16994c.d(editorInfo, strArrC);
            inputConnectionA = s2.e.c(this, inputConnectionA, editorInfo);
        }
        return this.f46722e.d(inputConnectionA, editorInfo);
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
        if (C5778l.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C5778l.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5768b c5768b = this.f46718a;
        if (c5768b != null) {
            c5768b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5768b c5768b = this.f46718a;
        if (c5768b != null) {
            c5768b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46719b;
        if (c5781o != null) {
            c5781o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5781o c5781o = this.f46719b;
        if (c5781o != null) {
            c5781o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5781o c5781o = this.f46719b;
        if (c5781o != null) {
            c5781o.q(context, i10);
        }
    }
}
