package Yu;

import gv.C14313a;

/* renamed from: Yu.n0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5476n0<T> extends io.reactivex.b implements Su.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41441a;

    /* renamed from: Yu.n0$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f41442a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41443b;

        @Override // io.reactivex.s
        public void onNext(T t10) {
        }

        @Override // Nu.b
        public void dispose() {
            this.f41443b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41443b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41442a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41442a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41443b = bVar;
            this.f41442a.onSubscribe(this);
        }

        a(io.reactivex.c cVar) {
            this.f41442a = cVar;
        }
    }

    @Override // Su.a
    public io.reactivex.l<T> b() {
        return C14313a.o(new C5473m0(this.f41441a));
    }

    @Override // io.reactivex.b
    public void h(io.reactivex.c cVar) {
        this.f41441a.subscribe(new a(cVar));
    }

    public C5476n0(io.reactivex.q<T> qVar) {
        this.f41441a = qVar;
    }
}
