package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbvf implements Runnable {
    final /* synthetic */ zzbvj zza;
    final /* synthetic */ zzbvi zzb;

    zzbvf(zzbvi zzbviVar, zzbvj zzbvjVar) {
        this.zza = zzbvjVar;
        Objects.requireNonNull(zzbviVar);
        this.zzb = zzbviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzx(this.zza);
    }
}
