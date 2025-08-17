package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbuo implements zzbus {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzbvl zzb;

    zzbuo(zzbvl zzbvlVar, Object obj) {
        this.zza = obj;
        Objects.requireNonNull(zzbvlVar);
        this.zzb = zzbvlVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbus
    public final void zza(zzbvj zzbvjVar) {
        zzbvjVar.zza.zzt(this.zzb.zzD().zze(this.zza));
        zzbvjVar.zza.zzu();
    }
}
