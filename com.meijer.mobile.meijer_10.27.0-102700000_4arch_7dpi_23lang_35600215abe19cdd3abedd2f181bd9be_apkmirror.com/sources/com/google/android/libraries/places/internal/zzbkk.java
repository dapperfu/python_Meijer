package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbkk implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbls zzb;
    final /* synthetic */ zzbip zzc;
    final /* synthetic */ zzbkl zzd;

    zzbkk(zzbkl zzbklVar, zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        this.zza = zzbjvVar;
        this.zzb = zzblsVar;
        this.zzc = zzbipVar;
        Objects.requireNonNull(zzbklVar);
        this.zzd = zzbklVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzk(this.zza, this.zzb, this.zzc);
    }
}
