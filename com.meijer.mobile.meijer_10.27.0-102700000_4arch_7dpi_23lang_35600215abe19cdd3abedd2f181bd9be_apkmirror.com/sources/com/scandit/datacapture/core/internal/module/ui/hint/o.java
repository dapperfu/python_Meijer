package com.scandit.datacapture.core.internal.module.ui.hint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintView f125277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f125278b;

    public o(HintView hintView, Function0 function0) {
        this.f125277a = hintView;
        this.f125278b = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.j(animation, "animation");
        p.a(this.f125277a, animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        this.f125278b.invoke();
        p.a(this.f125277a, animation);
    }
}
