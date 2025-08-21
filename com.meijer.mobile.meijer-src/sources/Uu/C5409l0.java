package Uu;

/* renamed from: Uu.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5409l0<T> extends AbstractC5375a<T, T> {

    /* renamed from: Uu.l0$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38625a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f38626b;

        @Override // Ju.b
        public void dispose() {
            this.f38626b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38626b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38625a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38625a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38625a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38626b, bVar)) {
                this.f38626b = bVar;
                this.f38625a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f38625a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar));
    }

    public C5409l0(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
