package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC11414a;
import com.google.common.util.concurrent.i;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class u {

    class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f88947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC11414a f88948b;

        a(Executor executor, AbstractC11414a abstractC11414a) {
            this.f88947a = executor;
            this.f88948b = abstractC11414a;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f88947a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.f88948b.setException(e10);
            }
        }
    }

    private static class b extends AbstractC11415b {

        /* renamed from: a, reason: collision with root package name */
        private final ExecutorService f88949a;

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f88949a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f88949a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f88949a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f88949a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f88949a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f88949a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f88949a + "]";
        }

        b(ExecutorService executorService) {
            this.f88949a = (ExecutorService) De.p.q(executorService);
        }
    }

    private static final class c extends b implements t {

        /* renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f88950b;

        private static final class a<V> extends i.a<V> implements r<V> {

            /* renamed from: b, reason: collision with root package name */
            private final ScheduledFuture<?> f88951b;

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f88951b.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f88951b.compareTo(delayed);
            }

            public a(q<V> qVar, ScheduledFuture<?> scheduledFuture) {
                super(qVar);
                this.f88951b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.h, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f88951b.cancel(z10);
                }
                return zCancel;
            }
        }

        private static final class b extends AbstractC11414a.j<Void> implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Runnable f88952a;

            @Override // com.google.common.util.concurrent.AbstractC11414a
            protected String pendingToString() {
                return "task=[" + this.f88952a + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f88952a.run();
                } catch (Throwable th2) {
                    setException(th2);
                    throw th2;
                }
            }

            public b(Runnable runnable) {
                this.f88952a = (Runnable) De.p.q(runnable);
            }
        }

        @Override // com.google.common.util.concurrent.t, java.util.concurrent.ScheduledExecutorService
        public r<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f88950b.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // com.google.common.util.concurrent.t, java.util.concurrent.ScheduledExecutorService
        public r<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f88950b.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f88950b = (ScheduledExecutorService) De.p.q(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.t, java.util.concurrent.ScheduledExecutorService
        public r<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            B bD = B.d(runnable, null);
            return new a(bD, this.f88950b.schedule(bD, j10, timeUnit));
        }

        @Override // com.google.common.util.concurrent.t, java.util.concurrent.ScheduledExecutorService
        public <V> r<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            B bE = B.e(callable);
            return new a(bE, this.f88950b.schedule(bE, j10, timeUnit));
        }
    }

    public static Executor a() {
        return e.INSTANCE;
    }

    public static t b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof t ? (t) scheduledExecutorService : new c(scheduledExecutorService);
    }

    public static Executor c(Executor executor) {
        return new y(executor);
    }

    static Executor d(Executor executor, AbstractC11414a<?> abstractC11414a) {
        De.p.q(executor);
        De.p.q(abstractC11414a);
        if (executor == a()) {
            return executor;
        }
        return new a(executor, abstractC11414a);
    }
}
