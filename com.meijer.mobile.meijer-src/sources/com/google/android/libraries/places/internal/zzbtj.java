package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbtj implements zzbhz {
    final /* synthetic */ zzbhx zza;
    final /* synthetic */ zzbto zzb;

    zzbtj(zzbto zzbtoVar, zzbhx zzbhxVar) {
        this.zza = zzbhxVar;
        Objects.requireNonNull(zzbtoVar);
        this.zzb = zzbtoVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbhz
    public final void zza(zzbfz zzbfzVar) {
        this.zzb.zze(this.zza, zzbfzVar);
    }
}
