package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameLayout f64987a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LayoutInflater f64988b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewGroup f64989c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f64990d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f64991e;

    i(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f64991e = aVar;
        this.f64987a = frameLayout;
        this.f64988b = layoutInflater;
        this.f64989c = viewGroup;
        this.f64990d = bundle;
    }

    @Override // com.google.android.gms.dynamic.m
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.m
    public final void b(c cVar) {
        this.f64987a.removeAllViews();
        this.f64987a.addView(this.f64991e.f64975a.b(this.f64988b, this.f64989c, this.f64990d));
    }
}
