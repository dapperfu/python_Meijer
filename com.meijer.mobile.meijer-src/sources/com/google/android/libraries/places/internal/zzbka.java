package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbka implements Runnable {
    final /* synthetic */ zzbkb zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzbkd zzc;

    zzbka(zzbkd zzbkdVar, zzbkb zzbkbVar, Runnable runnable) {
        this.zza = zzbkbVar;
        this.zzb = runnable;
        Objects.requireNonNull(zzbkdVar);
        this.zzc = zzbkdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbkd zzbkdVar = this.zzc;
        zzbkdVar.zzb(this.zza);
        zzbkdVar.zza();
    }

    public final String toString() {
        return String.valueOf(this.zzb.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
