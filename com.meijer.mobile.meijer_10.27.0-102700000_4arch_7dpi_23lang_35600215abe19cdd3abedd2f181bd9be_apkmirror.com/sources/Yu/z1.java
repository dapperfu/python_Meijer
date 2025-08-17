package Yu;

import Yu.A1;
import gv.C14313a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class z1<T, U, V> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<U> f41797b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.q<V>> f41798c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41799d;

    static final class b<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41802a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<?>> f41803b;

        /* renamed from: c, reason: collision with root package name */
        final Qu.h f41804c = new Qu.h();

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f41805d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Nu.b> f41806e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        io.reactivex.q<? extends T> f41807f;

        @Override // Yu.z1.d
        public void a(long j10, Throwable th2) {
            if (!this.f41805d.compareAndSet(j10, Long.MAX_VALUE)) {
                C14313a.s(th2);
            } else {
                Qu.d.a(this);
                this.f41802a.onError(th2);
            }
        }

        @Override // Yu.A1.d
        public void b(long j10) {
            if (this.f41805d.compareAndSet(j10, Long.MAX_VALUE)) {
                Qu.d.a(this.f41806e);
                io.reactivex.q<? extends T> qVar = this.f41807f;
                this.f41807f = null;
                qVar.subscribe(new A1.a(this.f41802a, this));
            }
        }

        void c(io.reactivex.q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0L, this);
                if (this.f41804c.a(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41806e);
            Qu.d.a(this);
            this.f41804c.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41805d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f41804c.dispose();
                this.f41802a.onComplete();
                this.f41804c.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41805d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C14313a.s(th2);
                return;
            }
            this.f41804c.dispose();
            this.f41802a.onError(th2);
            this.f41804c.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f41805d.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f41805d.compareAndSet(j10, j11)) {
                    Nu.b bVar = this.f41804c.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f41802a.onNext(t10);
                    try {
                        io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41803b.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f41804c.a(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Ou.a.b(th2);
                        this.f41806e.get().dispose();
                        this.f41805d.getAndSet(Long.MAX_VALUE);
                        this.f41802a.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f41806e, bVar);
        }

        b(io.reactivex.s<? super T> sVar, Pu.o<? super T, ? extends io.reactivex.q<?>> oVar, io.reactivex.q<? extends T> qVar) {
            this.f41802a = sVar;
            this.f41803b = oVar;
            this.f41807f = qVar;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.s<T>, Nu.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41808a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<?>> f41809b;

        /* renamed from: c, reason: collision with root package name */
        final Qu.h f41810c = new Qu.h();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Nu.b> f41811d = new AtomicReference<>();

        void c(io.reactivex.q<?> qVar) {
            if (qVar != null) {
                a aVar = new a(0L, this);
                if (this.f41810c.a(aVar)) {
                    qVar.subscribe(aVar);
                }
            }
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41811d);
            this.f41810c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f41811d.get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f41811d, bVar);
        }

        c(io.reactivex.s<? super T> sVar, Pu.o<? super T, ? extends io.reactivex.q<?>> oVar) {
            this.f41808a = sVar;
            this.f41809b = oVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    Nu.b bVar = this.f41810c.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f41808a.onNext(t10);
                    try {
                        io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41809b.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f41810c.a(aVar)) {
                            qVar.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Ou.a.b(th2);
                        this.f41811d.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f41808a.onError(th2);
                    }
                }
            }
        }

        @Override // Yu.z1.d
        public void a(long j10, Throwable th2) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                Qu.d.a(this.f41811d);
                this.f41808a.onError(th2);
            } else {
                C14313a.s(th2);
            }
        }

        @Override // Yu.A1.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                Qu.d.a(this.f41811d);
                this.f41808a.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f41810c.dispose();
                this.f41808a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f41810c.dispose();
                this.f41808a.onError(th2);
            } else {
                C14313a.s(th2);
            }
        }
    }

    interface d extends A1.d {
        void a(long j10, Throwable th2);
    }

    static final class a extends AtomicReference<Nu.b> implements io.reactivex.s<Object>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final d f41800a;

        /* renamed from: b, reason: collision with root package name */
        final long f41801b;

        a(long j10, d dVar) {
            this.f41801b = j10;
            this.f41800a = dVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Object obj = get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f41800a.b(this.f41801b);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Object obj = get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f41800a.a(this.f41801b, th2);
            } else {
                C14313a.s(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            Nu.b bVar = (Nu.b) get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar != dVar) {
                bVar.dispose();
                lazySet(dVar);
                this.f41800a.b(this.f41801b);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        if (this.f41799d == null) {
            c cVar = new c(sVar, this.f41798c);
            sVar.onSubscribe(cVar);
            cVar.c(this.f41797b);
            this.f41135a.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f41798c, this.f41799d);
        sVar.onSubscribe(bVar);
        bVar.c(this.f41797b);
        this.f41135a.subscribe(bVar);
    }

    public z1(io.reactivex.l<T> lVar, io.reactivex.q<U> qVar, Pu.o<? super T, ? extends io.reactivex.q<V>> oVar, io.reactivex.q<? extends T> qVar2) {
        super(lVar);
        this.f41797b = qVar;
        this.f41798c = oVar;
        this.f41799d = qVar2;
    }
}
