package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.C10783e2;

/* loaded from: classes4.dex */
final class zzh extends zzv {
    private C10783e2 zza;
    private C10783e2 zzb;
    private C10783e2 zzc;
    private C10783e2 zzd;
    private C10783e2 zze;
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
    final zzv zzb(C10783e2 c10783e2) {
        this.zzc = c10783e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zzc(C10783e2 c10783e2) {
        this.zza = c10783e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zzd(C10783e2 c10783e2) {
        this.zzb = c10783e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zze(C10783e2 c10783e2) {
        this.zze = c10783e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzv zzf(C10783e2 c10783e2) {
        this.zzd = c10783e2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.zzv
    final zzw zzg() {
        C10783e2 c10783e2;
        C10783e2 c10783e22;
        C10783e2 c10783e23;
        C10783e2 c10783e24;
        C10783e2 c10783e25;
        if (this.zzg == 1 && (c10783e2 = this.zza) != null && (c10783e22 = this.zzb) != null && (c10783e23 = this.zzc) != null && (c10783e24 = this.zzd) != null && (c10783e25 = this.zze) != null) {
            return new zzj(c10783e2, c10783e22, c10783e23, c10783e24, c10783e25, this.zzf, null);
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
