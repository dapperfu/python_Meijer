package com.google.ads.interactivemedia.pal;

import android.net.Uri;
import com.google.android.gms.internal.pal.I6;
import com.google.android.gms.internal.pal.J6;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzs {
    private final String zza;
    private final String zzb;
    private final String zzc;

    zzs(zzq zzqVar) {
        this.zza = zzqVar.zzb();
        this.zzb = zzqVar.zzc();
        this.zzc = zzqVar.zza();
    }

    final void zza(String str, String str2, Map map) {
        I6 i62 = new I6();
        i62.b(map);
        i62.a(zzr.SDKV.zza(), this.zzb);
        i62.a(zzr.PALV.zza(), this.zza);
        i62.a(zzr.CORRELATOR.zza(), this.zzc);
        i62.a(zzr.EVENT_ID.zza(), str2);
        i62.a(zzr.LOGGER_ID.zza(), str);
        J6 j6C = i62.c();
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        for (String str3 : j6C.keySet()) {
            builderBuildUpon.appendQueryParameter(str3, (String) j6C.get(str3));
        }
        new zzo(this, builderBuildUpon.build().toString()).start();
    }
}
