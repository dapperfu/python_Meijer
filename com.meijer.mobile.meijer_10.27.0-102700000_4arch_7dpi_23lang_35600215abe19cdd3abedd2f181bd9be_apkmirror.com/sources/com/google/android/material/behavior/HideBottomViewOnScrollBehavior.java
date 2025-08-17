package com.google.android.material.behavior;

import ae.C5597b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import be.C6230a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ne.i;

/* loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: j, reason: collision with root package name */
    private static final int f86291j = C5597b.f44487I;

    /* renamed from: k, reason: collision with root package name */
    private static final int f86292k = C5597b.f44490L;

    /* renamed from: l, reason: collision with root package name */
    private static final int f86293l = C5597b.f44497S;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<b> f86294a;

    /* renamed from: b, reason: collision with root package name */
    private int f86295b;

    /* renamed from: c, reason: collision with root package name */
    private int f86296c;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f86297d;

    /* renamed from: e, reason: collision with root package name */
    private TimeInterpolator f86298e;

    /* renamed from: f, reason: collision with root package name */
    private int f86299f;

    /* renamed from: g, reason: collision with root package name */
    private int f86300g;

    /* renamed from: h, reason: collision with root package name */
    private int f86301h;

    /* renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f86302i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f86302i = null;
        }
    }

    public interface b {
        void a(View view, int i10);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f86294a = new LinkedHashSet<>();
        this.f86299f = 0;
        this.f86300g = 2;
        this.f86301h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void N(V v10) {
        O(v10, true);
    }

    public void P(V v10) {
        Q(v10, true);
    }

    private void R(V v10, int i10) {
        this.f86300g = i10;
        Iterator<b> it = this.f86294a.iterator();
        while (it.hasNext()) {
            it.next().a(v10, this.f86300g);
        }
    }

    public boolean K() {
        return this.f86300g == 1;
    }

    public boolean L() {
        return this.f86300g == 2;
    }

    public void M(V v10, int i10) {
        this.f86301h = i10;
        if (this.f86300g == 1) {
            v10.setTranslationY(this.f86299f + i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            N(v10);
        } else if (i11 < 0) {
            P(v10);
        }
    }

    private void J(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f86302i = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public void O(V v10, boolean z10) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f86302i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        R(v10, 1);
        int i10 = this.f86299f + this.f86301h;
        if (z10) {
            J(v10, i10, this.f86296c, this.f86298e);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void Q(V v10, boolean z10) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f86302i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        R(v10, 2);
        if (z10) {
            J(v10, 0, this.f86295b, this.f86297d);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f86299f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f86295b = i.f(v10.getContext(), f86291j, 225);
        this.f86296c = i.f(v10.getContext(), f86292k, 175);
        Context context = v10.getContext();
        int i11 = f86293l;
        this.f86297d = i.g(context, i11, C6230a.f60118d);
        this.f86298e = i.g(v10.getContext(), i11, C6230a.f60117c);
        return super.p(coordinatorLayout, v10, i10);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86294a = new LinkedHashSet<>();
        this.f86299f = 0;
        this.f86300g = 2;
        this.f86301h = 0;
    }
}
