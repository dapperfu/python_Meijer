package Uu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class L1<T, U, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.c<? super T, ? super U, ? extends R> f38070b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.q<? extends U> f38071c;

    static final class a<T, U, R> extends AtomicReference<U> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38072a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.c<? super T, ? super U, ? extends R> f38073b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<Ju.b> f38074c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Ju.b> f38075d = new AtomicReference<>();

        public void a(Throwable th2) {
            Mu.d.a(this.f38074c);
            this.f38072a.onError(th2);
        }

        public boolean b(Ju.b bVar) {
            return Mu.d.o(this.f38075d, bVar);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38074c);
            Mu.d.a(this.f38075d);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f38074c.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Mu.d.a(this.f38075d);
            this.f38072a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.a(this.f38075d);
            this.f38072a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f38074c, bVar);
        }

        a(io.reactivex.s<? super R> sVar, Lu.c<? super T, ? super U, ? extends R> cVar) {
            this.f38072a = sVar;
            this.f38073b = cVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.f38072a.onNext(Nu.b.e(this.f38073b.apply(t10, u10), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    dispose();
                    this.f38072a.onError(th2);
                }
            }
        }
    }

    final class b implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        private final a<T, U, R> f38076a;

        @Override // io.reactivex.s
        public void onComplete() {
        }

        b(a<T, U, R> aVar) {
            this.f38076a = aVar;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38076a.a(th2);
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            this.f38076a.lazySet(u10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38076a.b(bVar);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        a aVar = new a(fVar, this.f38070b);
        fVar.onSubscribe(aVar);
        this.f38071c.subscribe(new b(aVar));
        this.f38360a.subscribe(aVar);
    }

    public L1(io.reactivex.q<T> qVar, Lu.c<? super T, ? super U, ? extends R> cVar, io.reactivex.q<? extends U> qVar2) {
        super(qVar);
        this.f38070b = cVar;
        this.f38071c = qVar2;
    }
}
