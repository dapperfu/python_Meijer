package com.google.android.material.appbar;

import ae.C5597b;
import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.s;

/* loaded from: classes4.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f86290a = {R.attr.stateListAnimator};

    static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(View view, float f10) throws Resources.NotFoundException {
        int integer = view.getResources().getInteger(ae.g.f44708a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, C5597b.f44522i0, -C5597b.f44524j0}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray typedArrayI = s.i(context, attributeSet, f86290a, i10, i11, new int[0]);
        try {
            if (typedArrayI.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayI.getResourceId(0, 0)));
            }
            typedArrayI.recycle();
        } catch (Throwable th2) {
            typedArrayI.recycle();
            throw th2;
        }
    }
}
