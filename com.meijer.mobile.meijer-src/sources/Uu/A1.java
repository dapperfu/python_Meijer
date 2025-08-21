package Uu;

import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class A1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f37762b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f37763c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f37764d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.q<? extends T> f37765e;

    static final class a<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37766a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Ju.b> f37767b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37766a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37766a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37766a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.e(this.f37767b, bVar);
        }

        a(io.reactivex.s<? super T> sVar, AtomicReference<Ju.b> atomicReference) {
            this.f37766a = sVar;
            this.f37767b = atomicReference;
        }
    }

    static final class b<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37768a;

        /* renamed from: b, reason: collision with root package name */
        final long f37769b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f37770c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f37771d;

        /* renamed from: e, reason: collision with root package name */
        final Mu.h f37772e = new Mu.h();

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f37773f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<Ju.b> f37774g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        io.reactivex.q<? extends T> f37775h;

        @Override // Uu.A1.d
        public void b(long j10) {
            if (this.f37773f.compareAndSet(j10, Long.MAX_VALUE)) {
                Mu.d.a(this.f37774g);
                io.reactivex.q<? extends T> qVar = this.f37775h;
                this.f37775h = null;
                qVar.subscribe(new a(this.f37768a, this));
                this.f37771d.dispose();
            }
        }

        void c(long j10) {
            this.f37772e.a(this.f37771d.c(new e(j10, this), this.f37769b, this.f37770c));
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f37774g);
            Mu.d.a(this);
            this.f37771d.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37773f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f37772e.dispose();
                this.f37768a.onComplete();
                this.f37771d.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37773f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C13558a.s(th2);
                return;
            }
            this.f37772e.dispose();
            this.f37768a.onError(th2);
            this.f37771d.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f37773f.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f37773f.compareAndSet(j10, j11)) {
                    this.f37772e.get().dispose();
                    this.f37768a.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f37774g, bVar);
        }

        b(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar, io.reactivex.q<? extends T> qVar) {
            this.f37768a = sVar;
            this.f37769b = j10;
            this.f37770c = timeUnit;
            this.f37771d = cVar;
            this.f37775h = qVar;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.s<T>, Ju.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37776a;

        /* renamed from: b, reason: collision with root package name */
        final long f37777b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f37778c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f37779d;

        /* renamed from: e, reason: collision with root package name */
        final Mu.h f37780e = new Mu.h();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Ju.b> f37781f = new AtomicReference<>();

        void c(long j10) {
            this.f37780e.a(this.f37779d.c(new e(j10, this), this.f37777b, this.f37778c));
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f37781f);
            this.f37779d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f37781f.get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f37781f, bVar);
        }

        c(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar) {
            this.f37776a = sVar;
            this.f37777b = j10;
            this.f37778c = timeUnit;
            this.f37779d = cVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.f37780e.get().dispose();
                    this.f37776a.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // Uu.A1.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                Mu.d.a(this.f37781f);
                this.f37776a.onError(new TimeoutException(av.j.c(this.f37777b, this.f37778c)));
                this.f37779d.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f37780e.dispose();
                this.f37776a.onComplete();
                this.f37779d.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f37780e.dispose();
                this.f37776a.onError(th2);
                this.f37779d.dispose();
                return;
            }
            C13558a.s(th2);
        }
    }

    interface d {
        void b(long j10);
    }

    static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final d f37782a;

        /* renamed from: b, reason: collision with root package name */
        final long f37783b;

        @Override // java.lang.Runnable
        public void run() {
            this.f37782a.b(this.f37783b);
        }

        e(long j10, d dVar) {
            this.f37783b = j10;
            this.f37782a = dVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        if (this.f37765e == null) {
            c cVar = new c(sVar, this.f37762b, this.f37763c, this.f37764d.b());
            sVar.onSubscribe(cVar);
            cVar.c(0L);
            this.f38360a.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f37762b, this.f37763c, this.f37764d.b(), this.f37765e);
        sVar.onSubscribe(bVar);
        bVar.c(0L);
        this.f38360a.subscribe(bVar);
    }

    public A1(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, io.reactivex.q<? extends T> qVar) {
        super(lVar);
        this.f37762b = j10;
        this.f37763c = timeUnit;
        this.f37764d = tVar;
        this.f37765e = qVar;
    }
}
