package Yu;

/* loaded from: classes9.dex */
public final class r1<T> extends AbstractC5436a<T, T> {

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41610a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41611b;

        /* renamed from: c, reason: collision with root package name */
        T f41612c;

        @Override // Nu.b
        public void dispose() {
            this.f41612c = null;
            this.f41611b.dispose();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41612c = null;
            this.f41610a.onError(th2);
        }

        void a() {
            T t10 = this.f41612c;
            if (t10 != null) {
                this.f41612c = null;
                this.f41610a.onNext(t10);
            }
            this.f41610a.onComplete();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41611b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41612c = t10;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41611b, bVar)) {
                this.f41611b = bVar;
                this.f41610a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f41610a = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar));
    }

    public r1(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
