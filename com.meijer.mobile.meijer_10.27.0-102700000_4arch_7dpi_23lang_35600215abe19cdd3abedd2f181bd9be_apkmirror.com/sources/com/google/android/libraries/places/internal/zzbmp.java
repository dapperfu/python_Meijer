package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbmp implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbna zzb;

    zzbmp(zzbna zzbnaVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbnaVar);
        this.zzb = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbjv zzbjvVar = this.zza;
        this.zzb.zzk().zze(zzbjvVar.zzh(), zzbjvVar.zzi());
    }
}
