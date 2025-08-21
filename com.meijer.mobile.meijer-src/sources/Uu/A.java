package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class A<T> extends io.reactivex.u<Long> implements Ou.a<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f37747a;

    static final class a implements io.reactivex.s<Object>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Long> f37748a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f37749b;

        /* renamed from: c, reason: collision with root package name */
        long f37750c;

        @Override // Ju.b
        public void dispose() {
            this.f37749b.dispose();
            this.f37749b = Mu.d.DISPOSED;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37749b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37749b = Mu.d.DISPOSED;
            this.f37748a.onSuccess(Long.valueOf(this.f37750c));
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37749b = Mu.d.DISPOSED;
            this.f37748a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f37750c++;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37749b, bVar)) {
                this.f37749b = bVar;
                this.f37748a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super Long> wVar) {
            this.f37748a = wVar;
        }
    }

    @Override // Ou.a
    public io.reactivex.l<Long> b() {
        return C13558a.o(new C5440z(this.f37747a));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super Long> wVar) {
        this.f37747a.subscribe(new a(wVar));
    }

    public A(io.reactivex.q<T> qVar) {
        this.f37747a = qVar;
    }
}
