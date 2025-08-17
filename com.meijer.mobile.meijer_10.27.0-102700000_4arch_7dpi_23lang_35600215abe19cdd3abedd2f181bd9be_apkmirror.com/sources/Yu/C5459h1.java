package Yu;

/* renamed from: Yu.h1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5459h1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f41280b;

    /* renamed from: Yu.h1$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41281a;

        /* renamed from: b, reason: collision with root package name */
        long f41282b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41283c;

        @Override // Nu.b
        public void dispose() {
            this.f41283c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41283c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41281a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41281a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f41282b;
            if (j10 != 0) {
                this.f41282b = j10 - 1;
            } else {
                this.f41281a.onNext(t10);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41283c, bVar)) {
                this.f41283c = bVar;
                this.f41281a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10) {
            this.f41281a = sVar;
            this.f41282b = j10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41280b));
    }

    public C5459h1(io.reactivex.q<T> qVar, long j10) {
        super(qVar);
        this.f41280b = j10;
    }
}
