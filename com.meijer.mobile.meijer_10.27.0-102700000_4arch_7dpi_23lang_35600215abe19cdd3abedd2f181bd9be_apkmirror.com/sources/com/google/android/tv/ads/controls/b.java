package com.google.android.tv.ads.controls;

import android.animation.AnimatorSet;
import androidx.view.F;

/* loaded from: classes4.dex */
final class b extends F {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnimatorSet f88025a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(SideDrawerFragment sideDrawerFragment, boolean z10, AnimatorSet animatorSet) {
        super(true);
        this.f88025a = animatorSet;
    }

    @Override // androidx.view.F
    public final void handleOnBackPressed() {
        this.f88025a.start();
    }
}
