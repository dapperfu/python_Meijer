package Xu;

import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class m extends t {

    /* renamed from: e, reason: collision with root package name */
    static final h f42729e;

    /* renamed from: f, reason: collision with root package name */
    static final ScheduledExecutorService f42730f;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f42731c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f42732d;

    static final class a extends t.c {

        /* renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f42733a;

        /* renamed from: b, reason: collision with root package name */
        final Ju.a f42734b = new Ju.a();

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f42735c;

        @Override // io.reactivex.t.c
        public Ju.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f42735c) {
                return Mu.e.INSTANCE;
            }
            k kVar = new k(C13558a.u(runnable), this.f42734b);
            this.f42734b.b(kVar);
            try {
                kVar.a(j10 <= 0 ? this.f42733a.submit((Callable) kVar) : this.f42733a.schedule((Callable) kVar, j10, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                C13558a.s(e10);
                return Mu.e.INSTANCE;
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f42735c) {
                return;
            }
            this.f42735c = true;
            this.f42734b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f42735c;
        }

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f42733a = scheduledExecutorService;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f42730f = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f42729e = new h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public m() {
        this(f42729e);
    }

    public m(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f42732d = atomicReference;
        this.f42731c = threadFactory;
        atomicReference.lazySet(g(threadFactory));
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new a(this.f42732d.get());
    }

    @Override // io.reactivex.t
    public Ju.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        j jVar = new j(C13558a.u(runnable));
        try {
            jVar.a(j10 <= 0 ? this.f42732d.get().submit(jVar) : this.f42732d.get().schedule(jVar, j10, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e10) {
            C13558a.s(e10);
            return Mu.e.INSTANCE;
        }
    }

    static ScheduledExecutorService g(ThreadFactory threadFactory) {
        return l.a(threadFactory);
    }

    @Override // io.reactivex.t
    public Ju.b f(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableU = C13558a.u(runnable);
        if (j11 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f42732d.get();
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
                C13558a.s(e10);
                return Mu.e.INSTANCE;
            }
        }
        i iVar = new i(runnableU);
        try {
            iVar.a(this.f42732d.get().scheduleAtFixedRate(iVar, j10, j11, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e11) {
            C13558a.s(e11);
            return Mu.e.INSTANCE;
        }
    }
}
