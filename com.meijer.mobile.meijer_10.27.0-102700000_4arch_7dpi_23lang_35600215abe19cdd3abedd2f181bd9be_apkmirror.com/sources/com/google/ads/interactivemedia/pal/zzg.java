package com.google.ads.interactivemedia.pal;

/* loaded from: classes4.dex */
final class zzg extends zzq {
    private final String zza;
    private final String zzb;
    private final String zzc;

    /* synthetic */ zzg(String str, String str2, String str3, zzf zzfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzq) {
            zzq zzqVar = (zzq) obj;
            if (this.zza.equals(zzqVar.zzb()) && this.zzb.equals(zzqVar.zzc()) && this.zzc.equals(zzqVar.zza())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.pal.zzq
    final String zza() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.zzq
    final String zzb() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.pal.zzq
    final String zzc() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        return "Gen204LoggerData{palVersion=" + this.zza + ", sdkVersion=" + this.zzb + ", correlator=" + this.zzc + "}";
    }
}
