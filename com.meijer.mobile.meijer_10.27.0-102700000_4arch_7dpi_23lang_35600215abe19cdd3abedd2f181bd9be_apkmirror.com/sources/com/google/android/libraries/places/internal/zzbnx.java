package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnx implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbls zzb;
    final /* synthetic */ zzbip zzc;
    final /* synthetic */ zzbny zzd;

    zzbnx(zzbny zzbnyVar, zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        this.zza = zzbjvVar;
        this.zzb = zzblsVar;
        this.zzc = zzbipVar;
        Objects.requireNonNull(zzbnyVar);
        this.zzd = zzbnyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzf().zzc(this.zza, this.zzb, this.zzc);
    }
}
