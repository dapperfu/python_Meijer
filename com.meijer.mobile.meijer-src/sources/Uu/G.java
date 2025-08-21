package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class G<T, U> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f37894a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<U> f37895b;

    final class a implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        final Mu.h f37896a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.s<? super T> f37897b;

        /* renamed from: c, reason: collision with root package name */
        boolean f37898c;

        /* renamed from: Uu.G$a$a, reason: collision with other inner class name */
        final class C0833a implements io.reactivex.s<T> {
            C0833a() {
            }

            @Override // io.reactivex.s
            public void onComplete() {
                a.this.f37897b.onComplete();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                a.this.f37897b.onError(th2);
            }

            @Override // io.reactivex.s
            public void onNext(T t10) {
                a.this.f37897b.onNext(t10);
            }

            @Override // io.reactivex.s
            public void onSubscribe(Ju.b bVar) {
                a.this.f37896a.b(bVar);
            }
        }

        a(Mu.h hVar, io.reactivex.s<? super T> sVar) {
            this.f37896a = hVar;
            this.f37897b = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37898c) {
                return;
            }
            this.f37898c = true;
            G.this.f37894a.subscribe(new C0833a());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37898c) {
                C13558a.s(th2);
            } else {
                this.f37898c = true;
                this.f37897b.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f37896a.b(bVar);
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            onComplete();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Mu.h hVar = new Mu.h();
        sVar.onSubscribe(hVar);
        this.f37895b.subscribe(new a(hVar, sVar));
    }

    public G(io.reactivex.q<? extends T> qVar, io.reactivex.q<U> qVar2) {
        this.f37894a = qVar;
        this.f37895b = qVar2;
    }
}
