package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes6.dex */
final class Dy0 extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f67149a;

    @Override // java.lang.Runnable
    public final void run() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f67149a.post(this);
        }
    }

    public Dy0(Fy0 fy0, Handler handler, Ey0 ey0) {
        this.f67149a = handler;
    }
}
