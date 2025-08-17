package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnl implements Runnable {
    final /* synthetic */ zzbgj zza;
    final /* synthetic */ zzbnz zzb;

    zzbnl(zzbnz zzbnzVar, zzbgj zzbgjVar) {
        this.zza = zzbgjVar;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzd(this.zza);
    }
}
