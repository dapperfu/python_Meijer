package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13358e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f124144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f124145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f124146c;

    public C13358e(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, E e10) {
        this.f124144a = valueAnimator;
        this.f124145b = valueAnimator2;
        this.f124146c = e10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        this.f124144a.removeAllUpdateListeners();
        this.f124145b.removeAllUpdateListeners();
        animation.removeAllListeners();
        this.f124146c.invoke();
    }
}
