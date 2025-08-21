package Uu;

/* loaded from: classes10.dex */
public final class r1<T> extends AbstractC5375a<T, T> {

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38835a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f38836b;

        /* renamed from: c, reason: collision with root package name */
        T f38837c;

        @Override // Ju.b
        public void dispose() {
            this.f38837c = null;
            this.f38836b.dispose();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38837c = null;
            this.f38835a.onError(th2);
        }

        void a() {
            T t10 = this.f38837c;
            if (t10 != null) {
                this.f38837c = null;
                this.f38835a.onNext(t10);
            }
            this.f38835a.onComplete();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38836b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38837c = t10;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38836b, bVar)) {
                this.f38836b = bVar;
                this.f38835a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f38835a = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar));
    }

    public r1(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
