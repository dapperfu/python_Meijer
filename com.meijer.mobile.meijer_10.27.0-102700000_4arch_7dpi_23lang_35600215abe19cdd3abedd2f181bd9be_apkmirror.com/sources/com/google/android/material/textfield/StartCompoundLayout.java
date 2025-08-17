package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.M;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import oe.C16026c;
import p2.C16236t;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
class StartCompoundLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f87733a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f87734b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f87735c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f87736d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f87737e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f87738f;

    /* renamed from: g, reason: collision with root package name */
    private int f87739g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f87740h;

    /* renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f87741i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f87742j;

    private void C() {
        int i10 = (this.f87735c == null || this.f87742j) ? 8 : 0;
        setVisibility((this.f87736d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f87734b.setVisibility(i10);
        this.f87733a.m0();
    }

    private void i(M m10) {
        this.f87734b.setVisibility(8);
        this.f87734b.setId(ae.f.f44677W);
        this.f87734b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.o0(this.f87734b, 1);
        o(m10.n(ae.l.f45194ga, 0));
        if (m10.s(ae.l.f45206ha)) {
            p(m10.c(ae.l.f45206ha));
        }
        n(m10.p(ae.l.f45182fa));
    }

    void A(q2.y yVar) {
        if (this.f87734b.getVisibility() != 0) {
            yVar.Z0(this.f87736d);
        } else {
            yVar.E0(this.f87734b);
            yVar.Z0(this.f87734b);
        }
    }

    void B() {
        EditText editText = this.f87733a.f87778d;
        if (editText == null) {
            return;
        }
        ViewCompat.B0(this.f87734b, k() ? 0 : ViewCompat.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(ae.d.f44581Q), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f87735c;
    }

    ColorStateList b() {
        return this.f87734b.getTextColors();
    }

    TextView d() {
        return this.f87734b;
    }

    CharSequence e() {
        return this.f87736d.getContentDescription();
    }

    Drawable f() {
        return this.f87736d.getDrawable();
    }

    int g() {
        return this.f87739g;
    }

    ImageView.ScaleType h() {
        return this.f87740h;
    }

    boolean k() {
        return this.f87736d.getVisibility() == 0;
    }

    void l(boolean z10) {
        this.f87742j = z10;
        C();
    }

    void m() {
        s.d(this.f87733a, this.f87736d, this.f87737e);
    }

    void o(int i10) {
        androidx.core.widget.k.p(this.f87734b, i10);
    }

    void p(ColorStateList colorStateList) {
        this.f87734b.setTextColor(colorStateList);
    }

    void q(boolean z10) {
        this.f87736d.setCheckable(z10);
    }

    void s(Drawable drawable) {
        this.f87736d.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f87733a, this.f87736d, this.f87737e, this.f87738f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f87739g) {
            this.f87739g = i10;
            s.g(this.f87736d, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        s.h(this.f87736d, onClickListener, this.f87741i);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f87741i = onLongClickListener;
        s.i(this.f87736d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f87740h = scaleType;
        s.j(this.f87736d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f87737e != colorStateList) {
            this.f87737e = colorStateList;
            s.a(this.f87733a, this.f87736d, colorStateList, this.f87738f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f87738f != mode) {
            this.f87738f = mode;
            s.a(this.f87733a, this.f87736d, this.f87737e, mode);
        }
    }

    StartCompoundLayout(TextInputLayout textInputLayout, M m10) {
        super(textInputLayout.getContext());
        this.f87733a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ae.h.f44727m, (ViewGroup) this, false);
        this.f87736d = checkableImageButton;
        s.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f87734b = appCompatTextView;
        j(m10);
        i(m10);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void j(M m10) {
        if (C16026c.h(getContext())) {
            C16236t.c((ViewGroup.MarginLayoutParams) this.f87736d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (m10.s(ae.l.f45278na)) {
            this.f87737e = C16026c.b(getContext(), m10, ae.l.f45278na);
        }
        if (m10.s(ae.l.f45290oa)) {
            this.f87738f = com.google.android.material.internal.x.l(m10.k(ae.l.f45290oa, -1), null);
        }
        if (m10.s(ae.l.f45242ka)) {
            s(m10.g(ae.l.f45242ka));
            if (m10.s(ae.l.f45230ja)) {
                r(m10.p(ae.l.f45230ja));
            }
            q(m10.a(ae.l.f45218ia, true));
        }
        t(m10.f(ae.l.f45254la, getResources().getDimensionPixelSize(ae.d.f44620o0)));
        if (m10.s(ae.l.f45266ma)) {
            w(s.b(m10.k(ae.l.f45266ma, -1)));
        }
    }

    int c() {
        int measuredWidth;
        if (k()) {
            measuredWidth = this.f87736d.getMeasuredWidth() + C16236t.a((ViewGroup.MarginLayoutParams) this.f87736d.getLayoutParams());
        } else {
            measuredWidth = 0;
        }
        return ViewCompat.E(this) + ViewCompat.E(this.f87734b) + measuredWidth;
    }

    void n(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f87735c = charSequence2;
        this.f87734b.setText(charSequence);
        C();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f87736d.setContentDescription(charSequence);
        }
    }

    void z(boolean z10) {
        int i10;
        if (k() != z10) {
            CheckableImageButton checkableImageButton = this.f87736d;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            B();
            C();
        }
    }
}
