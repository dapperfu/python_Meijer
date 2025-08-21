package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9629ta extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC9736ua f79435a;

    C9629ta(ViewOnAttachStateChangeListenerC9736ua viewOnAttachStateChangeListenerC9736ua) {
        this.f79435a = viewOnAttachStateChangeListenerC9736ua;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f79435a.f();
    }
}
