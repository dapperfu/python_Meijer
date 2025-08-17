package Yu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class X0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f41088b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f41089c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f41090d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f41091e;

    static final class a<T> extends c<T> {

        /* renamed from: g, reason: collision with root package name */
        final AtomicInteger f41092g;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f41092g.incrementAndGet() == 2) {
                e();
                if (this.f41092g.decrementAndGet() == 0) {
                    this.f41093a.onComplete();
                }
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            super(sVar, j10, timeUnit, tVar);
            this.f41092g = new AtomicInteger(1);
        }

        @Override // Yu.X0.c
        void b() {
            e();
            if (this.f41092g.decrementAndGet() == 0) {
                this.f41093a.onComplete();
            }
        }
    }

    static final class b<T> extends c<T> {
        @Override // Yu.X0.c
        void b() {
            this.f41093a.onComplete();
        }

        b(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            super(sVar, j10, timeUnit, tVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            e();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41093a;

        /* renamed from: b, reason: collision with root package name */
        final long f41094b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f41095c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.t f41096d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Nu.b> f41097e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        Nu.b f41098f;

        abstract void b();

        void e() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f41093a.onNext(andSet);
            }
        }

        void a() {
            Qu.d.a(this.f41097e);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41098f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41098f, bVar)) {
                this.f41098f = bVar;
                this.f41093a.onSubscribe(this);
                io.reactivex.t tVar = this.f41096d;
                long j10 = this.f41094b;
                Qu.d.e(this.f41097e, tVar.f(this, j10, j10, this.f41095c));
            }
        }

        c(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f41093a = sVar;
            this.f41094b = j10;
            this.f41095c = timeUnit;
            this.f41096d = tVar;
        }

        @Override // Nu.b
        public void dispose() {
            a();
            this.f41098f.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            a();
            this.f41093a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        if (this.f41091e) {
            this.f41135a.subscribe(new a(fVar, this.f41088b, this.f41089c, this.f41090d));
        } else {
            this.f41135a.subscribe(new b(fVar, this.f41088b, this.f41089c, this.f41090d));
        }
    }

    public X0(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, boolean z10) {
        super(qVar);
        this.f41088b = j10;
        this.f41089c = timeUnit;
        this.f41090d = tVar;
        this.f41091e = z10;
    }
}
