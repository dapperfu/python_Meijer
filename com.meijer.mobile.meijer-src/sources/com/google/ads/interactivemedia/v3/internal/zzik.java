package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzik extends zzgk {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzik() {
    }

    public zzik(String str) {
        HashMap mapZza = zzgk.zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Long) mapZza.get(1);
            this.zzc = (Long) mapZza.get(2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgk
    protected final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }
}
