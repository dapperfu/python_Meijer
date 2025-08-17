package bv;

import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class f extends t.c implements Nu.b {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f60817a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f60818b;

    @Override // io.reactivex.t.c
    public Nu.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // io.reactivex.t.c
    public Nu.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f60818b ? Qu.e.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // Nu.b
    public void dispose() {
        if (this.f60818b) {
            return;
        }
        this.f60818b = true;
        this.f60817a.shutdownNow();
    }

    public Nu.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        j jVar = new j(C14313a.u(runnable));
        try {
            jVar.a(j10 <= 0 ? this.f60817a.submit(jVar) : this.f60817a.schedule(jVar, j10, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e10) {
            C14313a.s(e10);
            return Qu.e.INSTANCE;
        }
    }

    public void h() {
        if (this.f60818b) {
            return;
        }
        this.f60818b = true;
        this.f60817a.shutdown();
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f60818b;
    }

    public f(ThreadFactory threadFactory) {
        this.f60817a = l.a(threadFactory);
    }

    public k e(Runnable runnable, long j10, TimeUnit timeUnit, Qu.c cVar) {
        Future<?> futureSchedule;
        k kVar = new k(C14313a.u(runnable), cVar);
        if (cVar != null && !cVar.a(kVar)) {
            return kVar;
        }
        try {
            if (j10 <= 0) {
                futureSchedule = this.f60817a.submit((Callable) kVar);
            } else {
                futureSchedule = this.f60817a.schedule((Callable) kVar, j10, timeUnit);
            }
            kVar.a(futureSchedule);
            return kVar;
        } catch (RejectedExecutionException e10) {
            if (cVar != null) {
                cVar.b(kVar);
            }
            C14313a.s(e10);
            return kVar;
        }
    }

    public Nu.b g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableU = C14313a.u(runnable);
        if (j11 <= 0) {
            c cVar = new c(runnableU, this.f60817a);
            try {
                if (j10 <= 0) {
                    futureSchedule = this.f60817a.submit(cVar);
                } else {
                    futureSchedule = this.f60817a.schedule(cVar, j10, timeUnit);
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
            iVar.a(this.f60817a.scheduleAtFixedRate(iVar, j10, j11, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e11) {
            C14313a.s(e11);
            return Qu.e.INSTANCE;
        }
    }
}
