package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes4.dex */
class u implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f87272a;

    @Override // com.google.android.material.internal.v
    public void a(Drawable drawable) {
        this.f87272a.add(drawable);
    }

    @Override // com.google.android.material.internal.v
    public void b(Drawable drawable) {
        this.f87272a.remove(drawable);
    }

    u(View view) {
        this.f87272a = view.getOverlay();
    }
}
