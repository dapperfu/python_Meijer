package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzrb extends zzre {
    final /* synthetic */ zzrf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzrb(zzrf zzrfVar) {
        super(zzrfVar);
        this.zza = zzrfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzrf zzrfVar = this.zza;
        int iZzc = zzrg.zzc(obj);
        int iZzc2 = zzrfVar.zzc(obj, iZzc);
        if (iZzc2 == -1) {
            return false;
        }
        this.zza.zzl(iZzc2, iZzc);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzre
    final Object zza(int i10) {
        return this.zza.zza[i10];
    }
}
