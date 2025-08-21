package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameLayout f65827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LayoutInflater f65828b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewGroup f65829c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f65830d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f65831e;

    i(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f65831e = aVar;
        this.f65827a = frameLayout;
        this.f65828b = layoutInflater;
        this.f65829c = viewGroup;
        this.f65830d = bundle;
    }

    @Override // com.google.android.gms.dynamic.m
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.m
    public final void b(c cVar) {
        this.f65827a.removeAllViews();
        this.f65827a.addView(this.f65831e.f65815a.b(this.f65828b, this.f65829c, this.f65830d));
    }
}
