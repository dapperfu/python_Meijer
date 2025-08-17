package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbmo implements Runnable {
    final /* synthetic */ zzbfh zza;
    final /* synthetic */ zzbip zzb;
    final /* synthetic */ zzbna zzc;

    zzbmo(zzbna zzbnaVar, zzbfh zzbfhVar, zzbip zzbipVar) {
        this.zza = zzbfhVar;
        this.zzb = zzbipVar;
        Objects.requireNonNull(zzbnaVar);
        this.zzc = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzk().zza(this.zza, this.zzb);
    }
}
