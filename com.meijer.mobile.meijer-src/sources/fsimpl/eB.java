package fsimpl;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes15.dex */
abstract class eB extends PriorityBlockingQueue {

    /* renamed from: a, reason: collision with root package name */
    private AtomicLong f133313a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f133314b;

    eB(int i10, Comparator comparator) {
        super(i10, comparator);
        this.f133313a = new AtomicLong();
        this.f133314b = new AtomicInteger();
    }

    private void b(Object obj) {
        if (obj != null) {
            this.f133313a.addAndGet(-a(obj));
            this.f133314b.decrementAndGet();
        }
    }

    public int a() {
        return this.f133314b.get();
    }

    abstract long a(Object obj);

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj) {
        this.f133313a.addAndGet(a(obj));
        this.f133314b.incrementAndGet();
        return super.offer(obj);
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue
    public Object poll() {
        Object objPoll = super.poll();
        b(objPoll);
        return objPoll;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public Object poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        Object objPoll = super.poll(j10, timeUnit);
        b(objPoll);
        return objPoll;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public Object take() throws InterruptedException {
        Object objTake = super.take();
        b(objTake);
        return objTake;
    }
}
