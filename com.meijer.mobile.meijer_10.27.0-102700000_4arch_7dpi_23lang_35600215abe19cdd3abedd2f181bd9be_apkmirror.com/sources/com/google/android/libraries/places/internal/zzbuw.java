package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbuw implements Runnable {
    final /* synthetic */ zzbvj zza;
    final /* synthetic */ zzbux zzb;

    zzbuw(zzbux zzbuxVar, zzbvj zzbvjVar) {
        this.zza = zzbvjVar;
        Objects.requireNonNull(zzbuxVar);
        this.zzb = zzbuxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbuv zzbuvVar;
        boolean z10;
        zzbux zzbuxVar = this.zzb;
        zzbvl zzbvlVar = zzbuxVar.zzb;
        synchronized (zzbvlVar.zzK()) {
            try {
                zzbuvVar = null;
                if (zzbuxVar.zza.zzc) {
                    z10 = true;
                } else {
                    zzbvlVar.zzR(zzbvlVar.zzQ().zzc(this.zza));
                    if (zzbvlVar.zzz(zzbvlVar.zzQ()) && (zzbvlVar.zzO() == null || zzbvlVar.zzO().zza())) {
                        zzbuvVar = new zzbuv(zzbvlVar.zzK());
                        zzbvlVar.zzaa(zzbuvVar);
                    } else {
                        zzbvlVar.zzR(zzbvlVar.zzQ().zzb());
                        zzbvlVar.zzaa(null);
                    }
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            zzbvj zzbvjVar = this.zza;
            zzbvjVar.zza.zzf(new zzbvi(this.zzb.zzb, zzbvjVar));
            zzbvjVar.zza.zzl(zzbjv.zzb.zze("Unneeded hedging"));
            return;
        }
        if (zzbuvVar != null) {
            zzbvl zzbvlVar2 = this.zzb.zzb;
            zzbuvVar.zza(zzbvlVar2.zzG().schedule(new zzbux(zzbvlVar2, zzbuvVar), zzbvlVar2.zzI().zzb, TimeUnit.NANOSECONDS));
        }
        this.zzb.zzb.zzx(this.zza);
    }
}
