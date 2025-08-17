package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13225e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f123192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f123193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f123194c;

    public C13225e(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, E e10) {
        this.f123192a = valueAnimator;
        this.f123193b = valueAnimator2;
        this.f123194c = e10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        this.f123192a.removeAllUpdateListeners();
        this.f123193b.removeAllUpdateListeners();
        animation.removeAllListeners();
        this.f123194c.invoke();
    }
}
