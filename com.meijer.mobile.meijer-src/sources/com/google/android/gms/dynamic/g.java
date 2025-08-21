package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes4.dex */
final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f65821a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f65822b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f65823c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f65824d;

    g(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f65824d = aVar;
        this.f65821a = activity;
        this.f65822b = bundle;
        this.f65823c = bundle2;
    }

    @Override // com.google.android.gms.dynamic.m
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.m
    public final void b(c cVar) {
        this.f65824d.f65815a.a(this.f65821a, this.f65822b, this.f65823c);
    }
}
