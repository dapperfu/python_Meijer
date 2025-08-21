package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f88828b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f88828b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    protected abstract AnimatorSet N(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean L(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f88828b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetN = N(view, view2, z10, z12);
        this.f88828b = animatorSetN;
        animatorSetN.addListener(new a());
        this.f88828b.start();
        if (!z11) {
            this.f88828b.end();
        }
        return true;
    }
}
