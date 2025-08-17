package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.util.Size;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.C13226f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13226f {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f123195a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123196b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPropertyAnimator f123197c;

    public final void a(final C endAction) {
        Intrinsics.j(endAction, "endAction");
        this.f123197c = this.f123195a.animate().alpha(0.0f).setDuration(this.f123196b ? 500L : 0L).setStartDelay(this.f123196b ? 500L : 0L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: Ut.m
            @Override // java.lang.Runnable
            public final void run() {
                C13226f.a(this.f36328a, endAction);
            }
        });
        this.f123196b = false;
    }

    public C13226f(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.f123195a = container;
    }

    public static final void a(C13226f this$0, Function0 endAction) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(endAction, "$endAction");
        this$0.f123197c = null;
        endAction.invoke();
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f123197c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f123195a.setAlpha(1.0f);
    }

    public final void a(D action) {
        Intrinsics.j(action, "action");
        if (this.f123197c != null) {
            this.f123195a.setAlpha(1.0f);
            this.f123196b = true;
            action.invoke();
        }
    }

    public final void a(final ViewGroup.MarginLayoutParams layoutParams, PointF position, Size currentSize, Size nextSize, E onEndAction) {
        Intrinsics.j(layoutParams, "layoutParams");
        Intrinsics.j(position, "position");
        Intrinsics.j(currentSize, "currentSize");
        Intrinsics.j(nextSize, "nextSize");
        Intrinsics.j(onEndAction, "onEndAction");
        int width = currentSize.getWidth();
        int width2 = nextSize.getWidth();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: Ut.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C13226f.a(layoutParams, this, valueAnimator);
            }
        };
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, width2);
        valueAnimatorOfInt.addUpdateListener(animatorUpdateListener);
        Intrinsics.g(valueAnimatorOfInt);
        int height = currentSize.getHeight();
        int height2 = nextSize.getHeight();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener() { // from class: Ut.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C13226f.a(layoutParams, valueAnimator);
            }
        };
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(height, height2);
        valueAnimatorOfInt2.addUpdateListener(animatorUpdateListener2);
        Intrinsics.g(valueAnimatorOfInt2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f123195a, "x", position.x);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f123195a, "y", position.y);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C13225e(valueAnimatorOfInt, valueAnimatorOfInt2, onEndAction));
        animatorSet.start();
    }

    public static final void a(ViewGroup.MarginLayoutParams layoutParams, C13226f this$0, ValueAnimator animation) {
        Intrinsics.j(layoutParams, "$layoutParams");
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        this$0.f123195a.requestLayout();
    }

    public static final void a(ViewGroup.MarginLayoutParams layoutParams, ValueAnimator animation) {
        Intrinsics.j(layoutParams, "$layoutParams");
        Intrinsics.j(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
    }
}
