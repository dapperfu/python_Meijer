package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbro implements Runnable {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzbrq zzb;

    zzbro(zzbrq zzbrqVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzbrqVar);
        this.zzb = zzbrqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.run();
        zzbrq zzbrqVar = this.zzb;
        zzbrp zzbrpVar = new zzbrp(zzbrqVar);
        zzbkd zzbkdVar = zzbrqVar.zzd.zza.zze;
        zzbkdVar.zzb(zzbrpVar);
        zzbkdVar.zza();
    }
}
