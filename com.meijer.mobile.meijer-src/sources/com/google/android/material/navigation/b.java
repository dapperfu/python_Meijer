package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import de.C13661a;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f88145a = Color.alpha(-1728053248);

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DrawerLayout f88146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88147b;

        a(DrawerLayout drawerLayout, View view) {
            this.f88146a = drawerLayout;
            this.f88147b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f88146a.i(this.f88147b, false);
            this.f88146a.setScrimColor(-1728053248);
        }
    }

    public static Animator.AnimatorListener b(DrawerLayout drawerLayout, View view) {
        return new a(drawerLayout, view);
    }

    public static ValueAnimator.AnimatorUpdateListener c(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(c2.c.k(-1728053248, C13661a.c(b.f88145a, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
