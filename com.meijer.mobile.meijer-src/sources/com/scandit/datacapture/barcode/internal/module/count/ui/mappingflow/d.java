package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f122664a;

    public d(com.scandit.datacapture.barcode.internal.module.count.ui.mode.c cVar) {
        this.f122664a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        this.f122664a.invoke();
    }
}
