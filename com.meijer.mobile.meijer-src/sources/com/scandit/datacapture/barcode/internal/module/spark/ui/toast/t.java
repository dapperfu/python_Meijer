package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f124230a;

    public t(Function0 function0) {
        this.f124230a = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        animation.removeAllListeners();
        this.f124230a.invoke();
    }
}
