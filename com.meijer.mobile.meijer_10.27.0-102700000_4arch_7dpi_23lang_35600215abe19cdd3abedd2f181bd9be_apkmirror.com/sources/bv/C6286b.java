package bv;

import io.reactivex.t;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bv.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6286b extends t {

    /* renamed from: e, reason: collision with root package name */
    static final C1195b f60775e;

    /* renamed from: f, reason: collision with root package name */
    static final h f60776f;

    /* renamed from: g, reason: collision with root package name */
    static final int f60777g = g(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: h, reason: collision with root package name */
    static final c f60778h;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f60779c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<C1195b> f60780d;

    /* renamed from: bv.b$a */
    static final class a extends t.c {

        /* renamed from: a, reason: collision with root package name */
        private final Qu.f f60781a;

        /* renamed from: b, reason: collision with root package name */
        private final Nu.a f60782b;

        /* renamed from: c, reason: collision with root package name */
        private final Qu.f f60783c;

        /* renamed from: d, reason: collision with root package name */
        private final c f60784d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f60785e;

        @Override // io.reactivex.t.c
        public Nu.b b(Runnable runnable) {
            return this.f60785e ? Qu.e.INSTANCE : this.f60784d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f60781a);
        }

        @Override // io.reactivex.t.c
        public Nu.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f60785e ? Qu.e.INSTANCE : this.f60784d.e(runnable, j10, timeUnit, this.f60782b);
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f60785e) {
                return;
            }
            this.f60785e = true;
            this.f60783c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f60785e;
        }

        a(c cVar) {
            this.f60784d = cVar;
            Qu.f fVar = new Qu.f();
            this.f60781a = fVar;
            Nu.a aVar = new Nu.a();
            this.f60782b = aVar;
            Qu.f fVar2 = new Qu.f();
            this.f60783c = fVar2;
            fVar2.a(fVar);
            fVar2.a(aVar);
        }
    }

    /* renamed from: bv.b$b, reason: collision with other inner class name */
    static final class C1195b {

        /* renamed from: a, reason: collision with root package name */
        final int f60786a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f60787b;

        /* renamed from: c, reason: collision with root package name */
        long f60788c;

        public c a() {
            int i10 = this.f60786a;
            if (i10 == 0) {
                return C6286b.f60778h;
            }
            c[] cVarArr = this.f60787b;
            long j10 = this.f60788c;
            this.f60788c = 1 + j10;
            return cVarArr[(int) (j10 % i10)];
        }

        public void b() {
            for (c cVar : this.f60787b) {
                cVar.dispose();
            }
        }

        C1195b(int i10, ThreadFactory threadFactory) {
            this.f60786a = i10;
            this.f60787b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f60787b[i11] = new c(threadFactory);
            }
        }
    }

    public C6286b() {
        this(f60776f);
    }

    /* renamed from: bv.b$c */
    static final class c extends f {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public C6286b(ThreadFactory threadFactory) {
        this.f60779c = threadFactory;
        this.f60780d = new AtomicReference<>(f60775e);
        h();
    }

    static int g(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // io.reactivex.t
    public t.c b() {
        return new a(this.f60780d.get().a());
    }

    @Override // io.reactivex.t
    public Nu.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f60780d.get().a().f(runnable, j10, timeUnit);
    }

    @Override // io.reactivex.t
    public Nu.b f(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f60780d.get().a().g(runnable, j10, j11, timeUnit);
    }

    public void h() {
        C1195b c1195b = new C1195b(f60777g, this.f60779c);
        if (U.d.a(this.f60780d, f60775e, c1195b)) {
            return;
        }
        c1195b.b();
    }

    static {
        c cVar = new c(new h("RxComputationShutdown"));
        f60778h = cVar;
        cVar.dispose();
        h hVar = new h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f60776f = hVar;
        C1195b c1195b = new C1195b(0, hVar);
        f60775e = c1195b;
        c1195b.b();
    }
}
