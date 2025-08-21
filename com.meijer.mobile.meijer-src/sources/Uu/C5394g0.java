package Uu;

/* renamed from: Uu.g0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5394g0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final lw.a<? extends T> f38485a;

    /* renamed from: Uu.g0$a */
    static final class a<T> implements io.reactivex.g<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38486a;

        /* renamed from: b, reason: collision with root package name */
        lw.c f38487b;

        @Override // lw.b
        public void b(lw.c cVar) {
            if (Zu.b.p(this.f38487b, cVar)) {
                this.f38487b = cVar;
                this.f38486a.onSubscribe(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38487b.cancel();
            this.f38487b = Zu.b.CANCELLED;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38487b == Zu.b.CANCELLED;
        }

        @Override // lw.b
        public void onComplete() {
            this.f38486a.onComplete();
        }

        @Override // lw.b
        public void onError(Throwable th2) {
            this.f38486a.onError(th2);
        }

        @Override // lw.b
        public void onNext(T t10) {
            this.f38486a.onNext(t10);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f38486a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38485a.a(new a(sVar));
    }

    public C5394g0(lw.a<? extends T> aVar) {
        this.f38485a = aVar;
    }
}
