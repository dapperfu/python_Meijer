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
import p2.C16381t;
import qe.C16634c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
class StartCompoundLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f88573a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f88574b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f88575c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f88576d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f88577e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f88578f;

    /* renamed from: g, reason: collision with root package name */
    private int f88579g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f88580h;

    /* renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f88581i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f88582j;

    private void C() {
        int i10 = (this.f88575c == null || this.f88582j) ? 8 : 0;
        setVisibility((this.f88576d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f88574b.setVisibility(i10);
        this.f88573a.m0();
    }

    private void i(M m10) {
        this.f88574b.setVisibility(8);
        this.f88574b.setId(ce.f.f61692W);
        this.f88574b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.o0(this.f88574b, 1);
        o(m10.n(ce.l.f62209ga, 0));
        if (m10.s(ce.l.f62221ha)) {
            p(m10.c(ce.l.f62221ha));
        }
        n(m10.p(ce.l.f62197fa));
    }

    void A(q2.y yVar) {
        if (this.f88574b.getVisibility() != 0) {
            yVar.Z0(this.f88576d);
        } else {
            yVar.E0(this.f88574b);
            yVar.Z0(this.f88574b);
        }
    }

    void B() {
        EditText editText = this.f88573a.f88618d;
        if (editText == null) {
            return;
        }
        ViewCompat.B0(this.f88574b, k() ? 0 : ViewCompat.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(ce.d.f61596Q), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f88575c;
    }

    ColorStateList b() {
        return this.f88574b.getTextColors();
    }

    TextView d() {
        return this.f88574b;
    }

    CharSequence e() {
        return this.f88576d.getContentDescription();
    }

    Drawable f() {
        return this.f88576d.getDrawable();
    }

    int g() {
        return this.f88579g;
    }

    ImageView.ScaleType h() {
        return this.f88580h;
    }

    boolean k() {
        return this.f88576d.getVisibility() == 0;
    }

    void l(boolean z10) {
        this.f88582j = z10;
        C();
    }

    void m() {
        s.d(this.f88573a, this.f88576d, this.f88577e);
    }

    void o(int i10) {
        androidx.core.widget.k.p(this.f88574b, i10);
    }

    void p(ColorStateList colorStateList) {
        this.f88574b.setTextColor(colorStateList);
    }

    void q(boolean z10) {
        this.f88576d.setCheckable(z10);
    }

    void s(Drawable drawable) {
        this.f88576d.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f88573a, this.f88576d, this.f88577e, this.f88578f);
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
        if (i10 != this.f88579g) {
            this.f88579g = i10;
            s.g(this.f88576d, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        s.h(this.f88576d, onClickListener, this.f88581i);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f88581i = onLongClickListener;
        s.i(this.f88576d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f88580h = scaleType;
        s.j(this.f88576d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f88577e != colorStateList) {
            this.f88577e = colorStateList;
            s.a(this.f88573a, this.f88576d, colorStateList, this.f88578f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f88578f != mode) {
            this.f88578f = mode;
            s.a(this.f88573a, this.f88576d, this.f88577e, mode);
        }
    }

    StartCompoundLayout(TextInputLayout textInputLayout, M m10) {
        super(textInputLayout.getContext());
        this.f88573a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ce.h.f61742m, (ViewGroup) this, false);
        this.f88576d = checkableImageButton;
        s.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f88574b = appCompatTextView;
        j(m10);
        i(m10);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void j(M m10) {
        if (C16634c.h(getContext())) {
            C16381t.c((ViewGroup.MarginLayoutParams) this.f88576d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (m10.s(ce.l.f62293na)) {
            this.f88577e = C16634c.b(getContext(), m10, ce.l.f62293na);
        }
        if (m10.s(ce.l.f62305oa)) {
            this.f88578f = com.google.android.material.internal.x.l(m10.k(ce.l.f62305oa, -1), null);
        }
        if (m10.s(ce.l.f62257ka)) {
            s(m10.g(ce.l.f62257ka));
            if (m10.s(ce.l.f62245ja)) {
                r(m10.p(ce.l.f62245ja));
            }
            q(m10.a(ce.l.f62233ia, true));
        }
        t(m10.f(ce.l.f62269la, getResources().getDimensionPixelSize(ce.d.f61635o0)));
        if (m10.s(ce.l.f62281ma)) {
            w(s.b(m10.k(ce.l.f62281ma, -1)));
        }
    }

    int c() {
        int measuredWidth;
        if (k()) {
            measuredWidth = this.f88576d.getMeasuredWidth() + C16381t.a((ViewGroup.MarginLayoutParams) this.f88576d.getLayoutParams());
        } else {
            measuredWidth = 0;
        }
        return ViewCompat.E(this) + ViewCompat.E(this.f88574b) + measuredWidth;
    }

    void n(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f88575c = charSequence2;
        this.f88574b.setText(charSequence);
        C();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f88576d.setContentDescription(charSequence);
        }
    }

    void z(boolean z10) {
        int i10;
        if (k() != z10) {
            CheckableImageButton checkableImageButton = this.f88576d;
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
