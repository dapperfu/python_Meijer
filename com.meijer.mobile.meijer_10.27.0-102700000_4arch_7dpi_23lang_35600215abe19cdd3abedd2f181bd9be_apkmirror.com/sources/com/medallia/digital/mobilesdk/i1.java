package com.medallia.digital.mobilesdk;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes7.dex */
final class i1 {

    /* renamed from: e, reason: collision with root package name */
    private static final long f92229e = 400;

    /* renamed from: a, reason: collision with root package name */
    private Animation f92230a;

    /* renamed from: b, reason: collision with root package name */
    private Animation f92231b;

    /* renamed from: c, reason: collision with root package name */
    private int f92232c;

    /* renamed from: d, reason: collision with root package name */
    private int f92233d;

    i1() {
    }

    private void a(int i10) {
        this.f92232c = i10;
    }

    private void b(int i10) {
        this.f92233d = i10;
    }

    Animation c(View view) {
        if (!a(view) || this.f92230a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -view.getMeasuredHeight(), 0.0f);
            this.f92230a = translateAnimation;
            translateAnimation.setDuration(f92229e);
            a(view.getMeasuredHeight());
        }
        return this.f92230a;
    }

    Animation d(View view) {
        if (!a(view) || this.f92230a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, view.getMeasuredHeight(), 0.0f);
            this.f92230a = translateAnimation;
            translateAnimation.setDuration(f92229e);
            a(view.getMeasuredHeight());
        }
        return this.f92230a;
    }

    Animation e(View view) {
        if (!b(view) || this.f92231b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, view.getMeasuredWidth());
            this.f92231b = translateAnimation;
            translateAnimation.setDuration(f92229e);
            b(view.getMeasuredHeight());
        }
        return this.f92231b;
    }

    Animation f(View view) {
        if (!b(view) || this.f92231b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -view.getMeasuredWidth(), 0.0f, 0.0f);
            this.f92231b = translateAnimation;
            translateAnimation.setDuration(f92229e);
            b(view.getMeasuredHeight());
        }
        return this.f92231b;
    }

    Animation g(View view) {
        if (!b(view) || this.f92231b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, view.getMeasuredWidth(), 0.0f, 0.0f);
            this.f92231b = translateAnimation;
            translateAnimation.setDuration(f92229e);
            b(view.getMeasuredHeight());
        }
        return this.f92231b;
    }

    Animation h(View view) {
        if (!b(view) || this.f92231b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -view.getMeasuredWidth());
            this.f92231b = translateAnimation;
            translateAnimation.setDuration(f92229e);
            b(view.getMeasuredHeight());
        }
        return this.f92231b;
    }

    private boolean a(int i10, View view) {
        return i10 == view.getMeasuredHeight();
    }

    private boolean b(View view) {
        return a(this.f92233d, view);
    }

    private boolean a(View view) {
        return a(this.f92232c, view);
    }
}
