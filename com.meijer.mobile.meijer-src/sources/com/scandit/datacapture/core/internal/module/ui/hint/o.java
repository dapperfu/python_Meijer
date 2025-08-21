package com.scandit.datacapture.core.internal.module.ui.hint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintView f126229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f126230b;

    public o(HintView hintView, Function0 function0) {
        this.f126229a = hintView;
        this.f126230b = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.j(animation, "animation");
        p.a(this.f126229a, animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        this.f126230b.invoke();
        p.a(this.f126229a, animation);
    }
}
