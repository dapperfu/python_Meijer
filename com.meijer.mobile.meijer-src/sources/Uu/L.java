package Uu;

/* loaded from: classes10.dex */
public final class L<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.g<? super T> f38062b;

    static final class a<T> extends Pu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Lu.g<? super T> f38063f;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f27218a.onNext(t10);
            if (this.f27222e == 0) {
                try {
                    this.f38063f.accept(t10);
                } catch (Throwable th2) {
                    d(th2);
                }
            }
        }

        @Override // Ou.f
        public T poll() throws Exception {
            T tPoll = this.f27220c.poll();
            if (tPoll != null) {
                this.f38063f.accept(tPoll);
            }
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Lu.g<? super T> gVar) {
            super(sVar);
            this.f38063f = gVar;
        }

        @Override // Ou.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38062b));
    }

    public L(io.reactivex.q<T> qVar, Lu.g<? super T> gVar) {
        super(qVar);
        this.f38062b = gVar;
    }
}
