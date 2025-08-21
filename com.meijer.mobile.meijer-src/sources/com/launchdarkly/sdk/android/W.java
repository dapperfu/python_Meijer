package com.launchdarkly.sdk.android;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
class W<T> implements Future<T> {

    /* renamed from: a, reason: collision with root package name */
    private volatile T f91944a = null;

    /* renamed from: b, reason: collision with root package name */
    private volatile Throwable f91945b = null;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f91946c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f91947d = new Object();

    synchronized void a(T t10) {
        try {
            if (this.f91946c) {
                a0.i().n("LDAwaitFuture set twice");
            } else {
                this.f91944a = t10;
                synchronized (this.f91947d) {
                    this.f91946c = true;
                    this.f91947d.notifyAll();
                }
            }
        } finally {
        }
    }

    synchronized void b(Throwable th2) {
        try {
            if (this.f91946c) {
                a0.i().n("LDAwaitFuture set twice");
            } else {
                this.f91945b = th2;
                synchronized (this.f91947d) {
                    this.f91946c = true;
                    this.f91947d.notifyAll();
                }
            }
        } finally {
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        synchronized (this.f91947d) {
            while (!this.f91946c) {
                try {
                    this.f91947d.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (this.f91945b == null) {
            return this.f91944a;
        }
        throw new ExecutionException(this.f91945b);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f91946c;
    }

    W() {
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        long jNanoTime = System.nanoTime() + nanos;
        synchronized (this.f91947d) {
            while (true) {
                try {
                    boolean z10 = true;
                    boolean z11 = !this.f91946c;
                    if (nanos <= 0) {
                        z10 = false;
                    }
                    if (!z11 || !z10) {
                        break;
                    }
                    TimeUnit.NANOSECONDS.timedWait(this.f91947d, nanos);
                    nanos = jNanoTime - System.nanoTime();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (this.f91946c) {
            if (this.f91945b == null) {
                return this.f91944a;
            }
            throw new ExecutionException(this.f91945b);
        }
        throw new TimeoutException("LDAwaitFuture timed out awaiting completion");
    }
}
