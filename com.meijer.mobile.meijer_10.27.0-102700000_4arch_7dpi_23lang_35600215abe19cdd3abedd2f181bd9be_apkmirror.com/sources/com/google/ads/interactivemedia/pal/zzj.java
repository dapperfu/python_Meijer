package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.C10658e2;

/* loaded from: classes4.dex */
final class zzj extends zzw {
    private final C10658e2 zza;
    private final C10658e2 zzb;
    private final C10658e2 zzc;
    private final C10658e2 zzd;
    private final C10658e2 zze;
    private final int zzf;

    /* synthetic */ zzj(C10658e2 c10658e2, C10658e2 c10658e22, C10658e2 c10658e23, C10658e2 c10658e24, C10658e2 c10658e25, int i10, zzi zziVar) {
        this.zza = c10658e2;
        this.zzb = c10658e22;
        this.zzc = c10658e23;
        this.zzd = c10658e24;
        this.zze = c10658e25;
        this.zzf = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza.equals(zzwVar.zzc()) && this.zzb.equals(zzwVar.zzd()) && this.zzc.equals(zzwVar.zzb()) && this.zzd.equals(zzwVar.zzf()) && this.zze.equals(zzwVar.zze()) && this.zzf == zzwVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final int zza() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final C10658e2 zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final C10658e2 zzc() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final C10658e2 zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final C10658e2 zze() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final C10658e2 zzf() {
        return this.zzd;
    }

    public final int hashCode() {
        return ((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf;
    }

    public final String toString() {
        return "NonceTimingData{nonceLoaderInitTime=" + this.zza.toString() + ", nonceRequestTime=" + this.zzb.toString() + ", nonceLoadedTime=" + this.zzc.toString() + ", resourceFetchStartTime=" + this.zzd.toString() + ", resourceFetchEndTime=" + this.zze.toString() + ", nonceLength=" + this.zzf + "}";
    }
}
