package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import i.C14578a;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {
    private C5773g mAppCompatEmojiTextHelper;
    private final C5768b mBackgroundTintHelper;
    private final C5781o mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136295q);
    }

    private C5773g getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C5773g(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Y.f47172c) {
            return super.getAutoSizeMaxTextSize();
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            return c5781o.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Y.f47172c) {
            return super.getAutoSizeMinTextSize();
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            return c5781o.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Y.f47172c) {
            return super.getAutoSizeStepGranularity();
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            return c5781o.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (Y.f47172c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5781o c5781o = this.mTextHelper;
        return c5781o != null ? c5781o.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Y.f47172c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            return c5781o.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5768b c5768b = this.mBackgroundTintHelper;
        if (c5768b != null) {
            return c5768b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5768b c5768b = this.mBackgroundTintHelper;
        if (c5768b != null) {
            return c5768b.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Y.f47172c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (Y.f47172c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (Y.f47172c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.v(i10);
        }
    }

    public void setSupportAllCaps(boolean z10) {
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5768b c5768b = this.mBackgroundTintHelper;
        if (c5768b != null) {
            c5768b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5768b c5768b = this.mBackgroundTintHelper;
        if (c5768b != null) {
            c5768b.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (Y.f47172c) {
            super.setTextSize(i10, f10);
            return;
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.A(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        H.a(this, getContext());
        C5768b c5768b = new C5768b(this);
        this.mBackgroundTintHelper = c5768b;
        c5768b.e(attributeSet, i10);
        C5781o c5781o = new C5781o(this);
        this.mTextHelper = c5781o;
        c5781o.m(attributeSet, i10);
        c5781o.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5768b c5768b = this.mBackgroundTintHelper;
        if (c5768b != null) {
            c5768b.b();
        }
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null && !Y.f47172c && c5781o.l()) {
            this.mTextHelper.c();
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
        C5768b c5768b = this.mBackgroundTintHelper;
        if (c5768b != null) {
            c5768b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5768b c5768b = this.mBackgroundTintHelper;
        if (c5768b != null) {
            c5768b.g(i10);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5781o c5781o = this.mTextHelper;
        if (c5781o != null) {
            c5781o.q(context, i10);
        }
    }
}
