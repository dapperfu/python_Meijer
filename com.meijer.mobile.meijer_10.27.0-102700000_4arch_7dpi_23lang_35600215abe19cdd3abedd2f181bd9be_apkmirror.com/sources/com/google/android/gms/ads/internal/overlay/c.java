package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* loaded from: classes4.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f64593a;

    c(h hVar) {
        this.f64593a = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f64593a;
        hVar.f64623v = 2;
        hVar.f64602a.finish();
    }
}
