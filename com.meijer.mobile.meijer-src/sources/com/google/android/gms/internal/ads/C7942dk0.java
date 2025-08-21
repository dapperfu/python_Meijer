package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7942dk0 extends C7622ak0 implements Yj0 {

    /* renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f74308b;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f74308b;
        RunnableFutureC9116ok0 runnableFutureC9116ok0E = RunnableFutureC9116ok0.E(runnable, null);
        return new C7729bk0(runnableFutureC9116ok0E, scheduledExecutorService.schedule(runnableFutureC9116ok0E, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final Wj0 schedule(Callable callable, long j10, TimeUnit timeUnit) {
        RunnableFutureC9116ok0 runnableFutureC9116ok0 = new RunnableFutureC9116ok0(callable);
        return new C7729bk0(runnableFutureC9116ok0, this.f74308b.schedule(runnableFutureC9116ok0, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC7835ck0 runnableC7835ck0 = new RunnableC7835ck0(runnable);
        return new C7729bk0(runnableC7835ck0, this.f74308b.scheduleAtFixedRate(runnableC7835ck0, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC7835ck0 runnableC7835ck0 = new RunnableC7835ck0(runnable);
        return new C7729bk0(runnableC7835ck0, this.f74308b.scheduleWithFixedDelay(runnableC7835ck0, j10, j11, timeUnit));
    }

    C7942dk0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f74308b = scheduledExecutorService;
    }
}
