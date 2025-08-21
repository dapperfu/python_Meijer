package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.I6;
import com.google.maps.android.BuildConfig;

/* loaded from: classes4.dex */
public final class zzax {
    private final zzs zza;
    private final String zzb;

    zzax(zzs zzsVar, String str) {
        this.zza = zzsVar;
        this.zzb = str;
    }

    public final void zza(int i10, String str) {
        if (str == null) {
            str = BuildConfig.TRAVIS;
        }
        I6 i62 = new I6();
        i62.a(zzaw.DEVICE_TYPE.zza(), String.valueOf(4));
        i62.a(zzaw.EVENT_TYPE.zza(), String.valueOf(i10 - 1));
        i62.a(zzaw.SPAM_CORRELATOR.zza(), this.zzb);
        i62.a(zzaw.SPAM_SIGNAL.zza(), str);
        this.zza.zza("asscs", "116", i62.c());
    }
}
