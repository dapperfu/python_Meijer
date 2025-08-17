package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzblo extends zzbmj {
    final /* synthetic */ zzblp zza;

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        int i10 = zzcba.zza;
        zzblp zzblpVar = this.zza;
        if (zzblpVar.zzg() != null) {
            return;
        }
        try {
            zzblpVar.zzf().zzd();
        } catch (Throwable th2) {
            this.zza.zze(zzbjv.zzb.zzd(th2).zze("Failed to call onReady."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzblo(zzblp zzblpVar, zzcaz zzcazVar) {
        super(zzblpVar.zza.zzl());
        Objects.requireNonNull(zzblpVar);
        this.zza = zzblpVar;
    }
}
