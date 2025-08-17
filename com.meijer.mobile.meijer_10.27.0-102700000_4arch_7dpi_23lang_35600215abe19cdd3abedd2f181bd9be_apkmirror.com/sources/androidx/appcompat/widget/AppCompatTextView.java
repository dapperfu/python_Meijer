package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.TypefaceCompat;
import j.C14791a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m2.r;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private final C5626b f46543a;

    /* renamed from: b, reason: collision with root package name */
    private final C5639o f46544b;

    /* renamed from: c, reason: collision with root package name */
    private final C5638n f46545c;

    /* renamed from: d, reason: collision with root package name */
    private C5631g f46546d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46547e;

    /* renamed from: f, reason: collision with root package name */
    private a f46548f;

    /* renamed from: g, reason: collision with root package name */
    private Future<m2.r> f46549g;

    private interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    class b implements a {
        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i10, float f10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void k(int i10) {
        }

        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int[] iArr, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] f() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier g() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int h() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void i(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void j(int i10, int i11, int i12, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int l() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void m(int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void k(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i10, float f10) {
            AppCompatTextView.super.setLineHeight(i10, f10);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.k.m(this, i10);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C5631g getEmojiTextViewHelper() {
        if (this.f46546d == null) {
            this.f46546d = new C5631g(this);
        }
        return this.f46546d;
    }

    private void r() {
        Future<m2.r> future = this.f46549g;
        if (future != null) {
            try {
                this.f46549g = null;
                androidx.core.widget.k.o(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Y.f46948c) {
            return getSuperCaller().h();
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            return c5639o.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Y.f46948c) {
            return getSuperCaller().d();
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            return c5639o.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Y.f46948c) {
            return getSuperCaller().l();
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            return c5639o.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (Y.f46948c) {
            return getSuperCaller().f();
        }
        C5639o c5639o = this.f46544b;
        return c5639o != null ? c5639o.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Y.f46948c) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            return c5639o.i();
        }
        return 0;
    }

    a getSuperCaller() {
        if (this.f46548f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f46548f = new d();
            } else if (i10 >= 28) {
                this.f46548f = new c();
            } else if (i10 >= 26) {
                this.f46548f = new b();
            }
        }
        return this.f46548f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46543a;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46543a;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46544b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46544b.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5638n c5638n;
        return (Build.VERSION.SDK_INT >= 28 || (c5638n = this.f46545c) == null) ? getSuperCaller().g() : c5638n.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Y.f46948c) {
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (Y.f46948c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (Y.f46948c) {
            getSuperCaller().m(i10);
            return;
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.v(i10);
        }
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i10);
        } else {
            androidx.core.widget.k.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            androidx.core.widget.k.l(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            androidx.core.widget.k.n(this, i10, f10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46543a;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46543a;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f46544b.w(colorStateList);
        this.f46544b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f46544b.x(mode);
        this.f46544b.b();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5638n c5638n;
        if (Build.VERSION.SDK_INT >= 28 || (c5638n = this.f46545c) == null) {
            getSuperCaller().i(textClassifier);
        } else {
            c5638n.b(textClassifier);
        }
    }

    public void setTextFuture(Future<m2.r> future) {
        this.f46549g = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (Y.f46948c) {
            super.setTextSize(i10, f10);
            return;
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f46547e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : TypefaceCompat.a(getContext(), typeface, i10);
        this.f46547e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f46547e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        this.f46547e = false;
        this.f46548f = null;
        H.a(this, getContext());
        C5626b c5626b = new C5626b(this);
        this.f46543a = c5626b;
        c5626b.e(attributeSet, i10);
        C5639o c5639o = new C5639o(this);
        this.f46544b = c5639o;
        c5639o.m(attributeSet, i10);
        c5639o.b();
        this.f46545c = new C5638n(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5626b c5626b = this.f46543a;
        if (c5626b != null) {
            c5626b.b();
        }
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.k.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.k.c(this);
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    public r.a getTextMetricsParamsCompat() {
        return androidx.core.widget.k.g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f46544b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return C5632h.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && i10 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C5639o c5639o = this.f46544b;
        if (c5639o != null && !Y.f46948c && c5639o.l()) {
            this.f46544b.c();
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
        C5626b c5626b = this.f46543a;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46543a;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5639o c5639o = this.f46544b;
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
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setPrecomputedText(m2.r rVar) {
        androidx.core.widget.k.o(this, rVar);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.q(context, i10);
        }
    }

    public void setTextMetricsParamsCompat(r.a aVar) {
        androidx.core.widget.k.q(this, aVar);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? C14791a.b(context, i10) : null, i11 != 0 ? C14791a.b(context, i11) : null, i12 != 0 ? C14791a.b(context, i12) : null, i13 != 0 ? C14791a.b(context, i13) : null);
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C14791a.b(context, i10) : null, i11 != 0 ? C14791a.b(context, i11) : null, i12 != 0 ? C14791a.b(context, i12) : null, i13 != 0 ? C14791a.b(context, i13) : null);
        C5639o c5639o = this.f46544b;
        if (c5639o != null) {
            c5639o.p();
        }
    }
}
