package Yu;

import A0.c;
import av.C6159c;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class A0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.j<? extends T> f40526b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40527a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Nu.b> f40528b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C0871a<T> f40529c = new C0871a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final ev.c f40530d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        volatile Su.e<T> f40531e;

        /* renamed from: f, reason: collision with root package name */
        T f40532f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f40533g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f40534h;

        /* renamed from: i, reason: collision with root package name */
        volatile int f40535i;

        /* renamed from: Yu.A0$a$a, reason: collision with other inner class name */
        static final class C0871a<T> extends AtomicReference<Nu.b> implements io.reactivex.i<T> {

            /* renamed from: a, reason: collision with root package name */
            final a<T> f40536a;

            @Override // io.reactivex.i
            public void onComplete() {
                this.f40536a.d();
            }

            @Override // io.reactivex.i
            public void onError(Throwable th2) {
                this.f40536a.e(th2);
            }

            @Override // io.reactivex.i
            public void onSuccess(T t10) {
                this.f40536a.f(t10);
            }

            C0871a(a<T> aVar) {
                this.f40536a = aVar;
            }

            @Override // io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        void d() {
            this.f40535i = 2;
            a();
        }

        @Override // Nu.b
        public void dispose() {
            this.f40533g = true;
            Qu.d.a(this.f40528b);
            Qu.d.a(this.f40529c);
            if (getAndIncrement() == 0) {
                this.f40531e = null;
                this.f40532f = null;
            }
        }

        void f(T t10) {
            if (compareAndSet(0, 1)) {
                this.f40527a.onNext(t10);
                this.f40535i = 2;
            } else {
                this.f40532f = t10;
                this.f40535i = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40534h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f40527a.onNext(t10);
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
            io.reactivex.s<? super T> sVar = this.f40527a;
            int iAddAndGet = 1;
            while (!this.f40533g) {
                if (this.f40530d.get() != null) {
                    this.f40532f = null;
                    this.f40531e = null;
                    sVar.onError(this.f40530d.b());
                    return;
                }
                int i10 = this.f40535i;
                if (i10 == 1) {
                    T t10 = this.f40532f;
                    this.f40532f = null;
                    this.f40535i = 2;
                    sVar.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f40534h;
                Su.e<T> eVar = this.f40531e;
                c.f fVarPoll = eVar != null ? eVar.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f40531e = null;
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
            this.f40532f = null;
            this.f40531e = null;
        }

        Su.e<T> c() {
            Su.e<T> eVar = this.f40531e;
            if (eVar != null) {
                return eVar;
            }
            C6159c c6159c = new C6159c(io.reactivex.l.bufferSize());
            this.f40531e = c6159c;
            return c6159c;
        }

        void e(Throwable th2) {
            if (!this.f40530d.a(th2)) {
                C14313a.s(th2);
            } else {
                Qu.d.a(this.f40528b);
                a();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f40528b.get());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f40530d.a(th2)) {
                C14313a.s(th2);
            } else {
                Qu.d.a(this.f40529c);
                a();
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40528b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f40527a = sVar;
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
        this.f41135a.subscribe(aVar);
        this.f40526b.a(aVar.f40529c);
    }

    public A0(io.reactivex.l<T> lVar, io.reactivex.j<? extends T> jVar) {
        super(lVar);
        this.f40526b = jVar;
    }
}
