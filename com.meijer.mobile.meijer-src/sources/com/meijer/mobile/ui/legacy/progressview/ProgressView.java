package com.meijer.mobile.ui.legacy.progressview;

import Cj.g;
import Cj.l;
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
import bk.AbstractC6392a;
import com.meijer.mobile.core.base.ui.behavior.MatchSizeBehavior;
import java.lang.ref.WeakReference;
import ls.e;
import ms.AbstractC15764a;

/* loaded from: classes12.dex */
public class ProgressView extends ConstraintLayout implements CoordinatorLayout.b {

    /* renamed from: A, reason: collision with root package name */
    private CharSequence f120082A;

    /* renamed from: B, reason: collision with root package name */
    private long f120083B;

    /* renamed from: C, reason: collision with root package name */
    private float f120084C;

    /* renamed from: D, reason: collision with root package name */
    private Boolean f120085D;

    /* renamed from: E, reason: collision with root package name */
    private final AnimatorListenerAdapter f120086E;

    /* renamed from: F, reason: collision with root package name */
    private final AnimatorListenerAdapter f120087F;

    /* renamed from: G, reason: collision with root package name */
    private final Runnable f120088G;

    /* renamed from: H, reason: collision with root package name */
    private final Runnable f120089H;

    /* renamed from: I, reason: collision with root package name */
    private d f120090I;

    /* renamed from: J, reason: collision with root package name */
    private final AbstractC15764a f120091J;

    /* renamed from: x, reason: collision with root package name */
    private boolean f120092x;

    /* renamed from: y, reason: collision with root package name */
    private int f120093y;

    /* renamed from: z, reason: collision with root package name */
    private WeakReference<View> f120094z;

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
            progressView.G(1.0f, progressView.f120084C, ProgressView.this.f120086E);
        }
    }

    public interface d {
        void y();
    }

    private void H(boolean z10) {
        L(null, null, false);
        if (z10) {
            post(this.f120089H);
        } else {
            R(false);
        }
    }

    private void setText(CharSequence charSequence) {
        this.f120091J.f151618D.setText(charSequence);
    }

    public void P(int i10, boolean z10) {
        Q(AbstractC6392a.f(i10, new Object[0]), z10);
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
        G(0.0f, 1.0f, this.f120087F);
    }

    private void K() {
        d dVar = this.f120090I;
        if (dVar != null) {
            dVar.y();
        }
    }

    private void L(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (z10 && this.f120092x) {
            this.f120091J.f151619E.setText(charSequence);
            this.f120091J.f151617C.setText(charSequence2);
        } else {
            this.f120091J.f151618D.setText(charSequence);
            this.f120091J.f151616B.setText(charSequence2);
        }
    }

    private void O(boolean z10) {
        this.f120091J.f151620z.setVisibility(0);
        if (z10) {
            post(this.f120088G);
        } else if (!isShown()) {
            R(true);
        }
        if (this.f120085D.booleanValue()) {
            this.f120091J.f151616B.setVisibility(0);
        }
    }

    private void setText(int i10) {
        this.f120091J.f151618D.setText(i10 > 0 ? getResources().getString(i10) : null);
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
        return new MatchSizeBehavior(this.f120093y);
    }

    public void setProgressBarListener(d dVar) {
        this.f120090I = dVar;
    }

    public ProgressView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet);
        this.f120092x = false;
        this.f120085D = Boolean.FALSE;
        this.f120086E = new a();
        this.f120087F = new b();
        this.f120088G = new c();
        this.f120089H = new Runnable() { // from class: ls.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f150174a.I();
            }
        };
        AbstractC15764a abstractC15764aM0 = AbstractC15764a.M0(LayoutInflater.from(getContext()), this, true);
        this.f120091J = abstractC15764aM0;
        if (getResources() != null && (theme = context.getTheme()) != null) {
            if (isInEditMode()) {
                typedArrayObtainStyledAttributes = null;
            } else if (attributeSet != null) {
                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, e.f150178a, 0, ls.d.f150177a);
            } else {
                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(ls.d.f150177a, e.f150178a);
            }
            if (typedArrayObtainStyledAttributes == null) {
                return;
            }
            if (getBackground() == null) {
                setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(e.f150179b, g.f4676r));
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f150180c, 0);
            setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f150181d, dimensionPixelSize), typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f150182e, dimensionPixelSize), typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f150183f, dimensionPixelSize), typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f150184g, dimensionPixelSize));
            this.f120082A = typedArrayObtainStyledAttributes.getText(e.f150186i);
            this.f120083B = typedArrayObtainStyledAttributes.getInteger(e.f150185h, r3.getInteger(l.f4973a));
            this.f120093y = typedArrayObtainStyledAttributes.getResourceId(e.f150188k, -1);
            this.f120084C = typedArrayObtainStyledAttributes.getFloat(e.f150187j, 0.03f);
            typedArrayObtainStyledAttributes.recycle();
            setAccessibilityLiveRegion(1);
            CharSequence charSequence = this.f120082A;
            if (charSequence != null) {
                setText(charSequence);
            }
            setVisibility(8);
            this.f120094z = new WeakReference<>(null);
            abstractC15764aM0.f151615A.setOnClickListener(new View.OnClickListener() { // from class: ls.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150175a.J(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(float f10, float f11, Animator.AnimatorListener animatorListener) {
        animate().alpha(f10).setDuration(this.f120083B).setListener(animatorListener);
        View view = this.f120094z.get();
        if (view != null) {
            view.animate().alpha(f11).setDuration(this.f120083B);
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
        View view = this.f120094z.get();
        if (view != null) {
            view.animate().cancel();
            if (z10) {
                f10 = this.f120084C;
            }
            view.setAlpha(f10);
        }
    }

    public void Q(AbstractC6392a abstractC6392a, boolean z10) {
        animate().cancel();
        setAlpha(1.0f);
        int i10 = 0;
        setVisibility(0);
        if (abstractC6392a != null && abstractC6392a != AbstractC6392a.a()) {
            ck.d.g(this.f120091J.f151618D, abstractC6392a);
        }
        Button button = this.f120091J.f151615A;
        if (!z10) {
            i10 = 8;
        }
        button.setVisibility(i10);
        this.f120091J.f151620z.setVisibility(8);
    }

    public void U(AbstractC6392a abstractC6392a, boolean z10) {
        V(ck.d.a(getContext(), abstractC6392a), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f120093y != -1) {
            this.f120094z = new WeakReference<>(getRootView().findViewById(this.f120093y));
            R(isShown());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return isShown();
    }
}
