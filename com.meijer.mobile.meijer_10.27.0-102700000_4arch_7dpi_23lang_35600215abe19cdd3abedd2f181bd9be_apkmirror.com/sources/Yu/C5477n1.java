package Yu;

/* renamed from: Yu.n1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5477n1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41444b;

    /* renamed from: Yu.n1$a */
    static final class a<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41445a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.q<? extends T> f41446b;

        /* renamed from: d, reason: collision with root package name */
        boolean f41448d = true;

        /* renamed from: c, reason: collision with root package name */
        final Qu.h f41447c = new Qu.h();

        @Override // io.reactivex.s
        public void onComplete() {
            if (!this.f41448d) {
                this.f41445a.onComplete();
            } else {
                this.f41448d = false;
                this.f41446b.subscribe(this);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41445a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41448d) {
                this.f41448d = false;
            }
            this.f41445a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41447c.b(bVar);
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.q<? extends T> qVar) {
            this.f41445a = sVar;
            this.f41446b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar, this.f41444b);
        sVar.onSubscribe(aVar.f41447c);
        this.f41135a.subscribe(aVar);
    }

    public C5477n1(io.reactivex.q<T> qVar, io.reactivex.q<? extends T> qVar2) {
        super(qVar);
        this.f41444b = qVar2;
    }
}
