package Yu;

/* renamed from: Yu.y0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5500y0<T> extends AbstractC5436a<T, io.reactivex.k<T>> {

    /* renamed from: Yu.y0$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.k<T>> f41777a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41778b;

        @Override // Nu.b
        public void dispose() {
            this.f41778b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41778b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41777a.onNext(io.reactivex.k.c(t10));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41778b, bVar)) {
                this.f41778b = bVar;
                this.f41777a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super io.reactivex.k<T>> sVar) {
            this.f41777a = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41777a.onNext(io.reactivex.k.a());
            this.f41777a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41777a.onNext(io.reactivex.k.b(th2));
            this.f41777a.onComplete();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.k<T>> sVar) {
        this.f41135a.subscribe(new a(sVar));
    }

    public C5500y0(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
