package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzrc extends zzre {
    final /* synthetic */ zzrf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzrc(zzrf zzrfVar) {
        super(zzrfVar);
        this.zza = zzrfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzrf zzrfVar = this.zza;
        int iZzc = zzrg.zzc(obj);
        int iZzd = zzrfVar.zzd(obj, iZzc);
        if (iZzd == -1) {
            return false;
        }
        this.zza.zzm(iZzd, iZzc);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzre
    final Object zza(int i10) {
        return this.zza.zzb[i10];
    }
}
