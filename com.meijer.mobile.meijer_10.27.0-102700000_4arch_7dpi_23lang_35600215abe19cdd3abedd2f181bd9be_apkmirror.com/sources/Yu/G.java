package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class G<T, U> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f40669a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<U> f40670b;

    final class a implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        final Qu.h f40671a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.s<? super T> f40672b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40673c;

        /* renamed from: Yu.G$a$a, reason: collision with other inner class name */
        final class C0876a implements io.reactivex.s<T> {
            C0876a() {
            }

            @Override // io.reactivex.s
            public void onComplete() {
                a.this.f40672b.onComplete();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                a.this.f40672b.onError(th2);
            }

            @Override // io.reactivex.s
            public void onNext(T t10) {
                a.this.f40672b.onNext(t10);
            }

            @Override // io.reactivex.s
            public void onSubscribe(Nu.b bVar) {
                a.this.f40671a.b(bVar);
            }
        }

        a(Qu.h hVar, io.reactivex.s<? super T> sVar) {
            this.f40671a = hVar;
            this.f40672b = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40673c) {
                return;
            }
            this.f40673c = true;
            G.this.f40669a.subscribe(new C0876a());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40673c) {
                C14313a.s(th2);
            } else {
                this.f40673c = true;
                this.f40672b.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f40671a.b(bVar);
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            onComplete();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Qu.h hVar = new Qu.h();
        sVar.onSubscribe(hVar);
        this.f40670b.subscribe(new a(hVar, sVar));
    }

    public G(io.reactivex.q<? extends T> qVar, io.reactivex.q<U> qVar2) {
        this.f40669a = qVar;
        this.f40670b = qVar2;
    }
}
