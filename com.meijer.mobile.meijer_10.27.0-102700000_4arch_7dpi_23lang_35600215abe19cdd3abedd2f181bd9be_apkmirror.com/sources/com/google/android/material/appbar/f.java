package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
class f<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    private g f86280a;

    /* renamed from: b, reason: collision with root package name */
    private int f86281b;

    /* renamed from: c, reason: collision with root package name */
    private int f86282c;

    public f() {
        this.f86281b = 0;
        this.f86282c = 0;
    }

    public int I() {
        g gVar = this.f86280a;
        if (gVar != null) {
            return gVar.c();
        }
        return 0;
    }

    public boolean K(int i10) {
        g gVar = this.f86280a;
        if (gVar != null) {
            return gVar.f(i10);
        }
        this.f86281b = i10;
        return false;
    }

    protected void J(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.K(v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        J(coordinatorLayout, v10, i10);
        if (this.f86280a == null) {
            this.f86280a = new g(v10);
        }
        this.f86280a.d();
        this.f86280a.a();
        int i11 = this.f86281b;
        if (i11 != 0) {
            this.f86280a.f(i11);
            this.f86281b = 0;
        }
        int i12 = this.f86282c;
        if (i12 != 0) {
            this.f86280a.e(i12);
            this.f86282c = 0;
            return true;
        }
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86281b = 0;
        this.f86282c = 0;
    }
}
