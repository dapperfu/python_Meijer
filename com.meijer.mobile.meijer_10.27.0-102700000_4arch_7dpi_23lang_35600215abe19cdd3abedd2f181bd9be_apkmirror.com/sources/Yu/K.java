package Yu;

/* loaded from: classes9.dex */
public final class K<T, K> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, K> f40782b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.d<? super K, ? super K> f40783c;

    static final class a<T, K> extends Tu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Pu.o<? super T, K> f40784f;

        /* renamed from: g, reason: collision with root package name */
        final Pu.d<? super K, ? super K> f40785g;

        /* renamed from: h, reason: collision with root package name */
        K f40786h;

        /* renamed from: i, reason: collision with root package name */
        boolean f40787i;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f35449d) {
                return;
            }
            if (this.f35450e != 0) {
                this.f35446a.onNext(t10);
                return;
            }
            try {
                K kApply = this.f40784f.apply(t10);
                if (this.f40787i) {
                    boolean zTest = this.f40785g.test(this.f40786h, kApply);
                    this.f40786h = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f40787i = true;
                    this.f40786h = kApply;
                }
                this.f35446a.onNext(t10);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Su.f
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f35448c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f40784f.apply(tPoll);
                if (!this.f40787i) {
                    this.f40787i = true;
                    this.f40786h = kApply;
                    return tPoll;
                }
                if (!this.f40785g.test(this.f40786h, kApply)) {
                    this.f40786h = kApply;
                    return tPoll;
                }
                this.f40786h = kApply;
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.o<? super T, K> oVar, Pu.d<? super K, ? super K> dVar) {
            super(sVar);
            this.f40784f = oVar;
            this.f40785g = dVar;
        }

        @Override // Su.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40782b, this.f40783c));
    }

    public K(io.reactivex.q<T> qVar, Pu.o<? super T, K> oVar, Pu.d<? super K, ? super K> dVar) {
        super(qVar);
        this.f40782b = oVar;
        this.f40783c = dVar;
    }
}
