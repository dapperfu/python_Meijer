package Uu;

/* renamed from: Uu.h1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5398h1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38505b;

    /* renamed from: Uu.h1$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38506a;

        /* renamed from: b, reason: collision with root package name */
        long f38507b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38508c;

        @Override // Ju.b
        public void dispose() {
            this.f38508c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38508c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38506a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38506a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f38507b;
            if (j10 != 0) {
                this.f38507b = j10 - 1;
            } else {
                this.f38506a.onNext(t10);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38508c, bVar)) {
                this.f38508c = bVar;
                this.f38506a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10) {
            this.f38506a = sVar;
            this.f38507b = j10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38505b));
    }

    public C5398h1(io.reactivex.q<T> qVar, long j10) {
        super(qVar);
        this.f38505b = j10;
    }
}
