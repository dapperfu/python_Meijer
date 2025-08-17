package com.scandit.datacapture.barcode.internal.module.ui.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PulsingView f123299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f123300b;

    public b(PulsingView pulsingView, a aVar) {
        this.f123299a = pulsingView;
        this.f123300b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.j(animation, "animation");
        AnimatorSet animatorSet = (AnimatorSet) animation;
        this.f123299a.f123295d = null;
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        Intrinsics.i(childAnimations, "getChildAnimations(...)");
        for (Animator animator : childAnimations) {
            Intrinsics.h(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animatorSet.removeAllListeners();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        AnimatorSet animatorSet = (AnimatorSet) animation;
        this.f123299a.f123295d = null;
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        Intrinsics.i(childAnimations, "getChildAnimations(...)");
        for (Animator animator : childAnimations) {
            Intrinsics.h(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animatorSet.removeAllListeners();
        this.f123300b.invoke();
    }
}
