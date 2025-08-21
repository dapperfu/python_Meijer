package com.google.android.gms.internal.pal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.pal.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10785e4 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC10802f4 f83938a;

    C10785e4(ViewOnAttachStateChangeListenerC10802f4 viewOnAttachStateChangeListenerC10802f4) {
        this.f83938a = viewOnAttachStateChangeListenerC10802f4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f83938a.f();
    }
}
