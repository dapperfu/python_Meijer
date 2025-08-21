package io.reactivex;

import cv.C13558a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    static boolean f138906a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: b, reason: collision with root package name */
    static final long f138907b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    static final class a implements Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f138908a;

        /* renamed from: b, reason: collision with root package name */
        final c f138909b;

        /* renamed from: c, reason: collision with root package name */
        Thread f138910c;

        @Override // Ju.b
        public void dispose() {
            if (this.f138910c == Thread.currentThread()) {
                c cVar = this.f138909b;
                if (cVar instanceof Xu.f) {
                    ((Xu.f) cVar).h();
                    return;
                }
            }
            this.f138909b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f138909b.isDisposed();
        }

        a(Runnable runnable, c cVar) {
            this.f138908a = runnable;
            this.f138909b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f138910c = Thread.currentThread();
            try {
                this.f138908a.run();
            } finally {
                dispose();
                this.f138910c = null;
            }
        }
    }

    static final class b implements Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f138911a;

        /* renamed from: b, reason: collision with root package name */
        final c f138912b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f138913c;

        @Override // Ju.b
        public void dispose() {
            this.f138913c = true;
            this.f138912b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f138913c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f138913c) {
                return;
            }
            try {
                this.f138911a.run();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f138912b.dispose();
                throw av.j.d(th2);
            }
        }

        b(Runnable runnable, c cVar) {
            this.f138911a = runnable;
            this.f138912b = cVar;
        }
    }

    public static abstract class c implements Ju.b {

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final Runnable f138914a;

            /* renamed from: b, reason: collision with root package name */
            final Mu.h f138915b;

            /* renamed from: c, reason: collision with root package name */
            final long f138916c;

            /* renamed from: d, reason: collision with root package name */
            long f138917d;

            /* renamed from: e, reason: collision with root package name */
            long f138918e;

            /* renamed from: f, reason: collision with root package name */
            long f138919f;

            a(long j10, Runnable runnable, long j11, Mu.h hVar, long j12) {
                this.f138914a = runnable;
                this.f138915b = hVar;
                this.f138916c = j12;
                this.f138918e = j11;
                this.f138919f = j10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f138914a
                    r0.run()
                    Mu.h r0 = r12.f138915b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L51
                    io.reactivex.t$c r0 = io.reactivex.t.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = io.reactivex.t.f138907b
                    long r6 = r2 + r4
                    long r8 = r12.f138918e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f138916c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f138919f
                    long r8 = r12.f138917d
                    long r8 = r8 + r6
                    r12.f138917d = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f138916c
                    long r8 = r2 + r4
                    long r10 = r12.f138917d
                    long r10 = r10 + r6
                    r12.f138917d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f138919f = r4
                    r4 = r8
                L43:
                    r12.f138918e = r2
                    long r4 = r4 - r2
                    Mu.h r0 = r12.f138915b
                    io.reactivex.t$c r2 = io.reactivex.t.c.this
                    Ju.b r1 = r2.c(r12, r4, r1)
                    r0.a(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.t.c.a.run():void");
            }
        }

        public abstract Ju.b c(Runnable runnable, long j10, TimeUnit timeUnit);

        public Ju.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public Ju.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            Mu.h hVar = new Mu.h();
            Mu.h hVar2 = new Mu.h(hVar);
            Runnable runnableU = C13558a.u(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            Ju.b bVarC = c(new a(jA + timeUnit.toNanos(j10), runnableU, jA, hVar2, nanos), j10, timeUnit);
            if (bVarC == Mu.e.INSTANCE) {
                return bVarC;
            }
            hVar.a(bVarC);
            return hVar2;
        }

        public long a(TimeUnit timeUnit) {
            return t.a(timeUnit);
        }
    }

    public abstract c b();

    static long a(TimeUnit timeUnit) {
        return !f138906a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public Ju.b d(Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public long c(TimeUnit timeUnit) {
        return a(timeUnit);
    }

    public Ju.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarB = b();
        a aVar = new a(C13558a.u(runnable), cVarB);
        cVarB.c(aVar, j10, timeUnit);
        return aVar;
    }

    public Ju.b f(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarB = b();
        b bVar = new b(C13558a.u(runnable), cVarB);
        Ju.b bVarD = cVarB.d(bVar, j10, j11, timeUnit);
        if (bVarD == Mu.e.INSTANCE) {
            return bVarD;
        }
        return bVar;
    }
}
