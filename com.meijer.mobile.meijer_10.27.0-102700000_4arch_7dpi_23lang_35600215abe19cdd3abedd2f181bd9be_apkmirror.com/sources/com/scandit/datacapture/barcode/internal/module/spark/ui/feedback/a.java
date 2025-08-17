package com.scandit.datacapture.barcode.internal.module.spark.ui.feedback;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f123130a;

    public a(b bVar) {
        this.f123130a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.j(animation, "animation");
        animation.removeAllListeners();
        this.f123130a.setVisibility(8);
        this.f123130a.f123131a = null;
    }
}
