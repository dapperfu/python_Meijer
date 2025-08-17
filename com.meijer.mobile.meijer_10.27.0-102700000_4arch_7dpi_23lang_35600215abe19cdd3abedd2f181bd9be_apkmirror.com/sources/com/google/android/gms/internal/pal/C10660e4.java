package com.google.android.gms.internal.pal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.pal.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10660e4 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC10677f4 f83098a;

    C10660e4(ViewOnAttachStateChangeListenerC10677f4 viewOnAttachStateChangeListenerC10677f4) {
        this.f83098a = viewOnAttachStateChangeListenerC10677f4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f83098a.f();
    }
}
