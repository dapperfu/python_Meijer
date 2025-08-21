package Nb;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class l<V> implements Future<V> {

    /* renamed from: a, reason: collision with root package name */
    private V f20778a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20779b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20780c;

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z10) {
        if (this.f20779b) {
            return false;
        }
        this.f20780c = true;
        notifyAll();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final synchronized V get() throws InterruptedException {
        boolean z10;
        while (true) {
            try {
                z10 = this.f20779b;
                if (z10 || this.f20780c) {
                    break;
                }
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return this.f20778a;
        }
        if (this.f20780c) {
            throw new CancellationException();
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f20780c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.f20779b;
    }

    @Override // java.util.concurrent.Future
    public final synchronized V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.MICROSECONDS.convert(j10, timeUnit);
            while (!this.f20779b && !this.f20780c && System.currentTimeMillis() < jCurrentTimeMillis) {
                wait(Math.max(1L, jCurrentTimeMillis - System.currentTimeMillis()));
            }
            if (this.f20779b) {
            } else {
                if (this.f20780c) {
                    throw new CancellationException();
                }
                throw new TimeoutException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20778a;
    }
}
