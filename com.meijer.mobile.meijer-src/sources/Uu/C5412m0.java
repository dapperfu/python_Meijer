package Uu;

/* renamed from: Uu.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5412m0<T> extends AbstractC5375a<T, T> {

    /* renamed from: Uu.m0$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38650a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f38651b;

        @Override // io.reactivex.s
        public void onNext(T t10) {
        }

        @Override // Ju.b
        public void dispose() {
            this.f38651b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38651b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38650a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38650a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38651b = bVar;
            this.f38650a.onSubscribe(this);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f38650a = sVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar));
    }

    public C5412m0(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
