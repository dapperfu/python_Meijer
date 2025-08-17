package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9504ta extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC9611ua f78595a;

    C9504ta(ViewOnAttachStateChangeListenerC9611ua viewOnAttachStateChangeListenerC9611ua) {
        this.f78595a = viewOnAttachStateChangeListenerC9611ua;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f78595a.f();
    }
}
