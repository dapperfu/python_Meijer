package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final View f86283a;

    /* renamed from: b, reason: collision with root package name */
    private int f86284b;

    /* renamed from: c, reason: collision with root package name */
    private int f86285c;

    /* renamed from: d, reason: collision with root package name */
    private int f86286d;

    /* renamed from: e, reason: collision with root package name */
    private int f86287e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f86288f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f86289g = true;

    void a() {
        View view = this.f86283a;
        ViewCompat.Y(view, this.f86286d - (view.getTop() - this.f86284b));
        View view2 = this.f86283a;
        ViewCompat.X(view2, this.f86287e - (view2.getLeft() - this.f86285c));
    }

    public int b() {
        return this.f86284b;
    }

    public int c() {
        return this.f86286d;
    }

    void d() {
        this.f86284b = this.f86283a.getTop();
        this.f86285c = this.f86283a.getLeft();
    }

    public boolean e(int i10) {
        if (!this.f86289g || this.f86287e == i10) {
            return false;
        }
        this.f86287e = i10;
        a();
        return true;
    }

    public boolean f(int i10) {
        if (!this.f86288f || this.f86286d == i10) {
            return false;
        }
        this.f86286d = i10;
        a();
        return true;
    }

    public g(View view) {
        this.f86283a = view;
    }
}
