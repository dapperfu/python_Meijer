package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ut, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ViewOnAttachStateChangeListenerC9774ut implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6930Hp f79776a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10309zt f79777b;

    ViewOnAttachStateChangeListenerC9774ut(C10309zt c10309zt, InterfaceC6930Hp interfaceC6930Hp) {
        this.f79776a = interfaceC6930Hp;
        this.f79777b = c10309zt;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f79777b.q0(view, this.f79776a, 10);
    }
}
