package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzqi extends zzqf {
    private final Object zza;

    zzqi(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqf
    public final Object zzb() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqf
    public final Object zzc(Object obj) {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqf
    public final Object zzd() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqf
    public final boolean zze() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqf
    public final boolean equals(Object obj) {
        if (obj instanceof zzqi) {
            return this.zza.equals(((zzqi) obj).zza);
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqf
    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqf
    public final zzqf zza(zzpz zzpzVar) {
        return new zzqi(zzpzVar.zza(this.zza));
    }
}
