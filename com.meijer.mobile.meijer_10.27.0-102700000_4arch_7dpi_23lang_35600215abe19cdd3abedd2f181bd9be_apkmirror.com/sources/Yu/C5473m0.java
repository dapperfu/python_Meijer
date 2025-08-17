package Yu;

/* renamed from: Yu.m0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5473m0<T> extends AbstractC5436a<T, T> {

    /* renamed from: Yu.m0$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41425a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41426b;

        @Override // io.reactivex.s
        public void onNext(T t10) {
        }

        @Override // Nu.b
        public void dispose() {
            this.f41426b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41426b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41425a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41425a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41426b = bVar;
            this.f41425a.onSubscribe(this);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f41425a = sVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar));
    }

    public C5473m0(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
