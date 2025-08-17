package com.google.android.material.textfield;

import ae.C5597b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import be.C6230a;
import be.C6231b;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import oe.C16026c;

/* loaded from: classes4.dex */
final class t {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f87877A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f87878B;

    /* renamed from: a, reason: collision with root package name */
    private final int f87879a;

    /* renamed from: b, reason: collision with root package name */
    private final int f87880b;

    /* renamed from: c, reason: collision with root package name */
    private final int f87881c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f87882d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f87883e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f87884f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f87885g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f87886h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f87887i;

    /* renamed from: j, reason: collision with root package name */
    private int f87888j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f87889k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f87890l;

    /* renamed from: m, reason: collision with root package name */
    private final float f87891m;

    /* renamed from: n, reason: collision with root package name */
    private int f87892n;

    /* renamed from: o, reason: collision with root package name */
    private int f87893o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f87894p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f87895q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f87896r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f87897s;

    /* renamed from: t, reason: collision with root package name */
    private int f87898t;

    /* renamed from: u, reason: collision with root package name */
    private int f87899u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f87900v;

    /* renamed from: w, reason: collision with root package name */
    private CharSequence f87901w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f87902x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f87903y;

    /* renamed from: z, reason: collision with root package name */
    private int f87904z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87905a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f87906b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f87907c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f87908d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f87905a = i10;
            this.f87906b = textView;
            this.f87907c = i11;
            this.f87908d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f87892n = this.f87905a;
            t.this.f87890l = null;
            TextView textView = this.f87906b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f87907c == 1 && t.this.f87896r != null) {
                    t.this.f87896r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f87908d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f87908d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f87908d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f87908d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f87886h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f87896r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f87903y;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f87896r == null || TextUtils.isEmpty(this.f87894p)) ? false : true;
    }

    void w() {
        this.f87894p = null;
        h();
        if (this.f87892n == 1) {
            if (!this.f87902x || TextUtils.isEmpty(this.f87901w)) {
                this.f87893o = 0;
            } else {
                this.f87893o = 2;
            }
        }
        S(this.f87892n, this.f87893o, P(this.f87896r, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f87892n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (ViewCompat.S(this.f87886h) && this.f87886h.isEnabled()) {
            return (this.f87893o == this.f87892n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i10, int i11, boolean z10) {
        t tVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f87890l = animatorSet;
            ArrayList arrayList = new ArrayList();
            tVar = this;
            tVar.i(arrayList, this.f87902x, this.f87903y, 2, i10, i11);
            tVar.i(arrayList, tVar.f87895q, tVar.f87896r, 1, i10, i11);
            C6231b.a(animatorSet, arrayList);
            animatorSet.addListener(tVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            tVar = this;
            D(i10, i11);
        }
        tVar.f87886h.n0();
        tVar.f87886h.s0(z10);
        tVar.f87886h.y0();
    }

    private boolean g() {
        return (this.f87887i == null || this.f87886h.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f87881c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f87881c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f87880b : this.f87881c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f87883e : this.f87884f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f87891m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f87879a);
        objectAnimatorOfFloat.setInterpolator(this.f87882d);
        return objectAnimatorOfFloat;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f87885g.getResources().getDimensionPixelSize(i10) : i11;
    }

    boolean A() {
        return this.f87895q;
    }

    boolean B() {
        return this.f87902x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f87887i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f87889k) == null) {
            this.f87887i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f87888j - 1;
        this.f87888j = i11;
        O(this.f87887i, i11);
    }

    void E(int i10) {
        this.f87898t = i10;
        TextView textView = this.f87896r;
        if (textView != null) {
            ViewCompat.o0(textView, i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f87897s = charSequence;
        TextView textView = this.f87896r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f87895q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f87885g);
            this.f87896r = appCompatTextView;
            appCompatTextView.setId(ae.f.f44674T);
            this.f87896r.setTextAlignment(5);
            Typeface typeface = this.f87878B;
            if (typeface != null) {
                this.f87896r.setTypeface(typeface);
            }
            H(this.f87899u);
            I(this.f87900v);
            F(this.f87897s);
            E(this.f87898t);
            this.f87896r.setVisibility(4);
            e(this.f87896r, 0);
        } else {
            w();
            C(this.f87896r, 0);
            this.f87896r = null;
            this.f87886h.n0();
            this.f87886h.y0();
        }
        this.f87895q = z10;
    }

    void H(int i10) {
        this.f87899u = i10;
        TextView textView = this.f87896r;
        if (textView != null) {
            this.f87886h.a0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f87900v = colorStateList;
        TextView textView = this.f87896r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f87904z = i10;
        TextView textView = this.f87903y;
        if (textView != null) {
            androidx.core.widget.k.p(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f87902x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f87885g);
            this.f87903y = appCompatTextView;
            appCompatTextView.setId(ae.f.f44675U);
            this.f87903y.setTextAlignment(5);
            Typeface typeface = this.f87878B;
            if (typeface != null) {
                this.f87903y.setTypeface(typeface);
            }
            this.f87903y.setVisibility(4);
            ViewCompat.o0(this.f87903y, 1);
            J(this.f87904z);
            L(this.f87877A);
            e(this.f87903y, 1);
            FS.setAccessibilityDelegate(this.f87903y, new b());
        } else {
            x();
            C(this.f87903y, 1);
            this.f87903y = null;
            this.f87886h.n0();
            this.f87886h.y0();
        }
        this.f87902x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f87877A = colorStateList;
        TextView textView = this.f87903y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f87878B) {
            this.f87878B = typeface;
            M(this.f87896r, typeface);
            M(this.f87903y, typeface);
        }
    }

    void e(TextView textView, int i10) {
        if (this.f87887i == null && this.f87889k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f87885g);
            this.f87887i = linearLayout;
            linearLayout.setOrientation(0);
            this.f87886h.addView(this.f87887i, -1, -2);
            this.f87889k = new FrameLayout(this.f87885g);
            this.f87887i.addView(this.f87889k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f87886h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f87889k.setVisibility(0);
            this.f87889k.addView(textView);
        } else {
            this.f87887i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f87887i.setVisibility(0);
        this.f87888j++;
    }

    void h() {
        Animator animator = this.f87890l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f87893o);
    }

    int n() {
        return this.f87898t;
    }

    CharSequence o() {
        return this.f87897s;
    }

    CharSequence p() {
        return this.f87894p;
    }

    int q() {
        TextView textView = this.f87896r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f87896r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f87901w;
    }

    View t() {
        return this.f87903y;
    }

    int u() {
        TextView textView = this.f87903y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f87885g = context;
        this.f87886h = textInputLayout;
        this.f87891m = context.getResources().getDimensionPixelSize(ae.d.f44611k);
        this.f87879a = ne.i.f(context, C5597b.f44494P, 217);
        this.f87880b = ne.i.f(context, C5597b.f44490L, 167);
        this.f87881c = ne.i.f(context, C5597b.f44494P, 167);
        this.f87882d = ne.i.g(context, C5597b.f44496R, C6230a.f60118d);
        int i10 = C5597b.f44496R;
        TimeInterpolator timeInterpolator = C6230a.f60115a;
        this.f87883e = ne.i.g(context, i10, timeInterpolator);
        this.f87884f = ne.i.g(context, C5597b.f44498T, timeInterpolator);
    }

    void Q(CharSequence charSequence) {
        h();
        this.f87894p = charSequence;
        this.f87896r.setText(charSequence);
        int i10 = this.f87892n;
        if (i10 != 1) {
            this.f87893o = 1;
        }
        S(i10, this.f87893o, P(this.f87896r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f87901w = charSequence;
        this.f87903y.setText(charSequence);
        int i10 = this.f87892n;
        if (i10 != 2) {
            this.f87893o = 2;
        }
        S(i10, this.f87893o, P(this.f87903y, charSequence));
    }

    void f() {
        if (g()) {
            EditText editText = this.f87886h.getEditText();
            boolean zH = C16026c.h(this.f87885g);
            ViewCompat.B0(this.f87887i, v(zH, ae.d.f44579O, ViewCompat.E(editText)), v(zH, ae.d.f44580P, this.f87885g.getResources().getDimensionPixelSize(ae.d.f44578N)), v(zH, ae.d.f44579O, ViewCompat.D(editText)), 0);
        }
    }

    void x() {
        h();
        int i10 = this.f87892n;
        if (i10 == 2) {
            this.f87893o = 0;
        }
        S(i10, this.f87893o, P(this.f87903y, ""));
    }
}
