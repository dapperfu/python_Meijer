package Uu;

/* renamed from: Uu.y0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5439y0<T> extends AbstractC5375a<T, io.reactivex.k<T>> {

    /* renamed from: Uu.y0$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.k<T>> f39002a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f39003b;

        @Override // Ju.b
        public void dispose() {
            this.f39003b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f39003b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f39002a.onNext(io.reactivex.k.c(t10));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f39003b, bVar)) {
                this.f39003b = bVar;
                this.f39002a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super io.reactivex.k<T>> sVar) {
            this.f39002a = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39002a.onNext(io.reactivex.k.a());
            this.f39002a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f39002a.onNext(io.reactivex.k.b(th2));
            this.f39002a.onComplete();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.k<T>> sVar) {
        this.f38360a.subscribe(new a(sVar));
    }

    public C5439y0(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
