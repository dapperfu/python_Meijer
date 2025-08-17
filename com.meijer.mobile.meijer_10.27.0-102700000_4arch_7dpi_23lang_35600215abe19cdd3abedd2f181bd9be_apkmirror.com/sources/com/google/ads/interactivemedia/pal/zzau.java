package com.google.ads.interactivemedia.pal;

/* loaded from: classes4.dex */
final class zzau implements Runnable {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzav zzb;

    zzau(zzav zzavVar, Runnable runnable) {
        this.zzb = zzavVar;
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NonceManager nonceManager = ((zzar) this.zza).zza;
        nonceManager.zzg.zza(7, nonceManager.zzk);
        zzav zzavVar = this.zzb;
        zzavVar.zza.postDelayed(this, zzavVar.zzb.zzd());
    }
}
