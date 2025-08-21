package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final View f87123a;

    /* renamed from: b, reason: collision with root package name */
    private int f87124b;

    /* renamed from: c, reason: collision with root package name */
    private int f87125c;

    /* renamed from: d, reason: collision with root package name */
    private int f87126d;

    /* renamed from: e, reason: collision with root package name */
    private int f87127e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87128f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f87129g = true;

    void a() {
        View view = this.f87123a;
        ViewCompat.Y(view, this.f87126d - (view.getTop() - this.f87124b));
        View view2 = this.f87123a;
        ViewCompat.X(view2, this.f87127e - (view2.getLeft() - this.f87125c));
    }

    public int b() {
        return this.f87124b;
    }

    public int c() {
        return this.f87126d;
    }

    void d() {
        this.f87124b = this.f87123a.getTop();
        this.f87125c = this.f87123a.getLeft();
    }

    public boolean e(int i10) {
        if (!this.f87129g || this.f87127e == i10) {
            return false;
        }
        this.f87127e = i10;
        a();
        return true;
    }

    public boolean f(int i10) {
        if (!this.f87128f || this.f87126d == i10) {
            return false;
        }
        this.f87126d = i10;
        a();
        return true;
    }

    public g(View view) {
        this.f87123a = view;
    }
}
