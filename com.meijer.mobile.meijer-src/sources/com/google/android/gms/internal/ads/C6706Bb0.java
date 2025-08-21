package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Bb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6706Bb0 extends BroadcastReceiver {
    C6706Bb0() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                C6740Cb0.f66651a = 1;
            } else if (intExtra == 1) {
                C6740Cb0.f66651a = 2;
            }
        }
    }
}
