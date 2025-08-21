package Uu;

/* loaded from: classes10.dex */
public final class V<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38257b;

    static final class a<T> extends Pu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Lu.q<? super T> f38258f;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f27222e != 0) {
                this.f27218a.onNext(null);
                return;
            }
            try {
                if (this.f38258f.test(t10)) {
                    this.f27218a.onNext(t10);
                }
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Ou.f
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f27220c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f38258f.test(tPoll));
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Lu.q<? super T> qVar) {
            super(sVar);
            this.f38258f = qVar;
        }

        @Override // Ou.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38257b));
    }

    public V(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        super(qVar);
        this.f38257b = qVar2;
    }
}
