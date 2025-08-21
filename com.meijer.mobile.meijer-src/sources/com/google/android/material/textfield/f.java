package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import ce.C6503b;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import de.C13661a;

/* loaded from: classes4.dex */
class f extends r {

    /* renamed from: e, reason: collision with root package name */
    private final int f88677e;

    /* renamed from: f, reason: collision with root package name */
    private final int f88678f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f88679g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f88680h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f88681i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f88682j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f88683k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f88684l;

    /* renamed from: m, reason: collision with root package name */
    private ValueAnimator f88685m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f88714b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f88714b.a0(false);
        }
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f88680h);
        valueAnimatorOfFloat.setDuration(this.f88678f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f88676a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        boolean z11 = this.f88714b.F() == z10;
        if (z10 && !this.f88684l.isRunning()) {
            this.f88685m.cancel();
            this.f88684l.start();
            if (z11) {
                this.f88684l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f88684l.cancel();
        this.f88685m.start();
        if (z11) {
            this.f88685m.end();
        }
    }

    private boolean E() {
        EditText editText = this.f88681i;
        if (editText != null) {
            return (editText.hasFocus() || this.f88716d.hasFocus()) && this.f88681i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f88681i;
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
        if (this.f88714b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.r
    int c() {
        return ce.j.f61766e;
    }

    @Override // com.google.android.material.textfield.r
    int d() {
        return ce.e.f61668k;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener e() {
        return this.f88683k;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f88682j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener g() {
        return this.f88683k;
    }

    @Override // com.google.android.material.textfield.r
    public void n(EditText editText) {
        this.f88681i = editText;
        this.f88713a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.r
    void q(boolean z10) {
        if (this.f88714b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.r
    void u() {
        EditText editText = this.f88681i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88675a.A(true);
                }
            });
        }
    }

    f(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f88682j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f88672a, view);
            }
        };
        this.f88683k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f88673a;
                fVar.A(fVar.E());
            }
        };
        this.f88677e = pe.i.f(endCompoundLayout.getContext(), C6503b.f61508O, 100);
        this.f88678f = pe.i.f(endCompoundLayout.getContext(), C6503b.f61508O, BinsView.TOTE_WIDTH_DP);
        this.f88679g = pe.i.g(endCompoundLayout.getContext(), C6503b.f61513T, C13661a.f128350a);
        this.f88680h = pe.i.g(endCompoundLayout.getContext(), C6503b.f61512S, C13661a.f128353d);
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f88679g);
        valueAnimatorOfFloat.setDuration(this.f88677e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f88674a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f88684l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f88684l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f88685m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f88716d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f88716d.setScaleX(fFloatValue);
        fVar.f88716d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        D();
    }
}
