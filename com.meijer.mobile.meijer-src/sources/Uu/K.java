package Uu;

/* loaded from: classes10.dex */
public final class K<T, K> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, K> f38007b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.d<? super K, ? super K> f38008c;

    static final class a<T, K> extends Pu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Lu.o<? super T, K> f38009f;

        /* renamed from: g, reason: collision with root package name */
        final Lu.d<? super K, ? super K> f38010g;

        /* renamed from: h, reason: collision with root package name */
        K f38011h;

        /* renamed from: i, reason: collision with root package name */
        boolean f38012i;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f27221d) {
                return;
            }
            if (this.f27222e != 0) {
                this.f27218a.onNext(t10);
                return;
            }
            try {
                K kApply = this.f38009f.apply(t10);
                if (this.f38012i) {
                    boolean zTest = this.f38010g.test(this.f38011h, kApply);
                    this.f38011h = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f38012i = true;
                    this.f38011h = kApply;
                }
                this.f27218a.onNext(t10);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Ou.f
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f27220c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f38009f.apply(tPoll);
                if (!this.f38012i) {
                    this.f38012i = true;
                    this.f38011h = kApply;
                    return tPoll;
                }
                if (!this.f38010g.test(this.f38011h, kApply)) {
                    this.f38011h = kApply;
                    return tPoll;
                }
                this.f38011h = kApply;
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.o<? super T, K> oVar, Lu.d<? super K, ? super K> dVar) {
            super(sVar);
            this.f38009f = oVar;
            this.f38010g = dVar;
        }

        @Override // Ou.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38007b, this.f38008c));
    }

    public K(io.reactivex.q<T> qVar, Lu.o<? super T, K> oVar, Lu.d<? super K, ? super K> dVar) {
        super(qVar);
        this.f38007b = oVar;
        this.f38008c = dVar;
    }
}
