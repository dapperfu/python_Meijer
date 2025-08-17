package Yu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class Y0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<?> f41110b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f41111c;

    static final class a<T> extends c<T> {

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f41112e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f41113f;

        @Override // Yu.Y0.c
        void b() {
            this.f41113f = true;
            if (this.f41112e.getAndIncrement() == 0) {
                c();
                this.f41114a.onComplete();
            }
        }

        @Override // Yu.Y0.c
        void e() {
            if (this.f41112e.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f41113f;
                    c();
                    if (z10) {
                        this.f41114a.onComplete();
                        return;
                    }
                } while (this.f41112e.decrementAndGet() != 0);
            }
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.q<?> qVar) {
            super(sVar, qVar);
            this.f41112e = new AtomicInteger();
        }
    }

    static final class b<T> extends c<T> {
        @Override // Yu.Y0.c
        void b() {
            this.f41114a.onComplete();
        }

        b(io.reactivex.s<? super T> sVar, io.reactivex.q<?> qVar) {
            super(sVar, qVar);
        }

        @Override // Yu.Y0.c
        void e() {
            c();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41114a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.q<?> f41115b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<Nu.b> f41116c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        Nu.b f41117d;

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f41114a.onNext(andSet);
            }
        }

        abstract void e();

        public void a() {
            this.f41117d.dispose();
            b();
        }

        public void d(Throwable th2) {
            this.f41117d.dispose();
            this.f41114a.onError(th2);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41116c);
            this.f41117d.dispose();
        }

        boolean f(Nu.b bVar) {
            return Qu.d.o(this.f41116c, bVar);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41116c.get() == Qu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Qu.d.a(this.f41116c);
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.a(this.f41116c);
            this.f41114a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41117d, bVar)) {
                this.f41117d = bVar;
                this.f41114a.onSubscribe(this);
                if (this.f41116c.get() == null) {
                    this.f41115b.subscribe(new d(this));
                }
            }
        }

        c(io.reactivex.s<? super T> sVar, io.reactivex.q<?> qVar) {
            this.f41114a = sVar;
            this.f41115b = qVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    static final class d<T> implements io.reactivex.s<Object> {

        /* renamed from: a, reason: collision with root package name */
        final c<T> f41118a;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41118a.a();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41118a.d(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f41118a.e();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41118a.f(bVar);
        }

        d(c<T> cVar) {
            this.f41118a = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        if (this.f41111c) {
            this.f41135a.subscribe(new a(fVar, this.f41110b));
        } else {
            this.f41135a.subscribe(new b(fVar, this.f41110b));
        }
    }

    public Y0(io.reactivex.q<T> qVar, io.reactivex.q<?> qVar2, boolean z10) {
        super(qVar);
        this.f41110b = qVar2;
        this.f41111c = z10;
    }
}
