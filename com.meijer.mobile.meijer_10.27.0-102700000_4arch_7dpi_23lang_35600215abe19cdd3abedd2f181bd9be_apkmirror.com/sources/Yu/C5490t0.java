package Yu;

/* renamed from: Yu.t0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5490t0<T> extends io.reactivex.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41656a;

    /* renamed from: Yu.t0$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f41657a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41658b;

        /* renamed from: c, reason: collision with root package name */
        T f41659c;

        @Override // Nu.b
        public void dispose() {
            this.f41658b.dispose();
            this.f41658b = Qu.d.DISPOSED;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41658b == Qu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41658b = Qu.d.DISPOSED;
            T t10 = this.f41659c;
            if (t10 == null) {
                this.f41657a.onComplete();
            } else {
                this.f41659c = null;
                this.f41657a.onSuccess(t10);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41658b = Qu.d.DISPOSED;
            this.f41659c = null;
            this.f41657a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41659c = t10;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41658b, bVar)) {
                this.f41658b = bVar;
                this.f41657a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar) {
            this.f41657a = iVar;
        }
    }

    @Override // io.reactivex.h
    protected void d(io.reactivex.i<? super T> iVar) {
        this.f41656a.subscribe(new a(iVar));
    }

    public C5490t0(io.reactivex.q<T> qVar) {
        this.f41656a = qVar;
    }
}
