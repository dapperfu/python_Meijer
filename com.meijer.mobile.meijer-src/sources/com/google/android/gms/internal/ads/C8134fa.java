package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.internal.ads.fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8134fa extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f74961a = true;

    final boolean a() {
        return this.f74961a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f74961a = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f74961a = false;
        }
    }

    C8134fa(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }
}
