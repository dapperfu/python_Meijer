package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbll extends zzbmj {
    final /* synthetic */ zzbip zza;
    final /* synthetic */ zzblp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbll(zzblp zzblpVar, zzcaz zzcazVar, zzbip zzbipVar) {
        super(zzblpVar.zza.zzl());
        this.zza = zzbipVar;
        Objects.requireNonNull(zzblpVar);
        this.zzb = zzblpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        int i10 = zzcba.zza;
        zzblp zzblpVar = this.zzb;
        if (zzblpVar.zzg() != null) {
            return;
        }
        try {
            zzblpVar.zzf().zza(this.zza);
        } catch (Throwable th2) {
            this.zzb.zze(zzbjv.zzb.zzd(th2).zze("Failed to read headers"));
        }
    }
}
