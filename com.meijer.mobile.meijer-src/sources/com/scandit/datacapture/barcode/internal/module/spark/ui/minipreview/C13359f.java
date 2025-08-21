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
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.C13359f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13359f {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f124147a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124148b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPropertyAnimator f124149c;

    public final void a(final C endAction) {
        Intrinsics.j(endAction, "endAction");
        this.f124149c = this.f124147a.animate().alpha(0.0f).setDuration(this.f124148b ? 500L : 0L).setStartDelay(this.f124148b ? 500L : 0L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: Ut.m
            @Override // java.lang.Runnable
            public final void run() {
                C13359f.a(this.f37740a, endAction);
            }
        });
        this.f124148b = false;
    }

    public C13359f(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.f124147a = container;
    }

    public static final void a(C13359f this$0, Function0 endAction) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(endAction, "$endAction");
        this$0.f124149c = null;
        endAction.invoke();
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f124149c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f124147a.setAlpha(1.0f);
    }

    public final void a(D action) {
        Intrinsics.j(action, "action");
        if (this.f124149c != null) {
            this.f124147a.setAlpha(1.0f);
            this.f124148b = true;
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
                C13359f.a(layoutParams, this, valueAnimator);
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
                C13359f.a(layoutParams, valueAnimator);
            }
        };
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(height, height2);
        valueAnimatorOfInt2.addUpdateListener(animatorUpdateListener2);
        Intrinsics.g(valueAnimatorOfInt2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f124147a, "x", position.x);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f124147a, "y", position.y);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C13358e(valueAnimatorOfInt, valueAnimatorOfInt2, onEndAction));
        animatorSet.start();
    }

    public static final void a(ViewGroup.MarginLayoutParams layoutParams, C13359f this$0, ValueAnimator animation) {
        Intrinsics.j(layoutParams, "$layoutParams");
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        this$0.f124147a.requestLayout();
    }

    public static final void a(ViewGroup.MarginLayoutParams layoutParams, ValueAnimator animation) {
        Intrinsics.j(layoutParams, "$layoutParams");
        Intrinsics.j(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
    }
}
