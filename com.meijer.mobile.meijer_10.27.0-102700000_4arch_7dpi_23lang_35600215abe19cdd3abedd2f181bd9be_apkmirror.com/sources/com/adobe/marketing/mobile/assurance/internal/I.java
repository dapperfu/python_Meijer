package com.adobe.marketing.mobile.assurance.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
abstract class I<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue<T> f62162a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f62163b;

    /* renamed from: c, reason: collision with root package name */
    private Future<?> f62164c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f62165d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f62166e = new Object();

    protected abstract boolean a();

    protected abstract void b(T t10) throws InterruptedException;

    protected abstract void e();

    boolean c(T t10) {
        boolean zOffer = this.f62162a.offer(t10);
        f();
        return zOffer;
    }

    protected void f() {
        Future<?> future;
        synchronized (this.f62166e) {
            try {
                if (this.f62165d && ((future = this.f62164c) == null || future.isDone())) {
                    this.f62164c = this.f62163b.submit(this);
                }
            } finally {
            }
        }
    }

    boolean g() {
        synchronized (this.f62166e) {
            try {
                if (this.f62165d) {
                    Q5.t.a("Assurance", "EventChunker", "EventQueueWorker is already running.", new Object[0]);
                    return false;
                }
                this.f62165d = true;
                e();
                f();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void h() {
        synchronized (this.f62166e) {
            try {
                Future<?> future = this.f62164c;
                if (future != null) {
                    future.cancel(true);
                    this.f62164c = null;
                }
                this.f62165d = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f62162a.clear();
    }

    I(ExecutorService executorService, LinkedBlockingQueue<T> linkedBlockingQueue) {
        this.f62162a = linkedBlockingQueue;
        this.f62163b = executorService;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!Thread.interrupted() && a() && this.f62162a.peek() != null) {
            try {
                b(this.f62162a.poll());
            } catch (InterruptedException e10) {
                Q5.t.b("Assurance", "EventChunker", "Background worker thread(InboundEventWorker) interrupted: " + e10.getLocalizedMessage(), new Object[0]);
                Thread.currentThread().interrupt();
            }
        }
        Q5.t.a("Assurance", "EventChunker", "No more items to process. Finishing current job : %s for %s", Thread.currentThread().toString(), getClass().getSimpleName());
    }
}
