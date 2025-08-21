package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes4.dex */
final class F extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f65644a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f65645b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f65646c;

    F(Intent intent, Activity activity, int i10) {
        this.f65644a = intent;
        this.f65645b = activity;
        this.f65646c = i10;
    }

    @Override // com.google.android.gms.common.internal.H
    public final void a() {
        Intent intent = this.f65644a;
        if (intent != null) {
            this.f65645b.startActivityForResult(intent, this.f65646c);
        }
    }
}
