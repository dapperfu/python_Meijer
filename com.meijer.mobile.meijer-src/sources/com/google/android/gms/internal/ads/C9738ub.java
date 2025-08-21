package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9738ub extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC10059xb f79721a;

    C9738ub(ViewOnAttachStateChangeListenerC10059xb viewOnAttachStateChangeListenerC10059xb) {
        this.f79721a = viewOnAttachStateChangeListenerC10059xb;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f79721a.j(3);
    }
}
