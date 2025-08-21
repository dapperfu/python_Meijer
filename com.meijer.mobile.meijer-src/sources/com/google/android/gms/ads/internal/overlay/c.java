package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* loaded from: classes4.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f65433a;

    c(h hVar) {
        this.f65433a = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f65433a;
        hVar.f65463v = 2;
        hVar.f65442a.finish();
    }
}
