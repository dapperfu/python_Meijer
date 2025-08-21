package Xu;

import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class f extends t.c implements Ju.b {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f42715a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f42716b;

    @Override // io.reactivex.t.c
    public Ju.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // io.reactivex.t.c
    public Ju.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f42716b ? Mu.e.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // Ju.b
    public void dispose() {
        if (this.f42716b) {
            return;
        }
        this.f42716b = true;
        this.f42715a.shutdownNow();
    }

    public Ju.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        j jVar = new j(C13558a.u(runnable));
        try {
            jVar.a(j10 <= 0 ? this.f42715a.submit(jVar) : this.f42715a.schedule(jVar, j10, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e10) {
            C13558a.s(e10);
            return Mu.e.INSTANCE;
        }
    }

    public void h() {
        if (this.f42716b) {
            return;
        }
        this.f42716b = true;
        this.f42715a.shutdown();
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f42716b;
    }

    public f(ThreadFactory threadFactory) {
        this.f42715a = l.a(threadFactory);
    }

    public k e(Runnable runnable, long j10, TimeUnit timeUnit, Mu.c cVar) {
        Future<?> futureSchedule;
        k kVar = new k(C13558a.u(runnable), cVar);
        if (cVar != null && !cVar.b(kVar)) {
            return kVar;
        }
        try {
            if (j10 <= 0) {
                futureSchedule = this.f42715a.submit((Callable) kVar);
            } else {
                futureSchedule = this.f42715a.schedule((Callable) kVar, j10, timeUnit);
            }
            kVar.a(futureSchedule);
            return kVar;
        } catch (RejectedExecutionException e10) {
            if (cVar != null) {
                cVar.c(kVar);
            }
            C13558a.s(e10);
            return kVar;
        }
    }

    public Ju.b g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableU = C13558a.u(runnable);
        if (j11 <= 0) {
            c cVar = new c(runnableU, this.f42715a);
            try {
                if (j10 <= 0) {
                    futureSchedule = this.f42715a.submit(cVar);
                } else {
                    futureSchedule = this.f42715a.schedule(cVar, j10, timeUnit);
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
            iVar.a(this.f42715a.scheduleAtFixedRate(iVar, j10, j11, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e11) {
            C13558a.s(e11);
            return Mu.e.INSTANCE;
        }
    }
}
