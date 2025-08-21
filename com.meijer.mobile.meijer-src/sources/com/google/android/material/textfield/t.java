package com.google.android.material.textfield;

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
import ce.C6503b;
import com.fullstory.FS;
import de.C13661a;
import de.C13662b;
import java.util.ArrayList;
import java.util.List;
import qe.C16634c;

/* loaded from: classes4.dex */
final class t {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f88717A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f88718B;

    /* renamed from: a, reason: collision with root package name */
    private final int f88719a;

    /* renamed from: b, reason: collision with root package name */
    private final int f88720b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88721c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f88722d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f88723e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f88724f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f88725g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f88726h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f88727i;

    /* renamed from: j, reason: collision with root package name */
    private int f88728j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f88729k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f88730l;

    /* renamed from: m, reason: collision with root package name */
    private final float f88731m;

    /* renamed from: n, reason: collision with root package name */
    private int f88732n;

    /* renamed from: o, reason: collision with root package name */
    private int f88733o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f88734p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f88735q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f88736r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f88737s;

    /* renamed from: t, reason: collision with root package name */
    private int f88738t;

    /* renamed from: u, reason: collision with root package name */
    private int f88739u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f88740v;

    /* renamed from: w, reason: collision with root package name */
    private CharSequence f88741w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f88742x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f88743y;

    /* renamed from: z, reason: collision with root package name */
    private int f88744z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f88745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f88746b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f88747c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f88748d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f88745a = i10;
            this.f88746b = textView;
            this.f88747c = i11;
            this.f88748d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f88732n = this.f88745a;
            t.this.f88730l = null;
            TextView textView = this.f88746b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f88747c == 1 && t.this.f88736r != null) {
                    t.this.f88736r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f88748d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f88748d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f88748d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f88748d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f88726h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f88736r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f88743y;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f88736r == null || TextUtils.isEmpty(this.f88734p)) ? false : true;
    }

    void w() {
        this.f88734p = null;
        h();
        if (this.f88732n == 1) {
            if (!this.f88742x || TextUtils.isEmpty(this.f88741w)) {
                this.f88733o = 0;
            } else {
                this.f88733o = 2;
            }
        }
        S(this.f88732n, this.f88733o, P(this.f88736r, ""));
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
        this.f88732n = i11;
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
        if (ViewCompat.S(this.f88726h) && this.f88726h.isEnabled()) {
            return (this.f88733o == this.f88732n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
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
            this.f88730l = animatorSet;
            ArrayList arrayList = new ArrayList();
            tVar = this;
            tVar.i(arrayList, this.f88742x, this.f88743y, 2, i10, i11);
            tVar.i(arrayList, tVar.f88735q, tVar.f88736r, 1, i10, i11);
            C13662b.a(animatorSet, arrayList);
            animatorSet.addListener(tVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            tVar = this;
            D(i10, i11);
        }
        tVar.f88726h.n0();
        tVar.f88726h.s0(z10);
        tVar.f88726h.y0();
    }

    private boolean g() {
        return (this.f88727i == null || this.f88726h.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f88721c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f88721c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f88720b : this.f88721c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f88723e : this.f88724f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f88731m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f88719a);
        objectAnimatorOfFloat.setInterpolator(this.f88722d);
        return objectAnimatorOfFloat;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f88725g.getResources().getDimensionPixelSize(i10) : i11;
    }

    boolean A() {
        return this.f88735q;
    }

    boolean B() {
        return this.f88742x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f88727i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f88729k) == null) {
            this.f88727i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f88728j - 1;
        this.f88728j = i11;
        O(this.f88727i, i11);
    }

    void E(int i10) {
        this.f88738t = i10;
        TextView textView = this.f88736r;
        if (textView != null) {
            ViewCompat.o0(textView, i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f88737s = charSequence;
        TextView textView = this.f88736r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f88735q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f88725g);
            this.f88736r = appCompatTextView;
            appCompatTextView.setId(ce.f.f61689T);
            this.f88736r.setTextAlignment(5);
            Typeface typeface = this.f88718B;
            if (typeface != null) {
                this.f88736r.setTypeface(typeface);
            }
            H(this.f88739u);
            I(this.f88740v);
            F(this.f88737s);
            E(this.f88738t);
            this.f88736r.setVisibility(4);
            e(this.f88736r, 0);
        } else {
            w();
            C(this.f88736r, 0);
            this.f88736r = null;
            this.f88726h.n0();
            this.f88726h.y0();
        }
        this.f88735q = z10;
    }

    void H(int i10) {
        this.f88739u = i10;
        TextView textView = this.f88736r;
        if (textView != null) {
            this.f88726h.a0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f88740v = colorStateList;
        TextView textView = this.f88736r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f88744z = i10;
        TextView textView = this.f88743y;
        if (textView != null) {
            androidx.core.widget.k.p(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f88742x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f88725g);
            this.f88743y = appCompatTextView;
            appCompatTextView.setId(ce.f.f61690U);
            this.f88743y.setTextAlignment(5);
            Typeface typeface = this.f88718B;
            if (typeface != null) {
                this.f88743y.setTypeface(typeface);
            }
            this.f88743y.setVisibility(4);
            ViewCompat.o0(this.f88743y, 1);
            J(this.f88744z);
            L(this.f88717A);
            e(this.f88743y, 1);
            FS.setAccessibilityDelegate(this.f88743y, new b());
        } else {
            x();
            C(this.f88743y, 1);
            this.f88743y = null;
            this.f88726h.n0();
            this.f88726h.y0();
        }
        this.f88742x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f88717A = colorStateList;
        TextView textView = this.f88743y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f88718B) {
            this.f88718B = typeface;
            M(this.f88736r, typeface);
            M(this.f88743y, typeface);
        }
    }

    void e(TextView textView, int i10) {
        if (this.f88727i == null && this.f88729k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f88725g);
            this.f88727i = linearLayout;
            linearLayout.setOrientation(0);
            this.f88726h.addView(this.f88727i, -1, -2);
            this.f88729k = new FrameLayout(this.f88725g);
            this.f88727i.addView(this.f88729k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f88726h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f88729k.setVisibility(0);
            this.f88729k.addView(textView);
        } else {
            this.f88727i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f88727i.setVisibility(0);
        this.f88728j++;
    }

    void h() {
        Animator animator = this.f88730l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f88733o);
    }

    int n() {
        return this.f88738t;
    }

    CharSequence o() {
        return this.f88737s;
    }

    CharSequence p() {
        return this.f88734p;
    }

    int q() {
        TextView textView = this.f88736r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f88736r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f88741w;
    }

    View t() {
        return this.f88743y;
    }

    int u() {
        TextView textView = this.f88743y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f88725g = context;
        this.f88726h = textInputLayout;
        this.f88731m = context.getResources().getDimensionPixelSize(ce.d.f61626k);
        this.f88719a = pe.i.f(context, C6503b.f61509P, 217);
        this.f88720b = pe.i.f(context, C6503b.f61505L, 167);
        this.f88721c = pe.i.f(context, C6503b.f61509P, 167);
        this.f88722d = pe.i.g(context, C6503b.f61511R, C13661a.f128353d);
        int i10 = C6503b.f61511R;
        TimeInterpolator timeInterpolator = C13661a.f128350a;
        this.f88723e = pe.i.g(context, i10, timeInterpolator);
        this.f88724f = pe.i.g(context, C6503b.f61513T, timeInterpolator);
    }

    void Q(CharSequence charSequence) {
        h();
        this.f88734p = charSequence;
        this.f88736r.setText(charSequence);
        int i10 = this.f88732n;
        if (i10 != 1) {
            this.f88733o = 1;
        }
        S(i10, this.f88733o, P(this.f88736r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f88741w = charSequence;
        this.f88743y.setText(charSequence);
        int i10 = this.f88732n;
        if (i10 != 2) {
            this.f88733o = 2;
        }
        S(i10, this.f88733o, P(this.f88743y, charSequence));
    }

    void f() {
        if (g()) {
            EditText editText = this.f88726h.getEditText();
            boolean zH = C16634c.h(this.f88725g);
            ViewCompat.B0(this.f88727i, v(zH, ce.d.f61594O, ViewCompat.E(editText)), v(zH, ce.d.f61595P, this.f88725g.getResources().getDimensionPixelSize(ce.d.f61593N)), v(zH, ce.d.f61594O, ViewCompat.D(editText)), 0);
        }
    }

    void x() {
        h();
        int i10 = this.f88732n;
        if (i10 == 2) {
            this.f88733o = 0;
        }
        S(i10, this.f88733o, P(this.f88743y, ""));
    }
}
