package Uu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class X0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38313b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f38314c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f38315d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f38316e;

    static final class a<T> extends c<T> {

        /* renamed from: g, reason: collision with root package name */
        final AtomicInteger f38317g;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38317g.incrementAndGet() == 2) {
                e();
                if (this.f38317g.decrementAndGet() == 0) {
                    this.f38318a.onComplete();
                }
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            super(sVar, j10, timeUnit, tVar);
            this.f38317g = new AtomicInteger(1);
        }

        @Override // Uu.X0.c
        void b() {
            e();
            if (this.f38317g.decrementAndGet() == 0) {
                this.f38318a.onComplete();
            }
        }
    }

    static final class b<T> extends c<T> {
        @Override // Uu.X0.c
        void b() {
            this.f38318a.onComplete();
        }

        b(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            super(sVar, j10, timeUnit, tVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            e();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38318a;

        /* renamed from: b, reason: collision with root package name */
        final long f38319b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f38320c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.t f38321d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Ju.b> f38322e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        Ju.b f38323f;

        abstract void b();

        void e() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f38318a.onNext(andSet);
            }
        }

        void a() {
            Mu.d.a(this.f38322e);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38323f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38323f, bVar)) {
                this.f38323f = bVar;
                this.f38318a.onSubscribe(this);
                io.reactivex.t tVar = this.f38321d;
                long j10 = this.f38319b;
                Mu.d.e(this.f38322e, tVar.f(this, j10, j10, this.f38320c));
            }
        }

        c(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f38318a = sVar;
            this.f38319b = j10;
            this.f38320c = timeUnit;
            this.f38321d = tVar;
        }

        @Override // Ju.b
        public void dispose() {
            a();
            this.f38323f.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            a();
            this.f38318a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        if (this.f38316e) {
            this.f38360a.subscribe(new a(fVar, this.f38313b, this.f38314c, this.f38315d));
        } else {
            this.f38360a.subscribe(new b(fVar, this.f38313b, this.f38314c, this.f38315d));
        }
    }

    public X0(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, boolean z10) {
        super(qVar);
        this.f38313b = j10;
        this.f38314c = timeUnit;
        this.f38315d = tVar;
        this.f38316e = z10;
    }
}
