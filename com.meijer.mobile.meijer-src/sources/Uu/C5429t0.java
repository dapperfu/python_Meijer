package Uu;

/* renamed from: Uu.t0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5429t0<T> extends io.reactivex.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38881a;

    /* renamed from: Uu.t0$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f38882a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f38883b;

        /* renamed from: c, reason: collision with root package name */
        T f38884c;

        @Override // Ju.b
        public void dispose() {
            this.f38883b.dispose();
            this.f38883b = Mu.d.DISPOSED;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38883b == Mu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38883b = Mu.d.DISPOSED;
            T t10 = this.f38884c;
            if (t10 == null) {
                this.f38882a.onComplete();
            } else {
                this.f38884c = null;
                this.f38882a.onSuccess(t10);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38883b = Mu.d.DISPOSED;
            this.f38884c = null;
            this.f38882a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38884c = t10;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38883b, bVar)) {
                this.f38883b = bVar;
                this.f38882a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar) {
            this.f38882a = iVar;
        }
    }

    @Override // io.reactivex.h
    protected void d(io.reactivex.i<? super T> iVar) {
        this.f38881a.subscribe(new a(iVar));
    }

    public C5429t0(io.reactivex.q<T> qVar) {
        this.f38881a = qVar;
    }
}
