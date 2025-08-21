package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbln extends zzbmj {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbip zzb;
    final /* synthetic */ zzblp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbln(zzblp zzblpVar, zzcaz zzcazVar, zzbjv zzbjvVar, zzbip zzbipVar) {
        super(zzblpVar.zza.zzl());
        this.zza = zzbjvVar;
        this.zzb = zzbipVar;
        Objects.requireNonNull(zzblpVar);
        this.zzc = zzblpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        int i10 = zzcba.zza;
        zzblp zzblpVar = this.zzc;
        zzblpVar.zza.zzm().zzb();
        zzbjv zzbjvVarZzg = this.zza;
        zzbip zzbipVar = this.zzb;
        if (zzblpVar.zzg() != null) {
            zzbjvVarZzg = zzblpVar.zzg();
            zzbipVar = new zzbip();
        }
        try {
            zzblq.zzq(zzblpVar.zzf(), zzbjvVarZzg, zzbipVar);
        } finally {
            this.zzc.zza.zzk().zzb(zzbjvVarZzg.zzj());
        }
    }
}
