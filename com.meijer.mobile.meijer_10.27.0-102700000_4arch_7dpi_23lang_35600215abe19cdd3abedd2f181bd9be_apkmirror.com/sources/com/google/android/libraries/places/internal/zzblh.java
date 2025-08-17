package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzblh {
    private final zzbwk zza;
    private final zzbqm zzb = zzbqn.zza();
    private final zzbqm zzc = zzbqn.zza();
    private final zzbqm zzd = zzbqn.zza();
    private volatile long zze;

    public final void zza() {
        this.zzb.zza(1L);
        this.zze = this.zza.zza();
    }

    public final void zzb(boolean z10) {
        if (z10) {
            this.zzc.zza(1L);
        } else {
            this.zzd.zza(1L);
        }
    }

    zzblh(zzbwk zzbwkVar) {
        this.zza = zzbwkVar;
    }
}
