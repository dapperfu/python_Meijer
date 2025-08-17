package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzaht {
    private final Object zza;
    private final int zzb;

    public final int hashCode() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaht)) {
            return false;
        }
        zzaht zzahtVar = (zzaht) obj;
        return this.zzb == zzahtVar.zzb && this.zza == zzahtVar.zza;
    }

    zzaht(Object obj) {
        this.zzb = System.identityHashCode(obj);
        this.zza = obj;
    }
}
