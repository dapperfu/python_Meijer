package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes4.dex */
final class zzun implements zzuu {
    static final zzuu zza = new zzun(null);
    private static final zzut zzb = new zzut(zzun.class);
    private final Object zzc;

    zzun(Object obj) {
        this.zzc = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }

    public final String toString() {
        Object obj = this.zzc;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuu
    public final void zzo(Runnable runnable, Executor executor) {
        zzqh.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }
}
