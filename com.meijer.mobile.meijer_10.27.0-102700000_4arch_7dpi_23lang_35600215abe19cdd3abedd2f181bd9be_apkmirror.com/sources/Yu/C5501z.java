package Yu;

/* renamed from: Yu.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5501z<T> extends AbstractC5436a<T, Long> {

    /* renamed from: Yu.z$a */
    static final class a implements io.reactivex.s<Object>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f41786a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41787b;

        /* renamed from: c, reason: collision with root package name */
        long f41788c;

        @Override // Nu.b
        public void dispose() {
            this.f41787b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41787b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41786a.onNext(Long.valueOf(this.f41788c));
            this.f41786a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41786a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f41788c++;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41787b, bVar)) {
                this.f41787b = bVar;
                this.f41786a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super Long> sVar) {
            this.f41786a = sVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        this.f41135a.subscribe(new a(sVar));
    }

    public C5501z(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
