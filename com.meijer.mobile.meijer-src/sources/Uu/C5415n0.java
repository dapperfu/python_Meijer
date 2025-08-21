package Uu;

import cv.C13558a;

/* renamed from: Uu.n0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5415n0<T> extends io.reactivex.b implements Ou.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38666a;

    /* renamed from: Uu.n0$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f38667a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f38668b;

        @Override // io.reactivex.s
        public void onNext(T t10) {
        }

        @Override // Ju.b
        public void dispose() {
            this.f38668b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38668b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38667a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38667a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38668b = bVar;
            this.f38667a.onSubscribe(this);
        }

        a(io.reactivex.c cVar) {
            this.f38667a = cVar;
        }
    }

    @Override // Ou.a
    public io.reactivex.l<T> b() {
        return C13558a.o(new C5412m0(this.f38666a));
    }

    @Override // io.reactivex.b
    public void h(io.reactivex.c cVar) {
        this.f38666a.subscribe(new a(cVar));
    }

    public C5415n0(io.reactivex.q<T> qVar) {
        this.f38666a = qVar;
    }
}
