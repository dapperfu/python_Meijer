package com.google.common.util.concurrent;

import Ce.G;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public abstract class h<V> extends G implements Future<V> {
    protected abstract Future<? extends V> b();

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return b().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return b().get(j10, timeUnit);
    }

    protected h() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return b().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return b().isDone();
    }
}
