package Xu;

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

/* loaded from: classes10.dex */
public final class d extends t {

    /* renamed from: e, reason: collision with root package name */
    static final h f42693e;

    /* renamed from: f, reason: collision with root package name */
    static final h f42694f;

    /* renamed from: i, reason: collision with root package name */
    static final c f42697i;

    /* renamed from: j, reason: collision with root package name */
    static boolean f42698j;

    /* renamed from: k, reason: collision with root package name */
    static final a f42699k;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f42700c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<a> f42701d;

    /* renamed from: h, reason: collision with root package name */
    private static final TimeUnit f42696h = TimeUnit.SECONDS;

    /* renamed from: g, reason: collision with root package name */
    private static final long f42695g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f42702a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f42703b;

        /* renamed from: c, reason: collision with root package name */
        final Ju.a f42704c;

        /* renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f42705d;

        /* renamed from: e, reason: collision with root package name */
        private final Future<?> f42706e;

        /* renamed from: f, reason: collision with root package name */
        private final ThreadFactory f42707f;

        void a() {
            if (this.f42703b.isEmpty()) {
                return;
            }
            long jE = e();
            Iterator<c> it = this.f42703b.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.i() > jE) {
                    return;
                }
                if (this.f42703b.remove(next)) {
                    this.f42704c.c(next);
                }
            }
        }

        c b() {
            if (this.f42704c.isDisposed()) {
                return d.f42697i;
            }
            while (!this.f42703b.isEmpty()) {
                c cVarPoll = this.f42703b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f42707f);
            this.f42704c.b(cVar);
            return cVar;
        }

        void g() {
            this.f42704c.dispose();
            Future<?> future = this.f42706e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f42705d;
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
            this.f42702a = j11;
            this.f42703b = new ConcurrentLinkedQueue<>();
            this.f42704c = new Ju.a();
            this.f42707f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, d.f42694f);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, j11, j11, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f42705d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f42706e = scheduledFutureScheduleWithFixedDelay;
        }

        long e() {
            return System.nanoTime();
        }

        void f(c cVar) {
            cVar.j(e() + this.f42702a);
            this.f42703b.offer(cVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    static final class b extends t.c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final a f42709b;

        /* renamed from: c, reason: collision with root package name */
        private final c f42710c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f42711d = new AtomicBoolean();

        /* renamed from: a, reason: collision with root package name */
        private final Ju.a f42708a = new Ju.a();

        @Override // io.reactivex.t.c
        public Ju.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f42708a.isDisposed() ? Mu.e.INSTANCE : this.f42710c.e(runnable, j10, timeUnit, this.f42708a);
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f42711d.compareAndSet(false, true)) {
                this.f42708a.dispose();
                if (d.f42698j) {
                    this.f42710c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f42709b.f(this.f42710c);
                }
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f42711d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42709b.f(this.f42710c);
        }

        b(a aVar) {
            this.f42709b = aVar;
            this.f42710c = aVar.b();
        }
    }

    static final class c extends f {

        /* renamed from: c, reason: collision with root package name */
        private long f42712c;

        public long i() {
            return this.f42712c;
        }

        public void j(long j10) {
            this.f42712c = j10;
        }

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f42712c = 0L;
        }
    }

    public d() {
        this(f42693e);
    }

    static {
        c cVar = new c(new h("RxCachedThreadSchedulerShutdown"));
        f42697i = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        h hVar = new h("RxCachedThreadScheduler", iMax);
        f42693e = hVar;
        f42694f = new h("RxCachedWorkerPoolEvictor", iMax);
        f42698j = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, hVar);
        f42699k = aVar;
        aVar.g();
    }

    public d(ThreadFactory threadFactory) {
        this.f42700c = threadFactory;
        this.f42701d = new AtomicReference<>(f42699k);
        g();
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new b(this.f42701d.get());
    }

    public void g() {
        a aVar = new a(f42695g, f42696h, this.f42700c);
        if (U.d.a(this.f42701d, f42699k, aVar)) {
            return;
        }
        aVar.g();
    }
}
