package Yu;

/* renamed from: Yu.l1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5471l1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41402b;

    /* renamed from: Yu.l1$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41403a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.q<? super T> f41404b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41405c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41406d;

        @Override // Nu.b
        public void dispose() {
            this.f41405c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41405c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41403a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41403a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41406d) {
                this.f41403a.onNext(t10);
                return;
            }
            try {
                if (this.f41404b.test(t10)) {
                    return;
                }
                this.f41406d = true;
                this.f41403a.onNext(t10);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41405c.dispose();
                this.f41403a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41405c, bVar)) {
                this.f41405c = bVar;
                this.f41403a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.q<? super T> qVar) {
            this.f41403a = sVar;
            this.f41404b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41402b));
    }

    public C5471l1(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        super(qVar);
        this.f41402b = qVar2;
    }
}
