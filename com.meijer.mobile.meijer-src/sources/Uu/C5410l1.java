package Uu;

/* renamed from: Uu.l1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5410l1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38627b;

    /* renamed from: Uu.l1$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38628a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.q<? super T> f38629b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38630c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38631d;

        @Override // Ju.b
        public void dispose() {
            this.f38630c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38630c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38628a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38628a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38631d) {
                this.f38628a.onNext(t10);
                return;
            }
            try {
                if (this.f38629b.test(t10)) {
                    return;
                }
                this.f38631d = true;
                this.f38628a.onNext(t10);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38630c.dispose();
                this.f38628a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38630c, bVar)) {
                this.f38630c = bVar;
                this.f38628a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.q<? super T> qVar) {
            this.f38628a = sVar;
            this.f38629b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38627b));
    }

    public C5410l1(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        super(qVar);
        this.f38627b = qVar2;
    }
}
