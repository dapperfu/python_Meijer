package Yu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class L1<T, U, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.c<? super T, ? super U, ? extends R> f40845b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.q<? extends U> f40846c;

    static final class a<T, U, R> extends AtomicReference<U> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f40847a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.c<? super T, ? super U, ? extends R> f40848b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<Nu.b> f40849c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Nu.b> f40850d = new AtomicReference<>();

        public void a(Throwable th2) {
            Qu.d.a(this.f40849c);
            this.f40847a.onError(th2);
        }

        public boolean b(Nu.b bVar) {
            return Qu.d.o(this.f40850d, bVar);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f40849c);
            Qu.d.a(this.f40850d);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f40849c.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Qu.d.a(this.f40850d);
            this.f40847a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.a(this.f40850d);
            this.f40847a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40849c, bVar);
        }

        a(io.reactivex.s<? super R> sVar, Pu.c<? super T, ? super U, ? extends R> cVar) {
            this.f40847a = sVar;
            this.f40848b = cVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.f40847a.onNext(Ru.b.e(this.f40848b.apply(t10, u10), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    dispose();
                    this.f40847a.onError(th2);
                }
            }
        }
    }

    final class b implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        private final a<T, U, R> f40851a;

        @Override // io.reactivex.s
        public void onComplete() {
        }

        b(a<T, U, R> aVar) {
            this.f40851a = aVar;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40851a.a(th2);
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            this.f40851a.lazySet(u10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f40851a.b(bVar);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        a aVar = new a(fVar, this.f40845b);
        fVar.onSubscribe(aVar);
        this.f40846c.subscribe(new b(aVar));
        this.f41135a.subscribe(aVar);
    }

    public L1(io.reactivex.q<T> qVar, Pu.c<? super T, ? super U, ? extends R> cVar, io.reactivex.q<? extends U> qVar2) {
        super(qVar);
        this.f40845b = cVar;
        this.f40846c = qVar2;
    }
}
