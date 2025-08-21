package Uu;

/* renamed from: Uu.k1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5407k1<T, U> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<U> f38598b;

    /* renamed from: Uu.k1$a */
    final class a implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        final Mu.a f38599a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f38600b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.observers.f<T> f38601c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38602d;

        a(Mu.a aVar, b<T> bVar, io.reactivex.observers.f<T> fVar) {
            this.f38599a = aVar;
            this.f38600b = bVar;
            this.f38601c = fVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38600b.f38607d = true;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38599a.dispose();
            this.f38601c.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            this.f38602d.dispose();
            this.f38600b.f38607d = true;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38602d, bVar)) {
                this.f38602d = bVar;
                this.f38599a.a(1, bVar);
            }
        }
    }

    /* renamed from: Uu.k1$b */
    static final class b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38604a;

        /* renamed from: b, reason: collision with root package name */
        final Mu.a f38605b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38606c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f38607d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38608e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38605b.dispose();
            this.f38604a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38605b.dispose();
            this.f38604a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38608e) {
                this.f38604a.onNext(t10);
            } else if (this.f38607d) {
                this.f38608e = true;
                this.f38604a.onNext(t10);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38606c, bVar)) {
                this.f38606c = bVar;
                this.f38605b.a(0, bVar);
            }
        }

        b(io.reactivex.s<? super T> sVar, Mu.a aVar) {
            this.f38604a = sVar;
            this.f38605b = aVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        Mu.a aVar = new Mu.a(2);
        fVar.onSubscribe(aVar);
        b bVar = new b(fVar, aVar);
        this.f38598b.subscribe(new a(aVar, bVar, fVar));
        this.f38360a.subscribe(bVar);
    }

    public C5407k1(io.reactivex.q<T> qVar, io.reactivex.q<U> qVar2) {
        super(qVar);
        this.f38598b = qVar2;
    }
}
