package Yu;

/* renamed from: Yu.w0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5496w0<T, U> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends U> f41733b;

    /* renamed from: Yu.w0$a */
    static final class a<T, U> extends Tu.a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final Pu.o<? super T, ? extends U> f41734f;

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f35449d) {
                return;
            }
            if (this.f35450e != 0) {
                this.f35446a.onNext(null);
                return;
            }
            try {
                this.f35446a.onNext(Ru.b.e(this.f41734f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Su.f
        public U poll() throws Exception {
            T tPoll = this.f35448c.poll();
            if (tPoll != null) {
                return (U) Ru.b.e(this.f41734f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        a(io.reactivex.s<? super U> sVar, Pu.o<? super T, ? extends U> oVar) {
            super(sVar);
            this.f41734f = oVar;
        }

        @Override // Su.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41733b));
    }

    public C5496w0(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends U> oVar) {
        super(qVar);
        this.f41733b = oVar;
    }
}
