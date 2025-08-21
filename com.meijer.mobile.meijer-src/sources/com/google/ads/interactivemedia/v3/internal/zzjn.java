package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzjn extends zzgk {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public zzjn() {
    }

    public zzjn(String str) {
        HashMap mapZza = zzgk.zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Long) mapZza.get(1);
            this.zzc = (Long) mapZza.get(2);
            this.zzd = (Long) mapZza.get(3);
            this.zze = (Long) mapZza.get(4);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgk
    protected final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        map.put(3, this.zzd);
        map.put(4, this.zze);
        return map;
    }
}
