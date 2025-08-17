package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes4.dex */
final class F extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f64804a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f64805b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f64806c;

    F(Intent intent, Activity activity, int i10) {
        this.f64804a = intent;
        this.f64805b = activity;
        this.f64806c = i10;
    }

    @Override // com.google.android.gms.common.internal.H
    public final void a() {
        Intent intent = this.f64804a;
        if (intent != null) {
            this.f64805b.startActivityForResult(intent, this.f64806c);
        }
    }
}
