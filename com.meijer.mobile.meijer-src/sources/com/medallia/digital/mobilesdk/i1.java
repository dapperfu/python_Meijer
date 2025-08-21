package com.medallia.digital.mobilesdk;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes8.dex */
final class i1 {

    /* renamed from: e, reason: collision with root package name */
    private static final long f93068e = 400;

    /* renamed from: a, reason: collision with root package name */
    private Animation f93069a;

    /* renamed from: b, reason: collision with root package name */
    private Animation f93070b;

    /* renamed from: c, reason: collision with root package name */
    private int f93071c;

    /* renamed from: d, reason: collision with root package name */
    private int f93072d;

    i1() {
    }

    private void a(int i10) {
        this.f93071c = i10;
    }

    private void b(int i10) {
        this.f93072d = i10;
    }

    Animation c(View view) {
        if (!a(view) || this.f93069a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -view.getMeasuredHeight(), 0.0f);
            this.f93069a = translateAnimation;
            translateAnimation.setDuration(f93068e);
            a(view.getMeasuredHeight());
        }
        return this.f93069a;
    }

    Animation d(View view) {
        if (!a(view) || this.f93069a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, view.getMeasuredHeight(), 0.0f);
            this.f93069a = translateAnimation;
            translateAnimation.setDuration(f93068e);
            a(view.getMeasuredHeight());
        }
        return this.f93069a;
    }

    Animation e(View view) {
        if (!b(view) || this.f93070b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, view.getMeasuredWidth());
            this.f93070b = translateAnimation;
            translateAnimation.setDuration(f93068e);
            b(view.getMeasuredHeight());
        }
        return this.f93070b;
    }

    Animation f(View view) {
        if (!b(view) || this.f93070b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -view.getMeasuredWidth(), 0.0f, 0.0f);
            this.f93070b = translateAnimation;
            translateAnimation.setDuration(f93068e);
            b(view.getMeasuredHeight());
        }
        return this.f93070b;
    }

    Animation g(View view) {
        if (!b(view) || this.f93070b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, view.getMeasuredWidth(), 0.0f, 0.0f);
            this.f93070b = translateAnimation;
            translateAnimation.setDuration(f93068e);
            b(view.getMeasuredHeight());
        }
        return this.f93070b;
    }

    Animation h(View view) {
        if (!b(view) || this.f93070b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -view.getMeasuredWidth());
            this.f93070b = translateAnimation;
            translateAnimation.setDuration(f93068e);
            b(view.getMeasuredHeight());
        }
        return this.f93070b;
    }

    private boolean a(int i10, View view) {
        return i10 == view.getMeasuredHeight();
    }

    private boolean b(View view) {
        return a(this.f93072d, view);
    }

    private boolean a(View view) {
        return a(this.f93071c, view);
    }
}
