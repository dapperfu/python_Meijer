package Xu;

import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    private static final n f42736c = new n();

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f42737a;

        /* renamed from: b, reason: collision with root package name */
        private final c f42738b;

        /* renamed from: c, reason: collision with root package name */
        private final long f42739c;

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            if (this.f42738b.f42747d) {
                return;
            }
            long jA = this.f42738b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f42739c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    C13558a.s(e10);
                    return;
                }
            }
            if (this.f42738b.f42747d) {
                return;
            }
            this.f42737a.run();
        }

        a(Runnable runnable, c cVar, long j10) {
            this.f42737a = runnable;
            this.f42738b = cVar;
            this.f42739c = j10;
        }
    }

    static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f42740a;

        /* renamed from: b, reason: collision with root package name */
        final long f42741b;

        /* renamed from: c, reason: collision with root package name */
        final int f42742c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f42743d;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = Nu.b.b(this.f42741b, bVar.f42741b);
            return iB == 0 ? Nu.b.a(this.f42742c, bVar.f42742c) : iB;
        }

        b(Runnable runnable, Long l10, int i10) {
            this.f42740a = runnable;
            this.f42741b = l10.longValue();
            this.f42742c = i10;
        }
    }

    static final class c extends t.c implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue<b> f42744a = new PriorityBlockingQueue<>();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f42745b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f42746c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f42747d;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b f42748a;

            a(b bVar) {
                this.f42748a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f42748a.f42743d = true;
                c.this.f42744a.remove(this.f42748a);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f42747d = true;
        }

        @Override // io.reactivex.t.c
        public Ju.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.t.c
        public Ju.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        Ju.b e(Runnable runnable, long j10) {
            if (this.f42747d) {
                return Mu.e.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f42746c.incrementAndGet());
            this.f42744a.add(bVar);
            if (this.f42745b.getAndIncrement() != 0) {
                return Ju.c.c(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f42747d) {
                b bVarPoll = this.f42744a.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f42745b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return Mu.e.INSTANCE;
                    }
                } else if (!bVarPoll.f42743d) {
                    bVarPoll.f42740a.run();
                }
            }
            this.f42744a.clear();
            return Mu.e.INSTANCE;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f42747d;
        }

        c() {
        }
    }

    public static n g() {
        return f42736c;
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new c();
    }

    n() {
    }

    @Override // io.reactivex.t
    public Ju.b d(Runnable runnable) {
        C13558a.u(runnable).run();
        return Mu.e.INSTANCE;
    }

    @Override // io.reactivex.t
    public Ju.b e(Runnable runnable, long j10, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j10);
            C13558a.u(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            C13558a.s(e10);
        }
        return Mu.e.INSTANCE;
    }
}
