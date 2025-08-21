package Uu;

import A0.c;
import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class B0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f37786b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37787a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Ju.b> f37788b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C0829a<T> f37789c = new C0829a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final av.c f37790d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        volatile Ou.e<T> f37791e;

        /* renamed from: f, reason: collision with root package name */
        T f37792f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f37793g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f37794h;

        /* renamed from: i, reason: collision with root package name */
        volatile int f37795i;

        /* renamed from: Uu.B0$a$a, reason: collision with other inner class name */
        static final class C0829a<T> extends AtomicReference<Ju.b> implements io.reactivex.w<T> {

            /* renamed from: a, reason: collision with root package name */
            final a<T> f37796a;

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f37796a.d(th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(T t10) {
                this.f37796a.e(t10);
            }

            C0829a(a<T> aVar) {
                this.f37796a = aVar;
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f37793g = true;
            Mu.d.a(this.f37788b);
            Mu.d.a(this.f37789c);
            if (getAndIncrement() == 0) {
                this.f37791e = null;
                this.f37792f = null;
            }
        }

        void e(T t10) {
            if (compareAndSet(0, 1)) {
                this.f37787a.onNext(t10);
                this.f37795i = 2;
            } else {
                this.f37792f = t10;
                this.f37795i = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37794h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f37787a.onNext(t10);
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
            io.reactivex.s<? super T> sVar = this.f37787a;
            int iAddAndGet = 1;
            while (!this.f37793g) {
                if (this.f37790d.get() != null) {
                    this.f37792f = null;
                    this.f37791e = null;
                    sVar.onError(this.f37790d.b());
                    return;
                }
                int i10 = this.f37795i;
                if (i10 == 1) {
                    T t10 = this.f37792f;
                    this.f37792f = null;
                    this.f37795i = 2;
                    sVar.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f37794h;
                Ou.e<T> eVar = this.f37791e;
                c.f fVarPoll = eVar != null ? eVar.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f37791e = null;
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
            this.f37792f = null;
            this.f37791e = null;
        }

        Ou.e<T> c() {
            Ou.e<T> eVar = this.f37791e;
            if (eVar != null) {
                return eVar;
            }
            Wu.c cVar = new Wu.c(io.reactivex.l.bufferSize());
            this.f37791e = cVar;
            return cVar;
        }

        void d(Throwable th2) {
            if (!this.f37790d.a(th2)) {
                C13558a.s(th2);
            } else {
                Mu.d.a(this.f37788b);
                a();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f37788b.get());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f37790d.a(th2)) {
                C13558a.s(th2);
            } else {
                Mu.d.a(this.f37789c);
                a();
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f37788b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f37787a = sVar;
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
        this.f37786b.a(aVar.f37789c);
    }

    public B0(io.reactivex.l<T> lVar, io.reactivex.y<? extends T> yVar) {
        super(lVar);
        this.f37786b = yVar;
    }
}
