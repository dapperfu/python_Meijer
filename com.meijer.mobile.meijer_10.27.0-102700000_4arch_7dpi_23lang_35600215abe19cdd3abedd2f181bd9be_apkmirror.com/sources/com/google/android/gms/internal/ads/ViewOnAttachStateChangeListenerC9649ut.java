package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ut, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ViewOnAttachStateChangeListenerC9649ut implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6805Hp f78936a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10184zt f78937b;

    ViewOnAttachStateChangeListenerC9649ut(C10184zt c10184zt, InterfaceC6805Hp interfaceC6805Hp) {
        this.f78936a = interfaceC6805Hp;
        this.f78937b = c10184zt;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f78937b.q0(view, this.f78936a, 10);
    }
}
