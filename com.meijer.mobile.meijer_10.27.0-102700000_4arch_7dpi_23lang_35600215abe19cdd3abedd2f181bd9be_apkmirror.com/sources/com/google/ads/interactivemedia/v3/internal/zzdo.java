package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes4.dex */
public final class zzdo {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzdn(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzdk.zza() != com.google.ads.interactivemedia.omid.library.adsession.zzg.CTV) {
            return 2;
        }
        return zza;
    }
}
