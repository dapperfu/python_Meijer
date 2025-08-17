package Yu;

/* loaded from: classes9.dex */
public final class L<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.g<? super T> f40837b;

    static final class a<T> extends Tu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Pu.g<? super T> f40838f;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f35446a.onNext(t10);
            if (this.f35450e == 0) {
                try {
                    this.f40838f.accept(t10);
                } catch (Throwable th2) {
                    d(th2);
                }
            }
        }

        @Override // Su.f
        public T poll() throws Exception {
            T tPoll = this.f35448c.poll();
            if (tPoll != null) {
                this.f40838f.accept(tPoll);
            }
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Pu.g<? super T> gVar) {
            super(sVar);
            this.f40838f = gVar;
        }

        @Override // Su.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40837b));
    }

    public L(io.reactivex.q<T> qVar, Pu.g<? super T> gVar) {
        super(qVar);
        this.f40837b = gVar;
    }
}
