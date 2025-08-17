package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.lb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8652lb0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8759mb0 f75868a;

    C8652lb0(C8759mb0 c8759mb0) {
        this.f75868a = c8759mb0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            C8759mb0 c8759mb0 = this.f75868a;
            c8759mb0.d(true, c8759mb0.f76834c);
            this.f75868a.f76833b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            C8759mb0 c8759mb02 = this.f75868a;
            c8759mb02.d(false, c8759mb02.f76834c);
            this.f75868a.f76833b = false;
        }
    }
}
