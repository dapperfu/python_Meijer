package com.google.android.libraries.places.internal;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
final class zzbue implements Runnable {
    final /* synthetic */ Collection zza;
    final /* synthetic */ zzbvj zzb;
    final /* synthetic */ Future zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ Future zze;
    final /* synthetic */ zzbvl zzf;

    zzbue(zzbvl zzbvlVar, Collection collection, zzbvj zzbvjVar, Future future, boolean z10, Future future2) {
        this.zza = collection;
        this.zzb = zzbvjVar;
        this.zzc = future;
        this.zzd = z10;
        this.zze = future2;
        Objects.requireNonNull(zzbvlVar);
        this.zzf = zzbvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (zzbvj zzbvjVar : this.zza) {
            if (zzbvjVar != this.zzb) {
                zzbvjVar.zza.zzl(zzbvl.zza);
            }
        }
        Future future = this.zzc;
        if (future != null) {
            future.cancel(false);
            if (!this.zzd) {
                zzbvl zzbvlVar = this.zzf;
                if (zzbvlVar.zzU().decrementAndGet() == Integer.MIN_VALUE) {
                    zzbkd zzbkdVar = (zzbkd) zzbvlVar.zzF();
                    zzbkdVar.zzb(new zzbud(this));
                    zzbkdVar.zza();
                }
            }
        }
        Future future2 = this.zze;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.zzf.zzg();
    }
}
