package Uu;

import A0.c;
import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class A0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.j<? extends T> f37751b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37752a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Ju.b> f37753b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C0828a<T> f37754c = new C0828a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final av.c f37755d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        volatile Ou.e<T> f37756e;

        /* renamed from: f, reason: collision with root package name */
        T f37757f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f37758g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f37759h;

        /* renamed from: i, reason: collision with root package name */
        volatile int f37760i;

        /* renamed from: Uu.A0$a$a, reason: collision with other inner class name */
        static final class C0828a<T> extends AtomicReference<Ju.b> implements io.reactivex.i<T> {

            /* renamed from: a, reason: collision with root package name */
            final a<T> f37761a;

            @Override // io.reactivex.i
            public void onComplete() {
                this.f37761a.d();
            }

            @Override // io.reactivex.i
            public void onError(Throwable th2) {
                this.f37761a.e(th2);
            }

            @Override // io.reactivex.i
            public void onSuccess(T t10) {
                this.f37761a.f(t10);
            }

            C0828a(a<T> aVar) {
                this.f37761a = aVar;
            }

            @Override // io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        void d() {
            this.f37760i = 2;
            a();
        }

        @Override // Ju.b
        public void dispose() {
            this.f37758g = true;
            Mu.d.a(this.f37753b);
            Mu.d.a(this.f37754c);
            if (getAndIncrement() == 0) {
                this.f37756e = null;
                this.f37757f = null;
            }
        }

        void f(T t10) {
            if (compareAndSet(0, 1)) {
                this.f37752a.onNext(t10);
                this.f37760i = 2;
            } else {
                this.f37757f = t10;
                this.f37760i = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37759h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f37752a.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                c().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        void b() {
            io.reactivex.s<? super T> sVar = this.f37752a;
            int iAddAndGet = 1;
            while (!this.f37758g) {
                if (this.f37755d.get() != null) {
                    this.f37757f = null;
                    this.f37756e = null;
                    sVar.onError(this.f37755d.b());
                    return;
                }
                int i10 = this.f37760i;
                if (i10 == 1) {
                    T t10 = this.f37757f;
                    this.f37757f = null;
                    this.f37760i = 2;
                    sVar.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f37759h;
                Ou.e<T> eVar = this.f37756e;
                c.f fVarPoll = eVar != null ? eVar.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f37756e = null;
                    sVar.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    sVar.onNext(fVarPoll);
                }
            }
            this.f37757f = null;
            this.f37756e = null;
        }

        Ou.e<T> c() {
            Ou.e<T> eVar = this.f37756e;
            if (eVar != null) {
                return eVar;
            }
            Wu.c cVar = new Wu.c(io.reactivex.l.bufferSize());
            this.f37756e = cVar;
            return cVar;
        }

        void e(Throwable th2) {
            if (!this.f37755d.a(th2)) {
                C13558a.s(th2);
            } else {
                Mu.d.a(this.f37753b);
                a();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f37753b.get());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f37755d.a(th2)) {
                C13558a.s(th2);
            } else {
                Mu.d.a(this.f37754c);
                a();
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f37753b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f37752a = sVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f38360a.subscribe(aVar);
        this.f37751b.a(aVar.f37754c);
    }

    public A0(io.reactivex.l<T> lVar, io.reactivex.j<? extends T> jVar) {
        super(lVar);
        this.f37751b = jVar;
    }
}
