package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC10626c4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC10677f4 f83072a;

    RunnableC10626c4(ViewOnAttachStateChangeListenerC10677f4 viewOnAttachStateChangeListenerC10677f4) {
        this.f83072a = viewOnAttachStateChangeListenerC10677f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f83072a.f();
    }
}
