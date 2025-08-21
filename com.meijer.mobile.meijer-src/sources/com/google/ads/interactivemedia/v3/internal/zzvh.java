package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes4.dex */
final class zzvh extends zzub implements RunnableFuture {
    private volatile zzus zza;

    static zzvh zzs(Runnable runnable, Object obj) {
        return new zzvh(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzus zzusVar = this.zza;
        if (zzusVar != null) {
            zzusVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final String zza() {
        zzus zzusVar = this.zza;
        if (zzusVar == null) {
            return super.zza();
        }
        return "task=[" + zzusVar.toString() + "]";
    }

    zzvh(Callable callable) {
        this.zza = new zzvg(this, callable);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final void zzb() {
        zzus zzusVar;
        if (zzr() && (zzusVar = this.zza) != null) {
            zzusVar.zzh();
        }
        this.zza = null;
    }
}
