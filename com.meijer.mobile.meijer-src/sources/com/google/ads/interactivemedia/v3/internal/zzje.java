package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzje extends zzgk {
    public Long zza;
    public Long zzb;

    public zzje() {
    }

    public zzje(String str) {
        HashMap mapZza = zzgk.zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Long) mapZza.get(1);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgk
    protected final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        return map;
    }
}
