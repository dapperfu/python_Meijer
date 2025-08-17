package com.launchdarkly.sdk.android;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
class W<T> implements Future<T> {

    /* renamed from: a, reason: collision with root package name */
    private volatile T f91105a = null;

    /* renamed from: b, reason: collision with root package name */
    private volatile Throwable f91106b = null;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f91107c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f91108d = new Object();

    synchronized void a(T t10) {
        try {
            if (this.f91107c) {
                a0.i().n("LDAwaitFuture set twice");
            } else {
                this.f91105a = t10;
                synchronized (this.f91108d) {
                    this.f91107c = true;
                    this.f91108d.notifyAll();
                }
            }
        } finally {
        }
    }

    synchronized void b(Throwable th2) {
        try {
            if (this.f91107c) {
                a0.i().n("LDAwaitFuture set twice");
            } else {
                this.f91106b = th2;
                synchronized (this.f91108d) {
                    this.f91107c = true;
                    this.f91108d.notifyAll();
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
        synchronized (this.f91108d) {
            while (!this.f91107c) {
                try {
                    this.f91108d.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (this.f91106b == null) {
            return this.f91105a;
        }
        throw new ExecutionException(this.f91106b);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f91107c;
    }

    W() {
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        long jNanoTime = System.nanoTime() + nanos;
        synchronized (this.f91108d) {
            while (true) {
                try {
                    boolean z10 = true;
                    boolean z11 = !this.f91107c;
                    if (nanos <= 0) {
                        z10 = false;
                    }
                    if (!z11 || !z10) {
                        break;
                    }
                    TimeUnit.NANOSECONDS.timedWait(this.f91108d, nanos);
                    nanos = jNanoTime - System.nanoTime();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (this.f91107c) {
            if (this.f91106b == null) {
                return this.f91105a;
            }
            throw new ExecutionException(this.f91106b);
        }
        throw new TimeoutException("LDAwaitFuture timed out awaiting completion");
    }
}
