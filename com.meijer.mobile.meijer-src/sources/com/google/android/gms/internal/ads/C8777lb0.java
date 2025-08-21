package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.lb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8777lb0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8884mb0 f76708a;

    C8777lb0(C8884mb0 c8884mb0) {
        this.f76708a = c8884mb0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            C8884mb0 c8884mb0 = this.f76708a;
            c8884mb0.d(true, c8884mb0.f77674c);
            this.f76708a.f77673b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            C8884mb0 c8884mb02 = this.f76708a;
            c8884mb02.d(false, c8884mb02.f77674c);
            this.f76708a.f77673b = false;
        }
    }
}
