package com.google.android.libraries.places.internal;

import De.p;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class zzbrb implements Executor {
    private final zzbsu zza;
    private Executor zzb;

    final synchronized Executor zza() {
        try {
            if (this.zzb == null) {
                this.zzb = (Executor) p.s((Executor) this.zza.zza(), "%s.getObject()", this.zzb);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzb;
    }

    final synchronized void zzb() {
        Executor executor = this.zzb;
        if (executor != null) {
            this.zza.zzb(executor);
            this.zzb = null;
        }
    }

    zzbrb(zzbsu zzbsuVar) {
        this.zza = (zzbsu) p.r(zzbsuVar, "executorPool");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zza().execute(runnable);
    }
}
