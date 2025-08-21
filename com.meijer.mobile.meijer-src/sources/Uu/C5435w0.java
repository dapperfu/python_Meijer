package Uu;

/* renamed from: Uu.w0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5435w0<T, U> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends U> f38958b;

    /* renamed from: Uu.w0$a */
    static final class a<T, U> extends Pu.a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final Lu.o<? super T, ? extends U> f38959f;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f27221d) {
                return;
            }
            if (this.f27222e != 0) {
                this.f27218a.onNext(null);
                return;
            }
            try {
                this.f27218a.onNext(Nu.b.e(this.f38959f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Ou.f
        public U poll() throws Exception {
            T tPoll = this.f27220c.poll();
            if (tPoll != null) {
                return (U) Nu.b.e(this.f38959f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        a(io.reactivex.s<? super U> sVar, Lu.o<? super T, ? extends U> oVar) {
            super(sVar);
            this.f38959f = oVar;
        }

        @Override // Ou.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38958b));
    }

    public C5435w0(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends U> oVar) {
        super(qVar);
        this.f38958b = oVar;
    }
}
