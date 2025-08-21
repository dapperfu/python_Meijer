package Uu;

import Uu.A1;
import cv.C13558a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class z1<T, U, V> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<U> f39022b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.q<V>> f39023c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.q<? extends T> f39024d;

    static final class b<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f39027a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<?>> f39028b;

        /* renamed from: c, reason: collision with root package name */
        final Mu.h f39029c = new Mu.h();

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f39030d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Ju.b> f39031e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        io.reactivex.q<? extends T> f39032f;

        @Override // Uu.z1.d
        public void a(long j10, Throwable th2) {
            if (!this.f39030d.compareAndSet(j10, Long.MAX_VALUE)) {
                C13558a.s(th2);
            } else {
                Mu.d.a(this);
                this.f39027a.onError(th2);
            }
        }

        @Override // Uu.A1.d
        public void b(long j10) {
            if (this.f39030d.compareAndSet(j10, Long.MAX_VALUE)) {
                Mu.d.a(this.f39031e);
                io.reactivex.q<? extends T> qVar = this.f39032f;
                this.f39032f = null;
                qVar.subscribe(new A1.a(this.f39027a, this));
            }
        }

        void c(io.reactivex.q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0L, this);
                if (this.f39029c.a(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f39031e);
            Mu.d.a(this);
            this.f39029c.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f39030d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39029c.dispose();
                this.f39027a.onComplete();
                this.f39029c.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f39030d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C13558a.s(th2);
                return;
            }
            this.f39029c.dispose();
            this.f39027a.onError(th2);
            this.f39029c.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f39030d.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f39030d.compareAndSet(j10, j11)) {
                    Ju.b bVar = this.f39029c.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f39027a.onNext(t10);
                    try {
                        io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f39028b.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f39029c.a(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Ku.a.b(th2);
                        this.f39031e.get().dispose();
                        this.f39030d.getAndSet(Long.MAX_VALUE);
                        this.f39027a.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f39031e, bVar);
        }

        b(io.reactivex.s<? super T> sVar, Lu.o<? super T, ? extends io.reactivex.q<?>> oVar, io.reactivex.q<? extends T> qVar) {
            this.f39027a = sVar;
            this.f39028b = oVar;
            this.f39032f = qVar;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.s<T>, Ju.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f39033a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<?>> f39034b;

        /* renamed from: c, reason: collision with root package name */
        final Mu.h f39035c = new Mu.h();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Ju.b> f39036d = new AtomicReference<>();

        void c(io.reactivex.q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0L, this);
                if (this.f39035c.a(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f39036d);
            this.f39035c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f39036d.get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f39036d, bVar);
        }

        c(io.reactivex.s<? super T> sVar, Lu.o<? super T, ? extends io.reactivex.q<?>> oVar) {
            this.f39033a = sVar;
            this.f39034b = oVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    Ju.b bVar = this.f39035c.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f39033a.onNext(t10);
                    try {
                        io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f39034b.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f39035c.a(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Ku.a.b(th2);
                        this.f39036d.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f39033a.onError(th2);
                    }
                }
            }
        }

        @Override // Uu.z1.d
        public void a(long j10, Throwable th2) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                Mu.d.a(this.f39036d);
                this.f39033a.onError(th2);
            } else {
                C13558a.s(th2);
            }
        }

        @Override // Uu.A1.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                Mu.d.a(this.f39036d);
                this.f39033a.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39035c.dispose();
                this.f39033a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f39035c.dispose();
                this.f39033a.onError(th2);
            } else {
                C13558a.s(th2);
            }
        }
    }

    interface d extends A1.d {
        void a(long j10, Throwable th2);
    }

    static final class a extends AtomicReference<Ju.b> implements io.reactivex.s<Object>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final d f39025a;

        /* renamed from: b, reason: collision with root package name */
        final long f39026b;

        a(long j10, d dVar) {
            this.f39026b = j10;
            this.f39025a = dVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Object obj = get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f39025a.b(this.f39026b);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Object obj = get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f39025a.a(this.f39026b, th2);
            } else {
                C13558a.s(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            Ju.b bVar = (Ju.b) get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar != dVar) {
                bVar.dispose();
                lazySet(dVar);
                this.f39025a.b(this.f39026b);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        if (this.f39024d == null) {
            c cVar = new c(sVar, this.f39023c);
            sVar.onSubscribe(cVar);
            cVar.c(this.f39022b);
            this.f38360a.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f39023c, this.f39024d);
        sVar.onSubscribe(bVar);
        bVar.c(this.f39022b);
        this.f38360a.subscribe(bVar);
    }

    public z1(io.reactivex.l<T> lVar, io.reactivex.q<U> qVar, Lu.o<? super T, ? extends io.reactivex.q<V>> oVar, io.reactivex.q<? extends T> qVar2) {
        super(lVar);
        this.f39022b = qVar;
        this.f39023c = oVar;
        this.f39024d = qVar2;
    }
}
