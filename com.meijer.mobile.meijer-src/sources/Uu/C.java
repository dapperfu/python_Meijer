package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class C<T, U> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.q<U>> f37801b;

    static final class a<T, U> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37802a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<U>> f37803b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f37804c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Ju.b> f37805d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        volatile long f37806e;

        /* renamed from: f, reason: collision with root package name */
        boolean f37807f;

        /* renamed from: Uu.C$a$a, reason: collision with other inner class name */
        static final class C0830a<T, U> extends io.reactivex.observers.d<U> {

            /* renamed from: b, reason: collision with root package name */
            final a<T, U> f37808b;

            /* renamed from: c, reason: collision with root package name */
            final long f37809c;

            /* renamed from: d, reason: collision with root package name */
            final T f37810d;

            /* renamed from: e, reason: collision with root package name */
            boolean f37811e;

            /* renamed from: f, reason: collision with root package name */
            final AtomicBoolean f37812f = new AtomicBoolean();

            void c() {
                if (this.f37812f.compareAndSet(false, true)) {
                    this.f37808b.a(this.f37809c, this.f37810d);
                }
            }

            @Override // io.reactivex.s
            public void onComplete() {
                if (this.f37811e) {
                    return;
                }
                this.f37811e = true;
                c();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                if (this.f37811e) {
                    C13558a.s(th2);
                } else {
                    this.f37811e = true;
                    this.f37808b.onError(th2);
                }
            }

            @Override // io.reactivex.s
            public void onNext(U u10) {
                if (this.f37811e) {
                    return;
                }
                this.f37811e = true;
                dispose();
                c();
            }

            C0830a(a<T, U> aVar, long j10, T t10) {
                this.f37808b = aVar;
                this.f37809c = j10;
                this.f37810d = t10;
            }
        }

        void a(long j10, T t10) {
            if (j10 == this.f37806e) {
                this.f37802a.onNext(t10);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f37804c.dispose();
            Mu.d.a(this.f37805d);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37804c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37807f) {
                return;
            }
            this.f37807f = true;
            Ju.b bVar = this.f37805d.get();
            if (bVar != Mu.d.DISPOSED) {
                C0830a c0830a = (C0830a) bVar;
                if (c0830a != null) {
                    c0830a.c();
                }
                Mu.d.a(this.f37805d);
                this.f37802a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.a(this.f37805d);
            this.f37802a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f37807f) {
                return;
            }
            long j10 = this.f37806e + 1;
            this.f37806e = j10;
            Ju.b bVar = this.f37805d.get();
            if (bVar != null) {
                bVar.dispose();
            }
            try {
                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f37803b.apply(t10), "The ObservableSource supplied is null");
                C0830a c0830a = new C0830a(this, j10, t10);
                if (U.d.a(this.f37805d, bVar, c0830a)) {
                    qVar.subscribe(c0830a);
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                dispose();
                this.f37802a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37804c, bVar)) {
                this.f37804c = bVar;
                this.f37802a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
            this.f37802a = sVar;
            this.f37803b = oVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(new io.reactivex.observers.f(sVar), this.f37801b));
    }

    public C(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
        super(qVar);
        this.f37801b = oVar;
    }
}
