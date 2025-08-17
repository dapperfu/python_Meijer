package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnk implements Runnable {
    final /* synthetic */ zzbfu zza;
    final /* synthetic */ zzbnz zzb;

    zzbnk(zzbnz zzbnzVar, zzbfu zzbfuVar) {
        this.zza = zzbfuVar;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzv(this.zza);
    }
}
