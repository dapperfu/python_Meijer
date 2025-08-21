package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzadj {
    private final Object zza;
    private final int zzb;

    zzadj(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzadj)) {
            return false;
        }
        zzadj zzadjVar = (zzadj) obj;
        return this.zza == zzadjVar.zza && this.zzb == zzadjVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
