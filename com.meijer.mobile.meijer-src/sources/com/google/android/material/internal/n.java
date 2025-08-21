package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f88080a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private b f88081b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f88082c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f88083d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n nVar = n.this;
            if (nVar.f88082c == animator) {
                nVar.f88082c = null;
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f88085a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f88086b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f88085a = iArr;
            this.f88086b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f88083d);
        this.f88080a.add(bVar);
    }
}
