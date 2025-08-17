package bv;

import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class m extends t {

    /* renamed from: e, reason: collision with root package name */
    static final h f60831e;

    /* renamed from: f, reason: collision with root package name */
    static final ScheduledExecutorService f60832f;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f60833c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f60834d;

    static final class a extends t.c {

        /* renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f60835a;

        /* renamed from: b, reason: collision with root package name */
        final Nu.a f60836b = new Nu.a();

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f60837c;

        @Override // io.reactivex.t.c
        public Nu.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f60837c) {
                return Qu.e.INSTANCE;
            }
            k kVar = new k(C14313a.u(runnable), this.f60836b);
            this.f60836b.a(kVar);
            try {
                kVar.a(j10 <= 0 ? this.f60835a.submit((Callable) kVar) : this.f60835a.schedule((Callable) kVar, j10, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                C14313a.s(e10);
                return Qu.e.INSTANCE;
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f60837c) {
                return;
            }
            this.f60837c = true;
            this.f60836b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f60837c;
        }

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f60835a = scheduledExecutorService;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f60832f = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f60831e = new h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public m() {
        this(f60831e);
    }

    public m(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f60834d = atomicReference;
        this.f60833c = threadFactory;
        atomicReference.lazySet(g(threadFactory));
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new a(this.f60834d.get());
    }

    @Override // io.reactivex.t
    public Nu.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        j jVar = new j(C14313a.u(runnable));
        try {
            jVar.a(j10 <= 0 ? this.f60834d.get().submit(jVar) : this.f60834d.get().schedule(jVar, j10, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e10) {
            C14313a.s(e10);
            return Qu.e.INSTANCE;
        }
    }

    static ScheduledExecutorService g(ThreadFactory threadFactory) {
        return l.a(threadFactory);
    }

    @Override // io.reactivex.t
    public Nu.b f(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableU = C14313a.u(runnable);
        if (j11 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f60834d.get();
            c cVar = new c(runnableU, scheduledExecutorService);
            try {
                if (j10 <= 0) {
                    futureSchedule = scheduledExecutorService.submit(cVar);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(cVar, j10, timeUnit);
                }
                cVar.b(futureSchedule);
                return cVar;
            } catch (RejectedExecutionException e10) {
                C14313a.s(e10);
                return Qu.e.INSTANCE;
            }
        }
        i iVar = new i(runnableU);
        try {
            iVar.a(this.f60834d.get().scheduleAtFixedRate(iVar, j10, j11, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e11) {
            C14313a.s(e11);
            return Qu.e.INSTANCE;
        }
    }
}
