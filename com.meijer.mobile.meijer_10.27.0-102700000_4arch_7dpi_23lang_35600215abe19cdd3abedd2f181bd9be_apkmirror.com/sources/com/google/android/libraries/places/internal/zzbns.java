package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbns implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbnz zzb;

    zzbns(zzbnz zzbnzVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzl(this.zza);
    }
}
