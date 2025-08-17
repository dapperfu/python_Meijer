package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.C10658e2;

/* loaded from: classes4.dex */
final class zzh extends zzv {
    private C10658e2 zza;
    private C10658e2 zzb;
    private C10658e2 zzc;
    private C10658e2 zzd;
    private C10658e2 zze;
    private int zzf;
    private byte zzg;

    zzh() {
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zza(int i10) {
        this.zzf = i10;
        this.zzg = (byte) 1;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zzb(C10658e2 c10658e2) {
        this.zzc = c10658e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zzc(C10658e2 c10658e2) {
        this.zza = c10658e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zzd(C10658e2 c10658e2) {
        this.zzb = c10658e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zze(C10658e2 c10658e2) {
        this.zze = c10658e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zzf(C10658e2 c10658e2) {
        this.zzd = c10658e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzw zzg() {
        C10658e2 c10658e2;
        C10658e2 c10658e22;
        C10658e2 c10658e23;
        C10658e2 c10658e24;
        C10658e2 c10658e25;
        if (this.zzg == 1 && (c10658e2 = this.zza) != null && (c10658e22 = this.zzb) != null && (c10658e23 = this.zzc) != null && (c10658e24 = this.zzd) != null && (c10658e25 = this.zze) != null) {
            return new zzj(c10658e2, c10658e22, c10658e23, c10658e24, c10658e25, this.zzf, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" nonceLoaderInitTime");
        }
        if (this.zzb == null) {
            sb2.append(" nonceRequestTime");
        }
        if (this.zzc == null) {
            sb2.append(" nonceLoadedTime");
        }
        if (this.zzd == null) {
            sb2.append(" resourceFetchStartTime");
        }
        if (this.zze == null) {
            sb2.append(" resourceFetchEndTime");
        }
        if (this.zzg == 0) {
            sb2.append(" nonceLength");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
