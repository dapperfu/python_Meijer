package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ak0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C7497ak0 extends AbstractC8028fj0 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f72484a;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f72484a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f72484a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f72484a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f72484a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f72484a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f72484a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f72484a;
        return super.toString() + "[" + String.valueOf(executorService) + "]";
    }

    C7497ak0(ExecutorService executorService) {
        executorService.getClass();
        this.f72484a = executorService;
    }
}
