package bv;

import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    private static final n f60838c = new n();

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f60839a;

        /* renamed from: b, reason: collision with root package name */
        private final c f60840b;

        /* renamed from: c, reason: collision with root package name */
        private final long f60841c;

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            if (this.f60840b.f60849d) {
                return;
            }
            long jA = this.f60840b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f60841c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    C14313a.s(e10);
                    return;
                }
            }
            if (this.f60840b.f60849d) {
                return;
            }
            this.f60839a.run();
        }

        a(Runnable runnable, c cVar, long j10) {
            this.f60839a = runnable;
            this.f60840b = cVar;
            this.f60841c = j10;
        }
    }

    static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f60842a;

        /* renamed from: b, reason: collision with root package name */
        final long f60843b;

        /* renamed from: c, reason: collision with root package name */
        final int f60844c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f60845d;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = Ru.b.b(this.f60843b, bVar.f60843b);
            return iB == 0 ? Ru.b.a(this.f60844c, bVar.f60844c) : iB;
        }

        b(Runnable runnable, Long l10, int i10) {
            this.f60842a = runnable;
            this.f60843b = l10.longValue();
            this.f60844c = i10;
        }
    }

    static final class c extends t.c implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue<b> f60846a = new PriorityBlockingQueue<>();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f60847b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f60848c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f60849d;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b f60850a;

            a(b bVar) {
                this.f60850a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f60850a.f60845d = true;
                c.this.f60846a.remove(this.f60850a);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f60849d = true;
        }

        @Override // io.reactivex.t.c
        public Nu.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.t.c
        public Nu.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        Nu.b e(Runnable runnable, long j10) {
            if (this.f60849d) {
                return Qu.e.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f60848c.incrementAndGet());
            this.f60846a.add(bVar);
            if (this.f60847b.getAndIncrement() != 0) {
                return Nu.c.c(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f60849d) {
                b bVarPoll = this.f60846a.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f60847b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return Qu.e.INSTANCE;
                    }
                } else if (!bVarPoll.f60845d) {
                    bVarPoll.f60842a.run();
                }
            }
            this.f60846a.clear();
            return Qu.e.INSTANCE;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f60849d;
        }

        c() {
        }
    }

    public static n g() {
        return f60838c;
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new c();
    }

    n() {
    }

    @Override // io.reactivex.t
    public Nu.b d(Runnable runnable) {
        C14313a.u(runnable).run();
        return Qu.e.INSTANCE;
    }

    @Override // io.reactivex.t
    public Nu.b e(Runnable runnable, long j10, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j10);
            C14313a.u(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            C14313a.s(e10);
        }
        return Qu.e.INSTANCE;
    }
}
