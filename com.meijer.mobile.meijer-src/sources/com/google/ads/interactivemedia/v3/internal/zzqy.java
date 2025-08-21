package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* loaded from: classes4.dex */
final class zzqy extends zzre {
    final /* synthetic */ zzrf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzqy(zzrf zzrfVar) {
        super(zzrfVar);
        this.zza = zzrfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iZzc = this.zza.zzc(key, zzrg.zzc(key));
            if (iZzc != -1 && zzqe.zza(value, this.zza.zzb[iZzc])) {
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
        int iZzc2 = this.zza.zzc(key, iZzc);
        if (iZzc2 == -1 || !zzqe.zza(value, this.zza.zzb[iZzc2])) {
            return false;
        }
        this.zza.zzl(iZzc2, iZzc);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzre
    final /* bridge */ /* synthetic */ Object zza(int i10) {
        return new zzqw(this.zza, i10);
    }
}
