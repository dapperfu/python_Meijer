package Uu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class Y0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<?> f38335b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f38336c;

    static final class a<T> extends c<T> {

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f38337e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f38338f;

        @Override // Uu.Y0.c
        void b() {
            this.f38338f = true;
            if (this.f38337e.getAndIncrement() == 0) {
                c();
                this.f38339a.onComplete();
            }
        }

        @Override // Uu.Y0.c
        void e() {
            if (this.f38337e.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f38338f;
                    c();
                    if (z10) {
                        this.f38339a.onComplete();
                        return;
                    }
                } while (this.f38337e.decrementAndGet() != 0);
            }
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.q<?> qVar) {
            super(sVar, qVar);
            this.f38337e = new AtomicInteger();
        }
    }

    static final class b<T> extends c<T> {
        @Override // Uu.Y0.c
        void b() {
            this.f38339a.onComplete();
        }

        b(io.reactivex.s<? super T> sVar, io.reactivex.q<?> qVar) {
            super(sVar, qVar);
        }

        @Override // Uu.Y0.c
        void e() {
            c();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38339a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.q<?> f38340b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<Ju.b> f38341c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38342d;

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f38339a.onNext(andSet);
            }
        }

        abstract void e();

        public void a() {
            this.f38342d.dispose();
            b();
        }

        public void d(Throwable th2) {
            this.f38342d.dispose();
            this.f38339a.onError(th2);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38341c);
            this.f38342d.dispose();
        }

        boolean f(Ju.b bVar) {
            return Mu.d.o(this.f38341c, bVar);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38341c.get() == Mu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Mu.d.a(this.f38341c);
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.a(this.f38341c);
            this.f38339a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38342d, bVar)) {
                this.f38342d = bVar;
                this.f38339a.onSubscribe(this);
                if (this.f38341c.get() == null) {
                    this.f38340b.subscribe(new d(this));
                }
            }
        }

        c(io.reactivex.s<? super T> sVar, io.reactivex.q<?> qVar) {
            this.f38339a = sVar;
            this.f38340b = qVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    static final class d<T> implements io.reactivex.s<Object> {

        /* renamed from: a, reason: collision with root package name */
        final c<T> f38343a;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38343a.a();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38343a.d(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f38343a.e();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38343a.f(bVar);
        }

        d(c<T> cVar) {
            this.f38343a = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        if (this.f38336c) {
            this.f38360a.subscribe(new a(fVar, this.f38335b));
        } else {
            this.f38360a.subscribe(new b(fVar, this.f38335b));
        }
    }

    public Y0(io.reactivex.q<T> qVar, io.reactivex.q<?> qVar2, boolean z10) {
        super(qVar);
        this.f38335b = qVar2;
        this.f38336c = z10;
    }
}
