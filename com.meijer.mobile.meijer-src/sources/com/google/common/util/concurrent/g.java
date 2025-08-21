package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
final class g<V> extends f<V> {

    /* renamed from: a, reason: collision with root package name */
    private final q<V> f88934a;

    @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f88934a.get();
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a, com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        this.f88934a.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f88934a.cancel(z10);
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f88934a.get(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f88934a.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a, java.util.concurrent.Future
    public boolean isDone() {
        return this.f88934a.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a
    public String toString() {
        return this.f88934a.toString();
    }

    g(q<V> qVar) {
        this.f88934a = (q) De.p.q(qVar);
    }
}
