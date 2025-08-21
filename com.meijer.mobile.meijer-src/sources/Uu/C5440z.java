package Uu;

/* renamed from: Uu.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5440z<T> extends AbstractC5375a<T, Long> {

    /* renamed from: Uu.z$a */
    static final class a implements io.reactivex.s<Object>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f39011a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f39012b;

        /* renamed from: c, reason: collision with root package name */
        long f39013c;

        @Override // Ju.b
        public void dispose() {
            this.f39012b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f39012b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39011a.onNext(Long.valueOf(this.f39013c));
            this.f39011a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f39011a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f39013c++;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f39012b, bVar)) {
                this.f39012b = bVar;
                this.f39011a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super Long> sVar) {
            this.f39011a = sVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        this.f38360a.subscribe(new a(sVar));
    }

    public C5440z(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
