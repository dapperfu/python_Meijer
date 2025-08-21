package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbvc implements Runnable {
    final /* synthetic */ zzbvj zza;
    final /* synthetic */ zzbvd zzb;

    zzbvc(zzbvd zzbvdVar, zzbvj zzbvjVar) {
        this.zza = zzbvjVar;
        Objects.requireNonNull(zzbvdVar);
        this.zzb = zzbvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzb.zzx(this.zza);
    }
}
