package Yu;

/* renamed from: Yu.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5470l0<T> extends AbstractC5436a<T, T> {

    /* renamed from: Yu.l0$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41400a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41401b;

        @Override // Nu.b
        public void dispose() {
            this.f41401b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41401b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41400a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41400a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41400a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41401b, bVar)) {
                this.f41401b = bVar;
                this.f41400a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f41400a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar));
    }

    public C5470l0(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
