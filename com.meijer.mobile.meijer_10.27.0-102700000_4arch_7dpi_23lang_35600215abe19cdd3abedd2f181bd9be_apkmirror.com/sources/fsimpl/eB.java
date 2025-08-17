package fsimpl;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes14.dex */
abstract class eB extends PriorityBlockingQueue {

    /* renamed from: a, reason: collision with root package name */
    private AtomicLong f132063a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f132064b;

    eB(int i10, Comparator comparator) {
        super(i10, comparator);
        this.f132063a = new AtomicLong();
        this.f132064b = new AtomicInteger();
    }

    private void b(Object obj) {
        if (obj != null) {
            this.f132063a.addAndGet(-a(obj));
            this.f132064b.decrementAndGet();
        }
    }

    public int a() {
        return this.f132064b.get();
    }

    abstract long a(Object obj);

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj) {
        this.f132063a.addAndGet(a(obj));
        this.f132064b.incrementAndGet();
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
