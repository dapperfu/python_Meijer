package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.fj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8153fj0 extends AbstractExecutorService implements Xj0 {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return RunnableFutureC9116ok0.E(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.q) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC9116ok0(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.q) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.Xj0
    public final com.google.common.util.concurrent.q k0(Callable callable) {
        return (com.google.common.util.concurrent.q) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (com.google.common.util.concurrent.q) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.Xj0
    public final com.google.common.util.concurrent.q zza(Runnable runnable) {
        return (com.google.common.util.concurrent.q) super.submit(runnable);
    }
}
