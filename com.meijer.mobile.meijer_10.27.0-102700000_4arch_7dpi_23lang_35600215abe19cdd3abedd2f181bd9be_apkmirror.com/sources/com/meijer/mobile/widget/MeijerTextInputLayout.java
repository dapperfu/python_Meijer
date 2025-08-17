package com.meijer.mobile.widget;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.meijer.mobile.meijer.Q;
import com.meijer.mobile.meijer.Z;
import com.meijer.mobile.meijer.a0;
import rr.C16831b;

/* loaded from: classes11.dex */
public class MeijerTextInputLayout extends TextInputLayout {

    /* renamed from: E0, reason: collision with root package name */
    private C16831b f119507E0;

    /* renamed from: F0, reason: collision with root package name */
    private int f119508F0;

    /* renamed from: G0, reason: collision with root package name */
    private int f119509G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f119510H0;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f119511I0;

    /* renamed from: J0, reason: collision with root package name */
    private ValueAnimator f119512J0;

    class a extends C16831b {
        a() {
        }

        @Override // rr.C16831b, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            MeijerTextInputLayout.this.E0();
        }
    }

    public void E0() {
        setError((CharSequence) null);
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(final CharSequence charSequence) {
        post(new Runnable() { // from class: com.meijer.mobile.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f119577a.H0(charSequence);
            }
        });
        super.setError(charSequence);
    }

    private void B0() {
        this.f119512J0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meijer.mobile.widget.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f119579a.G0(valueAnimator);
            }
        });
    }

    private void D0() {
        if (this.f119508F0 == 0) {
            this.f119508F0 = getMeasuredHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(CharSequence charSequence) {
        if (charSequence != null) {
            J0(String.valueOf(charSequence));
        } else {
            I0();
        }
    }

    private void I0() {
        int i10;
        if (this.f119511I0 && (i10 = this.f119508F0) != 0) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f119509G0, i10);
            this.f119512J0 = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(this.f119510H0);
            B0();
            this.f119512J0.start();
        }
        this.f119511I0 = false;
    }

    public void setDuration(int i10) {
        if (i10 <= 0) {
            this.f119510H0 = i10;
        }
    }

    public MeijerTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        F0(getContext(), attributeSet);
    }

    private int C0(String str) {
        int iApplyDimension = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
        TextView textView = new TextView(getContext());
        textView.setTextSize(0, getResources().getDimensionPixelSize(Q.f98657c));
        textView.setText(str);
        textView.setPadding(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
        textView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    private void F0(Context context, AttributeSet attributeSet) {
        E0();
        this.f119510H0 = getResources().getInteger(R.integer.config_longAnimTime);
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a0.f100945l, 0, Z.f100468b);
        this.f119510H0 = typedArrayObtainStyledAttributes.getInteger(a0.f100946m, this.f119510H0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(ValueAnimator valueAnimator) {
        getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        requestLayout();
    }

    private void J0(String str) {
        setErrorHeight(str);
        if (!this.f119511I0) {
            D0();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f119508F0, this.f119509G0);
            this.f119512J0 = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(this.f119510H0);
            B0();
            this.f119512J0.start();
            this.f119511I0 = true;
        }
    }

    private void setErrorHeight(String str) {
        D0();
        this.f119509G0 = C0(str) + this.f119508F0;
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (getEditText() != null && this.f119507E0 == null) {
            this.f119507E0 = new a();
            getEditText().addTextChangedListener(this.f119507E0);
        }
    }

    public void setError(int i10) {
        setError(getResources().getString(i10));
    }
}
