package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
abstract class zzty extends zzus {
    private final Executor zza;
    final /* synthetic */ zztz zzb;

    abstract void zzc(Object obj);

    zzty(zztz zztzVar, Executor executor) {
        this.zzb = zztzVar;
        executor.getClass();
        this.zza = executor;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final void zzd(Throwable th2) {
        this.zzb.zza = null;
        if (th2 instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzd(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
