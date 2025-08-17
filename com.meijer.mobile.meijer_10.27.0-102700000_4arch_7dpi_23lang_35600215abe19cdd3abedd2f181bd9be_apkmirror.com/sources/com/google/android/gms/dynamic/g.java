package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes4.dex */
final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f64981a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f64982b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f64983c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f64984d;

    g(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f64984d = aVar;
        this.f64981a = activity;
        this.f64982b = bundle;
        this.f64983c = bundle2;
    }

    @Override // com.google.android.gms.dynamic.m
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.m
    public final void b(c cVar) {
        this.f64984d.f64975a.a(this.f64981a, this.f64982b, this.f64983c);
    }
}
