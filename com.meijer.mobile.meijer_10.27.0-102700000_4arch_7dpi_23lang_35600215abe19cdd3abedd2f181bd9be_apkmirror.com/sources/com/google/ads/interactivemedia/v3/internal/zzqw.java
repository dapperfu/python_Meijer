package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzqw extends zzqr {
    final Object zza;
    int zzb;
    final /* synthetic */ zzrf zzc;

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    zzqw(zzrf zzrfVar, int i10) {
        this.zzc = zzrfVar;
        this.zza = zzrfVar.zza[i10];
        this.zzb = i10;
    }

    final void zza() {
        int i10 = this.zzb;
        if (i10 != -1) {
            zzrf zzrfVar = this.zzc;
            if (i10 <= zzrfVar.zzc && zzqe.zza(zzrfVar.zza[i10], this.zza)) {
                return;
            }
        }
        zzrf zzrfVar2 = this.zzc;
        Object obj = this.zza;
        this.zzb = zzrfVar2.zzc(obj, zzrg.zzc(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr, java.util.Map.Entry
    public final Object getValue() {
        zza();
        int i10 = this.zzb;
        if (i10 == -1) {
            return null;
        }
        return this.zzc.zzb[i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zza();
        int i10 = this.zzb;
        if (i10 == -1) {
            this.zzc.zzg(this.zza, obj, false);
            return null;
        }
        Object obj2 = this.zzc.zzb[i10];
        if (zzqe.zza(obj2, obj)) {
            return obj;
        }
        this.zzc.zzw(this.zzb, obj, false);
        return obj2;
    }
}
