package com.google.android.material.textfield;

import ae.C5597b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import be.C6230a;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* loaded from: classes4.dex */
class f extends r {

    /* renamed from: e, reason: collision with root package name */
    private final int f87837e;

    /* renamed from: f, reason: collision with root package name */
    private final int f87838f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f87839g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f87840h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f87841i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f87842j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f87843k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f87844l;

    /* renamed from: m, reason: collision with root package name */
    private ValueAnimator f87845m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f87874b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f87874b.a0(false);
        }
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f87840h);
        valueAnimatorOfFloat.setDuration(this.f87838f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f87836a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        boolean z11 = this.f87874b.F() == z10;
        if (z10 && !this.f87844l.isRunning()) {
            this.f87845m.cancel();
            this.f87844l.start();
            if (z11) {
                this.f87844l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f87844l.cancel();
        this.f87845m.start();
        if (z11) {
            this.f87845m.end();
        }
    }

    private boolean E() {
        EditText editText = this.f87841i;
        if (editText != null) {
            return (editText.hasFocus() || this.f87876d.hasFocus()) && this.f87841i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f87841i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    @Override // com.google.android.material.textfield.r
    void a(Editable editable) {
        if (this.f87874b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.r
    int c() {
        return ae.j.f44751e;
    }

    @Override // com.google.android.material.textfield.r
    int d() {
        return ae.e.f44653k;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener e() {
        return this.f87843k;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f87842j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener g() {
        return this.f87843k;
    }

    @Override // com.google.android.material.textfield.r
    public void n(EditText editText) {
        this.f87841i = editText;
        this.f87873a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.r
    void q(boolean z10) {
        if (this.f87874b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.r
    void u() {
        EditText editText = this.f87841i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87835a.A(true);
                }
            });
        }
    }

    f(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f87842j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f87832a, view);
            }
        };
        this.f87843k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f87833a;
                fVar.A(fVar.E());
            }
        };
        this.f87837e = ne.i.f(endCompoundLayout.getContext(), C5597b.f44493O, 100);
        this.f87838f = ne.i.f(endCompoundLayout.getContext(), C5597b.f44493O, BinsView.TOTE_WIDTH_DP);
        this.f87839g = ne.i.g(endCompoundLayout.getContext(), C5597b.f44498T, C6230a.f60115a);
        this.f87840h = ne.i.g(endCompoundLayout.getContext(), C5597b.f44497S, C6230a.f60118d);
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f87839g);
        valueAnimatorOfFloat.setDuration(this.f87837e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f87834a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f87844l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f87844l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f87845m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f87876d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f87876d.setScaleX(fFloatValue);
        fVar.f87876d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        D();
    }
}
