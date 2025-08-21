package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ak0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C7622ak0 extends AbstractC8153fj0 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f73324a;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f73324a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f73324a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f73324a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f73324a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f73324a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f73324a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f73324a;
        return super.toString() + "[" + String.valueOf(executorService) + "]";
    }

    C7622ak0(ExecutorService executorService) {
        executorService.getClass();
        this.f73324a = executorService;
    }
}
