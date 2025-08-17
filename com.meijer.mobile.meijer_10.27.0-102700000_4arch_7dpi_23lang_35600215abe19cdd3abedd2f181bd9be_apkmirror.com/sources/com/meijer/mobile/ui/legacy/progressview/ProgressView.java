package com.meijer.mobile.ui.legacy.progressview;

import Bj.g;
import Bj.l;
import ak.AbstractC5607a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.meijer.mobile.core.base.ui.behavior.MatchSizeBehavior;
import java.lang.ref.WeakReference;
import ls.e;
import ms.AbstractC15705a;

/* loaded from: classes11.dex */
public class ProgressView extends ConstraintLayout implements CoordinatorLayout.b {

    /* renamed from: A, reason: collision with root package name */
    private CharSequence f119109A;

    /* renamed from: B, reason: collision with root package name */
    private long f119110B;

    /* renamed from: C, reason: collision with root package name */
    private float f119111C;

    /* renamed from: D, reason: collision with root package name */
    private Boolean f119112D;

    /* renamed from: E, reason: collision with root package name */
    private final AnimatorListenerAdapter f119113E;

    /* renamed from: F, reason: collision with root package name */
    private final AnimatorListenerAdapter f119114F;

    /* renamed from: G, reason: collision with root package name */
    private final Runnable f119115G;

    /* renamed from: H, reason: collision with root package name */
    private final Runnable f119116H;

    /* renamed from: I, reason: collision with root package name */
    private d f119117I;

    /* renamed from: J, reason: collision with root package name */
    private final AbstractC15705a f119118J;

    /* renamed from: x, reason: collision with root package name */
    private boolean f119119x;

    /* renamed from: y, reason: collision with root package name */
    private int f119120y;

    /* renamed from: z, reason: collision with root package name */
    private WeakReference<View> f119121z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ProgressView.this.setVisibility(0);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressView.this.setVisibility(8);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressView progressView = ProgressView.this;
            progressView.G(1.0f, progressView.f119111C, ProgressView.this.f119113E);
        }
    }

    public interface d {
        void B();
    }

    private void H(boolean z10) {
        L(null, null, false);
        if (z10) {
            post(this.f119116H);
        } else {
            R(false);
        }
    }

    private void setText(CharSequence charSequence) {
        this.f119118J.f150727D.setText(charSequence);
    }

    public void P(int i10, boolean z10) {
        Q(AbstractC5607a.f(i10, new Object[0]), z10);
    }

    public void S(int i10, boolean z10) {
        T(i10, z10, true);
    }

    public void V(String str, boolean z10) {
        if (z10) {
            N(str, true);
        } else {
            H(true);
        }
    }

    public void W(boolean z10) {
        X(z10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        G(0.0f, 1.0f, this.f119114F);
    }

    private void K() {
        d dVar = this.f119117I;
        if (dVar != null) {
            dVar.B();
        }
    }

    private void L(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (z10 && this.f119119x) {
            this.f119118J.f150728E.setText(charSequence);
            this.f119118J.f150726C.setText(charSequence2);
        } else {
            this.f119118J.f150727D.setText(charSequence);
            this.f119118J.f150725B.setText(charSequence2);
        }
    }

    private void O(boolean z10) {
        this.f119118J.f150729z.setVisibility(0);
        if (z10) {
            post(this.f119115G);
        } else if (!isShown()) {
            R(true);
        }
        if (this.f119112D.booleanValue()) {
            this.f119118J.f150725B.setVisibility(0);
        }
    }

    private void setText(int i10) {
        this.f119118J.f150727D.setText(i10 > 0 ? getResources().getString(i10) : null);
    }

    public void T(int i10, boolean z10, boolean z11) {
        if (z10) {
            M(i10, z11);
        } else {
            H(z11);
        }
    }

    public void X(boolean z10, boolean z11) {
        if (z10) {
            M(0, z11);
        } else {
            H(z11);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public MatchSizeBehavior getBehavior() {
        return new MatchSizeBehavior(this.f119120y);
    }

    public void setProgressBarListener(d dVar) {
        this.f119117I = dVar;
    }

    public ProgressView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet);
        this.f119119x = false;
        this.f119112D = Boolean.FALSE;
        this.f119113E = new a();
        this.f119114F = new b();
        this.f119115G = new c();
        this.f119116H = new Runnable() { // from class: ls.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f149336a.I();
            }
        };
        AbstractC15705a abstractC15705aK0 = AbstractC15705a.K0(LayoutInflater.from(getContext()), this, true);
        this.f119118J = abstractC15705aK0;
        if (getResources() != null && (theme = context.getTheme()) != null) {
            if (isInEditMode()) {
                typedArrayObtainStyledAttributes = null;
            } else if (attributeSet != null) {
                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, e.f149340a, 0, ls.d.f149339a);
            } else {
                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(ls.d.f149339a, e.f149340a);
            }
            if (typedArrayObtainStyledAttributes == null) {
                return;
            }
            if (getBackground() == null) {
                setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(e.f149341b, g.f2631r));
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f149342c, 0);
            setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f149343d, dimensionPixelSize), typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f149344e, dimensionPixelSize), typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f149345f, dimensionPixelSize), typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f149346g, dimensionPixelSize));
            this.f119109A = typedArrayObtainStyledAttributes.getText(e.f149348i);
            this.f119110B = typedArrayObtainStyledAttributes.getInteger(e.f149347h, r3.getInteger(l.f2928a));
            this.f119120y = typedArrayObtainStyledAttributes.getResourceId(e.f149350k, -1);
            this.f119111C = typedArrayObtainStyledAttributes.getFloat(e.f149349j, 0.03f);
            typedArrayObtainStyledAttributes.recycle();
            setAccessibilityLiveRegion(1);
            CharSequence charSequence = this.f119109A;
            if (charSequence != null) {
                setText(charSequence);
            }
            setVisibility(8);
            this.f119121z = new WeakReference<>(null);
            abstractC15705aK0.f150724A.setOnClickListener(new View.OnClickListener() { // from class: ls.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149337a.J(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(float f10, float f11, Animator.AnimatorListener animatorListener) {
        animate().alpha(f10).setDuration(this.f119110B).setListener(animatorListener);
        View view = this.f119121z.get();
        if (view != null) {
            view.animate().alpha(f11).setDuration(this.f119110B);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        K();
    }

    private void M(int i10, boolean z10) {
        setText(i10);
        O(z10);
    }

    private void N(String str, boolean z10) {
        setText(str);
        O(z10);
    }

    private void R(boolean z10) {
        animate().cancel();
        float f10 = 1.0f;
        if (z10) {
            setAlpha(1.0f);
            setVisibility(0);
        } else {
            setAlpha(0.0f);
            setVisibility(8);
        }
        View view = this.f119121z.get();
        if (view != null) {
            view.animate().cancel();
            if (z10) {
                f10 = this.f119111C;
            }
            view.setAlpha(f10);
        }
    }

    public void Q(AbstractC5607a abstractC5607a, boolean z10) {
        animate().cancel();
        setAlpha(1.0f);
        int i10 = 0;
        setVisibility(0);
        if (abstractC5607a != null && abstractC5607a != AbstractC5607a.a()) {
            bk.d.g(this.f119118J.f150727D, abstractC5607a);
        }
        Button button = this.f119118J.f150724A;
        if (!z10) {
            i10 = 8;
        }
        button.setVisibility(i10);
        this.f119118J.f150729z.setVisibility(8);
    }

    public void U(AbstractC5607a abstractC5607a, boolean z10) {
        V(bk.d.a(getContext(), abstractC5607a), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f119120y != -1) {
            this.f119121z = new WeakReference<>(getRootView().findViewById(this.f119120y));
            R(isShown());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return isShown();
    }
}
