package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzqx extends zzqr {
    final zzrf zza;
    final Object zzb;
    int zzc;

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzrf zzrfVar = this.zza;
            if (i10 <= zzrfVar.zzc && zzqe.zza(this.zzb, zzrfVar.zzb[i10])) {
                return;
            }
        }
        zzrf zzrfVar2 = this.zza;
        Object obj = this.zzb;
        this.zzc = zzrfVar2.zzd(obj, zzrg.zzc(obj));
    }

    zzqx(zzrf zzrfVar, int i10) {
        this.zza = zzrfVar;
        this.zzb = zzrfVar.zzb[i10];
        this.zzc = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr, java.util.Map.Entry
    public final Object getValue() {
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return this.zza.zza[i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.zzh(this.zzb, obj, false);
            return null;
        }
        Object obj2 = this.zza.zza[i10];
        if (zzqe.zza(obj2, obj)) {
            return obj;
        }
        this.zza.zzv(this.zzc, obj, false);
        return obj2;
    }
}
