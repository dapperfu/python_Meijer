package bv;

import io.reactivex.t;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class d extends t {

    /* renamed from: e, reason: collision with root package name */
    static final h f60795e;

    /* renamed from: f, reason: collision with root package name */
    static final h f60796f;

    /* renamed from: i, reason: collision with root package name */
    static final c f60799i;

    /* renamed from: j, reason: collision with root package name */
    static boolean f60800j;

    /* renamed from: k, reason: collision with root package name */
    static final a f60801k;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f60802c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<a> f60803d;

    /* renamed from: h, reason: collision with root package name */
    private static final TimeUnit f60798h = TimeUnit.SECONDS;

    /* renamed from: g, reason: collision with root package name */
    private static final long f60797g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f60804a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f60805b;

        /* renamed from: c, reason: collision with root package name */
        final Nu.a f60806c;

        /* renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f60807d;

        /* renamed from: e, reason: collision with root package name */
        private final Future<?> f60808e;

        /* renamed from: f, reason: collision with root package name */
        private final ThreadFactory f60809f;

        void a() {
            if (this.f60805b.isEmpty()) {
                return;
            }
            long jE = e();
            Iterator<c> it = this.f60805b.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.i() > jE) {
                    return;
                }
                if (this.f60805b.remove(next)) {
                    this.f60806c.b(next);
                }
            }
        }

        c b() {
            if (this.f60806c.isDisposed()) {
                return d.f60799i;
            }
            while (!this.f60805b.isEmpty()) {
                c cVarPoll = this.f60805b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f60809f);
            this.f60806c.a(cVar);
            return cVar;
        }

        void g() {
            this.f60806c.dispose();
            Future<?> future = this.f60808e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f60807d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long nanos;
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            if (timeUnit != null) {
                nanos = timeUnit.toNanos(j10);
            } else {
                nanos = 0;
            }
            long j11 = nanos;
            this.f60804a = j11;
            this.f60805b = new ConcurrentLinkedQueue<>();
            this.f60806c = new Nu.a();
            this.f60809f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, d.f60796f);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, j11, j11, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f60807d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f60808e = scheduledFutureScheduleWithFixedDelay;
        }

        long e() {
            return System.nanoTime();
        }

        void f(c cVar) {
            cVar.j(e() + this.f60804a);
            this.f60805b.offer(cVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    static final class b extends t.c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final a f60811b;

        /* renamed from: c, reason: collision with root package name */
        private final c f60812c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f60813d = new AtomicBoolean();

        /* renamed from: a, reason: collision with root package name */
        private final Nu.a f60810a = new Nu.a();

        @Override // io.reactivex.t.c
        public Nu.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f60810a.isDisposed() ? Qu.e.INSTANCE : this.f60812c.e(runnable, j10, timeUnit, this.f60810a);
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f60813d.compareAndSet(false, true)) {
                this.f60810a.dispose();
                if (d.f60800j) {
                    this.f60812c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f60811b.f(this.f60812c);
                }
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f60813d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60811b.f(this.f60812c);
        }

        b(a aVar) {
            this.f60811b = aVar;
            this.f60812c = aVar.b();
        }
    }

    static final class c extends f {

        /* renamed from: c, reason: collision with root package name */
        private long f60814c;

        public long i() {
            return this.f60814c;
        }

        public void j(long j10) {
            this.f60814c = j10;
        }

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f60814c = 0L;
        }
    }

    public d() {
        this(f60795e);
    }

    static {
        c cVar = new c(new h("RxCachedThreadSchedulerShutdown"));
        f60799i = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        h hVar = new h("RxCachedThreadScheduler", iMax);
        f60795e = hVar;
        f60796f = new h("RxCachedWorkerPoolEvictor", iMax);
        f60800j = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, hVar);
        f60801k = aVar;
        aVar.g();
    }

    public d(ThreadFactory threadFactory) {
        this.f60802c = threadFactory;
        this.f60803d = new AtomicReference<>(f60801k);
        g();
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new b(this.f60803d.get());
    }

    public void g() {
        a aVar = new a(f60797g, f60798h, this.f60802c);
        if (U.d.a(this.f60803d, f60801k, aVar)) {
            return;
        }
        aVar.g();
    }
}
