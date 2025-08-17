package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* loaded from: classes4.dex */
final class zzra extends zzre {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iZzd = this.zzb.zzd(key, zzrg.zzc(key));
            if (iZzd != -1 && zzqe.zza(this.zzb.zza[iZzd], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iZzc = zzrg.zzc(key);
        int iZzd = this.zzb.zzd(key, iZzc);
        if (iZzd == -1 || !zzqe.zza(this.zzb.zza[iZzd], value)) {
            return false;
        }
        this.zzb.zzm(iZzd, iZzc);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzre
    final /* bridge */ /* synthetic */ Object zza(int i10) {
        return new zzqx(this.zzb, i10);
    }

    zzra(zzrf zzrfVar) {
        super(zzrfVar);
    }
}
