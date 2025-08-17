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
    private AnimatorSet f87988b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f87988b = null;
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
        AnimatorSet animatorSet = this.f87988b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetN = N(view, view2, z10, z12);
        this.f87988b = animatorSetN;
        animatorSetN.addListener(new a());
        this.f87988b.start();
        if (!z11) {
            this.f87988b.end();
        }
        return true;
    }
}
