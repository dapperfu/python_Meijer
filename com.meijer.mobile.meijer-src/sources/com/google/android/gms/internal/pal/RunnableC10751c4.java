package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC10751c4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC10802f4 f83912a;

    RunnableC10751c4(ViewOnAttachStateChangeListenerC10802f4 viewOnAttachStateChangeListenerC10802f4) {
        this.f83912a = viewOnAttachStateChangeListenerC10802f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f83912a.f();
    }
}
