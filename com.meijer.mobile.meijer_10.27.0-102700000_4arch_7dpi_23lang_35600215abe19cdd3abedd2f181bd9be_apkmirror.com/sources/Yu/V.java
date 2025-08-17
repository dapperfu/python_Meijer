package Yu;

/* loaded from: classes9.dex */
public final class V<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41032b;

    static final class a<T> extends Tu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Pu.q<? super T> f41033f;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f35450e != 0) {
                this.f35446a.onNext(null);
                return;
            }
            try {
                if (this.f41033f.test(t10)) {
                    this.f35446a.onNext(t10);
                }
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Su.f
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f35448c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f41033f.test(tPoll));
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Pu.q<? super T> qVar) {
            super(sVar);
            this.f41033f = qVar;
        }

        @Override // Su.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41032b));
    }

    public V(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        super(qVar);
        this.f41032b = qVar2;
    }
}
