package com.google.android.tv.ads.controls;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes4.dex */
final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SideDrawerFragment f88024a;

    a(SideDrawerFragment sideDrawerFragment) {
        this.f88024a = sideDrawerFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f88024a.requireActivity().finish();
    }
}
