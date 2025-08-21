package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
final class zzdn extends BroadcastReceiver {
    zzdn() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                zzdo.zza = 1;
            } else if (intExtra == 1) {
                zzdo.zza = 2;
            }
        }
    }
}
