package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f88234a;

    @Override // com.google.android.material.sidesheet.d
    int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return Math.max(0, this.f88234a.m0() + this.f88234a.k0());
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return (-this.f88234a.d0()) - this.f88234a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    int f() {
        return this.f88234a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    int g() {
        return -this.f88234a.d0();
    }

    @Override // com.google.android.material.sidesheet.d
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.d
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f88234a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }

    a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f88234a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int h(V v10) {
        return v10.getRight() + this.f88234a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.d
    boolean l(View view) {
        if (view.getRight() < (d() - e()) / 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean m(float f10, float f11) {
        if (e.a(f10, f11) && Math.abs(f10) > this.f88234a.o0()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean n(View view, float f10) {
        if (Math.abs(view.getLeft() + (f10 * this.f88234a.i0())) > this.f88234a.j0()) {
            return true;
        }
        return false;
    }
}
