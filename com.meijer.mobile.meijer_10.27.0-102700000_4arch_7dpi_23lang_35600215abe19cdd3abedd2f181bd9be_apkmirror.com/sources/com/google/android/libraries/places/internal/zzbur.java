package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbur implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbls zzb;
    final /* synthetic */ zzbip zzc;
    final /* synthetic */ zzbvl zzd;

    zzbur(zzbvl zzbvlVar, zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        this.zza = zzbjvVar;
        this.zzb = zzblsVar;
        this.zzc = zzbipVar;
        Objects.requireNonNull(zzbvlVar);
        this.zzd = zzbvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zzd;
        zzbvlVar.zzae(true);
        zzbvlVar.zzY().zzc(this.zza, this.zzb, this.zzc);
    }
}
