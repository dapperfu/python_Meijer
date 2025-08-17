package Yu;

import A0.c;
import av.C6159c;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class B0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f40561b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40562a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Nu.b> f40563b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C0872a<T> f40564c = new C0872a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final ev.c f40565d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        volatile Su.e<T> f40566e;

        /* renamed from: f, reason: collision with root package name */
        T f40567f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f40568g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f40569h;

        /* renamed from: i, reason: collision with root package name */
        volatile int f40570i;

        /* renamed from: Yu.B0$a$a, reason: collision with other inner class name */
        static final class C0872a<T> extends AtomicReference<Nu.b> implements io.reactivex.w<T> {

            /* renamed from: a, reason: collision with root package name */
            final a<T> f40571a;

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f40571a.d(th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(T t10) {
                this.f40571a.e(t10);
            }

            C0872a(a<T> aVar) {
                this.f40571a = aVar;
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f40568g = true;
            Qu.d.a(this.f40563b);
            Qu.d.a(this.f40564c);
            if (getAndIncrement() == 0) {
                this.f40566e = null;
                this.f40567f = null;
            }
        }

        void e(T t10) {
            if (compareAndSet(0, 1)) {
                this.f40562a.onNext(t10);
                this.f40570i = 2;
            } else {
                this.f40567f = t10;
                this.f40570i = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40569h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f40562a.onNext(t10);
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
            io.reactivex.s<? super T> sVar = this.f40562a;
            int iAddAndGet = 1;
            while (!this.f40568g) {
                if (this.f40565d.get() != null) {
                    this.f40567f = null;
                    this.f40566e = null;
                    sVar.onError(this.f40565d.b());
                    return;
                }
                int i10 = this.f40570i;
                if (i10 == 1) {
                    T t10 = this.f40567f;
                    this.f40567f = null;
                    this.f40570i = 2;
                    sVar.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f40569h;
                Su.e<T> eVar = this.f40566e;
                c.f fVarPoll = eVar != null ? eVar.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f40566e = null;
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
            this.f40567f = null;
            this.f40566e = null;
        }

        Su.e<T> c() {
            Su.e<T> eVar = this.f40566e;
            if (eVar != null) {
                return eVar;
            }
            C6159c c6159c = new C6159c(io.reactivex.l.bufferSize());
            this.f40566e = c6159c;
            return c6159c;
        }

        void d(Throwable th2) {
            if (!this.f40565d.a(th2)) {
                C14313a.s(th2);
            } else {
                Qu.d.a(this.f40563b);
                a();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f40563b.get());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f40565d.a(th2)) {
                C14313a.s(th2);
            } else {
                Qu.d.a(this.f40564c);
                a();
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40563b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f40562a = sVar;
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
        this.f40561b.a(aVar.f40564c);
    }

    public B0(io.reactivex.l<T> lVar, io.reactivex.y<? extends T> yVar) {
        super(lVar);
        this.f40561b = yVar;
    }
}
