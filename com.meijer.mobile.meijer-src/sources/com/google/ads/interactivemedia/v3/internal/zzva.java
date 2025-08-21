package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class zzva extends zzux implements ScheduledExecutorService, zzuv {
    final ScheduledExecutorService zza;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzvh zzvhVarZzs = zzvh.zzs(runnable, null);
        return new zzuy(zzvhVarZzs, scheduledExecutorService.schedule(zzvhVarZzs, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzuz zzuzVar = new zzuz(runnable);
        return new zzuy(zzuzVar, this.zza.scheduleAtFixedRate(zzuzVar, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzuz zzuzVar = new zzuz(runnable);
        return new zzuy(zzuzVar, this.zza.scheduleWithFixedDelay(zzuzVar, j10, j11, timeUnit));
    }

    zzva(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzvh zzvhVar = new zzvh(callable);
        return new zzuy(zzvhVar, this.zza.schedule(zzvhVar, j10, timeUnit));
    }
}
