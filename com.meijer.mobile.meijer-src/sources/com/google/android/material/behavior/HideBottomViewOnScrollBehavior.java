package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ce.C6503b;
import de.C13661a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import pe.i;

/* loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: j, reason: collision with root package name */
    private static final int f87131j = C6503b.f61502I;

    /* renamed from: k, reason: collision with root package name */
    private static final int f87132k = C6503b.f61505L;

    /* renamed from: l, reason: collision with root package name */
    private static final int f87133l = C6503b.f61512S;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<b> f87134a;

    /* renamed from: b, reason: collision with root package name */
    private int f87135b;

    /* renamed from: c, reason: collision with root package name */
    private int f87136c;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f87137d;

    /* renamed from: e, reason: collision with root package name */
    private TimeInterpolator f87138e;

    /* renamed from: f, reason: collision with root package name */
    private int f87139f;

    /* renamed from: g, reason: collision with root package name */
    private int f87140g;

    /* renamed from: h, reason: collision with root package name */
    private int f87141h;

    /* renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f87142i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f87142i = null;
        }
    }

    public interface b {
        void a(View view, int i10);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f87134a = new LinkedHashSet<>();
        this.f87139f = 0;
        this.f87140g = 2;
        this.f87141h = 0;
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
        this.f87140g = i10;
        Iterator<b> it = this.f87134a.iterator();
        while (it.hasNext()) {
            it.next().a(v10, this.f87140g);
        }
    }

    public boolean K() {
        return this.f87140g == 1;
    }

    public boolean L() {
        return this.f87140g == 2;
    }

    public void M(V v10, int i10) {
        this.f87141h = i10;
        if (this.f87140g == 1) {
            v10.setTranslationY(this.f87139f + i10);
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
        this.f87142i = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public void O(V v10, boolean z10) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f87142i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        R(v10, 1);
        int i10 = this.f87139f + this.f87141h;
        if (z10) {
            J(v10, i10, this.f87136c, this.f87138e);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void Q(V v10, boolean z10) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f87142i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        R(v10, 2);
        if (z10) {
            J(v10, 0, this.f87135b, this.f87137d);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f87139f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f87135b = i.f(v10.getContext(), f87131j, 225);
        this.f87136c = i.f(v10.getContext(), f87132k, 175);
        Context context = v10.getContext();
        int i11 = f87133l;
        this.f87137d = i.g(context, i11, C13661a.f128353d);
        this.f87138e = i.g(v10.getContext(), i11, C13661a.f128352c);
        return super.p(coordinatorLayout, v10, i10);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87134a = new LinkedHashSet<>();
        this.f87139f = 0;
        this.f87140g = 2;
        this.f87141h = 0;
    }
}
