package Uu;

/* loaded from: classes10.dex */
public final class I<T> extends AbstractC5375a<T, T> {

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        io.reactivex.s<? super T> f37961a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f37962b;

        @Override // Ju.b
        public void dispose() {
            Ju.b bVar = this.f37962b;
            this.f37962b = av.g.INSTANCE;
            this.f37961a = av.g.a();
            bVar.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37962b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            io.reactivex.s<? super T> sVar = this.f37961a;
            this.f37962b = av.g.INSTANCE;
            this.f37961a = av.g.a();
            sVar.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            io.reactivex.s<? super T> sVar = this.f37961a;
            this.f37962b = av.g.INSTANCE;
            this.f37961a = av.g.a();
            sVar.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37961a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37962b, bVar)) {
                this.f37962b = bVar;
                this.f37961a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f37961a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar));
    }

    public I(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
