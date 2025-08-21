package Xu;

import io.reactivex.t;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class b extends t {

    /* renamed from: e, reason: collision with root package name */
    static final C0906b f42673e;

    /* renamed from: f, reason: collision with root package name */
    static final h f42674f;

    /* renamed from: g, reason: collision with root package name */
    static final int f42675g = g(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: h, reason: collision with root package name */
    static final c f42676h;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f42677c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<C0906b> f42678d;

    static final class a extends t.c {

        /* renamed from: a, reason: collision with root package name */
        private final Mu.f f42679a;

        /* renamed from: b, reason: collision with root package name */
        private final Ju.a f42680b;

        /* renamed from: c, reason: collision with root package name */
        private final Mu.f f42681c;

        /* renamed from: d, reason: collision with root package name */
        private final c f42682d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f42683e;

        @Override // io.reactivex.t.c
        public Ju.b b(Runnable runnable) {
            return this.f42683e ? Mu.e.INSTANCE : this.f42682d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f42679a);
        }

        @Override // io.reactivex.t.c
        public Ju.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f42683e ? Mu.e.INSTANCE : this.f42682d.e(runnable, j10, timeUnit, this.f42680b);
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f42683e) {
                return;
            }
            this.f42683e = true;
            this.f42681c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f42683e;
        }

        a(c cVar) {
            this.f42682d = cVar;
            Mu.f fVar = new Mu.f();
            this.f42679a = fVar;
            Ju.a aVar = new Ju.a();
            this.f42680b = aVar;
            Mu.f fVar2 = new Mu.f();
            this.f42681c = fVar2;
            fVar2.b(fVar);
            fVar2.b(aVar);
        }
    }

    /* renamed from: Xu.b$b, reason: collision with other inner class name */
    static final class C0906b {

        /* renamed from: a, reason: collision with root package name */
        final int f42684a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f42685b;

        /* renamed from: c, reason: collision with root package name */
        long f42686c;

        public c a() {
            int i10 = this.f42684a;
            if (i10 == 0) {
                return b.f42676h;
            }
            c[] cVarArr = this.f42685b;
            long j10 = this.f42686c;
            this.f42686c = 1 + j10;
            return cVarArr[(int) (j10 % i10)];
        }

        public void b() {
            for (c cVar : this.f42685b) {
                cVar.dispose();
            }
        }

        C0906b(int i10, ThreadFactory threadFactory) {
            this.f42684a = i10;
            this.f42685b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f42685b[i11] = new c(threadFactory);
            }
        }
    }

    public b() {
        this(f42674f);
    }

    static final class c extends f {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public b(ThreadFactory threadFactory) {
        this.f42677c = threadFactory;
        this.f42678d = new AtomicReference<>(f42673e);
        h();
    }

    static int g(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new a(this.f42678d.get().a());
    }

    @Override // io.reactivex.t
    public Ju.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f42678d.get().a().f(runnable, j10, timeUnit);
    }

    @Override // io.reactivex.t
    public Ju.b f(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f42678d.get().a().g(runnable, j10, j11, timeUnit);
    }

    public void h() {
        C0906b c0906b = new C0906b(f42675g, this.f42677c);
        if (U.d.a(this.f42678d, f42673e, c0906b)) {
            return;
        }
        c0906b.b();
    }

    static {
        c cVar = new c(new h("RxComputationShutdown"));
        f42676h = cVar;
        cVar.dispose();
        h hVar = new h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f42674f = hVar;
        C0906b c0906b = new C0906b(0, hVar);
        f42673e = c0906b;
        c0906b.b();
    }
}
