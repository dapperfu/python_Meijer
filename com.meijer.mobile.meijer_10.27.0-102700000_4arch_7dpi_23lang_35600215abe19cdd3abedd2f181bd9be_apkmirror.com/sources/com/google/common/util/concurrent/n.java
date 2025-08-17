package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes6.dex */
class n<V> implements q<V> {

    /* renamed from: b, reason: collision with root package name */
    static final q<?> f88098b = new n(null);

    /* renamed from: c, reason: collision with root package name */
    private static final p f88099c = new p(n.class);

    /* renamed from: a, reason: collision with root package name */
    private final V f88100a;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f88100a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        Be.p.r(runnable, "Runnable was null.");
        Be.p.r(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f88099c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        Be.p.q(timeUnit);
        return get();
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f88100a + "]]";
    }

    n(V v10) {
        this.f88100a = v10;
    }
}
