package io.reactivex;

import gv.C14313a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    static boolean f138264a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: b, reason: collision with root package name */
    static final long f138265b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    static final class a implements Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f138266a;

        /* renamed from: b, reason: collision with root package name */
        final c f138267b;

        /* renamed from: c, reason: collision with root package name */
        Thread f138268c;

        @Override // Nu.b
        public void dispose() {
            if (this.f138268c == Thread.currentThread()) {
                c cVar = this.f138267b;
                if (cVar instanceof bv.f) {
                    ((bv.f) cVar).h();
                    return;
                }
            }
            this.f138267b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f138267b.isDisposed();
        }

        a(Runnable runnable, c cVar) {
            this.f138266a = runnable;
            this.f138267b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f138268c = Thread.currentThread();
            try {
                this.f138266a.run();
            } finally {
                dispose();
                this.f138268c = null;
            }
        }
    }

    static final class b implements Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f138269a;

        /* renamed from: b, reason: collision with root package name */
        final c f138270b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f138271c;

        @Override // Nu.b
        public void dispose() {
            this.f138271c = true;
            this.f138270b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f138271c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f138271c) {
                return;
            }
            try {
                this.f138269a.run();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f138270b.dispose();
                throw ev.j.d(th2);
            }
        }

        b(Runnable runnable, c cVar) {
            this.f138269a = runnable;
            this.f138270b = cVar;
        }
    }

    public static abstract class c implements Nu.b {

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final Runnable f138272a;

            /* renamed from: b, reason: collision with root package name */
            final Qu.h f138273b;

            /* renamed from: c, reason: collision with root package name */
            final long f138274c;

            /* renamed from: d, reason: collision with root package name */
            long f138275d;

            /* renamed from: e, reason: collision with root package name */
            long f138276e;

            /* renamed from: f, reason: collision with root package name */
            long f138277f;

            a(long j10, Runnable runnable, long j11, Qu.h hVar, long j12) {
                this.f138272a = runnable;
                this.f138273b = hVar;
                this.f138274c = j12;
                this.f138276e = j11;
                this.f138277f = j10;
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
                    java.lang.Runnable r0 = r12.f138272a
                    r0.run()
                    Qu.h r0 = r12.f138273b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L51
                    io.reactivex.t$c r0 = io.reactivex.t.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = io.reactivex.t.f138265b
                    long r6 = r2 + r4
                    long r8 = r12.f138276e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f138274c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f138277f
                    long r8 = r12.f138275d
                    long r8 = r8 + r6
                    r12.f138275d = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f138274c
                    long r8 = r2 + r4
                    long r10 = r12.f138275d
                    long r10 = r10 + r6
                    r12.f138275d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f138277f = r4
                    r4 = r8
                L43:
                    r12.f138276e = r2
                    long r4 = r4 - r2
                    Qu.h r0 = r12.f138273b
                    io.reactivex.t$c r2 = io.reactivex.t.c.this
                    Nu.b r1 = r2.c(r12, r4, r1)
                    r0.a(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.t.c.a.run():void");
            }
        }

        public abstract Nu.b c(Runnable runnable, long j10, TimeUnit timeUnit);

        public Nu.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public Nu.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            Qu.h hVar = new Qu.h();
            Qu.h hVar2 = new Qu.h(hVar);
            Runnable runnableU = C14313a.u(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            Nu.b bVarC = c(new a(jA + timeUnit.toNanos(j10), runnableU, jA, hVar2, nanos), j10, timeUnit);
            if (bVarC == Qu.e.INSTANCE) {
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
        return !f138264a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public Nu.b d(Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public long c(TimeUnit timeUnit) {
        return a(timeUnit);
    }

    public Nu.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarB = b();
        a aVar = new a(C14313a.u(runnable), cVarB);
        cVarB.c(aVar, j10, timeUnit);
        return aVar;
    }

    public Nu.b f(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarB = b();
        b bVar = new b(C14313a.u(runnable), cVarB);
        Nu.b bVarD = cVarB.d(bVar, j10, j11, timeUnit);
        if (bVarD == Qu.e.INSTANCE) {
            return bVarD;
        }
        return bVar;
    }
}
