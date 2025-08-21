package com.google.android.gms.internal.pal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes6.dex */
public final class R3 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f83695a = true;

    final boolean a() {
        return this.f83695a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f83695a = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f83695a = false;
        }
    }

    R3(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }
}
