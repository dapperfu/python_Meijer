package Yu;

/* renamed from: Yu.k1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5468k1<T, U> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<U> f41373b;

    /* renamed from: Yu.k1$a */
    final class a implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        final Qu.a f41374a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f41375b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.observers.f<T> f41376c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f41377d;

        a(Qu.a aVar, b<T> bVar, io.reactivex.observers.f<T> fVar) {
            this.f41374a = aVar;
            this.f41375b = bVar;
            this.f41376c = fVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41375b.f41382d = true;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41374a.dispose();
            this.f41376c.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            this.f41377d.dispose();
            this.f41375b.f41382d = true;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41377d, bVar)) {
                this.f41377d = bVar;
                this.f41374a.a(1, bVar);
            }
        }
    }

    /* renamed from: Yu.k1$b */
    static final class b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41379a;

        /* renamed from: b, reason: collision with root package name */
        final Qu.a f41380b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41381c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f41382d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41383e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41380b.dispose();
            this.f41379a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41380b.dispose();
            this.f41379a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41383e) {
                this.f41379a.onNext(t10);
            } else if (this.f41382d) {
                this.f41383e = true;
                this.f41379a.onNext(t10);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41381c, bVar)) {
                this.f41381c = bVar;
                this.f41380b.a(0, bVar);
            }
        }

        b(io.reactivex.s<? super T> sVar, Qu.a aVar) {
            this.f41379a = sVar;
            this.f41380b = aVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        Qu.a aVar = new Qu.a(2);
        fVar.onSubscribe(aVar);
        b bVar = new b(fVar, aVar);
        this.f41373b.subscribe(new a(aVar, bVar, fVar));
        this.f41135a.subscribe(bVar);
    }

    public C5468k1(io.reactivex.q<T> qVar, io.reactivex.q<U> qVar2) {
        super(qVar);
        this.f41373b = qVar2;
    }
}
