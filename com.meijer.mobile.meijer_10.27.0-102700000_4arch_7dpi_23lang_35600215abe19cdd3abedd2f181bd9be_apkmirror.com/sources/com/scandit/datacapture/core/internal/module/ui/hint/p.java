package com.scandit.datacapture.core.internal.module.ui.hint;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.module.ui.hint.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f125279a = R.id.sc_animator_tag;

    public static final void a(HintView hintView, boolean z10, Function0 then) {
        Intrinsics.j(hintView, "<this>");
        Intrinsics.j(then, "then");
        if (!z10) {
            int i10 = f125279a;
            Object tag = hintView.getTag(i10);
            Animator animator = tag instanceof Animator ? (Animator) tag : null;
            if (animator != null) {
                animator.cancel();
            }
            hintView.setTag(i10, null);
            hintView.setVisibility(4);
            hintView.setAlpha(0.0f);
            then.invoke();
            return;
        }
        ValueAnimator valueAnimatorA = a(hintView, 0.0f);
        m mVar = new m(hintView, then);
        int i11 = f125279a;
        Object tag2 = hintView.getTag(i11);
        Animator animator2 = tag2 instanceof Animator ? (Animator) tag2 : null;
        if (animator2 != null) {
            animator2.cancel();
        }
        valueAnimatorA.addListener(new o(hintView, mVar));
        valueAnimatorA.start();
        hintView.setTag(i11, valueAnimatorA);
    }

    public static final void b(HintView hintView, boolean z10, Function0 then) {
        Intrinsics.j(hintView, "<this>");
        Intrinsics.j(then, "then");
        if (!z10) {
            int i10 = f125279a;
            Object tag = hintView.getTag(i10);
            Animator animator = tag instanceof Animator ? (Animator) tag : null;
            if (animator != null) {
                animator.cancel();
            }
            hintView.setTag(i10, null);
            hintView.setVisibility(0);
            hintView.setAlpha(1.0f);
            then.invoke();
            return;
        }
        if (hintView.getVisibility() != 0) {
            hintView.setVisibility(0);
            hintView.setAlpha(0.0f);
        }
        ValueAnimator valueAnimatorA = a(hintView, 1.0f);
        l lVar = new l(then);
        int i11 = f125279a;
        Object tag2 = hintView.getTag(i11);
        Animator animator2 = tag2 instanceof Animator ? (Animator) tag2 : null;
        if (animator2 != null) {
            animator2.cancel();
        }
        valueAnimatorA.addListener(new o(hintView, lVar));
        valueAnimatorA.start();
        hintView.setTag(i11, valueAnimatorA);
    }

    public static final ValueAnimator a(final View view, float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), f10);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fu.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.a(view, valueAnimator);
            }
        });
        Intrinsics.i(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    public static final void a(View this_fadeAnimator, ValueAnimator it) {
        Intrinsics.j(this_fadeAnimator, "$this_fadeAnimator");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this_fadeAnimator.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void a(View view, Animator animator) {
        animator.removeAllListeners();
        view.setTag(f125279a, null);
    }
}
