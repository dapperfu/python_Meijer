package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7817dk0 extends C7497ak0 implements Yj0 {

    /* renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f73468b;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f73468b;
        RunnableFutureC8991ok0 runnableFutureC8991ok0E = RunnableFutureC8991ok0.E(runnable, null);
        return new C7604bk0(runnableFutureC8991ok0E, scheduledExecutorService.schedule(runnableFutureC8991ok0E, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final Wj0 schedule(Callable callable, long j10, TimeUnit timeUnit) {
        RunnableFutureC8991ok0 runnableFutureC8991ok0 = new RunnableFutureC8991ok0(callable);
        return new C7604bk0(runnableFutureC8991ok0, this.f73468b.schedule(runnableFutureC8991ok0, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC7710ck0 runnableC7710ck0 = new RunnableC7710ck0(runnable);
        return new C7604bk0(runnableC7710ck0, this.f73468b.scheduleAtFixedRate(runnableC7710ck0, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC7710ck0 runnableC7710ck0 = new RunnableC7710ck0(runnable);
        return new C7604bk0(runnableC7710ck0, this.f73468b.scheduleWithFixedDelay(runnableC7710ck0, j10, j11, timeUnit));
    }

    C7817dk0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f73468b = scheduledExecutorService;
    }
}
