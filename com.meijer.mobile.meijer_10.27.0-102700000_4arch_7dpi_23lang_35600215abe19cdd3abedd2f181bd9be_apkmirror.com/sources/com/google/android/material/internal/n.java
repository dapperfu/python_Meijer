package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f87240a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private b f87241b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f87242c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f87243d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n nVar = n.this;
            if (nVar.f87242c == animator) {
                nVar.f87242c = null;
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f87245a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f87246b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f87245a = iArr;
            this.f87246b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f87243d);
        this.f87240a.add(bVar);
    }
}
