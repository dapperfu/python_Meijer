package com.adobe.marketing.mobile.assurance.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
abstract class I<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue<T> f63001a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f63002b;

    /* renamed from: c, reason: collision with root package name */
    private Future<?> f63003c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f63004d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f63005e = new Object();

    protected abstract boolean a();

    protected abstract void b(T t10) throws InterruptedException;

    protected abstract void e();

    boolean c(T t10) {
        boolean zOffer = this.f63001a.offer(t10);
        f();
        return zOffer;
    }

    protected void f() {
        Future<?> future;
        synchronized (this.f63005e) {
            try {
                if (this.f63004d && ((future = this.f63003c) == null || future.isDone())) {
                    this.f63003c = this.f63002b.submit(this);
                }
            } finally {
            }
        }
    }

    boolean g() {
        synchronized (this.f63005e) {
            try {
                if (this.f63004d) {
                    R5.t.a("Assurance", "EventChunker", "EventQueueWorker is already running.", new Object[0]);
                    return false;
                }
                this.f63004d = true;
                e();
                f();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void h() {
        synchronized (this.f63005e) {
            try {
                Future<?> future = this.f63003c;
                if (future != null) {
                    future.cancel(true);
                    this.f63003c = null;
                }
                this.f63004d = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f63001a.clear();
    }

    I(ExecutorService executorService, LinkedBlockingQueue<T> linkedBlockingQueue) {
        this.f63001a = linkedBlockingQueue;
        this.f63002b = executorService;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!Thread.interrupted() && a() && this.f63001a.peek() != null) {
            try {
                b(this.f63001a.poll());
            } catch (InterruptedException e10) {
                R5.t.b("Assurance", "EventChunker", "Background worker thread(InboundEventWorker) interrupted: " + e10.getLocalizedMessage(), new Object[0]);
                Thread.currentThread().interrupt();
            }
        }
        R5.t.a("Assurance", "EventChunker", "No more items to process. Finishing current job : %s for %s", Thread.currentThread().toString(), getClass().getSimpleName());
    }
}
