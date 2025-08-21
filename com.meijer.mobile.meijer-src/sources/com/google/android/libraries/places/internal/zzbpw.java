package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbpw extends zzbos {
    final /* synthetic */ zzblt zza;
    final /* synthetic */ zzbpx zzb;

    @Override // com.google.android.libraries.places.internal.zzbos
    protected final zzblt zze() {
        return this.zza;
    }

    zzbpw(zzbpx zzbpxVar, zzblt zzbltVar) {
        this.zza = zzbltVar;
        Objects.requireNonNull(zzbpxVar);
        this.zzb = zzbpxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbos, com.google.android.libraries.places.internal.zzblt
    public final void zzc(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        this.zzb.zzb.zzg().zzb(zzbjvVar.zzj());
        this.zza.zzc(zzbjvVar, zzblsVar, zzbipVar);
    }
}
