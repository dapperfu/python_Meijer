package Yu;

import gv.C14313a;

/* renamed from: Yu.a1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5438a1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.c<T, T, T> f41148b;

    /* renamed from: Yu.a1$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41149a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.c<T, T, T> f41150b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41151c;

        /* renamed from: d, reason: collision with root package name */
        T f41152d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41153e;

        @Override // Nu.b
        public void dispose() {
            this.f41151c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41151c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41153e) {
                return;
            }
            this.f41153e = true;
            this.f41149a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41153e) {
                C14313a.s(th2);
            } else {
                this.f41153e = true;
                this.f41149a.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41153e) {
                return;
            }
            io.reactivex.s<? super T> sVar = this.f41149a;
            T t11 = this.f41152d;
            if (t11 == null) {
                this.f41152d = t10;
                sVar.onNext(t10);
                return;
            }
            try {
                ?? r42 = (T) Ru.b.e(this.f41150b.apply(t11, t10), "The value returned by the accumulator is null");
                this.f41152d = r42;
                sVar.onNext(r42);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41151c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41151c, bVar)) {
                this.f41151c = bVar;
                this.f41149a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.c<T, T, T> cVar) {
            this.f41149a = sVar;
            this.f41150b = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41148b));
    }

    public C5438a1(io.reactivex.q<T> qVar, Pu.c<T, T, T> cVar) {
        super(qVar);
        this.f41148b = cVar;
    }
}
