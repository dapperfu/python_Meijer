package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9613ub extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC9934xb f78881a;

    C9613ub(ViewOnAttachStateChangeListenerC9934xb viewOnAttachStateChangeListenerC9934xb) {
        this.f78881a = viewOnAttachStateChangeListenerC9934xb;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f78881a.j(3);
    }
}
